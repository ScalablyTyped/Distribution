package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableState extends js.Object {
  var awaitDrain: scala.Double
  var buffer: BufferList[_]
  var decoder: nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder | scala.Null
  var defaultEncoding: java.lang.String
  var destroyed: scala.Boolean
  var emittedReadable: scala.Boolean
  var encoding: java.lang.String | scala.Null
  var endEmitted: scala.Boolean
  var ended: scala.Boolean
  var flowing: js.Any
  var highWaterMark: scala.Double
  var length: scala.Double
  var needReadable: scala.Boolean
  var objectMode: scala.Boolean
  var pipes: js.Any
   // NodeJS.WritableStream | any[]; // TODO
  var pipesCount: scala.Double
  var readableListening: scala.Boolean
  var reading: scala.Boolean
  var readingMore: scala.Boolean
  var resumeScheduled: scala.Boolean
  var sync: scala.Boolean
}

object ReadableState {
  @scala.inline
  def apply(
    awaitDrain: scala.Double,
    buffer: BufferList[_],
    defaultEncoding: java.lang.String,
    destroyed: scala.Boolean,
    emittedReadable: scala.Boolean,
    endEmitted: scala.Boolean,
    ended: scala.Boolean,
    flowing: js.Any,
    highWaterMark: scala.Double,
    length: scala.Double,
    needReadable: scala.Boolean,
    objectMode: scala.Boolean,
    pipes: js.Any,
    pipesCount: scala.Double,
    readableListening: scala.Boolean,
    reading: scala.Boolean,
    readingMore: scala.Boolean,
    resumeScheduled: scala.Boolean,
    sync: scala.Boolean,
    decoder: nodeLib.stringUnderscoreDecoderMod.NodeStringDecoder = null,
    encoding: java.lang.String = null
  ): ReadableState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awaitDrain")(awaitDrain)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    __obj.updateDynamic("destroyed")(destroyed)
    __obj.updateDynamic("emittedReadable")(emittedReadable)
    __obj.updateDynamic("endEmitted")(endEmitted)
    __obj.updateDynamic("ended")(ended)
    __obj.updateDynamic("flowing")(flowing)
    __obj.updateDynamic("highWaterMark")(highWaterMark)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("needReadable")(needReadable)
    __obj.updateDynamic("objectMode")(objectMode)
    __obj.updateDynamic("pipes")(pipes)
    __obj.updateDynamic("pipesCount")(pipesCount)
    __obj.updateDynamic("readableListening")(readableListening)
    __obj.updateDynamic("reading")(reading)
    __obj.updateDynamic("readingMore")(readingMore)
    __obj.updateDynamic("resumeScheduled")(resumeScheduled)
    __obj.updateDynamic("sync")(sync)
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[ReadableState]
  }
}

