package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPMLine extends StObject {
  
  var fmt: js.UndefOr[String] = js.undefined
  
  var kind: String
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: String
}
object SDPMLine {
  
  @scala.inline
  def apply(kind: String, protocol: String): SDPMLine = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMLine]
  }
  
  @scala.inline
  implicit class SDPMLineMutableBuilder[Self <: SDPMLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFmt(value: String): Self = StObject.set(x, "fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmtUndefined: Self = StObject.set(x, "fmt", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
