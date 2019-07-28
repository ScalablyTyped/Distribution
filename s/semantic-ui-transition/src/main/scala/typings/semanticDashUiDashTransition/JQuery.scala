package typings.semanticDashUiDashTransition

import typings.semanticDashUiDashTransition.SemanticUINs.Transition
import typings.semanticDashUiDashTransition.SemanticUINs.TransitionSettings
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`clear queue`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`force repaint`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`get animation event`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`get animation name`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is animating`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is looping`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is supported`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`is visible`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`remove looping`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`restore conditions`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`save conditions`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`set duration`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.`stop all`
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.destroy
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.disable
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.enable
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.hide
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.looping
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.repaint
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.reset
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.setting
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.show
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.stop
import typings.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("transition")
  var transition_Original: Transition = js.native
  def transition(): JQuery = js.native
  def transition(settings: TransitionSettings): JQuery = js.native
  def transition(transition: String): JQuery = js.native
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
  @JSName("transition")
  def transition_setting[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any = js.native
  @JSName("transition")
  def transition_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
  ): JQuery = js.native
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

