package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDefaultConstraintOptions extends AddConstraintOptions {
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: typings.sequelize.sequelizeStrings.default = js.native
}
object AddDefaultConstraintOptions {
  
  @scala.inline
  def apply(`type`: typings.sequelize.sequelizeStrings.default): AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDefaultConstraintOptions]
  }
  
  @scala.inline
  implicit class AddDefaultConstraintOptionsMutableBuilder[Self <: AddDefaultConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: typings.sequelize.sequelizeStrings.default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
