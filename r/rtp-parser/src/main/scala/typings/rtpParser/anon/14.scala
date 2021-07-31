package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`16000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `16000`
  
  var mediaType: A
  
  var name: DVI4
}
object `14` {
  
  @scala.inline
  def apply(): `14` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 16000, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `16000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
