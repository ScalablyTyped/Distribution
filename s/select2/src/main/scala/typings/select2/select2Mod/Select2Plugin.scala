package typings.select2.select2Mod

import typings.select2.Anon_Key
import typings.select2.Anon_Require
import typings.select2.select2Mod.Global.JQuery
import typings.select2.select2Strings.close
import typings.select2.select2Strings.data
import typings.select2.select2Strings.destroy
import typings.select2.select2Strings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select2Plugin[TElement] extends js.Object {
  var amd: Anon_Require = js.native
  var defaults: Anon_Key = js.native
  def apply(): JQuery[TElement] = js.native
  /**
  	 * Closes the dropdown
  	 */
  def apply(method: close): JQuery[TElement] = js.native
  /**
  	 * Get the data object of the current selection
  	 */
  def apply(method: data): js.Array[OptionData] = js.native
  /**
  	 * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
  	 */
  def apply(method: destroy): JQuery[TElement] = js.native
  /**
  	 * Opens the dropdown
  	 */
  def apply(method: open): JQuery[TElement] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[Result, RemoteResult](options: Options[Result, RemoteResult]): JQuery[TElement] = js.native
}

