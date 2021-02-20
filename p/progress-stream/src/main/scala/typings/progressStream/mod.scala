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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("progress-stream", JSImport.Namespace)
  @js.native
  def apply(): ProgressStream = js.native
  @JSImport("progress-stream", JSImport.Namespace)
  @js.native
  def apply(optionsOrProgressListener: Options): ProgressStream = js.native
  @JSImport("progress-stream", JSImport.Namespace)
  @js.native
  def apply(optionsOrProgressListener: ProgressListener): ProgressStream = js.native
  @JSImport("progress-stream", JSImport.Namespace)
  @js.native
  def apply(options: Options, progressListener: ProgressListener): ProgressStream = js.native
  
  @js.native
  trait Options extends StObject {
    
    var drain: js.UndefOr[Boolean] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var time: js.UndefOr[Double] = js.native
    
    var transferred: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrain(value: Boolean): Self = StObject.set(x, "drain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrainUndefined: Self = StObject.set(x, "drain", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferredUndefined: Self = StObject.set(x, "transferred", js.undefined)
    }
  }
  
  @js.native
  trait Progress extends StObject {
    
    var delta: Double = js.native
    
    var eta: Double = js.native
    
    var length: Double = js.native
    
    var percentage: Double = js.native
    
    var remaining: Double = js.native
    
    var runtime: Double = js.native
    
    var speed: Double = js.native
    
    var transferred: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
  
  type ProgressListener = js.Function1[/* progress */ Progress, Unit]
  
  @js.native
  trait ProgressStream extends Transform {
    
    // We have to redeclare all on/once overloads from stream.Transform in
    // order for this ProgressStream interface to extend stream.Transform
    // correctly. Using an intersection type instead may be an option once
    // https://github.com/Microsoft/TypeScript/issues/30031 is resolved.
    // stream.Readable events
    /* tslint:disable-next-line adjacent-overload-signatures */
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    // stream.Writable events
    /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
    @JSName("on")
    def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    /* tslint:disable-next-line adjacent-overload-signatures unified-signatures */
    @JSName("once")
    def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
    /* tslint:disable-next-line unified-signatures */
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
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
