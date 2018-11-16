package typings
package semanticDashUiDashTransitionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("transition")
  var transition_Original: semanticDashUiDashTransitionLib.SemanticUINs.Transition = js.native
  def transition(): JQuery = js.native
  def transition(settings: semanticDashUiDashTransitionLib.SemanticUINs.TransitionSettings): JQuery = js.native
  def transition(transition: java.lang.String): JQuery = js.native
  /**
           * Clears all queued animations
           */
  @JSName("transition")
  def `transition_clear queue`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`clear queue`): JQuery = js.native
  @JSName("transition")
  def transition_destroy(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.destroy): JQuery = js.native
  /**
           * Adds disabled state (stops ability to animate)
           */
  @JSName("transition")
  def transition_disable(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.disable): JQuery = js.native
  /**
           * Removes disabled state
           */
  @JSName("transition")
  def transition_enable(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.enable): JQuery = js.native
  /**
           * Forces reflow using a more expensive but stable method
           */
  @JSName("transition")
  def `transition_force repaint`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`force repaint`): JQuery = js.native
  /**
           * Returns vendor prefixed animation property for animationend
           */
  @JSName("transition")
  def `transition_get animation event`(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`get animation event`
  ): java.lang.String = js.native
  /**
           * Returns vendor prefixed animation property for animationname
           */
  @JSName("transition")
  def `transition_get animation name`(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`get animation name`
  ): java.lang.String = js.native
  /**
           * Stop current animation and hide element
           */
  @JSName("transition")
  def transition_hide(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.hide): JQuery = js.native
  /**
           * Returns whether transition is currently occurring
           */
  @JSName("transition")
  def `transition_is animating`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is animating`): scala.Boolean = js.native
  /**
           * Returns whether animation looping is set
           */
  @JSName("transition")
  def `transition_is looping`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is looping`): scala.Boolean = js.native
  /**
           * Returns whether animations are supported
           */
  @JSName("transition")
  def `transition_is supported`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is supported`): scala.Boolean = js.native
  /**
           * Returns whether element is currently visible
           */
  @JSName("transition")
  def `transition_is visible`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is visible`): scala.Boolean = js.native
  /**
           * Enables animation looping
           */
  @JSName("transition")
  def transition_looping(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.looping): JQuery = js.native
  /**
           * Removes looping state from element
           */
  @JSName("transition")
  def `transition_remove looping`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`remove looping`): JQuery = js.native
  /**
           * Triggers reflow on element
           */
  @JSName("transition")
  def transition_repaint(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.repaint): JQuery = js.native
  /**
           * Resets all conditions changes during transition
           */
  @JSName("transition")
  def transition_reset(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.reset): JQuery = js.native
  /**
           * Adds back cached names and styles to element
           */
  @JSName("transition")
  def `transition_restore conditions`(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`restore conditions`
  ): JQuery = js.native
  /**
           * Saves all class names and styles to cache to be retrieved after animation
           */
  @JSName("transition")
  def `transition_save conditions`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`save conditions`): JQuery = js.native
  /**
           * Modifies element animation duration
           */
  @JSName("transition")
  def `transition_set duration`(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`set duration`,
    duration: scala.Double
  ): JQuery = js.native
  @JSName("transition")
  def transition_setting(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting,
    value: semanticDashUiDashTransitionLib.SemanticUINs.TransitionSettings
  ): JQuery = js.native
  @JSName("transition")
  def transition_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting, name: K): js.Any = js.native
  @JSName("transition")
  def transition_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting,
    name: K,
    value: js.Any
  ): JQuery = js.native
  /**
           * Stop current animation and show element
           */
  @JSName("transition")
  def transition_show(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.show): JQuery = js.native
  /**
           * Stop current animation and preserve queue
           */
  @JSName("transition")
  def transition_stop(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.stop): JQuery = js.native
  /**
           * Stop current animation and queued animations
           */
  @JSName("transition")
  def `transition_stop all`(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`stop all`): JQuery = js.native
  /**
           * Toggles between hide and show
           */
  @JSName("transition")
  def transition_toggle(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.toggle): JQuery = js.native
}

