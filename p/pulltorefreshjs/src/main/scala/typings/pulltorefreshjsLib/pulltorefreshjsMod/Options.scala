package typings
package pulltorefreshjsLib.pulltorefreshjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * What class prefix for the elements?
    * (default: `ptr--`)
    */
  var classPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What property will be used to calculate the element's proportions?
    * (default: `min-height`)
    */
  var cssProp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum distance possible for the element.
    * (default: `80`)
    */
  var distMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * After the `distThreshold` is reached and released, the element will have this height.
    * (default: `50`)
    */
  var distReload: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum distance required to trigger the refresh.
    * (default: `60`)
    */
  var distThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * The icon for both `instructionsPullToRefresh` and `instructionsReleaseToRefresh`
    * (default: `&#8675;`)
    */
  var iconArrow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The icon when the refresh is in progress.
    * (default: `&hellip;`)
    */
  var iconRefreshing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial instructions string.
    * (default: `Pull down to refresh`)
    */
  var instructionsPullToRefresh: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The refreshing text.
    * (default: `Refreshing`)
    */
  var instructionsRefreshing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The instructions string when the `distThreshold` has been reached.
    * (default: `Release to refresh`)
    */
  var instructionsReleaseToRefresh: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Before which element the pull to refresh elements will be?
    * (default: `body`)
    */
  var mainElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initialize function.
    */
  var onInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * What will the pull to refresh trigger? You can return a promise.
    *
    * Defaults to `window.location.reload()`
    */
  var onRefresh: js.UndefOr[js.Function0[js.Thenable[scala.Unit]] | js.Function0[scala.Unit]] = js.undefined
  /**
    * This value will be passed as `{ passive: true|false }` to `touchmove`
    * listeners if passive-handlers are supported.
    *
    * Defaults to `false`
    */
  var passive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What class will the main element have?
    * (default: `.ptr`)
    */
  var ptrElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The delay, in milliseconds before the `onRefresh` is triggered.
    * (default: `500`)
    */
  var refreshTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The resistance function, accepts one parameter, must return a number, capping at 1.
    *
    * Defaults to `t => Math.min(1, t / 2.5)`
    */
  var resistanceFunction: js.UndefOr[js.Function1[/* input */ scala.Double, scala.Double]] = js.undefined
  /**
    * Which condition should be met for pullToRefresh to trigger?
    *
    * Defaults to `!window.scrollY`
    */
  var shouldPullToRefresh: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /**
    * Which element should trigger the pull to refresh?
    * (default: `body`)
    */
  var triggerElement: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classPrefix: java.lang.String = null,
    cssProp: java.lang.String = null,
    distMax: scala.Int | scala.Double = null,
    distReload: scala.Int | scala.Double = null,
    distThreshold: scala.Int | scala.Double = null,
    iconArrow: java.lang.String = null,
    iconRefreshing: java.lang.String = null,
    instructionsPullToRefresh: java.lang.String = null,
    instructionsRefreshing: java.lang.String = null,
    instructionsReleaseToRefresh: java.lang.String = null,
    mainElement: java.lang.String = null,
    onInit: js.Function0[scala.Unit] = null,
    onRefresh: js.Function0[js.Thenable[scala.Unit]] | js.Function0[scala.Unit] = null,
    passive: js.UndefOr[scala.Boolean] = js.undefined,
    ptrElement: java.lang.String = null,
    refreshTimeout: scala.Int | scala.Double = null,
    resistanceFunction: js.Function1[/* input */ scala.Double, scala.Double] = null,
    shouldPullToRefresh: js.Function0[scala.Boolean] = null,
    triggerElement: java.lang.String = null
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
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(onRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    if (ptrElement != null) __obj.updateDynamic("ptrElement")(ptrElement)
    if (refreshTimeout != null) __obj.updateDynamic("refreshTimeout")(refreshTimeout.asInstanceOf[js.Any])
    if (resistanceFunction != null) __obj.updateDynamic("resistanceFunction")(resistanceFunction)
    if (shouldPullToRefresh != null) __obj.updateDynamic("shouldPullToRefresh")(shouldPullToRefresh)
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement)
    __obj.asInstanceOf[Options]
  }
}

