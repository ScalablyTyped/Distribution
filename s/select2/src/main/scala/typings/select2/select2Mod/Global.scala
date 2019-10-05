package typings.select2.select2Mod

import typings.select2.select2Mod.Global.JQuery
import typings.select2.select2Strings.`select2:close`
import typings.select2.select2Strings.`select2:closing`
import typings.select2.select2Strings.`select2:open`
import typings.select2.select2Strings.`select2:opening`
import typings.select2.select2Strings.`select2:select`
import typings.select2.select2Strings.`select2:selecting`
import typings.select2.select2Strings.`select2:unselect`
import typings.select2.select2Strings.`select2:unselecting`
import typings.select2.select2Strings.close
import typings.select2.select2Strings.data
import typings.select2.select2Strings.destroy
import typings.select2.select2Strings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait JQuery[TElement] extends js.Object {
    @JSName("select2")
    var select2_Original: Select2Plugin[TElement] = js.native
    @JSName("data")
    def data_select2(key: typings.select2.select2Strings.select2): Select2 = js.native
    @JSName("on")
    def on_select2close(events: `select2:close`): this.type = js.native
    @JSName("on")
    def on_select2close(events: `select2:close`, handler: JQueryEventHandlerBase[TElement, Event[TElement, js.Object]]): this.type = js.native
    // TODO: events "change" and "change.select2"
    @JSName("on")
    def on_select2closing(events: `select2:closing`): this.type = js.native
    @JSName("on")
    def on_select2closing(events: `select2:closing`, handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]): this.type = js.native
    @JSName("on")
    def on_select2open(events: `select2:open`): this.type = js.native
    @JSName("on")
    def on_select2open(events: `select2:open`, handler: JQueryEventHandlerBase[TElement, Event[TElement, js.Object]]): this.type = js.native
    @JSName("on")
    def on_select2opening(events: `select2:opening`): this.type = js.native
    @JSName("on")
    def on_select2opening(events: `select2:opening`, handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]): this.type = js.native
    @JSName("on")
    def on_select2select(events: `select2:select`): this.type = js.native
    @JSName("on")
    def on_select2select(events: `select2:select`, handler: JQueryEventHandlerBase[TElement, Event[TElement, DataParams]]): this.type = js.native
    @JSName("on")
    def on_select2selecting(events: `select2:selecting`): this.type = js.native
    @JSName("on")
    def on_select2selecting(events: `select2:selecting`, handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]): this.type = js.native
    @JSName("on")
    def on_select2unselect(events: `select2:unselect`): this.type = js.native
    @JSName("on")
    def on_select2unselect(events: `select2:unselect`, handler: JQueryEventHandlerBase[TElement, Event[TElement, DataParams]]): this.type = js.native
    @JSName("on")
    def on_select2unselecting(events: `select2:unselecting`): this.type = js.native
    @JSName("on")
    def on_select2unselecting(
      events: `select2:unselecting`,
      handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]
    ): this.type = js.native
    def select2(): JQuery[TElement] = js.native
    // tslint:disable-next-line:no-unnecessary-generics
    def select2[Result, RemoteResult](options: Options[Result, RemoteResult]): JQuery[TElement] = js.native
    /**
    	 * Closes the dropdown
    	 */
    @JSName("select2")
    def select2_close(method: close): JQuery[TElement] = js.native
    /**
    	 * Get the data object of the current selection
    	 */
    @JSName("select2")
    def select2_data(method: data): js.Array[OptionData] = js.native
    /**
    	 * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
    	 */
    @JSName("select2")
    def select2_destroy(method: destroy): JQuery[TElement] = js.native
    /**
    	 * Opens the dropdown
    	 */
    @JSName("select2")
    def select2_open(method: open): JQuery[TElement] = js.native
    def trigger(events: Trigger): Unit = js.native
  }
  
}

