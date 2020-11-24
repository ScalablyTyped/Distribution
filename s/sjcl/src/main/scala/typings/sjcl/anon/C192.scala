package typings.sjcl.anon

import typings.sjcl.mod.SjclEllipticalCurve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait C192 extends js.Object {
  
  var c192: SjclEllipticalCurve = js.native
  
  var c224: SjclEllipticalCurve = js.native
  
  var c256: SjclEllipticalCurve = js.native
  
  var c384: SjclEllipticalCurve = js.native
  
  var c521: SjclEllipticalCurve = js.native
  
  var k192: SjclEllipticalCurve = js.native
  
  var k224: SjclEllipticalCurve = js.native
  
  var k256: SjclEllipticalCurve = js.native
}
object C192 {
  
  @scala.inline
  def apply(
    c192: SjclEllipticalCurve,
    c224: SjclEllipticalCurve,
    c256: SjclEllipticalCurve,
    c384: SjclEllipticalCurve,
    c521: SjclEllipticalCurve,
    k192: SjclEllipticalCurve,
    k224: SjclEllipticalCurve,
    k256: SjclEllipticalCurve
  ): C192 = {
    val __obj = js.Dynamic.literal(c192 = c192.asInstanceOf[js.Any], c224 = c224.asInstanceOf[js.Any], c256 = c256.asInstanceOf[js.Any], c384 = c384.asInstanceOf[js.Any], c521 = c521.asInstanceOf[js.Any], k192 = k192.asInstanceOf[js.Any], k224 = k224.asInstanceOf[js.Any], k256 = k256.asInstanceOf[js.Any])
    __obj.asInstanceOf[C192]
  }
  
  @scala.inline
  implicit class C192Ops[Self <: C192] (val x: Self) extends AnyVal {
    
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
    def setC192(value: SjclEllipticalCurve): Self = this.set("c192", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC224(value: SjclEllipticalCurve): Self = this.set("c224", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC256(value: SjclEllipticalCurve): Self = this.set("c256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC384(value: SjclEllipticalCurve): Self = this.set("c384", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC521(value: SjclEllipticalCurve): Self = this.set("c521", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK192(value: SjclEllipticalCurve): Self = this.set("k192", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK224(value: SjclEllipticalCurve): Self = this.set("k224", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK256(value: SjclEllipticalCurve): Self = this.set("k256", value.asInstanceOf[js.Any])
  }
}
