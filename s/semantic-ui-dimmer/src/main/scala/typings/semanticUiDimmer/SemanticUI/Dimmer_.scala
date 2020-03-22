package typings.semanticUiDimmer.SemanticUI

import typings.semanticUiDimmer.JQuery
import typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
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
import scala.scalajs.js.annotation._

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
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closable): auto | Boolean = js.native
  def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: closable, value: auto): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: dimmerName): `false` | String = js.native
  def apply(behavior: setting, name: dimmerName, value: String): JQuery = js.native
  def apply(behavior: setting, name: dimmerName, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: duration): Double | DurationSettings = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: duration, value: DurationSettings): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: on): `false` | hover | click = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onShow): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: on, value: click): JQuery = js.native
  def apply(behavior: setting, name: on, value: hover): JQuery = js.native
  def apply(behavior: setting, name: opacity): auto | Double = js.native
  def apply(behavior: setting, name: opacity, value: Double): JQuery = js.native
  def apply(behavior: setting, name: opacity, value: auto): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: template): TemplateSettings = js.native
  def apply(behavior: setting, name: template, value: TemplateSettings): JQuery = js.native
  def apply(behavior: setting, name: transition): String = js.native
  def apply(behavior: setting, name: transition, value: String): JQuery = js.native
  def apply(behavior: setting, name: useCSS): Boolean = js.native
  def apply(behavior: setting, name: useCSS, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: variation): `false` | String = js.native
  def apply(behavior: setting, name: variation, value: String): JQuery = js.native
  def apply(behavior: setting, name: variation, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
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
}

