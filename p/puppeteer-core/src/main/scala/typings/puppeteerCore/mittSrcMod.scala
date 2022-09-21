package typings.puppeteerCore

import typings.puppeteerCore.puppeteerCoreStrings.Asterisk
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mittSrcMod {
  
  @JSImport("puppeteer-core/lib/esm/vendor/mitt/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Emitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Emitter]
  inline def default(all: EventHandlerMap): Emitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(all.asInstanceOf[js.Any]).asInstanceOf[Emitter]
  
  @js.native
  trait Emitter extends StObject {
    
    var all: EventHandlerMap = js.native
    
    def emit(`type`: Asterisk): Unit = js.native
    def emit(`type`: Asterisk, event: Any): Unit = js.native
    def emit[T](`type`: EventType): Unit = js.native
    def emit[T](`type`: EventType, event: T): Unit = js.native
    
    def off(`type`: Asterisk, handler: WildcardHandler): Unit = js.native
    def off[T](`type`: EventType, handler: Handler[T]): Unit = js.native
    
    def on(`type`: Asterisk, handler: WildcardHandler): Unit = js.native
    def on[T](`type`: EventType, handler: Handler[T]): Unit = js.native
  }
  
  type EventHandlerList = js.Array[Handler[Any]]
  
  type EventHandlerMap = Map[EventType, EventHandlerList | WildCardEventHandlerList]
  
  type EventType = String | js.Symbol
  
  type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]
  
  type WildCardEventHandlerList = js.Array[WildcardHandler]
  
  type WildcardHandler = js.Function2[/* type */ EventType, /* event */ js.UndefOr[Any], Unit]
}
