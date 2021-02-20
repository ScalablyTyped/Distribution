package typings.sequelize.mod

import typings.sequelize.anon.Plural
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models
  *
  * @see Association class
  */
@js.native
trait AssociationOptions extends StObject {
  
  /**
    * The alias of this model, in singular form. See also the `name` option passed to `sequelize.define`. If
    * you create multiple associations between the same tables, you should provide an alias to be able to
    * distinguish between them. If you provide an alias when creating the assocition, you should provide the
    * same alias when eager loading and when getting assocated models. Defaults to the singularized name of
    * target
    */
  var as: js.UndefOr[String | Plural] = js.native
  
  /**
    * Should on update and on delete constraints be enabled on the foreign key.
    */
  var constraints: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the foreign key in the target table or an object representing the type definition for the
    * foreign column (see `Sequelize.define` for syntax). When using an object, you can add a `name` property
    * to set the name of the column. Defaults to the name of source + primary key of source
    */
  var foreignKey: js.UndefOr[String | AssociationForeignKeyOptions] = js.native
  
  var foreignKeyConstraint: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to run before-/afterDestroy hooks when an associated model is deleted because of a cascade.
    * For example if `User.hasOne(Profile, {onDelete: 'cascade', hooks:true})`, the before-/afterDestroy hooks
    * for profile will be called when a user is deleted. Otherwise the profile will be deleted without invoking
    * any hooks.
    *
    * Defaults to false
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * What happens when delete occurs.
    *
    * Cascade if this is a n:m, and set null if it is a 1:m
    *
    * Defaults to 'SET NULL' or 'CASCADE'
    */
  var onDelete: js.UndefOr[String] = js.native
  
  /**
    * What happens when update occurs
    *
    * Defaults to 'CASCADE'
    */
  var onUpdate: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[AssociationScope] = js.native
}
object AssociationOptions {
  
  @scala.inline
  def apply(): AssociationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptions]
  }
  
  @scala.inline
  implicit class AssociationOptionsMutableBuilder[Self <: AssociationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | Plural): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setConstraints(value: Boolean): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setForeignKey(value: String | AssociationForeignKeyOptions): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyConstraint(value: Boolean): Self = StObject.set(x, "foreignKeyConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyConstraintUndefined: Self = StObject.set(x, "foreignKeyConstraint", js.undefined)
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setScope(value: AssociationScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
