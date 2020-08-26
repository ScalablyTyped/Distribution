package typings.semanticUiVisibility.SemanticUI

import typings.semanticUiVisibility.JQuery
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.`type`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.checkOnRefresh
import typings.semanticUiVisibility.semanticUiVisibilityStrings.className
import typings.semanticUiVisibility.semanticUiVisibilityStrings.context
import typings.semanticUiVisibility.semanticUiVisibilityStrings.continuous
import typings.semanticUiVisibility.semanticUiVisibilityStrings.debug
import typings.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typings.semanticUiVisibility.semanticUiVisibilityStrings.duration
import typings.semanticUiVisibility.semanticUiVisibilityStrings.error
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import typings.semanticUiVisibility.semanticUiVisibilityStrings.includeMargin
import typings.semanticUiVisibility.semanticUiVisibilityStrings.initialCheck
import typings.semanticUiVisibility.semanticUiVisibilityStrings.name
import typings.semanticUiVisibility.semanticUiVisibilityStrings.namespace
import typings.semanticUiVisibility.semanticUiVisibilityStrings.observeChanges
import typings.semanticUiVisibility.semanticUiVisibilityStrings.offset
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onAllLoaded
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassedReverse
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisible
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisibleReverse
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onFixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onLoad
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onOffScreen
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onOnScreen
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onPassing
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onPassingReverse
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onRefresh
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassedReverse
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisible
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisibleReverse
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onUnfixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.onUpdate
import typings.semanticUiVisibility.semanticUiVisibilityStrings.once
import typings.semanticUiVisibility.semanticUiVisibilityStrings.performance
import typings.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnLoad
import typings.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnResize
import typings.semanticUiVisibility.semanticUiVisibilityStrings.setting
import typings.semanticUiVisibility.semanticUiVisibilityStrings.silent
import typings.semanticUiVisibility.semanticUiVisibilityStrings.throttle
import typings.semanticUiVisibility.semanticUiVisibilityStrings.transition
import typings.semanticUiVisibility.semanticUiVisibilityStrings.verbose
import typings.semanticUiVisibility.semanticUiVisibilityStrings.zIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visibility_ extends js.Object {
  var settings: VisibilitySettings = js.native
  def apply(): JQuery = js.native
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  def apply(behavior: `disable callbacks`): JQuery = js.native
  /**
    * Re-enable callbacks
    */
  def apply(behavior: `enable callbacks`): JQuery = js.native
  /**
    * Returns element calculations as object
    */
  def apply(behavior: `get element calculations`): ElementCalculations = js.native
  /**
    * Returns number of pixels passed in current element from top of element
    */
  def apply(behavior: `get pixels passed`): Double = js.native
  /**
    * Returns screen calculations as object
    */
  def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
  /**
    * Returns screen size as object
    */
  def apply(behavior: `get screen size`): ScreenSize = js.native
  /**
    * Returns whether element is off screen
    */
  def apply(behavior: `is off screen`): Boolean = js.native
  /**
    * Returns whether element is on screen
    */
  def apply(behavior: `is on screen`): Boolean = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): `false` | image | fixed = js.native
  def apply(behavior: setting, name: `type`, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: fixed): JQuery = js.native
  def apply(behavior: setting, name: `type`, value: image): JQuery = js.native
  def apply(behavior: setting, name: checkOnRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: continuous, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: continuous, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: includeMargin, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: includeMargin, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: initialCheck, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: initialCheck, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onAllLoaded, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onBottomVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onFixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOffScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOnScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassingReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onPassing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onRefresh, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTopVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUnfixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUpdate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = js.native
  def apply(
    behavior: setting,
    name: onUpdate,
    value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: once, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: once, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: refreshOnResize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: refreshOnResize, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
  def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
  def apply(behavior: setting, name: throttle, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: transition, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: zIndex, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: zIndex, value: Double): JQuery = js.native
  def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
  def apply(settings: VisibilitySettings): JQuery = js.native
}

