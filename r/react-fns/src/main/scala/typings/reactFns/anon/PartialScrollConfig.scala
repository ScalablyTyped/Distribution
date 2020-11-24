package typings.reactFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-fns.react-fns/dist/Scroll/Scroll.ScrollConfig> */
@js.native
trait PartialScrollConfig extends js.Object {
  
  var throttle: js.UndefOr[Double] = js.native
}
object PartialScrollConfig {
  
  @scala.inline
  def apply(): PartialScrollConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollConfig]
  }
  
  @scala.inline
  implicit class PartialScrollConfigOps[Self <: PartialScrollConfig] (val x: Self) extends AnyVal {
    
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
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
}
