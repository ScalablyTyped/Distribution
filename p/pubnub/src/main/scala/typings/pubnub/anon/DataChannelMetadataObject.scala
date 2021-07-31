package typings.pubnub.anon

import typings.pubnub.mod.ChannelMetadataObject
import typings.pubnub.mod.ObjectCustom
import typings.pubnub.pubnubStrings.channel
import typings.pubnub.pubnubStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChannelMetadataObject[ChannelCustom /* <: ObjectCustom */] extends StObject {
  
  var data: ChannelMetadataObject[ChannelCustom]
  
  var event: set
  
  var `type`: channel
}
object DataChannelMetadataObject {
  
  @scala.inline
  def apply[ChannelCustom /* <: ObjectCustom */](data: ChannelMetadataObject[ChannelCustom]): DataChannelMetadataObject[ChannelCustom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "set")
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[DataChannelMetadataObject[ChannelCustom]]
  }
  
  @scala.inline
  implicit class DataChannelMetadataObjectMutableBuilder[Self <: DataChannelMetadataObject[?], ChannelCustom /* <: ObjectCustom */] (val x: Self & DataChannelMetadataObject[ChannelCustom]) extends AnyVal {
    
    @scala.inline
    def setData(value: ChannelMetadataObject[ChannelCustom]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: set): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
