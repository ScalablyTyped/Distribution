package typings
package semanticDashUiDashDimmerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("dimmer")
  var dimmer_Original: semanticDashUiDashDimmerLib.SemanticUINs.Dimmer = js.native
  def dimmer(): JQuery = js.native
  def dimmer(settings: semanticDashUiDashDimmerLib.SemanticUINs.DimmerSettings): JQuery = js.native
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  @JSName("dimmer")
  def dimmer_addcontent(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`add content`,
    element: java.lang.String
  ): JQuery = js.native
  @JSName("dimmer")
  def dimmer_addcontent(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`add content`,
    element: JQuery
  ): JQuery = js.native
  /**
    * Creates a new dimmer in dimmable context
    */
  @JSName("dimmer")
  def dimmer_create(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.create): JQuery = js.native
  @JSName("dimmer")
  def dimmer_destroy(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.destroy): JQuery = js.native
  /**
    * Returns DOM element for dimmer
    */
  @JSName("dimmer")
  def dimmer_getdimmer(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`get dimmer`): JQuery = js.native
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  @JSName("dimmer")
  def dimmer_getduration(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`get duration`): scala.Double = js.native
  /**
    * Returns whether current dimmable has a dimmer
    */
  @JSName("dimmer")
  def dimmer_hasdimmer(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`has dimmer`): scala.Boolean = js.native
  /**
    * Hides dimmer
    */
  @JSName("dimmer")
  def dimmer_hide(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.hide): JQuery = js.native
  /**
    * Whether section's dimmer is active
    */
  @JSName("dimmer")
  def dimmer_isactive(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is active`): scala.Boolean = js.native
  /**
    * Whether dimmer is animating
    */
  @JSName("dimmer")
  def dimmer_isanimating(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is animating`): scala.Boolean = js.native
  /**
    * Whether current element is a dimmable section
    */
  @JSName("dimmer")
  def dimmer_isdimmable(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is dimmable`): scala.Boolean = js.native
  /**
    * Whether current element is a dimmer
    */
  @JSName("dimmer")
  def dimmer_isdimmer(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is dimmer`): scala.Boolean = js.native
  /**
    * Whether dimmer is disabled
    */
  @JSName("dimmer")
  def dimmer_isdisabled(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is disabled`): scala.Boolean = js.native
  /**
    * Whether dimmer is not disabled
    */
  @JSName("dimmer")
  def dimmer_isenabled(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is enabled`): scala.Boolean = js.native
  /**
    * Whether dimmable section is body
    */
  @JSName("dimmer")
  def dimmer_ispage(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is page`): scala.Boolean = js.native
  /**
    * Whether dimmer is a page dimmer
    */
  @JSName("dimmer")
  def dimmer_ispagedimmer(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`is page dimmer`): scala.Boolean = js.native
  /**
    * Sets page dimmer to active
    */
  @JSName("dimmer")
  def dimmer_setactive(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set active`): JQuery = js.native
  /**
    * Sets an element as a dimmable section
    */
  @JSName("dimmer")
  def dimmer_setdimmable(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set dimmable`): JQuery = js.native
  /**
    * Sets a dimmable section as dimmed
    */
  @JSName("dimmer")
  def dimmer_setdimmed(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set dimmed`): JQuery = js.native
  /**
    * Sets a dimmer as disabled
    */
  @JSName("dimmer")
  def dimmer_setdisabled(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set disabled`): JQuery = js.native
  /**
    * Changes dimmer opacity
    */
  @JSName("dimmer")
  def dimmer_setopacity(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set opacity`,
    opacity: scala.Double
  ): JQuery = js.native
  /**
    * Sets current dimmer as a page dimmer
    */
  @JSName("dimmer")
  def dimmer_setpagedimmer(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.`set page dimmer`): JQuery = js.native
  @JSName("dimmer")
  def dimmer_setting(
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting,
    value: semanticDashUiDashDimmerLib.SemanticUINs.DimmerSettings
  ): JQuery = js.native
  @JSName("dimmer")
  def dimmer_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any = js.native
  @JSName("dimmer")
  def dimmer_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Shows dimmer
    */
  @JSName("dimmer")
  def dimmer_show(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.show): JQuery = js.native
  /**
    * Toggles current dimmer visibility
    */
  @JSName("dimmer")
  def dimmer_toggle(behavior: semanticDashUiDashDimmerLib.semanticDashUiDashDimmerLibStrings.toggle): JQuery = js.native
}

