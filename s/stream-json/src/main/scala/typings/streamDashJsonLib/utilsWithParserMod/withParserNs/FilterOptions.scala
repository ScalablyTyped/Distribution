package typings
package streamDashJsonLib.utilsWithParserMod.withParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions
  extends streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.FilterOptions {
  var jsonStreaming: js.UndefOr[scala.Boolean] = js.undefined
  var packKeys: js.UndefOr[scala.Boolean] = js.undefined
  var packNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var packStrings: js.UndefOr[scala.Boolean] = js.undefined
  // copied from ParserOptions
  var packValues: js.UndefOr[scala.Boolean] = js.undefined
  var streamNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var streamStrings: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply(
    filter: java.lang.String | stdLib.RegExp | streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.FilterFunction,
    allowEmptyReplacement: js.UndefOr[scala.Boolean] = js.undefined,
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Duplex, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    encoding: java.lang.String = null,
    `final`: js.ThisFunction1[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    final_TransformOptions: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    flush: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* callback */ nodeLib.streamMod.internalNs.TransformCallback, 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    jsonStreaming: js.UndefOr[scala.Boolean] = js.undefined,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    packKeys: js.UndefOr[scala.Boolean] = js.undefined,
    packNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    packStrings: js.UndefOr[scala.Boolean] = js.undefined,
    packValues: js.UndefOr[scala.Boolean] = js.undefined,
    pathSeparator: java.lang.String = null,
    read: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Readable, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ nodeLib.streamMod.internalNs.Duplex, /* size */ scala.Double, scala.Unit] = null,
    read_TransformOptions: js.ThisFunction1[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    replacement: js.Array[streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.Token] | streamDashJsonLib.filtersFilterBaseMod.FilterBaseNs.ReplacementFunction = null,
    streamKeys: js.UndefOr[scala.Boolean] = js.undefined,
    streamNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    streamStrings: js.UndefOr[scala.Boolean] = js.undefined,
    streamValues: js.UndefOr[scala.Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ nodeLib.streamMod.internalNs.TransformCallback, 
      scala.Unit
    ] = null,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    write_TransformOptions: js.ThisFunction3[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ nodeLib.streamMod.internalNs.Duplex) | (/* this */ nodeLib.streamMod.internalNs.Writable), 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev_TransformOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.internalNs.Transform, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmptyReplacement)) __obj.updateDynamic("allowEmptyReplacement")(allowEmptyReplacement)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (destroy_TransformOptions != null) __obj.updateDynamic("destroy")(destroy_TransformOptions)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (final_TransformOptions != null) __obj.updateDynamic("final")(final_TransformOptions)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonStreaming)) __obj.updateDynamic("jsonStreaming")(jsonStreaming)
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(packKeys)) __obj.updateDynamic("packKeys")(packKeys)
    if (!js.isUndefined(packNumbers)) __obj.updateDynamic("packNumbers")(packNumbers)
    if (!js.isUndefined(packStrings)) __obj.updateDynamic("packStrings")(packStrings)
    if (!js.isUndefined(packValues)) __obj.updateDynamic("packValues")(packValues)
    if (pathSeparator != null) __obj.updateDynamic("pathSeparator")(pathSeparator)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (read_TransformOptions != null) __obj.updateDynamic("read")(read_TransformOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(streamKeys)) __obj.updateDynamic("streamKeys")(streamKeys)
    if (!js.isUndefined(streamNumbers)) __obj.updateDynamic("streamNumbers")(streamNumbers)
    if (!js.isUndefined(streamStrings)) __obj.updateDynamic("streamStrings")(streamStrings)
    if (!js.isUndefined(streamValues)) __obj.updateDynamic("streamValues")(streamValues)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (write_TransformOptions != null) __obj.updateDynamic("write")(write_TransformOptions)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    if (writev_TransformOptions != null) __obj.updateDynamic("writev")(writev_TransformOptions)
    __obj.asInstanceOf[FilterOptions]
  }
}

