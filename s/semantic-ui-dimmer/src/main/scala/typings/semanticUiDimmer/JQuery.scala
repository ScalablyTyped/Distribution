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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def dimmer(): JQuery
  def dimmer(behavior: setting, name: className, value: Unit): ClassNameSettings
  def dimmer(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def dimmer(behavior: setting, name: closable, value: Boolean): JQuery
  def dimmer(behavior: setting, name: closable, value: Unit): auto | Boolean
  def dimmer(behavior: setting, name: closable, value: auto): JQuery
  def dimmer(behavior: setting, name: debug, value: Boolean): JQuery
  def dimmer(behavior: setting, name: debug, value: Unit): Boolean
  def dimmer(behavior: setting, name: dimmerName, value: String): JQuery
  def dimmer(behavior: setting, name: dimmerName, value: Unit): `false` | String
  def dimmer(behavior: setting, name: dimmerName, value: `false`): JQuery
  def dimmer(behavior: setting, name: duration, value: Double): JQuery
  def dimmer(behavior: setting, name: duration, value: Unit): Double | DurationSettings
  def dimmer(behavior: setting, name: duration, value: DurationSettings): JQuery
  def dimmer(behavior: setting, name: error, value: Unit): ErrorSettings
  def dimmer(behavior: setting, name: error, value: ErrorSettings): JQuery
  def dimmer(behavior: setting, name: namespace, value: String): JQuery
  def dimmer(behavior: setting, name: namespace, value: Unit): String
  def dimmer(behavior: setting, name: name, value: String): JQuery
  def dimmer(behavior: setting, name: name, value: Unit): String
  def dimmer(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def dimmer(behavior: setting, name: onChange, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def dimmer(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def dimmer(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def dimmer(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def dimmer(behavior: setting, name: onShow, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def dimmer(behavior: setting, name: on, value: Unit): `false` | hover | click
  def dimmer(behavior: setting, name: on, value: `false`): JQuery
  def dimmer(behavior: setting, name: on, value: click): JQuery
  def dimmer(behavior: setting, name: on, value: hover): JQuery
  def dimmer(behavior: setting, name: opacity, value: Double): JQuery
  def dimmer(behavior: setting, name: opacity, value: Unit): auto | Double
  def dimmer(behavior: setting, name: opacity, value: auto): JQuery
  def dimmer(behavior: setting, name: performance, value: Boolean): JQuery
  def dimmer(behavior: setting, name: performance, value: Unit): Boolean
  def dimmer(behavior: setting, name: selector, value: Unit): SelectorSettings
  def dimmer(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def dimmer(behavior: setting, name: silent, value: Boolean): JQuery
  def dimmer(behavior: setting, name: silent, value: Unit): Boolean
  def dimmer(behavior: setting, name: template, value: Unit): TemplateSettings
  def dimmer(behavior: setting, name: template, value: TemplateSettings): JQuery
  def dimmer(behavior: setting, name: transition, value: String): JQuery
  def dimmer(behavior: setting, name: transition, value: Unit): String
  def dimmer(behavior: setting, name: useCSS, value: Boolean): JQuery
  def dimmer(behavior: setting, name: useCSS, value: Unit): Boolean
  def dimmer(behavior: setting, name: variation, value: String): JQuery
  def dimmer(behavior: setting, name: variation, value: Unit): `false` | String
  def dimmer(behavior: setting, name: variation, value: `false`): JQuery
  def dimmer(behavior: setting, name: verbose, value: Boolean): JQuery
  def dimmer(behavior: setting, name: verbose, value: Unit): Boolean
  def dimmer(settings: DimmerSettings): JQuery
  @JSName("dimmer")
  var dimmer_Original: Dimmer
  /**
    * Detaches a given element from DOM and reattaches element inside dimmer
    */
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: String): JQuery
  @JSName("dimmer")
  def dimmer_addcontent(behavior: `add content`, element: JQuery): JQuery
  /**
    * Creates a new dimmer in dimmable context
    */
  @JSName("dimmer")
  def dimmer_create(behavior: create): JQuery
  @JSName("dimmer")
  def dimmer_destroy(behavior: destroy): JQuery
  /**
    * Returns DOM element for dimmer
    */
  @JSName("dimmer")
  def dimmer_getdimmer(behavior: `get dimmer`): JQuery
  /**
    * Returns current duration for show or hide event depending on current visibility
    */
  @JSName("dimmer")
  def dimmer_getduration(behavior: `get duration`): Double
  /**
    * Returns whether current dimmable has a dimmer
    */
  @JSName("dimmer")
  def dimmer_hasdimmer(behavior: `has dimmer`): Boolean
  /**
    * Hides dimmer
    */
  @JSName("dimmer")
  def dimmer_hide(behavior: hide): JQuery
  /**
    * Whether section's dimmer is active
    */
  @JSName("dimmer")
  def dimmer_isactive(behavior: `is active`): Boolean
  /**
    * Whether dimmer is animating
    */
  @JSName("dimmer")
  def dimmer_isanimating(behavior: `is animating`): Boolean
  /**
    * Whether current element is a dimmable section
    */
  @JSName("dimmer")
  def dimmer_isdimmable(behavior: `is dimmable`): Boolean
  /**
    * Whether current element is a dimmer
    */
  @JSName("dimmer")
  def dimmer_isdimmer(behavior: `is dimmer`): Boolean
  /**
    * Whether dimmer is disabled
    */
  @JSName("dimmer")
  def dimmer_isdisabled(behavior: `is disabled`): Boolean
  /**
    * Whether dimmer is not disabled
    */
  @JSName("dimmer")
  def dimmer_isenabled(behavior: `is enabled`): Boolean
  /**
    * Whether dimmable section is body
    */
  @JSName("dimmer")
  def dimmer_ispage(behavior: `is page`): Boolean
  /**
    * Whether dimmer is a page dimmer
    */
  @JSName("dimmer")
  def dimmer_ispagedimmer(behavior: `is page dimmer`): Boolean
  /**
    * Sets page dimmer to active
    */
  @JSName("dimmer")
  def dimmer_setactive(behavior: `set active`): JQuery
  /**
    * Sets an element as a dimmable section
    */
  @JSName("dimmer")
  def dimmer_setdimmable(behavior: `set dimmable`): JQuery
  /**
    * Sets a dimmable section as dimmed
    */
  @JSName("dimmer")
  def dimmer_setdimmed(behavior: `set dimmed`): JQuery
  /**
    * Sets a dimmer as disabled
    */
  @JSName("dimmer")
  def dimmer_setdisabled(behavior: `set disabled`): JQuery
  /**
    * Changes dimmer opacity
    */
  @JSName("dimmer")
  def dimmer_setopacity(behavior: `set opacity`, opacity: Double): JQuery
  /**
    * Sets current dimmer as a page dimmer
    */
  @JSName("dimmer")
  def dimmer_setpagedimmer(behavior: `set page dimmer`): JQuery
  @JSName("dimmer")
  def dimmer_setting(behavior: setting, value: DimmerSettings): JQuery
  /**
    * Shows dimmer
    */
  @JSName("dimmer")
  def dimmer_show(behavior: show): JQuery
  /**
    * Toggles current dimmer visibility
    */
  @JSName("dimmer")
  def dimmer_toggle(behavior: toggle): JQuery
}
object JQuery {
  
  inline def apply(dimmer: Dimmer): JQuery = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDimmer(value: Dimmer): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
  }
}
