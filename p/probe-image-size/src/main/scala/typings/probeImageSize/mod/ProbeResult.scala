package typings.probeImageSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProbeResult extends js.Object {
  
  var hUnits: String = js.native
  
  var height: Double = js.native
  
  var length: Double = js.native
  
  var mime: String = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
  
  var wUnits: String = js.native
  
  var width: Double = js.native
}
object ProbeResult {
  
  @scala.inline
  def apply(
    hUnits: String,
    height: Double,
    length: Double,
    mime: String,
    `type`: String,
    url: String,
    wUnits: String,
    width: Double
  ): ProbeResult = {
    val __obj = js.Dynamic.literal(hUnits = hUnits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wUnits = wUnits.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProbeResult]
  }
  
  @scala.inline
  implicit class ProbeResultOps[Self <: ProbeResult] (val x: Self) extends AnyVal {
    
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
    def setHUnits(value: String): Self = this.set("hUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUnits(value: String): Self = this.set("wUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
