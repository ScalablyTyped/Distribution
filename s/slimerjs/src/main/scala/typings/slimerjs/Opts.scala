package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opts extends StObject {
  
  var charset: String = js.native
  
  var mode: String = js.native
  
  var nobuffer: Boolean = js.native
}
object Opts {
  
  @scala.inline
  def apply(charset: String, mode: String, nobuffer: Boolean): Opts = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nobuffer = nobuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  @scala.inline
  implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNobuffer(value: Boolean): Self = StObject.set(x, "nobuffer", value.asInstanceOf[js.Any])
  }
}
