package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select2Plugin[TElement] extends js.Object {
  var amd: select2Lib.Anon_Require = js.native
  var defaults: select2Lib.Anon_Key = js.native
  def apply(): select2Lib.select2Mod.Global.JQuery[TElement] = js.native
  /**
  	 * Closes the dropdown
  	 */
  def apply(method: select2Lib.select2LibStrings.close): select2Lib.select2Mod.Global.JQuery[TElement] = js.native
  /**
  	 * Get the data object of the current selection
  	 */
  def apply(method: select2Lib.select2LibStrings.data): js.Array[OptionData] = js.native
  /**
  	 * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
  	 */
  def apply(method: select2Lib.select2LibStrings.destroy): select2Lib.select2Mod.Global.JQuery[TElement] = js.native
  /**
  	 * Opens the dropdown
  	 */
  def apply(method: select2Lib.select2LibStrings.open): select2Lib.select2Mod.Global.JQuery[TElement] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[Result, RemoteResult](options: Options[Result, RemoteResult]): select2Lib.select2Mod.Global.JQuery[TElement] = js.native
}

