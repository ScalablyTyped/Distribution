package typings
package select2Lib.select2Mod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery[TElement] extends js.Object {
  @JSName("select2")
  var select2_Original: select2Lib.select2Mod.Select2Plugin[TElement] = js.native
  @JSName("data")
  def data_select2(key: select2Lib.select2LibStrings.select2): select2Lib.select2Mod.Select2 = js.native
  @JSName("on")
  def on_select2close(events: select2Lib.select2LibStrings.`select2:close`): this.type = js.native
  @JSName("on")
  def on_select2close(
    events: select2Lib.select2LibStrings.`select2:close`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, js.Object]]
  ): this.type = js.native
  // TODO: events "change" and "change.select2"
  @JSName("on")
  def on_select2closing(events: select2Lib.select2LibStrings.`select2:closing`): this.type = js.native
  @JSName("on")
  def on_select2closing(
    events: select2Lib.select2LibStrings.`select2:closing`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.IngParams]]
  ): this.type = js.native
  @JSName("on")
  def on_select2open(events: select2Lib.select2LibStrings.`select2:open`): this.type = js.native
  @JSName("on")
  def on_select2open(
    events: select2Lib.select2LibStrings.`select2:open`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, js.Object]]
  ): this.type = js.native
  @JSName("on")
  def on_select2opening(events: select2Lib.select2LibStrings.`select2:opening`): this.type = js.native
  @JSName("on")
  def on_select2opening(
    events: select2Lib.select2LibStrings.`select2:opening`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.IngParams]]
  ): this.type = js.native
  @JSName("on")
  def on_select2select(events: select2Lib.select2LibStrings.`select2:select`): this.type = js.native
  @JSName("on")
  def on_select2select(
    events: select2Lib.select2LibStrings.`select2:select`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.DataParams]]
  ): this.type = js.native
  @JSName("on")
  def on_select2selecting(events: select2Lib.select2LibStrings.`select2:selecting`): this.type = js.native
  @JSName("on")
  def on_select2selecting(
    events: select2Lib.select2LibStrings.`select2:selecting`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.IngParams]]
  ): this.type = js.native
  @JSName("on")
  def on_select2unselect(events: select2Lib.select2LibStrings.`select2:unselect`): this.type = js.native
  @JSName("on")
  def on_select2unselect(
    events: select2Lib.select2LibStrings.`select2:unselect`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.DataParams]]
  ): this.type = js.native
  @JSName("on")
  def on_select2unselecting(events: select2Lib.select2LibStrings.`select2:unselecting`): this.type = js.native
  @JSName("on")
  def on_select2unselecting(
    events: select2Lib.select2LibStrings.`select2:unselecting`,
    handler: select2Lib.select2Mod.JQueryEventHandlerBase[TElement, select2Lib.select2Mod.Event[TElement, select2Lib.select2Mod.IngParams]]
  ): this.type = js.native
  def select2(): JQuery[TElement] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def select2[Result, RemoteResult](options: select2Lib.select2Mod.Options[Result, RemoteResult]): JQuery[TElement] = js.native
  /**
  	 * Closes the dropdown
  	 */
  @JSName("select2")
  def select2_close(method: select2Lib.select2LibStrings.close): JQuery[TElement] = js.native
  /**
  	 * Get the data object of the current selection
  	 */
  @JSName("select2")
  def select2_data(method: select2Lib.select2LibStrings.data): js.Array[select2Lib.select2Mod.OptionData] = js.native
  /**
  	 * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
  	 */
  @JSName("select2")
  def select2_destroy(method: select2Lib.select2LibStrings.destroy): JQuery[TElement] = js.native
  /**
  	 * Opens the dropdown
  	 */
  @JSName("select2")
  def select2_open(method: select2Lib.select2LibStrings.open): JQuery[TElement] = js.native
  def trigger(events: select2Lib.select2Mod.Trigger): scala.Unit = js.native
}

