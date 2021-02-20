package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`2` = js.native
  
  var clockRate: `44100` = js.native
  
  var mediaType: A = js.native
  
  var name: L16 = js.native
}
object `10` {
  
  @scala.inline
  def apply(channels: typings.rtpParser.rtpParserNumbers.`2`, clockRate: `44100`, mediaType: A, name: L16): `10` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: typings.rtpParser.rtpParserNumbers.`2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `44100`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: L16): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
