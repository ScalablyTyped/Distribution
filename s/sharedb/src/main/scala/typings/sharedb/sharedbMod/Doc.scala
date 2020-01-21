package typings.sharedb.sharedbMod

import typings.node.eventsMod.EventEmitter
import typings.sharedb.sharedbStrings.`before op`
import typings.sharedb.sharedbStrings.`no write pending`
import typings.sharedb.sharedbStrings.`nothing pending`
import typings.sharedb.sharedbStrings.create
import typings.sharedb.sharedbStrings.del
import typings.sharedb.sharedbStrings.error
import typings.sharedb.sharedbStrings.load
import typings.sharedb.sharedbStrings.op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/sharedb", "Doc")
@js.native
class Doc () extends EventEmitter {
  var data: js.Any = js.native
  var id: String = js.native
  var `type`: String = js.native
  @JSName("addListener")
  def addListener_beforeop(event: `before op`, callback: js.Function2[/* ops */ js.Array[Op], /* source */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_create(event: create, callback: js.Function1[/* source */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_del(event: del, callback: js.Function2[/* data */ js.Any, /* source */ Boolean, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_load(event: load, callback: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_nothingpending(event: `nothing pending`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_nowritepending(event: `no write pending`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_op(event: op, callback: js.Function2[/* ops */ js.Array[Op], /* source */ Boolean, Unit]): this.type = js.native
  def create(data: js.Any): Unit = js.native
  def create(data: js.Any, callback: Callback): Unit = js.native
  def create(data: js.Any, `type`: OTType): Unit = js.native
  def create(data: js.Any, `type`: OTType, callback: Callback): Unit = js.native
  def create(data: js.Any, `type`: OTType, options: ShareDBSourceOptions): Unit = js.native
  def create(data: js.Any, `type`: OTType, options: ShareDBSourceOptions, callback: Callback): Unit = js.native
  def del(options: ShareDBSourceOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def destroy(): Unit = js.native
  def fetch(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ingestSnapshot(snapshot: Snapshot, callback: Callback): Unit = js.native
  @JSName("on")
  def on_beforeop(event: `before op`, callback: js.Function2[/* ops */ js.Array[Op], /* source */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_create(event: create, callback: js.Function1[/* source */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_del(event: del, callback: js.Function2[/* data */ js.Any, /* source */ Boolean, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: load, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_nothingpending(event: `nothing pending`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_nowritepending(event: `no write pending`, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_op(event: op, callback: js.Function2[/* ops */ js.Array[Op], /* source */ Boolean, Unit]): this.type = js.native
  def submitOp(data: js.Array[Op]): Unit = js.native
  def submitOp(data: js.Array[Op], options: ShareDBSourceOptions): Unit = js.native
  def submitOp(data: js.Array[Op], options: ShareDBSourceOptions, callback: Callback): Unit = js.native
  def subscribe(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def whenNothingPending(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

