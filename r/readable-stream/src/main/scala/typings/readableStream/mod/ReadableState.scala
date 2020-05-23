package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.node.stringDecoderMod.StringDecoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableState extends js.Object {
  var awaitDrain: Double
  var buffer: BufferList[_]
  var decoder: StringDecoder | Null
  var defaultEncoding: BufferEncoding
  var destroyed: Boolean
  var emittedReadable: Boolean
  var encoding: BufferEncoding | Null
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
    defaultEncoding: BufferEncoding,
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
    encoding: BufferEncoding = null
  ): ReadableState = {
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], defaultEncoding = defaultEncoding.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], emittedReadable = emittedReadable.asInstanceOf[js.Any], endEmitted = endEmitted.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], flowing = flowing.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], needReadable = needReadable.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], pipesCount = pipesCount.asInstanceOf[js.Any], readableListening = readableListening.asInstanceOf[js.Any], reading = reading.asInstanceOf[js.Any], readingMore = readingMore.asInstanceOf[js.Any], resumeScheduled = resumeScheduled.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], decoder = decoder.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableState]
  }
}

