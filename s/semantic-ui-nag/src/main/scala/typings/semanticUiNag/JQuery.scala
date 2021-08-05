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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def nag(): JQuery
  def nag(behavior: setting, name: animation, value: Unit): AnimationSettings
  def nag(behavior: setting, name: animation, value: AnimationSettings): JQuery
  def nag(behavior: setting, name: className, value: Unit): ClassNameSettings
  def nag(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def nag(behavior: setting, name: context, value: String): JQuery
  def nag(behavior: setting, name: context, value: Unit): `false` | String | JQuery
  def nag(behavior: setting, name: context, value: JQuery): JQuery
  def nag(behavior: setting, name: context, value: `false`): JQuery
  def nag(behavior: setting, name: debug, value: Boolean): JQuery
  def nag(behavior: setting, name: debug, value: Unit): Boolean
  def nag(behavior: setting, name: detachable, value: Boolean): JQuery
  def nag(behavior: setting, name: detachable, value: Unit): Boolean
  def nag(behavior: setting, name: displayTime, value: Double): JQuery
  def nag(behavior: setting, name: displayTime, value: Unit): Double
  def nag(behavior: setting, name: domain, value: String): JQuery
  def nag(behavior: setting, name: domain, value: Unit): `false` | String
  def nag(behavior: setting, name: domain, value: `false`): JQuery
  def nag(behavior: setting, name: easing, value: String): JQuery
  def nag(behavior: setting, name: easing, value: Unit): String
  def nag(behavior: setting, name: error, value: Unit): ErrorSettings
  def nag(behavior: setting, name: error, value: ErrorSettings): JQuery
  def nag(behavior: setting, name: expires, value: Double): JQuery
  def nag(behavior: setting, name: expires, value: Unit): Double
  def nag(
    behavior: setting,
    name: key,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
  ): JQuery
  def nag(behavior: setting, name: key, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
  def nag(behavior: setting, name: namespace, value: String): JQuery
  def nag(behavior: setting, name: namespace, value: Unit): String
  def nag(behavior: setting, name: name, value: String): JQuery
  def nag(behavior: setting, name: name, value: Unit): String
  def nag(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def nag(behavior: setting, name: onHide, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def nag(behavior: setting, name: path, value: String): JQuery
  def nag(behavior: setting, name: path, value: Unit): String
  def nag(behavior: setting, name: performance, value: Boolean): JQuery
  def nag(behavior: setting, name: performance, value: Unit): Boolean
  def nag(behavior: setting, name: persist, value: Boolean): JQuery
  def nag(behavior: setting, name: persist, value: Unit): Boolean
  def nag(behavior: setting, name: selector, value: Unit): SelectorSettings
  def nag(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def nag(behavior: setting, name: silent, value: Boolean): JQuery
  def nag(behavior: setting, name: silent, value: Unit): Boolean
  def nag(behavior: setting, name: speed, value: Double): JQuery
  def nag(behavior: setting, name: speed, value: Unit): Double
  def nag(behavior: setting, name: storageMethod, value: Unit): cookie | localstorage | sessionstorage
  def nag(behavior: setting, name: storageMethod, value: cookie): JQuery
  def nag(behavior: setting, name: storageMethod, value: localstorage): JQuery
  def nag(behavior: setting, name: storageMethod, value: sessionstorage): JQuery
  def nag(
    behavior: setting,
    name: value,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
  ): JQuery
  def nag(behavior: setting, name: value, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
  def nag(behavior: setting, name: verbose, value: Boolean): JQuery
  def nag(behavior: setting, name: verbose, value: Unit): Boolean
  def nag(settings: NagSettings): JQuery
  @JSName("nag")
  var nag_Original: Nag
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: clear): JQuery
  @JSName("nag")
  def nag_destroy(behavior: destroy): JQuery
  @JSName("nag")
  def nag_hide(behavior: hide): JQuery
  @JSName("nag")
  def nag_setting(behavior: setting, value: NagSettings): JQuery
  @JSName("nag")
  def nag_show(behavior: show): JQuery
}
object JQuery {
  
  inline def apply(nag: Nag): JQuery = {
    val __obj = js.Dynamic.literal(nag = nag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setNag(value: Nag): Self = StObject.set(x, "nag", value.asInstanceOf[js.Any])
  }
}
