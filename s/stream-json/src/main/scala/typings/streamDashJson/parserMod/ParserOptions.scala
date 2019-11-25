package typings.streamDashJson.parserMod

import typings.node.Anon_Chunk
import typings.node.Error
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends TransformOptions {
  var jsonStreaming: js.UndefOr[Boolean] = js.undefined
  var packKeys: js.UndefOr[Boolean] = js.undefined
  var packNumbers: js.UndefOr[Boolean] = js.undefined
  var packStrings: js.UndefOr[Boolean] = js.undefined
  var packValues: js.UndefOr[Boolean] = js.undefined
  var streamKeys: js.UndefOr[Boolean] = js.undefined
  var streamNumbers: js.UndefOr[Boolean] = js.undefined
  var streamStrings: js.UndefOr[Boolean] = js.undefined
  var streamValues: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Transform, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    `final`: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    flush: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit] = null,
    highWaterMark: Int | Double = null,
    jsonStreaming: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    packKeys: js.UndefOr[Boolean] = js.undefined,
    packNumbers: js.UndefOr[Boolean] = js.undefined,
    packStrings: js.UndefOr[Boolean] = js.undefined,
    packValues: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit] = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    streamKeys: js.UndefOr[Boolean] = js.undefined,
    streamNumbers: js.UndefOr[Boolean] = js.undefined,
    streamStrings: js.UndefOr[Boolean] = js.undefined,
    streamValues: js.UndefOr[Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ TransformCallback, 
      Unit
    ] = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonStreaming)) __obj.updateDynamic("jsonStreaming")(jsonStreaming.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(packKeys)) __obj.updateDynamic("packKeys")(packKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(packNumbers)) __obj.updateDynamic("packNumbers")(packNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(packStrings)) __obj.updateDynamic("packStrings")(packStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(packValues)) __obj.updateDynamic("packValues")(packValues.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.asInstanceOf[js.Any])
    if (!js.isUndefined(streamKeys)) __obj.updateDynamic("streamKeys")(streamKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(streamNumbers)) __obj.updateDynamic("streamNumbers")(streamNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(streamStrings)) __obj.updateDynamic("streamStrings")(streamStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(streamValues)) __obj.updateDynamic("streamValues")(streamValues.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

