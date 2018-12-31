package typings
package semanticDashUiDashTransitionLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition extends js.Object {
  var settings: TransitionSettings = js.native
  def apply(): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Clears all queued animations
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`clear queue`): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Forces reflow using a more expensive but stable method
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`force repaint`): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Returns vendor prefixed animation property for animationend
    */
  def apply(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`get animation event`
  ): java.lang.String = js.native
  /**
    * Returns vendor prefixed animation property for animationname
    */
  def apply(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`get animation name`
  ): java.lang.String = js.native
  /**
    * Returns whether transition is currently occurring
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is animating`): scala.Boolean = js.native
  /**
    * Returns whether animation looping is set
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is looping`): scala.Boolean = js.native
  /**
    * Returns whether animations are supported
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is supported`): scala.Boolean = js.native
  /**
    * Returns whether element is currently visible
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`is visible`): scala.Boolean = js.native
  /**
    * Removes looping state from element
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`remove looping`): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Adds back cached names and styles to element
    */
  def apply(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`restore conditions`
  ): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Saves all class names and styles to cache to be retrieved after animation
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`save conditions`): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Modifies element animation duration
    */
  def apply(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`set duration`,
    duration: scala.Double
  ): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Stop current animation and queued animations
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.`stop all`): semanticDashUiDashTransitionLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.destroy): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Adds disabled state (stops ability to animate)
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.disable): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Removes disabled state
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.enable): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Stop current animation and hide element
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.hide): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Enables animation looping
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.looping): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Triggers reflow on element
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.repaint): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Resets all conditions changes during transition
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.reset): semanticDashUiDashTransitionLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting,
    value: TransitionSettings
  ): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Stop current animation and show element
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.show): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Stop current animation and preserve queue
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.stop): semanticDashUiDashTransitionLib.JQuery = js.native
  /**
    * Toggles between hide and show
    */
  def apply(behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.toggle): semanticDashUiDashTransitionLib.JQuery = js.native
  def apply(settings: TransitionSettings): semanticDashUiDashTransitionLib.JQuery = js.native
  def apply(transition: java.lang.String): semanticDashUiDashTransitionLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashTransitionLib.semanticDashUiDashTransitionLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-transition.SemanticUI.TransitionSettings._Impl[K] */ js.Any
  ): semanticDashUiDashTransitionLib.JQuery = js.native
}

