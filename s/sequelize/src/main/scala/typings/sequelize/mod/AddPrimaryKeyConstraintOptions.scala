package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.`primary key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPrimaryKeyConstraintOptions
  extends StObject
     with AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: `primary key`
}
object AddPrimaryKeyConstraintOptions {
  
  inline def apply(): AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("primary key")
    __obj.asInstanceOf[AddPrimaryKeyConstraintOptions]
  }
  
  extension [Self <: AddPrimaryKeyConstraintOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: `primary key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
