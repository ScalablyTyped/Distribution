package typings.readableStream.mod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableState extends StObject {
  
  var awaitDrain: Double = js.native
  
  var buffer: BufferList[_] = js.native
  
  var decoder: StringDecoder | Null = js.native
  
  var defaultEncoding: BufferEncoding = js.native
  
  var destroyed: Boolean = js.native
  
  var emittedReadable: Boolean = js.native
  
  var encoding: BufferEncoding | Null = js.native
  
  var endEmitted: Boolean = js.native
  
  var ended: Boolean = js.native
  
  var flowing: js.Any = js.native
  
  var highWaterMark: Double = js.native
  
  var length: Double = js.native
  
  var needReadable: Boolean = js.native
  
  var objectMode: Boolean = js.native
  
  var pipes: js.Any = js.native
  
  // NodeJS.WritableStream | any[]; // TODO
  var pipesCount: Double = js.native
  
  var readableListening: Boolean = js.native
  
  var reading: Boolean = js.native
  
  var readingMore: Boolean = js.native
  
  var resumeScheduled: Boolean = js.native
  
  var sync: Boolean = js.native
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
    sync: Boolean
  ): ReadableState = {
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], defaultEncoding = defaultEncoding.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], emittedReadable = emittedReadable.asInstanceOf[js.Any], endEmitted = endEmitted.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], flowing = flowing.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], needReadable = needReadable.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], pipesCount = pipesCount.asInstanceOf[js.Any], readableListening = readableListening.asInstanceOf[js.Any], reading = reading.asInstanceOf[js.Any], readingMore = readingMore.asInstanceOf[js.Any], resumeScheduled = resumeScheduled.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableState]
  }
  
  @scala.inline
  implicit class ReadableStateMutableBuilder[Self <: ReadableState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwaitDrain(value: Double): Self = StObject.set(x, "awaitDrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: BufferList[_]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoder(value: StringDecoder): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoderNull: Self = StObject.set(x, "decoder", null)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedReadable(value: Boolean): Self = StObject.set(x, "emittedReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEndEmitted(value: Boolean): Self = StObject.set(x, "endEmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowing(value: js.Any): Self = StObject.set(x, "flowing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedReadable(value: Boolean): Self = StObject.set(x, "needReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipes(value: js.Any): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipesCount(value: Double): Self = StObject.set(x, "pipesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableListening(value: Boolean): Self = StObject.set(x, "readableListening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReading(value: Boolean): Self = StObject.set(x, "reading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingMore(value: Boolean): Self = StObject.set(x, "readingMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeScheduled(value: Boolean): Self = StObject.set(x, "resumeScheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
