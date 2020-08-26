package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticUiSticky.semanticUiStickyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, keyof semantic-ui-sticky.SemanticUI.StickySettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var bottomOffset: js.UndefOr[Double] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var context: js.UndefOr[`false` | String | JQuery] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var jitter: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onBottom: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onReposition: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onScroll: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onStick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTop: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onUnstick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var pushing: js.UndefOr[Boolean] = js.native
  var scrollContext: js.UndefOr[String | JQuery] = js.native
  var setSize: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def setBottomOffset(value: Double): Self = this.set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomOffset: Self = this.set("bottomOffset", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnBottom(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBottom: Self = this.set("onBottom", js.undefined)
    @scala.inline
    def setOnReposition(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onReposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReposition: Self = this.set("onReposition", js.undefined)
    @scala.inline
    def setOnScroll(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnStick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onStick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStick: Self = this.set("onStick", js.undefined)
    @scala.inline
    def setOnTop(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTop: Self = this.set("onTop", js.undefined)
    @scala.inline
    def setOnUnstick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onUnstick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnstick: Self = this.set("onUnstick", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setPushing(value: Boolean): Self = this.set("pushing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushing: Self = this.set("pushing", js.undefined)
    @scala.inline
    def setScrollContext(value: String | JQuery): Self = this.set("scrollContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollContext: Self = this.set("scrollContext", js.undefined)
    @scala.inline
    def setSetSize(value: Boolean): Self = this.set("setSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

