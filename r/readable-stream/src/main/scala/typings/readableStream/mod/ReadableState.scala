package typings.readableStream.mod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableState extends StObject {
  
  var awaitDrain: Double
  
  var buffer: BufferList[js.Any]
  
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
    buffer: BufferList[js.Any],
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
    val __obj = js.Dynamic.literal(awaitDrain = awaitDrain.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], defaultEncoding = defaultEncoding.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], emittedReadable = emittedReadable.asInstanceOf[js.Any], endEmitted = endEmitted.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], flowing = flowing.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], needReadable = needReadable.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any], pipesCount = pipesCount.asInstanceOf[js.Any], readableListening = readableListening.asInstanceOf[js.Any], reading = reading.asInstanceOf[js.Any], readingMore = readingMore.asInstanceOf[js.Any], resumeScheduled = resumeScheduled.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], decoder = null, encoding = null)
    __obj.asInstanceOf[ReadableState]
  }
  
  @scala.inline
  implicit class ReadableStateMutableBuilder[Self <: ReadableState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwaitDrain(value: Double): Self = StObject.set(x, "awaitDrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: BufferList[js.Any]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
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
