package typings.readableDashStream.readableDashStreamMod

import typings.node.stringUnderscoreDecoderMod.StringDecoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableState extends js.Object {
  var awaitDrain: Double
  var buffer: BufferList[_]
  var decoder: StringDecoder | Null
  var defaultEncoding: String
  var destroyed: Boolean
  var emittedReadable: Boolean
  var encoding: String | Null
  var endEmitted: Boolean
  var ended: Boolean
  var flowing: js.Any
  var highWaterMark: Double
  var length: Double
  var needReadable: Boolean
  var objectMode: Boolean
  var pipes: js.Any
   // NodeJS.WritableStream | any[]; // TODO
  var pipesCount: Double
  var readableListening: Boolean
  var reading: Boolean
  var readingMore: Boolean
  var resumeScheduled: Boolean
  var sync: Boolean
}

object ReadableState {
  @scala.inline
  def apply(
    awaitDrain: Double,
    buffer: BufferList[_],
    defaultEncoding: String,
    destroyed: Boolean,
    emittedReadable: Boolean,
    endEmitted: Boolean,
    ended: Boolean,
    flowing: js.Any,
    highWaterMark: Double,
    length: Double,
    needReadable: Boolean,
    objectMode: Boolean,
    pipes: js.Any,
    pipesCount: Double,
    readableListening: Boolean,
    reading: Boolean,
    readingMore: Boolean,
    resumeScheduled: Boolean,
    sync: Boolean,
    decoder: StringDecoder = null,
    encoding: String = null
  ): ReadableState = {
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain, buffer = buffer, defaultEncoding = defaultEncoding, destroyed = destroyed, emittedReadable = emittedReadable, endEmitted = endEmitted, ended = ended, flowing = flowing, highWaterMark = highWaterMark, length = length, needReadable = needReadable, objectMode = objectMode, pipes = pipes, pipesCount = pipesCount, readableListening = readableListening, reading = reading, readingMore = readingMore, resumeScheduled = resumeScheduled, sync = sync)
    if (decoder != null) __obj.updateDynamic("decoder")(decoder)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[ReadableState]
  }
}

