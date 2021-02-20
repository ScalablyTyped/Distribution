package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
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
trait ColumnOptions extends StObject {
  
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
  implicit class ColumnOptionsMutableBuilder[Self <: ColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
