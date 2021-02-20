package typings.select2.mod

import typings.select2.select2Strings.close
import typings.select2.select2Strings.data
import typings.select2.select2Strings.destroy
import typings.select2.select2Strings.open
import typings.select2.select2Strings.select2
import typings.select2.select2Strings.select2Colonclose
import typings.select2.select2Strings.select2Colonclosing
import typings.select2.select2Strings.select2Colonopen
import typings.select2.select2Strings.select2Colonopening
import typings.select2.select2Strings.select2Colonselect
import typings.select2.select2Strings.select2Colonselecting
import typings.select2.select2Strings.select2Colonunselect
import typings.select2.select2Strings.select2Colonunselecting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait JQuery[TElement] extends StObject {
    
    @JSName("data")
    def data_select2(key: select2): Select2 = js.native
    
    @JSName("on")
    def on_select2close(events: select2Colonclose): this.type = js.native
    @JSName("on")
    def on_select2close(events: select2Colonclose, handler: JQueryEventHandlerBase[TElement, Event[TElement, js.Object]]): this.type = js.native
    // TODO: events "change" and "change.select2"
    @JSName("on")
    def on_select2closing(events: select2Colonclosing): this.type = js.native
    @JSName("on")
    def on_select2closing(events: select2Colonclosing, handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]): this.type = js.native
    @JSName("on")
    def on_select2open(events: select2Colonopen): this.type = js.native
    @JSName("on")
    def on_select2open(events: select2Colonopen, handler: JQueryEventHandlerBase[TElement, Event[TElement, js.Object]]): this.type = js.native
    @JSName("on")
    def on_select2opening(events: select2Colonopening): this.type = js.native
    @JSName("on")
    def on_select2opening(events: select2Colonopening, handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]): this.type = js.native
    @JSName("on")
    def on_select2select(events: select2Colonselect): this.type = js.native
    @JSName("on")
    def on_select2select(events: select2Colonselect, handler: JQueryEventHandlerBase[TElement, Event[TElement, DataParams]]): this.type = js.native
    @JSName("on")
    def on_select2selecting(events: select2Colonselecting): this.type = js.native
    @JSName("on")
    def on_select2selecting(
      events: select2Colonselecting,
      handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]
    ): this.type = js.native
    @JSName("on")
    def on_select2unselect(events: select2Colonunselect): this.type = js.native
    @JSName("on")
    def on_select2unselect(
      events: select2Colonunselect,
      handler: JQueryEventHandlerBase[TElement, Event[TElement, DataParams]]
    ): this.type = js.native
    @JSName("on")
    def on_select2unselecting(events: select2Colonunselecting): this.type = js.native
    @JSName("on")
    def on_select2unselecting(
      events: select2Colonunselecting,
      handler: JQueryEventHandlerBase[TElement, Event[TElement, IngParams]]
    ): this.type = js.native
    
    def select2(): JQuery[TElement] = js.native
    // tslint:disable-next-line:no-unnecessary-generics
    def select2[Result, RemoteResult](options: Options[Result, RemoteResult]): JQuery[TElement] = js.native
    @JSName("select2")
    var select2_Original: Select2Plugin[TElement] = js.native
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
