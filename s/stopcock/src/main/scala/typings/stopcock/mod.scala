package typings.stopcock

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Limits the execution rate of a function using the token bucket algorithm.
    *
    * Useful for scenarios such as REST APIs consumption where the amount of requests per unit of time
    * should not exceed a given threshold.
    *
    * @param fn The function to rate limit calls to.
    * @param limit The maximum number of allowed calls per `interval`.
    * @param interval The timespan where `limit` is calculated.
    * @param size The maximum size of the internal queue. Defaults to `2^32 - 1` which is the maximum array size in JavaScript.
    * @returns A function that returns a promise which resolves to the value returned by the original `fn` function.
    *          When the queue is at capacity the promise is rejected.
    *
    * @example
    * import stopcock = require('stopcock');
    *
    * async function request(i: number): Promise<string> {
    *   return `${i} - ${new Date().toISOString()}`;
    * }
    *
    * function log(data: any) {
    *   console.log(data);
    * }
    *
    * const get = stopcock(request, { bucketSize: 5 });
    *
    * for (let i = 0; i < 10; i++) {
    *   get(i).then(log);
    * }
    *
    * // 0 - 2017-03-30T16:46:39.938Z
    * // 1 - 2017-03-30T16:46:39.940Z
    * // 2 - 2017-03-30T16:46:39.940Z
    * // 3 - 2017-03-30T16:46:39.940Z
    * // 4 - 2017-03-30T16:46:39.940Z
    * // 5 - 2017-03-30T16:46:40.443Z
    * // 6 - 2017-03-30T16:46:40.943Z
    * // 7 - 2017-03-30T16:46:41.441Z
    * // 8 - 2017-03-30T16:46:41.942Z
    * // 9 - 2017-03-30T16:46:42.439Z
    */
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn): LimiterFunction[TFn] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[LimiterFunction[TFn]]
  inline def apply[TFn /* <: js.Function1[/* repeated */ Any, Any] */](fn: TFn, options: Options): LimiterFunction[TFn] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LimiterFunction[TFn]]
  
  @JSImport("stopcock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait LimiterFunction[TFn /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<TFn> is not an array type */ args: Parameters[TFn]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<TFn> extends std.PromiseLike<infer TRetVal> ? std.Promise<TRetVal> : std.Promise<std.ReturnType<TFn>> */ js.Any = js.native
    
    /**
      * The internal queue size.
      */
    val size: Double = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The capacity of the bucket.
      * @default 40
      */
    var bucketSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The timespan where `limit` is calculated.
      * @default 1000
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of allowed calls per `interval`.
      * @default 2
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of the internal queue.
      * @default 2^32-1 (the maximum array size in JavaScript)
      */
    var queueSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
      
      inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
      
      inline def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
    }
  }
}
