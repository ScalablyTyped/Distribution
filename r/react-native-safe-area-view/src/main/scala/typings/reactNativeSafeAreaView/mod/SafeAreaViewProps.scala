package typings.reactNativeSafeAreaView.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeSafeAreaView.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeAreaViewProps extends ViewProps {
  var forceInset: js.UndefOr[Bottom] = js.native
}

object SafeAreaViewProps {
  @scala.inline
  def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  @scala.inline
  implicit class SafeAreaViewPropsOps[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
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
    def setForceInset(value: Bottom): Self = this.set("forceInset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceInset: Self = this.set("forceInset", js.undefined)
  }
  
}

