package typings.pulltorefreshjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * What class prefix for the elements?
    * (default: `ptr--`)
    */
  var classPrefix: js.UndefOr[String] = js.native
  /**
    * What property will be used to calculate the element's proportions?
    * (default: `min-height`)
    */
  var cssProp: js.UndefOr[String] = js.native
  /**
    * After which distance should we start pulling.
    * (Default: `0`)
    */
  var distIgnore: js.UndefOr[Double] = js.native
  /**
    * Maximum distance possible for the element.
    * (default: `80`)
    */
  var distMax: js.UndefOr[Double] = js.native
  /**
    * After the `distThreshold` is reached and released, the element will have this height.
    * (default: `50`)
    */
  var distReload: js.UndefOr[Double] = js.native
  /**
    * Minimum distance required to trigger the refresh.
    * (default: `60`)
    */
  var distThreshold: js.UndefOr[Double] = js.native
  /**
    * It returns the default HTML for the widget, __PREFIX__ is replaced.
    */
  var getMarkup: js.UndefOr[js.Function0[String]] = js.native
  /**
    * It returns the default CSS for the widget, __PREFIX__ is replaced.
    */
  var getStyles: js.UndefOr[js.Function0[String]] = js.native
  /**
    * The icon for both `instructionsPullToRefresh` and `instructionsReleaseToRefresh`
    * (default: `&#8675;`)
    */
  var iconArrow: js.UndefOr[String] = js.native
  /**
    * The icon when the refresh is in progress.
    * (default: `&hellip;`)
    */
  var iconRefreshing: js.UndefOr[String] = js.native
  /**
    * The initial instructions string.
    * (default: `Pull down to refresh`)
    */
  var instructionsPullToRefresh: js.UndefOr[String] = js.native
  /**
    * The refreshing text.
    * (default: `Refreshing`)
    */
  var instructionsRefreshing: js.UndefOr[String] = js.native
  /**
    * The instructions string when the `distThreshold` has been reached.
    * (default: `Release to refresh`)
    */
  var instructionsReleaseToRefresh: js.UndefOr[String] = js.native
  /**
    * Before which element the pull to refresh elements will be?
    * (default: `body`)
    */
  var mainElement: js.UndefOr[String] = js.native
  /**
    * The initialize function.
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * What will the pull to refresh trigger? You can return a promise.
    *
    * Defaults to `window.location.reload()`
    */
  var onRefresh: js.UndefOr[js.Function0[js.Thenable[Unit] | Unit]] = js.native
  /**
    * What class will the main element have?
    * (default: `.ptr`)
    */
  var ptrElement: js.UndefOr[String] = js.native
  /**
    * The delay, in milliseconds before the `onRefresh` is triggered.
    * (default: `500`)
    */
  var refreshTimeout: js.UndefOr[Double] = js.native
  /**
    * The resistance function, accepts one parameter, must return a number, capping at 1.
    *
    * Defaults to `t => Math.min(1, t / 2.5)`
    */
  var resistanceFunction: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.native
  /**
    * Which condition should be met for pullToRefresh to trigger?
    *
    * Defaults to `!window.scrollY`
    */
  var shouldPullToRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * Which element should trigger the pull to refresh?
    * (default: `body`)
    */
  var triggerElement: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setClassPrefix(value: String): Self = this.set("classPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassPrefix: Self = this.set("classPrefix", js.undefined)
    @scala.inline
    def setCssProp(value: String): Self = this.set("cssProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssProp: Self = this.set("cssProp", js.undefined)
    @scala.inline
    def setDistIgnore(value: Double): Self = this.set("distIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistIgnore: Self = this.set("distIgnore", js.undefined)
    @scala.inline
    def setDistMax(value: Double): Self = this.set("distMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistMax: Self = this.set("distMax", js.undefined)
    @scala.inline
    def setDistReload(value: Double): Self = this.set("distReload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistReload: Self = this.set("distReload", js.undefined)
    @scala.inline
    def setDistThreshold(value: Double): Self = this.set("distThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistThreshold: Self = this.set("distThreshold", js.undefined)
    @scala.inline
    def setGetMarkup(value: () => String): Self = this.set("getMarkup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMarkup: Self = this.set("getMarkup", js.undefined)
    @scala.inline
    def setGetStyles(value: () => String): Self = this.set("getStyles", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStyles: Self = this.set("getStyles", js.undefined)
    @scala.inline
    def setIconArrow(value: String): Self = this.set("iconArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconArrow: Self = this.set("iconArrow", js.undefined)
    @scala.inline
    def setIconRefreshing(value: String): Self = this.set("iconRefreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconRefreshing: Self = this.set("iconRefreshing", js.undefined)
    @scala.inline
    def setInstructionsPullToRefresh(value: String): Self = this.set("instructionsPullToRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionsPullToRefresh: Self = this.set("instructionsPullToRefresh", js.undefined)
    @scala.inline
    def setInstructionsRefreshing(value: String): Self = this.set("instructionsRefreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionsRefreshing: Self = this.set("instructionsRefreshing", js.undefined)
    @scala.inline
    def setInstructionsReleaseToRefresh(value: String): Self = this.set("instructionsReleaseToRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructionsReleaseToRefresh: Self = this.set("instructionsReleaseToRefresh", js.undefined)
    @scala.inline
    def setMainElement(value: String): Self = this.set("mainElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainElement: Self = this.set("mainElement", js.undefined)
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    @scala.inline
    def setOnRefresh(value: () => js.Thenable[Unit] | Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setPtrElement(value: String): Self = this.set("ptrElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePtrElement: Self = this.set("ptrElement", js.undefined)
    @scala.inline
    def setRefreshTimeout(value: Double): Self = this.set("refreshTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshTimeout: Self = this.set("refreshTimeout", js.undefined)
    @scala.inline
    def setResistanceFunction(value: /* input */ Double => Double): Self = this.set("resistanceFunction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResistanceFunction: Self = this.set("resistanceFunction", js.undefined)
    @scala.inline
    def setShouldPullToRefresh(value: () => Boolean): Self = this.set("shouldPullToRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldPullToRefresh: Self = this.set("shouldPullToRefresh", js.undefined)
    @scala.inline
    def setTriggerElement(value: String): Self = this.set("triggerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerElement: Self = this.set("triggerElement", js.undefined)
  }
  
}

