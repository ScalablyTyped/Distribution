package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with belongsToMany relationship
  *
  * @see Association class belongsToMany method
  */
trait AssociationOptionsBelongsToMany
  extends StObject
     with AssociationOptionsManyToMany {
  
  /**
    * The name of the foreign key in the join table (representing the target model) or an object representing
    * the type definition for the other column (see `Sequelize.define` for syntax). When using an object, you
    * can add a `name` property to set the name of the colum. Defaults to the name of target + primary key of
    * target
    */
  var otherKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.undefined
  
  /**
    * The name of the table that is used to join source and target in n:m associations. Can also be a
    * sequelize
    * model if you want to define the junction table yourself and add extra attributes to it.
    *
    * In 3.4.1 version of Sequelize, hasMany's use of through gives an error, and on the other hand through
    * option for belongsToMany has been made required.
    *
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/has-many.js
    * @see https://github.com/sequelize/sequelize/blob/v3.4.1/lib/associations/belongs-to-many.js
    */
  var through: (Model[js.Any, js.Any, js.Any]) | String | ThroughOptions
  
  /**
    * Should the join model have timestamps
    */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Belongs-To-Many creates a unique key when primary key is not present on through model. This unique key name can be overridden using uniqueKey option.
    */
  var uniqueKey: js.UndefOr[String] = js.undefined
}
object AssociationOptionsBelongsToMany {
  
  @scala.inline
  def apply(through: (Model[js.Any, js.Any, js.Any]) | String | ThroughOptions): AssociationOptionsBelongsToMany = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOptionsBelongsToMany]
  }
  
  @scala.inline
  implicit class AssociationOptionsBelongsToManyMutableBuilder[Self <: AssociationOptionsBelongsToMany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherKey(value: String | AssociationForeignKeyOptions): Self = StObject.set(x, "otherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherKeyUndefined: Self = StObject.set(x, "otherKey", js.undefined)
    
    @scala.inline
    def setThrough(value: (Model[js.Any, js.Any, js.Any]) | String | ThroughOptions): Self = StObject.set(x, "through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    @scala.inline
    def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueKeyUndefined: Self = StObject.set(x, "uniqueKey", js.undefined)
  }
}
