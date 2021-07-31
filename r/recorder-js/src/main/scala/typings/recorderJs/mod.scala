package typings.recorderJs

import typings.std.AudioContext
import typings.std.Blob
import typings.std.Float32Array
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recorder-js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Recorder {
    def this(audioContext: AudioContext) = this()
    def this(audioContext: AudioContext, config: RecorderConfig) = this()
    
    /* CompleteClass */
    override def init(stream: MediaStream): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def start(): js.Promise[js.UndefOr[MediaStream]] = js.native
    
    /* CompleteClass */
    override def stop(): js.Promise[RecorderResult] = js.native
  }
  @JSImport("recorder-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def download(blob: Blob, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(blob.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type OnAnalysedHandler = js.Function2[/* data */ js.Array[Double], /* lastNonZero */ Double, Unit]
  
  trait Recorder extends StObject {
    
    def init(stream: MediaStream): js.Promise[Unit]
    
    def start(): js.Promise[js.UndefOr[MediaStream]]
    
    def stop(): js.Promise[RecorderResult]
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
  
  trait RecorderConfig extends StObject {
    
    var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.undefined
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
  
  trait RecorderResult extends StObject {
    
    var blob: Blob
    
    var buffer: js.Array[Float32Array]
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
