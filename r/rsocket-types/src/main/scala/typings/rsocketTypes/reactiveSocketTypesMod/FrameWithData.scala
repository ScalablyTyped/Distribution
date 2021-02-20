package typings.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameWithData extends StObject {
  
  var data: js.UndefOr[Encodable] = js.native
  
  var metadata: js.UndefOr[Encodable] = js.native
}
object FrameWithData {
  
  @scala.inline
  def apply(): FrameWithData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameWithData]
  }
  
  @scala.inline
  implicit class FrameWithDataMutableBuilder[Self <: FrameWithData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
