package typings
package semanticDashUiDashNagLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nag extends js.Object {
  var settings: NagSettings = js.native
  def apply(): semanticDashUiDashNagLib.JQuery = js.native
  /**
           * Clears cookie so nag shows again
           */
  def apply(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.clear): semanticDashUiDashNagLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.destroy): semanticDashUiDashNagLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.hide): semanticDashUiDashNagLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting, value: NagSettings): semanticDashUiDashNagLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.show): semanticDashUiDashNagLib.JQuery = js.native
  def apply(settings: NagSettings): semanticDashUiDashNagLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashNagLib.semanticDashUiDashNagLibStrings.setting, name: K, value: js.Any): semanticDashUiDashNagLib.JQuery = js.native
}

