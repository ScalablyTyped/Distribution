package typings.sharedb.mod

import typings.sharedb.sharedbStrings.p
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceMessage extends StObject {
  
  var a: p
  
  // presence version
  var c: js.UndefOr[String] = js.undefined
  
  var ch: String
  
  // document collection
  var d: js.UndefOr[String] = js.undefined
  
  // client ID
  var id: String
  
  // presence ID
  var p: Any
  
  // presence payload
  var pv: Double
  
  // channel
  var src: String
  
  // document version
  var t: js.UndefOr[String] = js.undefined
  
  // document ID
  var v: js.UndefOr[Double] = js.undefined
}
object PresenceMessage {
  
  inline def apply(ch: String, id: String, p: Any, pv: Double, src: String): PresenceMessage = {
    val __obj = js.Dynamic.literal(a = "p", ch = ch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresenceMessage] (val x: Self) extends AnyVal {
    
    inline def setA(value: p): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setP(value: Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPv(value: Double): Self = StObject.set(x, "pv", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
