package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDefaultConstraintOptions
  extends StObject
     with AddConstraintOptions {
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: typings.sequelize.sequelizeStrings.default
}
object AddDefaultConstraintOptions {
  
  inline def apply(): AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[AddDefaultConstraintOptions]
  }
  
  extension [Self <: AddDefaultConstraintOptions](x: Self) {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: typings.sequelize.sequelizeStrings.default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
