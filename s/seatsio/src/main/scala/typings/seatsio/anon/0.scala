package typings.seatsio.anon

import typings.seatsio.seatsioStrings.row
import typings.seatsio.seatsioStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: row | table
}
object `0` {
  
  inline def apply(`type`: row | table): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: row | table): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
