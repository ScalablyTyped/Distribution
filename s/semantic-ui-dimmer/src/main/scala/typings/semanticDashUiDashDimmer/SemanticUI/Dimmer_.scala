package typings.semanticDashUiDashDimmer.SemanticUI

import typings.semanticDashUiDashDimmer.JQuery
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`add content`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`get dimmer`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`get duration`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`has dimmer`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is active`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is animating`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is dimmable`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is dimmer`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is disabled`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is enabled`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is page dimmer`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`is page`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set active`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set dimmable`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set dimmed`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set disabled`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set opacity`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.`set page dimmer`
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.create
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.destroy
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.hide
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.setting
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.show
import typings.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Dimmer")
@js.native
trait Dimmer_ extends js.Object {
  var settings: DimmerSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  def apply(behavior: `add content`, element: String): JQuery = js.native
  def apply(behavior: `add content`, element: JQuery): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  def apply(behavior: `get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  def apply(behavior: `get duration`): Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  def apply(behavior: `has dimmer`): Boolean = js.native
  /**
    * Whether section's dimmer is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  def apply(behavior: `is dimmable`): Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  def apply(behavior: `is dimmer`): Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  def apply(behavior: `is disabled`): Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  def apply(behavior: `is enabled`): Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  def apply(behavior: `is page dimmer`): Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  def apply(behavior: `is page`): Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  def apply(behavior: `set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  def apply(behavior: `set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  def apply(behavior: `set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  def apply(behavior: `set opacity`, opacity: Double): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  def apply(behavior: `set page dimmer`): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  def apply(behavior: create): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides dimmer
    */
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: DimmerSettings): JQuery = js.native
  /**
    * Shows dimmer
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: DimmerSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

