package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.large_
import typings.reactNative.reactNativeStrings.small_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityIndicatorProps extends ViewProps {
  /**
    * Whether to show the indicator (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  /**
    * The foreground color of the spinner (default is gray).
    */
  var color: js.UndefOr[ColorValue] = js.native
  /**
    * Whether the indicator should hide when not animating (true by default).
    */
  var hidesWhenStopped: js.UndefOr[Boolean] = js.native
  /**
    * Size of the indicator.
    * Small has a height of 20, large has a height of 36.
    *
    * enum('small', 'large')
    */
  var size: js.UndefOr[Double | small_ | large_] = js.native
}

object ActivityIndicatorProps {
  @scala.inline
  def apply(): ActivityIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityIndicatorProps]
  }
  @scala.inline
  implicit class ActivityIndicatorPropsOps[Self <: ActivityIndicatorProps] (val x: Self) extends AnyVal {
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    @scala.inline
    def setColor(value: ColorValue): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHidesWhenStopped(value: Boolean): Self = this.set("hidesWhenStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidesWhenStopped: Self = this.set("hidesWhenStopped", js.undefined)
    @scala.inline
    def setSize(value: Double | small_ | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

