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
  
  @scala.inline
  def apply(): K = {
    val __obj = js.Dynamic.literal(H = "ZH", K = "ZK", O = "ZO")
    __obj.asInstanceOf[K]
  }
  
  @scala.inline
  implicit class KMutableBuilder[Self <: K] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: ZH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK(value: typings.screeps.screepsStrings.ZK): Self = StObject.set(x, "K", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: ZO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
