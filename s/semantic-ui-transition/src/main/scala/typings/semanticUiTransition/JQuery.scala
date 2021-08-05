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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def transition(): JQuery
  def transition(behavior: setting, name: allowRepeats, value: Boolean): JQuery
  def transition(behavior: setting, name: allowRepeats, value: Unit): Boolean
  def transition(behavior: setting, name: animation, value: String): JQuery
  def transition(behavior: setting, name: animation, value: Unit): String
  def transition(behavior: setting, name: className, value: Unit): ClassNameSettings
  def transition(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def transition(behavior: setting, name: debug, value: Boolean): JQuery
  def transition(behavior: setting, name: debug, value: Unit): Boolean
  def transition(behavior: setting, name: displayType, value: String): JQuery
  def transition(behavior: setting, name: displayType, value: Unit): `false` | String
  def transition(behavior: setting, name: displayType, value: `false`): JQuery
  def transition(behavior: setting, name: duration, value: Double): JQuery
  def transition(behavior: setting, name: duration, value: Unit): Double
  def transition(behavior: setting, name: error, value: Unit): ErrorSettings
  def transition(behavior: setting, name: error, value: ErrorSettings): JQuery
  def transition(behavior: setting, name: interval, value: Double): JQuery
  def transition(behavior: setting, name: interval, value: Unit): Double
  def transition(behavior: setting, name: namespace, value: String): JQuery
  def transition(behavior: setting, name: namespace, value: Unit): String
  def transition(behavior: setting, name: name, value: String): JQuery
  def transition(behavior: setting, name: name, value: Unit): String
  def transition(behavior: setting, name: onComplete, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def transition(behavior: setting, name: onComplete, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def transition(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def transition(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def transition(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def transition(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def transition(behavior: setting, name: onStart, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def transition(behavior: setting, name: onStart, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def transition(behavior: setting, name: performance, value: Boolean): JQuery
  def transition(behavior: setting, name: performance, value: Unit): Boolean
  def transition(behavior: setting, name: queue, value: Boolean): JQuery
  def transition(behavior: setting, name: queue, value: Unit): Boolean
  def transition(behavior: setting, name: reverse, value: Boolean): JQuery
  def transition(behavior: setting, name: reverse, value: Unit): auto | Boolean
  def transition(behavior: setting, name: reverse, value: auto): JQuery
  def transition(behavior: setting, name: silent, value: Boolean): JQuery
  def transition(behavior: setting, name: silent, value: Unit): Boolean
  def transition(behavior: setting, name: useFailSafe, value: Boolean): JQuery
  def transition(behavior: setting, name: useFailSafe, value: Unit): Boolean
  def transition(behavior: setting, name: verbose, value: Boolean): JQuery
  def transition(behavior: setting, name: verbose, value: Unit): Boolean
  def transition(settings: TransitionSettings): JQuery
  def transition(transition: String): JQuery
  @JSName("transition")
  var transition_Original: Transition
  /**
    * Clears all queued animations
    */
  @JSName("transition")
  def transition_clearqueue(behavior: `clear queue`): JQuery
  @JSName("transition")
  def transition_destroy(behavior: destroy): JQuery
  /**
    * Adds disabled state (stops ability to animate)
    */
  @JSName("transition")
  def transition_disable(behavior: disable): JQuery
  /**
    * Removes disabled state
    */
  @JSName("transition")
  def transition_enable(behavior: enable): JQuery
  /**
    * Forces reflow using a more expensive but stable method
    */
  @JSName("transition")
  def transition_forcerepaint(behavior: `force repaint`): JQuery
  /**
    * Returns vendor prefixed animation property for animationend
    */
  @JSName("transition")
  def transition_getanimationevent(behavior: `get animation event`): String
  /**
    * Returns vendor prefixed animation property for animationname
    */
  @JSName("transition")
  def transition_getanimationname(behavior: `get animation name`): String
  /**
    * Stop current animation and hide element
    */
  @JSName("transition")
  def transition_hide(behavior: hide): JQuery
  /**
    * Returns whether transition is currently occurring
    */
  @JSName("transition")
  def transition_isanimating(behavior: `is animating`): Boolean
  /**
    * Returns whether animation looping is set
    */
  @JSName("transition")
  def transition_islooping(behavior: `is looping`): Boolean
  /**
    * Returns whether animations are supported
    */
  @JSName("transition")
  def transition_issupported(behavior: `is supported`): Boolean
  /**
    * Returns whether element is currently visible
    */
  @JSName("transition")
  def transition_isvisible(behavior: `is visible`): Boolean
  /**
    * Enables animation looping
    */
  @JSName("transition")
  def transition_looping(behavior: looping): JQuery
  /**
    * Removes looping state from element
    */
  @JSName("transition")
  def transition_removelooping(behavior: `remove looping`): JQuery
  /**
    * Triggers reflow on element
    */
  @JSName("transition")
  def transition_repaint(behavior: repaint): JQuery
  /**
    * Resets all conditions changes during transition
    */
  @JSName("transition")
  def transition_reset(behavior: reset): JQuery
  /**
    * Adds back cached names and styles to element
    */
  @JSName("transition")
  def transition_restoreconditions(behavior: `restore conditions`): JQuery
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  @JSName("transition")
  def transition_saveconditions(behavior: `save conditions`): JQuery
  /**
    * Modifies element animation duration
    */
  @JSName("transition")
  def transition_setduration(behavior: `set duration`, duration: Double): JQuery
  @JSName("transition")
  def transition_setting(behavior: setting, value: TransitionSettings): JQuery
  /**
    * Stop current animation and show element
    */
  @JSName("transition")
  def transition_show(behavior: show): JQuery
  /**
    * Stop current animation and preserve queue
    */
  @JSName("transition")
  def transition_stop(behavior: stop): JQuery
  /**
    * Stop current animation and queued animations
    */
  @JSName("transition")
  def transition_stopall(behavior: `stop all`): JQuery
  /**
    * Toggles between hide and show
    */
  @JSName("transition")
  def transition_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(transition: Transition): JQuery = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
