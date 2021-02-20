package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.H263
import typings.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockRate extends StObject {
  
  var clockRate: `90000` = js.native
  
  var mediaType: V = js.native
  
  var name: H263 = js.native
}
object ClockRate {
  
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: H263): ClockRate = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockRate]
  }
  
  @scala.inline
  implicit class ClockRateMutableBuilder[Self <: ClockRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: H263): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
