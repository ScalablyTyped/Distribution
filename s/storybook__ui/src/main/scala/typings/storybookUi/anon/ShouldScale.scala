package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldScale extends js.Object {
  
  var shouldScale: Boolean = js.native
}
object ShouldScale {
  
  @scala.inline
  def apply(shouldScale: Boolean): ShouldScale = {
    val __obj = js.Dynamic.literal(shouldScale = shouldScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldScale]
  }
  
  @scala.inline
  implicit class ShouldScaleOps[Self <: ShouldScale] (val x: Self) extends AnyVal {
    
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
    def setShouldScale(value: Boolean): Self = this.set("shouldScale", value.asInstanceOf[js.Any])
  }
}
