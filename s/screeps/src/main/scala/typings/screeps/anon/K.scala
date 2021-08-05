package typings.screeps.anon

import typings.screeps.screepsStrings.ZH
import typings.screeps.screepsStrings.ZO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait K extends StObject {
  
  var H: ZH
  
  var K: typings.screeps.screepsStrings.ZK
  
  var O: ZO
}
object K {
  
  inline def apply(): K = {
    val __obj = js.Dynamic.literal(H = "ZH", K = "ZK", O = "ZO")
    __obj.asInstanceOf[K]
  }
  
  extension [Self <: K](x: Self) {
    
    inline def setH(value: ZH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setK(value: typings.screeps.screepsStrings.ZK): Self = StObject.set(x, "K", value.asInstanceOf[js.Any])
    
    inline def setO(value: ZO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
