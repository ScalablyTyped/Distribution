package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.unique_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddUniqueConstraintOptions
  extends StObject
     with AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: unique_
}
object AddUniqueConstraintOptions {
  
  inline def apply(): AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[AddUniqueConstraintOptions]
  }
  
  extension [Self <: AddUniqueConstraintOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: unique_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
