package typings.semanticUiDimmer

import typings.semanticUiDimmer.SemanticUI.Dimmer
import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import typings.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typings.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typings.semanticUiDimmer.semanticUiDimmerStrings.create
import typings.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typings.semanticUiDimmer.semanticUiDimmerStrings.hide
import typings.semanticUiDimmer.semanticUiDimmerStrings.setting
import typings.semanticUiDimmer.semanticUiDimmerStrings.show
import typings.semanticUiDimmer.semanticUiDimmerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dimmer")
  var dimmer_Original: Dimmer = js.native
  def dimmer(): JQuery = js.native
  def dimmer(settings: DimmerSettings): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: String): JQuery = js.native
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: JQuery): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  @JSName("dimmer")
  def dimmer_create(behavior: create): JQuery = js.native
  @JSName("dimmer")
  def dimmer_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  @JSName("dimmer")
  def dimmer_getdimmer(behavior: `get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  @JSName("dimmer")
  def dimmer_getduration(behavior: `get duration`): Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  @JSName("dimmer")
  def dimmer_hasdimmer(behavior: `has dimmer`): Boolean = js.native
  /**
    * Hides dimmer
    */
  @JSName("dimmer")
  def dimmer_hide(behavior: hide): JQuery = js.native
  /**
    * Whether section's dimmer is active
    */
  @JSName("dimmer")
  def dimmer_isactive(behavior: `is active`): Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  @JSName("dimmer")
  def dimmer_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  @JSName("dimmer")
  def dimmer_isdimmable(behavior: `is dimmable`): Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  @JSName("dimmer")
  def dimmer_isdimmer(behavior: `is dimmer`): Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  @JSName("dimmer")
  def dimmer_isdisabled(behavior: `is disabled`): Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  @JSName("dimmer")
  def dimmer_isenabled(behavior: `is enabled`): Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  @JSName("dimmer")
  def dimmer_ispage(behavior: `is page`): Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  @JSName("dimmer")
  def dimmer_ispagedimmer(behavior: `is page dimmer`): Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  @JSName("dimmer")
  def dimmer_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  @JSName("dimmer")
  def dimmer_setdimmable(behavior: `set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  @JSName("dimmer")
  def dimmer_setdimmed(behavior: `set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  @JSName("dimmer")
  def dimmer_setdisabled(behavior: `set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  @JSName("dimmer")
  def dimmer_setopacity(behavior: `set opacity`, opacity: Double): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  @JSName("dimmer")
  def dimmer_setpagedimmer(behavior: `set page dimmer`): JQuery = js.native
  @JSName("dimmer")
  def dimmer_setting(behavior: setting, value: DimmerSettings): JQuery = js.native
  @JSName("dimmer")
  def dimmer_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any = js.native
  @JSName("dimmer")
  def dimmer_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows dimmer
    */
  @JSName("dimmer")
  def dimmer_show(behavior: show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  @JSName("dimmer")
  def dimmer_toggle(behavior: toggle): JQuery = js.native
}

