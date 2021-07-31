package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.MPA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: A
  
  var name: MPA
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "A", name = "MPA")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: MPA): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
