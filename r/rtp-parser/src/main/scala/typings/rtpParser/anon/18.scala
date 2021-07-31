package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.reserved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var mediaType: A
  
  var name: reserved
}
object `18` {
  
  @scala.inline
  def apply(): `18` = {
    val __obj = js.Dynamic.literal(mediaType = "A", name = "reserved")
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: reserved): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
