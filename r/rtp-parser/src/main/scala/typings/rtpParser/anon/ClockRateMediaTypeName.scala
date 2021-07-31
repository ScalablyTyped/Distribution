package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.nv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockRateMediaTypeName extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: nv
}
object ClockRateMediaTypeName {
  
  @scala.inline
  def apply(): ClockRateMediaTypeName = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "nv")
    __obj.asInstanceOf[ClockRateMediaTypeName]
  }
  
  @scala.inline
  implicit class ClockRateMediaTypeNameMutableBuilder[Self <: ClockRateMediaTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: nv): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
