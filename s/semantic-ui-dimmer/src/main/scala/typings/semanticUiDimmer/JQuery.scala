package typings.semanticUiDimmer

import typings.semanticUiDimmer.SemanticUI.Dimmer
import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typings.semanticUiDimmer.SemanticUI.DimmerSettings
import typings.semanticUiDimmer.semanticUiDimmerBooleans.`false`
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
import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import typings.semanticUiDimmer.semanticUiDimmerStrings.className
import typings.semanticUiDimmer.semanticUiDimmerStrings.click
import typings.semanticUiDimmer.semanticUiDimmerStrings.closable
import typings.semanticUiDimmer.semanticUiDimmerStrings.create
import typings.semanticUiDimmer.semanticUiDimmerStrings.debug
import typings.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typings.semanticUiDimmer.semanticUiDimmerStrings.dimmerName
import typings.semanticUiDimmer.semanticUiDimmerStrings.duration
import typings.semanticUiDimmer.semanticUiDimmerStrings.error
import typings.semanticUiDimmer.semanticUiDimmerStrings.hide
import typings.semanticUiDimmer.semanticUiDimmerStrings.hover
import typings.semanticUiDimmer.semanticUiDimmerStrings.name
import typings.semanticUiDimmer.semanticUiDimmerStrings.namespace
import typings.semanticUiDimmer.semanticUiDimmerStrings.on
import typings.semanticUiDimmer.semanticUiDimmerStrings.onChange
import typings.semanticUiDimmer.semanticUiDimmerStrings.onHide
import typings.semanticUiDimmer.semanticUiDimmerStrings.onShow
import typings.semanticUiDimmer.semanticUiDimmerStrings.opacity
import typings.semanticUiDimmer.semanticUiDimmerStrings.performance
import typings.semanticUiDimmer.semanticUiDimmerStrings.selector
import typings.semanticUiDimmer.semanticUiDimmerStrings.setting
import typings.semanticUiDimmer.semanticUiDimmerStrings.show
import typings.semanticUiDimmer.semanticUiDimmerStrings.silent
import typings.semanticUiDimmer.semanticUiDimmerStrings.template
import typings.semanticUiDimmer.semanticUiDimmerStrings.toggle
import typings.semanticUiDimmer.semanticUiDimmerStrings.transition
import typings.semanticUiDimmer.semanticUiDimmerStrings.useCSS
import typings.semanticUiDimmer.semanticUiDimmerStrings.variation
import typings.semanticUiDimmer.semanticUiDimmerStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def dimmer(): JQuery = js.native
  def dimmer(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def dimmer(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
  def dimmer(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def dimmer(behavior: setting, name: closable, value: auto): JQuery = js.native
  def dimmer(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def dimmer(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def dimmer(behavior: setting, name: dimmerName, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def dimmer(behavior: setting, name: dimmerName, value: String): JQuery = js.native
  def dimmer(behavior: setting, name: dimmerName, value: `false`): JQuery = js.native
  def dimmer(behavior: setting, name: duration, value: Double): JQuery = js.native
  def dimmer(behavior: setting, name: duration, value: DurationSettings): JQuery = js.native
  def dimmer(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def dimmer(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def dimmer(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def dimmer(behavior: setting, name: namespace, value: String): JQuery = js.native
  def dimmer(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def dimmer(behavior: setting, name: name, value: String): JQuery = js.native
  def dimmer(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def dimmer(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def dimmer(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def dimmer(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def dimmer(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def dimmer(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def dimmer(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): `false` | hover | click = js.native
  def dimmer(behavior: setting, name: on, value: `false`): JQuery = js.native
  def dimmer(behavior: setting, name: on, value: click): JQuery = js.native
  def dimmer(behavior: setting, name: on, value: hover): JQuery = js.native
  def dimmer(behavior: setting, name: opacity, value: js.UndefOr[scala.Nothing]): auto | Double = js.native
  def dimmer(behavior: setting, name: opacity, value: Double): JQuery = js.native
  def dimmer(behavior: setting, name: opacity, value: auto): JQuery = js.native
  def dimmer(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def dimmer(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def dimmer(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def dimmer(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def dimmer(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def dimmer(behavior: setting, name: template, value: js.UndefOr[scala.Nothing]): TemplateSettings = js.native
  def dimmer(behavior: setting, name: template, value: TemplateSettings): JQuery = js.native
  def dimmer(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
  def dimmer(behavior: setting, name: transition, value: String): JQuery = js.native
  def dimmer(behavior: setting, name: useCSS, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def dimmer(behavior: setting, name: useCSS, value: Boolean): JQuery = js.native
  def dimmer(behavior: setting, name: variation, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def dimmer(behavior: setting, name: variation, value: String): JQuery = js.native
  def dimmer(behavior: setting, name: variation, value: `false`): JQuery = js.native
  def dimmer(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def dimmer(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def dimmer(settings: DimmerSettings): JQuery = js.native
  @JSName("dimmer")
  def dimmer_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("dimmer")
  var dimmer_Original: Dimmer = js.native
  @JSName("dimmer")
  def dimmer_SelectorSettings(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  @JSName("dimmer")
  def dimmer_Union(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double | DurationSettings = js.native
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
