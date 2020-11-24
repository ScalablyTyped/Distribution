package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`90000`
import typings.rtpParser.rtpParserStrings.MPV
import typings.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockRateMediaType extends js.Object {
  
  var clockRate: `90000` = js.native
  
  var mediaType: V = js.native
  
  var name: MPV = js.native
}
object ClockRateMediaType {
  
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: MPV): ClockRateMediaType = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockRateMediaType]
  }
  
  @scala.inline
  implicit class ClockRateMediaTypeOps[Self <: ClockRateMediaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClockRate(value: `90000`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: V): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: MPV): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
