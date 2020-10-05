package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewPropsIOS extends TVViewPropsIOS {
  /**
    * Whether this view should be rendered as a bitmap before compositing.
    *
    * On iOS, this is useful for animations and interactions that do not modify this component's dimensions nor its children;
    * for example, when translating the position of a static view, rasterization allows the renderer to reuse a cached bitmap of a static view
    * and quickly composite it during each frame.
    *
    * Rasterization incurs an off-screen drawing pass and the bitmap consumes memory.
    * Test and measure when using this property.
    */
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
}

object ViewPropsIOS {
  @scala.inline
  def apply(): ViewPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPropsIOS]
  }
  @scala.inline
  implicit class ViewPropsIOSOps[Self <: ViewPropsIOS] (val x: Self) extends AnyVal {
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
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
  }
  
}

