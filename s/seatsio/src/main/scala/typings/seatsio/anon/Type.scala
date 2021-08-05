package typings.seatsio.anon

import typings.seatsio.seatsioStrings.row
import typings.seatsio.seatsioStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: row | table
}
object Type {
  
  inline def apply(`type`: row | table): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: row | table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
