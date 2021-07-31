package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `44100`
  
  var mediaType: A
  
  var name: L16
}
object `9` {
  
  @scala.inline
  def apply(): `9` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 44100, mediaType = "A", name = "L16")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `44100`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: L16): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
