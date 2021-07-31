package typings.skyway

import typings.std.RTCDataChannelInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  var dcInit: js.UndefOr[RTCDataChannelInit] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var serialization: js.UndefOr[String] = js.undefined
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDcInit(value: RTCDataChannelInit): Self = StObject.set(x, "dcInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDcInitUndefined: Self = StObject.set(x, "dcInit", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSerialization(value: String): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
