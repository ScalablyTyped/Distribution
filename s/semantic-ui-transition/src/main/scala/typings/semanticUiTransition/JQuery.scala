package typings.semanticUiTransition

import typings.semanticUiTransition.SemanticUI.Transition
import typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typings.semanticUiTransition.SemanticUI.TransitionSettings
import typings.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typings.semanticUiTransition.semanticUiTransitionStrings.`clear queue`
import typings.semanticUiTransition.semanticUiTransitionStrings.`force repaint`
import typings.semanticUiTransition.semanticUiTransitionStrings.`get animation event`
import typings.semanticUiTransition.semanticUiTransitionStrings.`get animation name`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is animating`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is looping`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is supported`
import typings.semanticUiTransition.semanticUiTransitionStrings.`is visible`
import typings.semanticUiTransition.semanticUiTransitionStrings.`remove looping`
import typings.semanticUiTransition.semanticUiTransitionStrings.`restore conditions`
import typings.semanticUiTransition.semanticUiTransitionStrings.`save conditions`
import typings.semanticUiTransition.semanticUiTransitionStrings.`set duration`
import typings.semanticUiTransition.semanticUiTransitionStrings.`stop all`
import typings.semanticUiTransition.semanticUiTransitionStrings.allowRepeats
import typings.semanticUiTransition.semanticUiTransitionStrings.animation
import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import typings.semanticUiTransition.semanticUiTransitionStrings.className
import typings.semanticUiTransition.semanticUiTransitionStrings.debug
import typings.semanticUiTransition.semanticUiTransitionStrings.destroy
import typings.semanticUiTransition.semanticUiTransitionStrings.disable
import typings.semanticUiTransition.semanticUiTransitionStrings.displayType
import typings.semanticUiTransition.semanticUiTransitionStrings.duration
import typings.semanticUiTransition.semanticUiTransitionStrings.enable
import typings.semanticUiTransition.semanticUiTransitionStrings.error
import typings.semanticUiTransition.semanticUiTransitionStrings.hide
import typings.semanticUiTransition.semanticUiTransitionStrings.interval
import typings.semanticUiTransition.semanticUiTransitionStrings.looping
import typings.semanticUiTransition.semanticUiTransitionStrings.name
import typings.semanticUiTransition.semanticUiTransitionStrings.namespace
import typings.semanticUiTransition.semanticUiTransitionStrings.onComplete
import typings.semanticUiTransition.semanticUiTransitionStrings.onHide
import typings.semanticUiTransition.semanticUiTransitionStrings.onShow
import typings.semanticUiTransition.semanticUiTransitionStrings.onStart
import typings.semanticUiTransition.semanticUiTransitionStrings.performance
import typings.semanticUiTransition.semanticUiTransitionStrings.queue
import typings.semanticUiTransition.semanticUiTransitionStrings.repaint
import typings.semanticUiTransition.semanticUiTransitionStrings.reset
import typings.semanticUiTransition.semanticUiTransitionStrings.reverse
import typings.semanticUiTransition.semanticUiTransitionStrings.setting
import typings.semanticUiTransition.semanticUiTransitionStrings.show
import typings.semanticUiTransition.semanticUiTransitionStrings.silent
import typings.semanticUiTransition.semanticUiTransitionStrings.stop
import typings.semanticUiTransition.semanticUiTransitionStrings.toggle
import typings.semanticUiTransition.semanticUiTransitionStrings.useFailSafe
import typings.semanticUiTransition.semanticUiTransitionStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def transition(): JQuery = js.native
  def transition(behavior: setting, name: allowRepeats, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: allowRepeats, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: animation, value: js.UndefOr[scala.Nothing]): String = js.native
  def transition(behavior: setting, name: animation, value: String): JQuery = js.native
  def transition(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def transition(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: displayType, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def transition(behavior: setting, name: displayType, value: String): JQuery = js.native
  def transition(behavior: setting, name: displayType, value: `false`): JQuery = js.native
  def transition(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
  def transition(behavior: setting, name: duration, value: Double): JQuery = js.native
  def transition(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def transition(behavior: setting, name: interval, value: js.UndefOr[scala.Nothing]): Double = js.native
  def transition(behavior: setting, name: interval, value: Double): JQuery = js.native
  def transition(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def transition(behavior: setting, name: namespace, value: String): JQuery = js.native
  def transition(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def transition(behavior: setting, name: name, value: String): JQuery = js.native
  def transition(behavior: setting, name: onComplete, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: onStart, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def transition(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def transition(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: queue, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: queue, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: reverse, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def transition(behavior: setting, name: reverse, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: reverse, value: auto): JQuery = js.native
  def transition(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: useFailSafe, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: useFailSafe, value: Boolean): JQuery = js.native
  def transition(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def transition(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def transition(settings: TransitionSettings): JQuery = js.native
  def transition(transition: String): JQuery = js.native
  @JSName("transition")
  def transition_JQuery(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  @JSName("transition")
  def transition_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("transition")
  var transition_Original: Transition = js.native
  /**
    * Clears all queued animations
    */
  @JSName("transition")
  def transition_clearqueue(behavior: `clear queue`): JQuery = js.native
  @JSName("transition")
  def transition_destroy(behavior: destroy): JQuery = js.native
  /**
    * Adds disabled state (stops ability to animate)
    */
  @JSName("transition")
  def transition_disable(behavior: disable): JQuery = js.native
  /**
    * Removes disabled state
    */
  @JSName("transition")
  def transition_enable(behavior: enable): JQuery = js.native
  /**
    * Forces reflow using a more expensive but stable method
    */
  @JSName("transition")
  def transition_forcerepaint(behavior: `force repaint`): JQuery = js.native
  /**
    * Returns vendor prefixed animation property for animationend
    */
  @JSName("transition")
  def transition_getanimationevent(behavior: `get animation event`): String = js.native
  /**
    * Returns vendor prefixed animation property for animationname
    */
  @JSName("transition")
  def transition_getanimationname(behavior: `get animation name`): String = js.native
  /**
    * Stop current animation and hide element
    */
  @JSName("transition")
  def transition_hide(behavior: hide): JQuery = js.native
  /**
    * Returns whether transition is currently occurring
    */
  @JSName("transition")
  def transition_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Returns whether animation looping is set
    */
  @JSName("transition")
  def transition_islooping(behavior: `is looping`): Boolean = js.native
  /**
    * Returns whether animations are supported
    */
  @JSName("transition")
  def transition_issupported(behavior: `is supported`): Boolean = js.native
  /**
    * Returns whether element is currently visible
    */
  @JSName("transition")
  def transition_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Enables animation looping
    */
  @JSName("transition")
  def transition_looping(behavior: looping): JQuery = js.native
  /**
    * Removes looping state from element
    */
  @JSName("transition")
  def transition_removelooping(behavior: `remove looping`): JQuery = js.native
  /**
    * Triggers reflow on element
    */
  @JSName("transition")
  def transition_repaint(behavior: repaint): JQuery = js.native
  /**
    * Resets all conditions changes during transition
    */
  @JSName("transition")
  def transition_reset(behavior: reset): JQuery = js.native
  /**
    * Adds back cached names and styles to element
    */
  @JSName("transition")
  def transition_restoreconditions(behavior: `restore conditions`): JQuery = js.native
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  @JSName("transition")
  def transition_saveconditions(behavior: `save conditions`): JQuery = js.native
  /**
    * Modifies element animation duration
    */
  @JSName("transition")
  def transition_setduration(behavior: `set duration`, duration: Double): JQuery = js.native
  @JSName("transition")
  def transition_setting(behavior: setting, value: TransitionSettings): JQuery = js.native
  /**
    * Stop current animation and show element
    */
  @JSName("transition")
  def transition_show(behavior: show): JQuery = js.native
  /**
    * Stop current animation and preserve queue
    */
  @JSName("transition")
  def transition_stop(behavior: stop): JQuery = js.native
  /**
    * Stop current animation and queued animations
    */
  @JSName("transition")
  def transition_stopall(behavior: `stop all`): JQuery = js.native
  /**
    * Toggles between hide and show
    */
  @JSName("transition")
  def transition_toggle(behavior: toggle): JQuery = js.native
}
