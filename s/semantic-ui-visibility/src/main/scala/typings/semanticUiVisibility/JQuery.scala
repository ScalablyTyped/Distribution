package typings.semanticUiVisibility

import typings.semanticUiVisibility.SemanticUI.Visibility
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typings.semanticUiVisibility.SemanticUI.VisibilitySettings
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def visibility(): JQuery
  def visibility(behavior: setting, name: `type`, value: Unit): `false` | image | fixed
  def visibility(behavior: setting, name: `type`, value: `false`): JQuery
  def visibility(behavior: setting, name: `type`, value: fixed): JQuery
  def visibility(behavior: setting, name: `type`, value: image): JQuery
  def visibility(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery
  def visibility(behavior: setting, name: checkOnRefresh, value: Unit): Boolean
  def visibility(behavior: setting, name: className, value: Unit): ClassNameSettings
  def visibility(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def visibility(behavior: setting, name: context, value: String): JQuery
  def visibility(behavior: setting, name: context, value: Unit): String | JQuery
  def visibility(behavior: setting, name: context, value: JQuery): JQuery
  def visibility(behavior: setting, name: continuous, value: Boolean): JQuery
  def visibility(behavior: setting, name: continuous, value: Unit): Boolean
  def visibility(behavior: setting, name: debug, value: Boolean): JQuery
  def visibility(behavior: setting, name: debug, value: Unit): Boolean
  def visibility(behavior: setting, name: duration, value: Double): JQuery
  def visibility(behavior: setting, name: duration, value: Unit): Double
  def visibility(behavior: setting, name: error, value: Unit): ErrorSettings
  def visibility(behavior: setting, name: error, value: ErrorSettings): JQuery
  def visibility(behavior: setting, name: includeMargin, value: Boolean): JQuery
  def visibility(behavior: setting, name: includeMargin, value: Unit): Boolean
  def visibility(behavior: setting, name: initialCheck, value: Boolean): JQuery
  def visibility(behavior: setting, name: initialCheck, value: Unit): Boolean
  def visibility(behavior: setting, name: namespace, value: String): JQuery
  def visibility(behavior: setting, name: namespace, value: Unit): String
  def visibility(behavior: setting, name: name, value: String): JQuery
  def visibility(behavior: setting, name: name, value: Unit): String
  def visibility(behavior: setting, name: observeChanges, value: Boolean): JQuery
  def visibility(behavior: setting, name: observeChanges, value: Unit): Boolean
  def visibility(behavior: setting, name: offset, value: Double): JQuery
  def visibility(behavior: setting, name: offset, value: Unit): Double
  def visibility(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onAllLoaded, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onBottomPassedReverse, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onBottomPassed, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onBottomVisibleReverse, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onBottomVisible, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onFixed, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onLoad, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onOffScreen, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onOnScreen, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onPassingReverse, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onPassing, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onRefresh, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onTopPassedReverse, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onTopPassed, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onTopVisibleReverse, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onTopVisible, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def visibility(behavior: setting, name: onUnfixed, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def visibility(
    behavior: setting,
    name: onUpdate,
    value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ): JQuery
  def visibility(behavior: setting, name: onUpdate, value: Unit): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  def visibility(behavior: setting, name: once, value: Boolean): JQuery
  def visibility(behavior: setting, name: once, value: Unit): Boolean
  def visibility(behavior: setting, name: performance, value: Boolean): JQuery
  def visibility(behavior: setting, name: performance, value: Unit): Boolean
  def visibility(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery
  def visibility(behavior: setting, name: refreshOnLoad, value: Unit): Boolean
  def visibility(behavior: setting, name: refreshOnResize, value: Boolean): JQuery
  def visibility(behavior: setting, name: refreshOnResize, value: Unit): Boolean
  def visibility(behavior: setting, name: silent, value: Boolean): JQuery
  def visibility(behavior: setting, name: silent, value: Unit): Boolean
  def visibility(behavior: setting, name: throttle, value: Double): JQuery
  def visibility(behavior: setting, name: throttle, value: Unit): `false` | Double
  def visibility(behavior: setting, name: throttle, value: `false`): JQuery
  def visibility(behavior: setting, name: transition, value: String): JQuery
  def visibility(behavior: setting, name: transition, value: Unit): `false` | String
  def visibility(behavior: setting, name: transition, value: `false`): JQuery
  def visibility(behavior: setting, name: verbose, value: Boolean): JQuery
  def visibility(behavior: setting, name: verbose, value: Unit): Boolean
  def visibility(behavior: setting, name: zIndex, value: Double): JQuery
  def visibility(behavior: setting, name: zIndex, value: Unit): Double
  def visibility(settings: VisibilitySettings): JQuery
  @JSName("visibility")
  var visibility_Original: Visibility
  @JSName("visibility")
  def visibility_destroy(behavior: destroy): JQuery
  /**
    * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
    */
  @JSName("visibility")
  def visibility_disablecallbacks(behavior: `disable callbacks`): JQuery
  /**
    * Re-enable callbacks
    */
  @JSName("visibility")
  def visibility_enablecallbacks(behavior: `enable callbacks`): JQuery
  /**
    * Returns element calculations as object
    */
  @JSName("visibility")
  def visibility_getelementcalculations(behavior: `get element calculations`): ElementCalculations
  /**
    * Returns number of pixels passed in current element from top of element
    */
  @JSName("visibility")
  def visibility_getpixelspassed(behavior: `get pixels passed`): Double
  /**
    * Returns screen calculations as object
    */
  @JSName("visibility")
  def visibility_getscreencalculations(behavior: `get screen calculations`): ScreenCalculations
  /**
    * Returns screen size as object
    */
  @JSName("visibility")
  def visibility_getscreensize(behavior: `get screen size`): ScreenSize
  /**
    * Returns whether element is off screen
    */
  @JSName("visibility")
  def visibility_isoffscreen(behavior: `is off screen`): Boolean
  /**
    * Returns whether element is on screen
    */
  @JSName("visibility")
  def visibility_isonscreen(behavior: `is on screen`): Boolean
  @JSName("visibility")
  def visibility_setting(behavior: setting, value: VisibilitySettings): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(visibility: Visibility): JQuery = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisibility(value: Visibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
