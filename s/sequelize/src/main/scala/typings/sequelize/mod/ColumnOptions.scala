package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Sequelize
// ~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/sequelize.js
//
/**
  * General column options
  *
  * @see Define
  * @see AssociationForeignKeyOptions
  */
@js.native
trait ColumnOptions extends js.Object {
  
  /**
    * If false, the column will have a NOT NULL constraint, and a not null validation will be run before an
    * instance is saved.
    */
  var allowNull: js.UndefOr[Boolean] = js.native
  
  /**
    * A literal default value, a JavaScript function, or an SQL function (see `sequelize.fn`)
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /**
    *  If set, sequelize will map the attribute name to a different name in the database
    */
  var field: js.UndefOr[String] = js.native
}
object ColumnOptions {
  
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
