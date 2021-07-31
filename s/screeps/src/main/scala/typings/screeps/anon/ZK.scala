package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZK extends StObject {
  
  var ZK: typings.screeps.screepsStrings.G
}
object ZK {
  
  @scala.inline
  def apply(): ZK = {
    val __obj = js.Dynamic.literal(ZK = "G")
    __obj.asInstanceOf[ZK]
  }
  
  @scala.inline
  implicit class ZKMutableBuilder[Self <: ZK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZK(value: typings.screeps.screepsStrings.G): Self = StObject.set(x, "ZK", value.asInstanceOf[js.Any])
  }
}
