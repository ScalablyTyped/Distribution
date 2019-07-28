package typings.stompit.libClientMod

import typings.node.Anon_Chunk
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends WritableOptions {
  def onError(err: Error): Unit
  def onReceipt(): Unit
}

object SendOptions {
  @scala.inline
  def apply(
    onError: Error => Unit,
    onReceipt: () => Unit,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Writable, 
      /* error */ typings.node.Error | Null, 
      /* callback */ js.Function1[/* error */ typings.node.Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    `final`: js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[typings.node.Error | Null], Unit], 
      Unit
    ] = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[typings.node.Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[typings.node.Error | Null], Unit], 
      Unit
    ] = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onReceipt = js.Any.fromFunction0(onReceipt))
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[SendOptions]
  }
}

