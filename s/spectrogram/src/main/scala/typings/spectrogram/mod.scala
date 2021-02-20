package typings.spectrogram

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.spectrogram.anon.Enable
import typings.spectrogram.anon.Height
import typings.std.AnalyserNode
import typings.std.AudioBuffer
import typings.std.AudioContext
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("spectrogram", JSImport.Namespace)
  @js.native
  val ^ : SpectrogramConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("spectrogram", JSImport.Namespace)
  @js.native
  class Class protected () extends Spectrogram {
    def this(canvas: HTMLCanvasElement, options: SpectrogramOptions) = this()
  }
  
  @js.native
  trait Spectrogram extends StObject {
    
    def clear(canvasContext: CanvasRenderingContext2D): Unit = js.native
    
    def connectSource(analyserNode: AnalyserNode, audioContext: AudioContext): Unit = js.native
    def connectSource(audioBuffer: AudioBuffer): Unit = js.native
    def connectSource(audioBuffer: AudioBuffer, audioContext: AudioContext): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def start(): Unit = js.native
    def start(offset: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait SpectrogramConstructor extends Instantiable2[/* canvas */ HTMLCanvasElement, /* options */ SpectrogramOptions, Spectrogram] {
    
    def apply(canvas: HTMLCanvasElement, options: SpectrogramOptions): Spectrogram = js.native
  }
  
  @js.native
  trait SpectrogramOptions extends StObject {
    
    var audio: js.UndefOr[Enable] = js.native
    
    var canvas: js.UndefOr[Height] = js.native
    
    var colors: js.UndefOr[
        js.Function1[/* steps */ Double, js.Array[String | CanvasGradient | CanvasPattern]]
      ] = js.native
  }
  object SpectrogramOptions {
    
    @scala.inline
    def apply(): SpectrogramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpectrogramOptions]
    }
    
    @scala.inline
    implicit class SpectrogramOptionsMutableBuilder[Self <: SpectrogramOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Enable): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setCanvas(value: Height): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      @scala.inline
      def setColors(value: /* steps */ Double => js.Array[String | CanvasGradient | CanvasPattern]): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    }
  }
  
  type _To = SpectrogramConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SpectrogramConstructor = ^
}
