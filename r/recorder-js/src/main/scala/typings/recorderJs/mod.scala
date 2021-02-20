package typings.recorderJs

import typings.std.AudioContext
import typings.std.Blob
import typings.std.Float32Array
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recorder-js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Recorder {
    def this(audioContext: AudioContext) = this()
    def this(audioContext: AudioContext, config: RecorderConfig) = this()
  }
  
  /* static member */
  @JSImport("recorder-js", "download")
  @js.native
  def download(blob: Blob, filename: String): Unit = js.native
  
  type OnAnalysedHandler = js.Function2[/* data */ js.Array[Double], /* lastNonZero */ Double, Unit]
  
  @js.native
  trait Recorder extends StObject {
    
    def init(stream: MediaStream): js.Promise[Unit] = js.native
    
    def start(): js.Promise[js.UndefOr[MediaStream]] = js.native
    
    def stop(): js.Promise[RecorderResult] = js.native
  }
  object Recorder {
    
    @scala.inline
    def apply(
      init: MediaStream => js.Promise[Unit],
      start: () => js.Promise[js.UndefOr[MediaStream]],
      stop: () => js.Promise[RecorderResult]
    ): Recorder = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Recorder]
    }
    
    @scala.inline
    implicit class RecorderMutableBuilder[Self <: Recorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: MediaStream => js.Promise[Unit]): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => js.Promise[js.UndefOr[MediaStream]]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => js.Promise[RecorderResult]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RecorderConfig extends StObject {
    
    var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.native
  }
  object RecorderConfig {
    
    @scala.inline
    def apply(): RecorderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderConfig]
    }
    
    @scala.inline
    implicit class RecorderConfigMutableBuilder[Self <: RecorderConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAnalysed(value: (/* data */ js.Array[Double], /* lastNonZero */ Double) => Unit): Self = StObject.set(x, "onAnalysed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAnalysedUndefined: Self = StObject.set(x, "onAnalysed", js.undefined)
    }
  }
  
  @js.native
  trait RecorderResult extends StObject {
    
    var blob: Blob = js.native
    
    var buffer: js.Array[Float32Array] = js.native
  }
  object RecorderResult {
    
    @scala.inline
    def apply(blob: Blob, buffer: js.Array[Float32Array]): RecorderResult = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecorderResult]
    }
    
    @scala.inline
    implicit class RecorderResultMutableBuilder[Self <: RecorderResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: js.Array[Float32Array]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferVarargs(value: Float32Array*): Self = StObject.set(x, "buffer", js.Array(value :_*))
    }
  }
}
