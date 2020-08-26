package typings.reactOverlays.affixMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// put AffixProps inside the exported namespace so it's importable in AutoAffix
@js.native
trait AffixProps extends js.Object {
  /**
    * CSS class or classes to apply when affixed
    */
  var affixClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when affixed
    */
  var affixStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * CSS class or classes to apply when at bottom
    */
  var bottomClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when at bottom
    */
  var bottomStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Pixels to offset from bottom of screen when calculating position
    */
  var offsetBottom: js.UndefOr[Double] = js.native
  /**
    * Pixels to offset from top of screen when calculating position
    */
  var offsetTop: js.UndefOr[Double] = js.native
  /**
    * Callback fired when the right before the `affixStyle` and `affixStyle` props are rendered
    */
  var onAffix: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired when the right before the `bottomStyle` and `bottomClassName` props are rendered
    */
  var onAffixBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired when the right before the `topStyle` and `topClassName` props are rendered
    */
  var onAffixTop: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `affixStyle` and `affixClassName` props have been rendered.
    */
  var onAffixed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `bottomStyle` and `bottomClassName` props have been rendered.
    */
  var onAffixedBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `topStyle` and `topClassName` props have been rendered.
    */
  var onAffixedTop: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * CSS class or classes to apply when at top
    */
  var topClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when at top
    */
  var topStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * When affixed, pixels to offset from top of viewport
    */
  var viewportOffsetTop: js.UndefOr[Double] = js.native
}

object AffixProps {
  @scala.inline
  def apply(): AffixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixProps]
  }
  @scala.inline
  implicit class AffixPropsOps[Self <: AffixProps] (val x: Self) extends AnyVal {
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
    def setAffixClassName(value: String): Self = this.set("affixClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffixClassName: Self = this.set("affixClassName", js.undefined)
    @scala.inline
    def setAffixStyle(value: CSSProperties): Self = this.set("affixStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffixStyle: Self = this.set("affixStyle", js.undefined)
    @scala.inline
    def setBottomClassName(value: String): Self = this.set("bottomClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomClassName: Self = this.set("bottomClassName", js.undefined)
    @scala.inline
    def setBottomStyle(value: CSSProperties): Self = this.set("bottomStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomStyle: Self = this.set("bottomStyle", js.undefined)
    @scala.inline
    def setOffsetBottom(value: Double): Self = this.set("offsetBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBottom: Self = this.set("offsetBottom", js.undefined)
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    @scala.inline
    def setOnAffix(value: () => Unit): Self = this.set("onAffix", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffix: Self = this.set("onAffix", js.undefined)
    @scala.inline
    def setOnAffixBottom(value: () => Unit): Self = this.set("onAffixBottom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffixBottom: Self = this.set("onAffixBottom", js.undefined)
    @scala.inline
    def setOnAffixTop(value: () => Unit): Self = this.set("onAffixTop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffixTop: Self = this.set("onAffixTop", js.undefined)
    @scala.inline
    def setOnAffixed(value: () => Unit): Self = this.set("onAffixed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffixed: Self = this.set("onAffixed", js.undefined)
    @scala.inline
    def setOnAffixedBottom(value: () => Unit): Self = this.set("onAffixedBottom", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffixedBottom: Self = this.set("onAffixedBottom", js.undefined)
    @scala.inline
    def setOnAffixedTop(value: () => Unit): Self = this.set("onAffixedTop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAffixedTop: Self = this.set("onAffixedTop", js.undefined)
    @scala.inline
    def setTopClassName(value: String): Self = this.set("topClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopClassName: Self = this.set("topClassName", js.undefined)
    @scala.inline
    def setTopStyle(value: CSSProperties): Self = this.set("topStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopStyle: Self = this.set("topStyle", js.undefined)
    @scala.inline
    def setViewportOffsetTop(value: Double): Self = this.set("viewportOffsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportOffsetTop: Self = this.set("viewportOffsetTop", js.undefined)
  }
  
}

