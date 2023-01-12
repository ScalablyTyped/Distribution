package typings.streamTransform

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, U](handler: Handler[T, U]): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  inline def default[T, U](handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](options: Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](options: Options, handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](records: js.Array[T], handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](records: js.Array[T], handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](records: js.Array[T], options: Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def default[T, U](records: js.Array[T], options: Options, handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  
  @JSImport("stream-transform", "Transformer")
  @js.native
  open class Transformer protected () extends Transform {
    def this(options: Options) = this()
    
    val options: Options = js.native
    
    val state: State = js.native
  }
  
  inline def transform[T, U](handler: Handler[T, U]): Transformer = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  inline def transform[T, U](handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](options: Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](options: Options, handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], options: Options, handler: Handler[T, U]): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  inline def transform[T, U](records: js.Array[T], options: Options, handler: Handler[T, U], callback: Callback): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(records.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  
  type Callback = js.Function2[/* err */ js.UndefOr[Null | js.Error], /* output */ js.UndefOr[String], Unit]
  
  type Handler[T, U] = js.Function3[/* record */ T, /* callback */ HandlerCallback[Any], /* params */ js.UndefOr[Any], U]
  
  type HandlerCallback[T] = js.Function2[/* err */ js.UndefOr[Null | js.Error], /* record */ js.UndefOr[T], Unit]
  
  trait Options
    extends StObject
       with TransformOptions {
    
    /**
      * In the absence of a consumer, like a `stream.Readable`, trigger the consumption of the stream.
      */
    var consume: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of transformation callbacks to run in parallel; only apply with asynchronous handlers; default to "100".
      */
    var parallel: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass user defined parameters to the user handler as last argument.
      */
    var params: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var finished: Double
    
    var running: Double
    
    var started: Double
  }
  object State {
    
    inline def apply(finished: Double, running: Double, started: Double): State = {
      val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setRunning(value: Double): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    }
  }
}
