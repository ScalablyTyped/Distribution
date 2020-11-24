package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with belongsTo relationship
  *
  * @see Association class belongsTo method
  */
@js.native
trait AssociationOptionsBelongsTo extends AssociationOptions {
  
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
  
  /**
    * The name of the field to use as the key for the association in the target table. Defaults to the primary
    * key of the target table
    */
  var targetKey: js.UndefOr[String] = js.native
}
object AssociationOptionsBelongsTo {
  
  @scala.inline
  def apply(): AssociationOptionsBelongsTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsBelongsTo]
  }
  
  @scala.inline
  implicit class AssociationOptionsBelongsToOps[Self <: AssociationOptionsBelongsTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyType(value: DataTypeAbstract): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    
    @scala.inline
    def setTargetKey(value: String): Self = this.set("targetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetKey: Self = this.set("targetKey", js.undefined)
  }
}
