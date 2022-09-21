package typings.progressStream

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.progressStream.progressStreamStrings.close
import typings.progressStream.progressStreamStrings.data
import typings.progressStream.progressStreamStrings.drain
import typings.progressStream.progressStreamStrings.end
import typings.progressStream.progressStreamStrings.error
import typings.progressStream.progressStreamStrings.finish
import typings.progressStream.progressStreamStrings.length
import typings.progressStream.progressStreamStrings.pipe
import typings.progressStream.progressStreamStrings.progress
import typings.progressStream.progressStreamStrings.readable
import typings.progressStream.progressStreamStrings.unpipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ProgressStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ProgressStream]
  inline def apply(optionsOrProgressListener: Options): ProgressStream = ^.asInstanceOf[js.Dynamic].apply(optionsOrProgressListener.asInstanceOf[js.Any]).asInstanceOf[ProgressStream]
  inline def apply(optionsOrProgressListener: ProgressListener): ProgressStream = ^.asInstanceOf[js.Dynamic].apply(optionsOrProgressListener.asInstanceOf[js.Any]).asInstanceOf[ProgressStream]
  inline def apply(options: Options, progressListener: ProgressListener): ProgressStream = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], progressListener.asInstanceOf[js.Any])).asInstanceOf[ProgressStream]
  
  @JSImport("progress-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var drain: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var transferred: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDrain(value: Boolean): Self = StObject.set(x, "drain", value.asInstanceOf[js.Any])
      
      inline def setDrainUndefined: Self = StObject.set(x, "drain", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
      
      inline def setTransferredUndefined: Self = StObject.set(x, "transferred", js.undefined)
    }
  }
  
  trait Progress extends StObject {
    
    var delta: Double
    
    var eta: Double
    
    var length: Double
    
    var percentage: Double
    
    var remaining: Double
    
    var runtime: Double
    
    var speed: Double
    
    var transferred: Double
  }
  object Progress {
    
    inline def apply(
      delta: Double,
      eta: Double,
      length: Double,
      percentage: Double,
      remaining: Double,
      runtime: Double,
      speed: Double,
      transferred: Double
    ): Progress = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
  
  type ProgressListener = js.Function1[/* progress */ Progress, Unit]
  
  @js.native
  trait ProgressStream extends Transform {
    
    // events shared by stream.Readable and stream.Writable
    /* tslint:disable-next-line adjacent-overload-signatures */
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    // We have to redeclare all on/once overloads from stream.Transform in
    // order for this ProgressStream interface to extend stream.Transform
    // correctly. Using an intersection type instead may be an option once
    // https://github.com/Microsoft/TypeScript/issues/30031 is resolved.
    // stream.Readable events
    /* tslint:disable-next-line adjacent-overload-signatures */
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    // stream.Writable events
    /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("on")
    def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_length(event: length, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: ProgressListener): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("on")
    def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    /* tslint:disable-next-line adjacent-overload-signatures */
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /* tslint:disable-next-line adjacent-overload-signatures */
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Any, Unit]): this.type = js.native
    /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("once")
    def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_length(event: length, listener: js.Function1[/* length */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    @JSName("once")
    def once_progress(event: progress, listener: ProgressListener): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("once")
    def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
    
    def progress(): Progress = js.native
    
    def setLength(length: Double): Unit = js.native
  }
}
