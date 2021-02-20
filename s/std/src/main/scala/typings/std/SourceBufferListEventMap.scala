package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceBufferListEventMap extends StObject {
  
  var addsourcebuffer: Event = js.native
  
  var removesourcebuffer: Event = js.native
}
object SourceBufferListEventMap {
  
  @scala.inline
  def apply(addsourcebuffer: Event, removesourcebuffer: Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  @scala.inline
  implicit class SourceBufferListEventMapMutableBuilder[Self <: SourceBufferListEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddsourcebuffer(value: Event): Self = StObject.set(x, "addsourcebuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovesourcebuffer(value: Event): Self = StObject.set(x, "removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
