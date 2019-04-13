package typings
package readableDashStreamLib.readableDashStreamMod

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
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain, buffer = buffer, defaultEncoding = defaultEncoding, destroyed = destroyed, emittedReadable = emittedReadable, endEmitted = endEmitted, ended = ended, flowing = flowing, highWaterMark = highWaterMark, length = length, needReadable = needReadable, objectMode = objectMode, pipes = pipes, pipesCount = pipesCount, readableListening = readableListening, reading = reading, readingMore = readingMore, resumeScheduled = resumeScheduled, sync = sync)
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[ReadableState]
  }
}

