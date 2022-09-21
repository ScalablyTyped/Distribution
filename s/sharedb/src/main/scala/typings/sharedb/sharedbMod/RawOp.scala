package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawOp extends StObject {
  
  var c: CollectionName
  
  var d: DocumentID
  
  var m: Any
  
  var seq: Double
  
  var src: String
  
  var v: VersionNumber
}
object RawOp {
  
  inline def apply(c: CollectionName, d: DocumentID, m: Any, seq: Double, src: String, v: VersionNumber): RawOp = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawOp]
  }
  
  extension [Self <: RawOp](x: Self) {
    
    inline def setC(value: CollectionName): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: DocumentID): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setM(value: Any): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setV(value: VersionNumber): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
