package typings.semanticUiNag

import typings.semanticUiNag.SemanticUI.Nag
import typings.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typings.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typings.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typings.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typings.semanticUiNag.SemanticUI.NagSettings
import typings.semanticUiNag.semanticUiNagBooleans.`false`
import typings.semanticUiNag.semanticUiNagStrings.animation
import typings.semanticUiNag.semanticUiNagStrings.className
import typings.semanticUiNag.semanticUiNagStrings.clear
import typings.semanticUiNag.semanticUiNagStrings.context
import typings.semanticUiNag.semanticUiNagStrings.cookie
import typings.semanticUiNag.semanticUiNagStrings.debug
import typings.semanticUiNag.semanticUiNagStrings.destroy
import typings.semanticUiNag.semanticUiNagStrings.detachable
import typings.semanticUiNag.semanticUiNagStrings.displayTime
import typings.semanticUiNag.semanticUiNagStrings.domain
import typings.semanticUiNag.semanticUiNagStrings.easing
import typings.semanticUiNag.semanticUiNagStrings.error
import typings.semanticUiNag.semanticUiNagStrings.expires
import typings.semanticUiNag.semanticUiNagStrings.hide
import typings.semanticUiNag.semanticUiNagStrings.key
import typings.semanticUiNag.semanticUiNagStrings.localstorage
import typings.semanticUiNag.semanticUiNagStrings.name
import typings.semanticUiNag.semanticUiNagStrings.namespace
import typings.semanticUiNag.semanticUiNagStrings.onHide
import typings.semanticUiNag.semanticUiNagStrings.path
import typings.semanticUiNag.semanticUiNagStrings.performance
import typings.semanticUiNag.semanticUiNagStrings.persist
import typings.semanticUiNag.semanticUiNagStrings.selector
import typings.semanticUiNag.semanticUiNagStrings.sessionstorage
import typings.semanticUiNag.semanticUiNagStrings.setting
import typings.semanticUiNag.semanticUiNagStrings.show
import typings.semanticUiNag.semanticUiNagStrings.silent
import typings.semanticUiNag.semanticUiNagStrings.speed
import typings.semanticUiNag.semanticUiNagStrings.storageMethod
import typings.semanticUiNag.semanticUiNagStrings.value
import typings.semanticUiNag.semanticUiNagStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("nag")
  var nag_Original: Nag = js.native
  def nag(): JQuery = js.native
  def nag(behavior: setting, name: animation): AnimationSettings = js.native
  def nag(behavior: setting, name: animation, value: AnimationSettings): JQuery = js.native
  def nag(behavior: setting, name: className): ClassNameSettings = js.native
  def nag(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def nag(behavior: setting, name: context): `false` | String | JQuery = js.native
  def nag(behavior: setting, name: context, value: String): JQuery = js.native
  def nag(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def nag(behavior: setting, name: context, value: `false`): JQuery = js.native
  def nag(behavior: setting, name: debug): Boolean = js.native
  def nag(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def nag(behavior: setting, name: detachable): Boolean = js.native
  def nag(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def nag(behavior: setting, name: displayTime): Double = js.native
  def nag(behavior: setting, name: displayTime, value: Double): JQuery = js.native
  def nag(behavior: setting, name: domain): `false` | String = js.native
  def nag(behavior: setting, name: domain, value: String): JQuery = js.native
  def nag(behavior: setting, name: domain, value: `false`): JQuery = js.native
  def nag(behavior: setting, name: easing): String = js.native
  def nag(behavior: setting, name: easing, value: String): JQuery = js.native
  def nag(behavior: setting, name: error): ErrorSettings = js.native
  def nag(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def nag(behavior: setting, name: expires): Double = js.native
  def nag(behavior: setting, name: expires, value: Double): JQuery = js.native
  def nag(behavior: setting, name: key): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any = js.native
  def nag(
    behavior: setting,
    name: key,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
  ): JQuery = js.native
  def nag(behavior: setting, name: name): String = js.native
  def nag(behavior: setting, name: namespace): String = js.native
  def nag(behavior: setting, name: namespace, value: String): JQuery = js.native
  def nag(behavior: setting, name: name, value: String): JQuery = js.native
  def nag(behavior: setting, name: onHide): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def nag(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def nag(behavior: setting, name: path): String = js.native
  def nag(behavior: setting, name: path, value: String): JQuery = js.native
  def nag(behavior: setting, name: performance): Boolean = js.native
  def nag(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def nag(behavior: setting, name: persist): Boolean = js.native
  def nag(behavior: setting, name: persist, value: Boolean): JQuery = js.native
  def nag(behavior: setting, name: selector): SelectorSettings = js.native
  def nag(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def nag(behavior: setting, name: silent): Boolean = js.native
  def nag(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def nag(behavior: setting, name: speed): Double = js.native
  def nag(behavior: setting, name: speed, value: Double): JQuery = js.native
  def nag(behavior: setting, name: storageMethod): cookie | localstorage | sessionstorage = js.native
  def nag(behavior: setting, name: storageMethod, value: cookie): JQuery = js.native
  def nag(behavior: setting, name: storageMethod, value: localstorage): JQuery = js.native
  def nag(behavior: setting, name: storageMethod, value: sessionstorage): JQuery = js.native
  def nag(behavior: setting, name: value): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any = js.native
  def nag(
    behavior: setting,
    name: value,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
  ): JQuery = js.native
  def nag(behavior: setting, name: verbose): Boolean = js.native
  def nag(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def nag(settings: NagSettings): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: clear): JQuery = js.native
  @JSName("nag")
  def nag_destroy(behavior: destroy): JQuery = js.native
  @JSName("nag")
  def nag_hide(behavior: hide): JQuery = js.native
  @JSName("nag")
  def nag_setting(behavior: setting, value: NagSettings): JQuery = js.native
  @JSName("nag")
  def nag_show(behavior: show): JQuery = js.native
}

