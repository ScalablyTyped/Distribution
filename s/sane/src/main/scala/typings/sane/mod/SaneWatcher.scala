package typings.sane.mod

import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.Stats
import typings.sane.saneStrings.add
import typings.sane.saneStrings.all
import typings.sane.saneStrings.change
import typings.sane.saneStrings.delete
import typings.sane.saneStrings.error
import typings.sane.saneStrings.ready
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaneWatcher extends EventEmitter {
  
  @JSName("addListener")
  def addListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  val dot: Boolean = js.native
  
  @JSName("emit")
  def emit_add(event: add, path: String, root: String, stat: Stats): Boolean = js.native
  @JSName("emit")
  def emit_all(event: all, eventType: AllEventType, path: String, root: String): Boolean = js.native
  @JSName("emit")
  def emit_all(event: all, eventType: AllEventType, path: String, root: String, stat: Stats): Boolean = js.native
  @JSName("emit")
  def emit_change(event: change, path: String, root: String, stat: Stats): Boolean = js.native
  @JSName("emit")
  def emit_delete(event: delete, path: String, root: String): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, error: Error): Boolean = js.native
  @JSName("emit")
  def emit_ready(event: ready): Boolean = js.native
  
  val globs: js.Array[String] = js.native
  
  val hasIgnore: Boolean = js.native
  
  val ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = js.native
  
  def listenerCount(`type`: EventType): Double = js.native
  
  // tslint:disable-next-line ban-types
  def listeners(event: EventType): js.Array[js.Function] = js.native
  
  @JSName("on")
  def on_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("once")
  def once_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def removeAllListeners(event: EventType): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_add(event: add, listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_all(
    event: all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ String, 
      /* root */ String, 
      /* stat */ js.UndefOr[Stats], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(
    event: change,
    listener: js.Function3[/* path */ String, /* root */ String, /* stat */ Stats, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_delete(event: delete, listener: js.Function2[/* path */ String, /* root */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  
  val root: String = js.native
}
