package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.CelB
import typings.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: CelB
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "CelB")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: CelB): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
