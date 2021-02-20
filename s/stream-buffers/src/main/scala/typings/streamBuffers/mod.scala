package typings.streamBuffers

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.streamBuffers.streamBuffersBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-buffers", "DEFAULT_CHUNK_SIZE")
  @js.native
  val DEFAULT_CHUNK_SIZE: Double = js.native
  
  @JSImport("stream-buffers", "DEFAULT_FREQUENCY")
  @js.native
  val DEFAULT_FREQUENCY: Double = js.native
  
  @JSImport("stream-buffers", "DEFAULT_INCREMENT_AMOUNT")
  @js.native
  val DEFAULT_INCREMENT_AMOUNT: Double = js.native
  
  @JSImport("stream-buffers", "DEFAULT_INITIAL_SIZE")
  @js.native
  val DEFAULT_INITIAL_SIZE: Double = js.native
  
  @JSImport("stream-buffers", "ReadableStreamBuffer")
  @js.native
  class ReadableStreamBuffer () extends Readable {
    def this(options: ReadableStreamBufferOptions) = this()
    
    def maxSize(): Double = js.native
    
    def put(data: String): Unit = js.native
    def put(data: String, encoding: String): Unit = js.native
    def put(data: Buffer): Unit = js.native
    def put(data: Buffer, encoding: String): Unit = js.native
    
    def size(): Double = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("stream-buffers", "WritableStreamBuffer")
  @js.native
  class WritableStreamBuffer () extends Writable {
    def this(options: WritableStreamBufferOptions) = this()
    
    def getContents(): Buffer | `false` = js.native
    def getContents(length: Double): Buffer | `false` = js.native
    
    def getContentsAsString(): String | `false` = js.native
    def getContentsAsString(encoding: js.UndefOr[scala.Nothing], length: Double): String | `false` = js.native
    def getContentsAsString(encoding: String): String | `false` = js.native
    def getContentsAsString(encoding: String, length: Double): String | `false` = js.native
    
    def maxSize(): Double = js.native
    
    def size(): Double = js.native
  }
  
  @js.native
  trait ReadableStreamBufferOptions extends ReadableOptions {
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var frequency: js.UndefOr[Double] = js.native
    
    var incrementAmount: js.UndefOr[Double] = js.native
    
    var initialSize: js.UndefOr[Double] = js.native
  }
  object ReadableStreamBufferOptions {
    
    @scala.inline
    def apply(): ReadableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableStreamBufferOptions]
    }
    
    @scala.inline
    implicit class ReadableStreamBufferOptionsMutableBuilder[Self <: ReadableStreamBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setIncrementAmount(value: Double): Self = StObject.set(x, "incrementAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementAmountUndefined: Self = StObject.set(x, "incrementAmount", js.undefined)
      
      @scala.inline
      def setInitialSize(value: Double): Self = StObject.set(x, "initialSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSizeUndefined: Self = StObject.set(x, "initialSize", js.undefined)
    }
  }
  
  @js.native
  trait WritableStreamBufferOptions extends WritableOptions {
    
    var incrementAmount: js.UndefOr[Double] = js.native
    
    var initialSize: js.UndefOr[Double] = js.native
  }
  object WritableStreamBufferOptions {
    
    @scala.inline
    def apply(): WritableStreamBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableStreamBufferOptions]
    }
    
    @scala.inline
    implicit class WritableStreamBufferOptionsMutableBuilder[Self <: WritableStreamBufferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncrementAmount(value: Double): Self = StObject.set(x, "incrementAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementAmountUndefined: Self = StObject.set(x, "incrementAmount", js.undefined)
      
      @scala.inline
      def setInitialSize(value: Double): Self = StObject.set(x, "initialSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSizeUndefined: Self = StObject.set(x, "initialSize", js.undefined)
    }
  }
}
