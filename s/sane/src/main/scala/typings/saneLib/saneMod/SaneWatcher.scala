package typings
package saneLib.saneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaneWatcher
  extends nodeLib.eventsMod.EventEmitter {
  val dot: scala.Boolean = js.native
  val globs: js.Array[java.lang.String] = js.native
  val hasIgnore: scala.Boolean = js.native
  val ignored: AnymatchMatcher | js.Array[AnymatchMatcher] = js.native
  val root: java.lang.String = js.native
  @JSName("addListener")
  def addListener_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("emit")
  def emit_add(
    event: saneLib.saneLibStrings.add,
    path: java.lang.String,
    root: java.lang.String,
    stat: nodeLib.fsMod.Stats
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_all(
    event: saneLib.saneLibStrings.all,
    eventType: AllEventType,
    path: java.lang.String,
    root: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_all(
    event: saneLib.saneLibStrings.all,
    eventType: AllEventType,
    path: java.lang.String,
    root: java.lang.String,
    stat: nodeLib.fsMod.Stats
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_change(
    event: saneLib.saneLibStrings.change,
    path: java.lang.String,
    root: java.lang.String,
    stat: nodeLib.fsMod.Stats
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_delete(event: saneLib.saneLibStrings.delete, path: java.lang.String, root: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_error(event: saneLib.saneLibStrings.error, error: stdLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_ready(event: saneLib.saneLibStrings.ready): scala.Boolean = js.native
  def listenerCount(`type`: EventType): scala.Double = js.native
  // tslint:disable-next-line ban-types
  def listeners(event: EventType): js.Array[js.Function] = js.native
  @JSName("on")
  def on_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
  def removeAllListeners(event: EventType): this.type = js.native
  @JSName("removeListener")
  def removeListener_add(
    event: saneLib.saneLibStrings.add,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_all(
    event: saneLib.saneLibStrings.all,
    listener: js.Function4[
      /* eventType */ AllEventType, 
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ js.UndefOr[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(
    event: saneLib.saneLibStrings.change,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* root */ java.lang.String, 
      /* stat */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_delete(
    event: saneLib.saneLibStrings.delete,
    listener: js.Function2[/* path */ java.lang.String, /* root */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: saneLib.saneLibStrings.error, listener: js.Function1[/* error */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_ready(event: saneLib.saneLibStrings.ready, listener: js.Function0[scala.Unit]): this.type = js.native
}

