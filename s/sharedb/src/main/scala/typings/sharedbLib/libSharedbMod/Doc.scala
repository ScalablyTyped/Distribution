package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb/lib/sharedb", "Doc")
@js.native
class Doc ()
  extends nodeLib.eventsMod.EventEmitter {
  var data: js.Any = js.native
  var id: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  @JSName("addListener")
  def addListener_beforeop(
    event: sharedbLib.sharedbLibStrings.`before op`,
    callback: js.Function2[/* ops */ js.Array[Op], /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_create(
    event: sharedbLib.sharedbLibStrings.create,
    callback: js.Function1[/* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_del(
    event: sharedbLib.sharedbLibStrings.del,
    callback: js.Function2[/* data */ js.Any, /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: sharedbLib.sharedbLibStrings.error, callback: js.Function1[/* err */ Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_load(event: sharedbLib.sharedbLibStrings.load, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_nothingpending(event: sharedbLib.sharedbLibStrings.`nothing pending`, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_nowritepending(event: sharedbLib.sharedbLibStrings.`no write pending`, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_op(
    event: sharedbLib.sharedbLibStrings.op,
    callback: js.Function2[/* ops */ js.Array[Op], /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  def create(data: js.Any): scala.Unit = js.native
  def create(data: js.Any, callback: Callback): scala.Unit = js.native
  def create(data: js.Any, `type`: OTType): scala.Unit = js.native
  def create(data: js.Any, `type`: OTType, callback: Callback): scala.Unit = js.native
  def create(data: js.Any, `type`: OTType, options: ShareDBSourceOptions): scala.Unit = js.native
  def create(data: js.Any, `type`: OTType, options: ShareDBSourceOptions, callback: Callback): scala.Unit = js.native
  def del(options: ShareDBSourceOptions, callback: js.Function1[/* err */ Error, scala.Unit]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def fetch(callback: js.Function1[/* err */ Error, scala.Unit]): scala.Unit = js.native
  def ingestSnapshot(snapshot: Snapshot, callback: Callback): scala.Unit = js.native
  @JSName("on")
  def on_beforeop(
    event: sharedbLib.sharedbLibStrings.`before op`,
    callback: js.Function2[/* ops */ js.Array[Op], /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_create(
    event: sharedbLib.sharedbLibStrings.create,
    callback: js.Function1[/* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_del(
    event: sharedbLib.sharedbLibStrings.del,
    callback: js.Function2[/* data */ js.Any, /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: sharedbLib.sharedbLibStrings.error, callback: js.Function1[/* err */ Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_load(event: sharedbLib.sharedbLibStrings.load, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_nothingpending(event: sharedbLib.sharedbLibStrings.`nothing pending`, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_nowritepending(event: sharedbLib.sharedbLibStrings.`no write pending`, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_op(
    event: sharedbLib.sharedbLibStrings.op,
    callback: js.Function2[/* ops */ js.Array[Op], /* source */ scala.Boolean, scala.Unit]
  ): this.type = js.native
  def submitOp(data: js.Array[Op]): scala.Unit = js.native
  def submitOp(data: js.Array[Op], options: ShareDBSourceOptions): scala.Unit = js.native
  def submitOp(data: js.Array[Op], options: ShareDBSourceOptions, callback: Callback): scala.Unit = js.native
  def subscribe(callback: js.Function1[/* err */ Error, scala.Unit]): scala.Unit = js.native
  def whenNothingPending(callback: js.Function1[/* err */ Error, scala.Unit]): scala.Unit = js.native
}

