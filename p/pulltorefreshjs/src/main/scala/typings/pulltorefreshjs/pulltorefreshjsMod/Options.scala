package typings.pulltorefreshjs.pulltorefreshjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * What class prefix for the elements?
    * (default: `ptr--`)
    */
  var classPrefix: js.UndefOr[String] = js.undefined
  /**
    * What property will be used to calculate the element's proportions?
    * (default: `min-height`)
    */
  var cssProp: js.UndefOr[String] = js.undefined
  /**
    * Maximum distance possible for the element.
    * (default: `80`)
    */
  var distMax: js.UndefOr[Double] = js.undefined
  /**
    * After the `distThreshold` is reached and released, the element will have this height.
    * (default: `50`)
    */
  var distReload: js.UndefOr[Double] = js.undefined
  /**
    * Minimum distance required to trigger the refresh.
    * (default: `60`)
    */
  var distThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The icon for both `instructionsPullToRefresh` and `instructionsReleaseToRefresh`
    * (default: `&#8675;`)
    */
  var iconArrow: js.UndefOr[String] = js.undefined
  /**
    * The icon when the refresh is in progress.
    * (default: `&hellip;`)
    */
  var iconRefreshing: js.UndefOr[String] = js.undefined
  /**
    * The initial instructions string.
    * (default: `Pull down to refresh`)
    */
  var instructionsPullToRefresh: js.UndefOr[String] = js.undefined
  /**
    * The refreshing text.
    * (default: `Refreshing`)
    */
  var instructionsRefreshing: js.UndefOr[String] = js.undefined
  /**
    * The instructions string when the `distThreshold` has been reached.
    * (default: `Release to refresh`)
    */
  var instructionsReleaseToRefresh: js.UndefOr[String] = js.undefined
  /**
    * Before which element the pull to refresh elements will be?
    * (default: `body`)
    */
  var mainElement: js.UndefOr[String] = js.undefined
  /**
    * The initialize function.
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * What will the pull to refresh trigger? You can return a promise.
    *
    * Defaults to `window.location.reload()`
    */
  var onRefresh: js.UndefOr[js.Function0[js.Thenable[Unit] | Unit]] = js.undefined
  /**
    * This value will be passed as `{ passive: true|false }` to `touchmove`
    * listeners if passive-handlers are supported.
    *
    * Defaults to `false`
    */
  var passive: js.UndefOr[Boolean] = js.undefined
  /**
    * What class will the main element have?
    * (default: `.ptr`)
    */
  var ptrElement: js.UndefOr[String] = js.undefined
  /**
    * The delay, in milliseconds before the `onRefresh` is triggered.
    * (default: `500`)
    */
  var refreshTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The resistance function, accepts one parameter, must return a number, capping at 1.
    *
    * Defaults to `t => Math.min(1, t / 2.5)`
    */
  var resistanceFunction: js.UndefOr[js.Function1[/* input */ Double, Double]] = js.undefined
  /**
    * Which condition should be met for pullToRefresh to trigger?
    *
    * Defaults to `!window.scrollY`
    */
  var shouldPullToRefresh: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * Which element should trigger the pull to refresh?
    * (default: `body`)
    */
  var triggerElement: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classPrefix: String = null,
    cssProp: String = null,
    distMax: Int | Double = null,
    distReload: Int | Double = null,
    distThreshold: Int | Double = null,
    iconArrow: String = null,
    iconRefreshing: String = null,
    instructionsPullToRefresh: String = null,
    instructionsRefreshing: String = null,
    instructionsReleaseToRefresh: String = null,
    mainElement: String = null,
    onInit: () => Unit = null,
    onRefresh: () => js.Thenable[Unit] | Unit = null,
    passive: js.UndefOr[Boolean] = js.undefined,
    ptrElement: String = null,
    refreshTimeout: Int | Double = null,
    resistanceFunction: /* input */ Double => Double = null,
    shouldPullToRefresh: () => Boolean = null,
    triggerElement: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (cssProp != null) __obj.updateDynamic("cssProp")(cssProp)
    if (distMax != null) __obj.updateDynamic("distMax")(distMax.asInstanceOf[js.Any])
    if (distReload != null) __obj.updateDynamic("distReload")(distReload.asInstanceOf[js.Any])
    if (distThreshold != null) __obj.updateDynamic("distThreshold")(distThreshold.asInstanceOf[js.Any])
    if (iconArrow != null) __obj.updateDynamic("iconArrow")(iconArrow)
    if (iconRefreshing != null) __obj.updateDynamic("iconRefreshing")(iconRefreshing)
    if (instructionsPullToRefresh != null) __obj.updateDynamic("instructionsPullToRefresh")(instructionsPullToRefresh)
    if (instructionsRefreshing != null) __obj.updateDynamic("instructionsRefreshing")(instructionsRefreshing)
    if (instructionsReleaseToRefresh != null) __obj.updateDynamic("instructionsReleaseToRefresh")(instructionsReleaseToRefresh)
    if (mainElement != null) __obj.updateDynamic("mainElement")(mainElement)
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction0(onRefresh))
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    if (ptrElement != null) __obj.updateDynamic("ptrElement")(ptrElement)
    if (refreshTimeout != null) __obj.updateDynamic("refreshTimeout")(refreshTimeout.asInstanceOf[js.Any])
    if (resistanceFunction != null) __obj.updateDynamic("resistanceFunction")(js.Any.fromFunction1(resistanceFunction))
    if (shouldPullToRefresh != null) __obj.updateDynamic("shouldPullToRefresh")(js.Any.fromFunction0(shouldPullToRefresh))
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement)
    __obj.asInstanceOf[Options]
  }
}

