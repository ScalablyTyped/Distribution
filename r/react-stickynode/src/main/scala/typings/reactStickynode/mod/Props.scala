package typings.reactStickynode.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Class name to be applied to the element when the sticky state is
    * active ('active' by default).
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * The offset from the top of document which release state will be
    * triggered when the bottom of the element reaches at. If it is a
    * selector to a target (via `querySelector()`), the offset will be the
    * bottom of the target.
    */
  var bottomBoundary: js.UndefOr[Double | String] = js.native
  var children: ReactNode | (js.Function1[/* status */ Status, ReactNode]) = js.native
  /** Enable the use of CSS3 transforms (`true` by default). */
  var enableTransforms: js.UndefOr[Boolean] = js.native
  /** The switch to enable or disable Sticky (true by default ). */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Class name to be applied to the inner element ('' by default).
    */
  var innerClass: js.UndefOr[String] = js.native
  /** z-index of the sticky */
  var innerZ: js.UndefOr[Double | String] = js.native
  /** Callback for when the sticky state changes. */
  var onStateChange: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.native
  /**
    * Class name to be applied to the element when the sticky state is
    * released ('released' by default).
    */
  var releasedClass: js.UndefOr[String] = js.native
  /**
    * Callback to indicate when the sticky plugin should freeze position
    * and ignore scroll/resize events.
    */
  var shouldFreeze: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * The offset from the top of window where the top of the element will
    * be when sticky state is triggered(0 by default ). If it is a selector
    * to a target (via `querySelector()`), the offset will be the height of
    * the target.
    */
  var top: js.UndefOr[Double | String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setBottomBoundary(value: Double | String): Self = this.set("bottomBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomBoundary: Self = this.set("bottomBoundary", js.undefined)
    @scala.inline
    def setChildrenFunction1(value: /* status */ Status => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode | (js.Function1[/* status */ Status, ReactNode])): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setEnableTransforms(value: Boolean): Self = this.set("enableTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTransforms: Self = this.set("enableTransforms", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setInnerClass(value: String): Self = this.set("innerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerClass: Self = this.set("innerClass", js.undefined)
    @scala.inline
    def setInnerZ(value: Double | String): Self = this.set("innerZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerZ: Self = this.set("innerZ", js.undefined)
    @scala.inline
    def setOnStateChange(value: /* status */ Status => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    @scala.inline
    def setReleasedClass(value: String): Self = this.set("releasedClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleasedClass: Self = this.set("releasedClass", js.undefined)
    @scala.inline
    def setShouldFreeze(value: () => Boolean): Self = this.set("shouldFreeze", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldFreeze: Self = this.set("shouldFreeze", js.undefined)
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

