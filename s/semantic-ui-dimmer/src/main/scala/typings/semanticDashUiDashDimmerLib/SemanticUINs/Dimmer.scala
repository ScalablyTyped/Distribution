package typings
package semanticDashUiDashDimmerLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimmer extends js.Object {
  var settings: DimmerSettings = js.native
  def apply(): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Detaches a given element from DOM and reattaches element inside dimmer
           */
  def apply(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`add content`,
    element: java.lang.String
  ): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Detaches a given element from DOM and reattaches element inside dimmer
           */
  def apply(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`add content`,
    element: semanticDashUiDashDimmerLib.JQuery
  ): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Returns DOM element for dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`get dimmer`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Returns current duration for show or hide event depending on current visibility
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`get duration`): scala.Double = js.native
  /**
           * Returns whether current dimmable has a dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`has dimmer`): scala.Boolean = js.native
  /**
           * Whether section's dimmer is active
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is active`): scala.Boolean = js.native
  /**
           * Whether dimmer is animating
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is animating`): scala.Boolean = js.native
  /**
           * Whether current element is a dimmable section
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is dimmable`): scala.Boolean = js.native
  /**
           * Whether current element is a dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is dimmer`): scala.Boolean = js.native
  /**
           * Whether dimmer is disabled
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is disabled`): scala.Boolean = js.native
  /**
           * Whether dimmer is not disabled
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is enabled`): scala.Boolean = js.native
  /**
           * Whether dimmer is a page dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is page dimmer`): scala.Boolean = js.native
  /**
           * Whether dimmable section is body
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is page`): scala.Boolean = js.native
  /**
           * Sets page dimmer to active
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set active`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Sets an element as a dimmable section
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set dimmable`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Sets a dimmable section as dimmed
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set dimmed`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Sets a dimmer as disabled
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set disabled`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Changes dimmer opacity
           */
  def apply(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set opacity`,
    opacity: scala.Double
  ): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Sets current dimmer as a page dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set page dimmer`): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Creates a new dimmer in dimmable context
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.create): semanticDashUiDashDimmerLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.destroy): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Hides dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.hide): semanticDashUiDashDimmerLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting,
    value: DimmerSettings
  ): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Shows dimmer
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.show): semanticDashUiDashDimmerLib.JQuery = js.native
  /**
           * Toggles current dimmer visibility
           */
  def apply(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.toggle): semanticDashUiDashDimmerLib.JQuery = js.native
  def apply(settings: DimmerSettings): semanticDashUiDashDimmerLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashDimmerLib.JQuery = js.native
}

