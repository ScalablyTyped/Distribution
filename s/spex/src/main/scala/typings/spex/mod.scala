package typings.spex

import typings.spex.anon.Cb
import typings.spex.anon.Dest
import typings.spex.anon.Limit
import typings.spex.anon.Typeoferrors
import typings.std.Array
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(promise: Any): ISpex = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[ISpex]
  
  @JSImport("spex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // PromiseAdapter class;
  // API: http://vitaly-t.github.io/spex/PromiseAdapter.html
  @JSImport("spex", "PromiseAdapter")
  @js.native
  open class PromiseAdapter protected () extends StObject {
    def this(
      create: js.Function1[/* cb */ Any, js.Object],
      resolve: js.Function1[/* data */ Any, Unit],
      reject: js.Function1[/* reason */ Any, Unit]
    ) = this()
  }
  
  // Errors namespace
  // API: http://vitaly-t.github.io/spex/errors.html
  object errors {
    
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html
    @JSImport("spex", "errors.BatchError")
    @js.native
    open class BatchError ()
      extends StObject
         with Error {
      
      // extended properties:
      var data: js.Array[IBatchData] = js.native
      
      var first: Any = js.native
      
      // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
      def getErrors(): js.Array[Any] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      @JSName("stack")
      var stack_BatchError: String = js.native
      
      var stat: IBatchStat = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.PageError.html
    @JSImport("spex", "errors.PageError")
    @js.native
    open class PageError ()
      extends StObject
         with Error {
      
      var dest: Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: Any = js.native
      
      var index: Double = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var reason: String = js.native
      
      var source: Any = js.native
      
      @JSName("stack")
      var stack_PageError: String = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
    @JSImport("spex", "errors.SequenceError")
    @js.native
    open class SequenceError ()
      extends StObject
         with Error {
      
      var dest: Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: Any = js.native
      
      var index: Double = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      var reason: String = js.native
      
      var source: Any = js.native
      
      @JSName("stack")
      var stack_SequenceError: String = js.native
    }
  }
  
  @js.native
  trait IArrayExt[T]
    extends StObject
       with Array[T] {
    
    val duration: Double = js.native
  }
  
  trait IBatchData extends StObject {
    
    val origin: js.UndefOr[IOriginData] = js.undefined
    
    val result: Any
    
    val success: Boolean
  }
  object IBatchData {
    
    inline def apply(result: Any, success: Boolean): IBatchData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBatchData] (val x: Self) extends AnyVal {
      
      inline def setOrigin(value: IOriginData): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBatchStat extends StObject {
    
    val duration: Double
    
    val failed: Double
    
    val succeeded: Double
    
    val total: Double
  }
  object IBatchStat {
    
    inline def apply(duration: Double, failed: Double, succeeded: Double, total: Double): IBatchStat = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchStat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBatchStat] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOriginData extends StObject {
    
    val result: Any
    
    val success: Boolean
  }
  object IOriginData {
    
    inline def apply(result: Any, success: Boolean): IOriginData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOriginData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOriginData] (val x: Self) extends AnyVal {
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageResult extends StObject {
    
    val duration: Double
    
    val pages: Double
    
    val total: Double
  }
  object IPageResult {
    
    inline def apply(duration: Double, pages: Double, total: Double): IPageResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPageResult] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISequenceResult extends StObject {
    
    val duration: Double
    
    val total: Double
  }
  object ISequenceResult {
    
    inline def apply(duration: Double, total: Double): ISequenceResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISequenceResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISequenceResult] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpex
    extends StObject
       with ISpexBase {
    
    // API: http://vitaly-t.github.io/spex/errors.html
    val errors: Typeoferrors = js.native
    
    // API: http://vitaly-t.github.io/spex/stream.html
    val stream: IStream = js.native
  }
  
  // Subset of the base methods only, to be used by pg-promise
  @js.native
  trait ISpexBase extends StObject {
    
    // API: http://vitaly-t.github.io/spex/global.html#batch
    def batch[T](values: js.Array[T | js.Promise[T]]): js.Promise[IArrayExt[T]] = js.native
    def batch[T](values: js.Array[T | js.Promise[T]], options: Cb): js.Promise[IArrayExt[T]] = js.native
    def batch[T1, T2](values: js.Tuple2[T1 | js.Promise[T1], T2 | js.Promise[T2]]): js.Promise[(js.Tuple2[T1, T2]) & (IArrayExt[T1 | T2])] = js.native
    def batch[T1, T2](values: js.Tuple2[T1 | js.Promise[T1], T2 | js.Promise[T2]], options: Cb): js.Promise[(js.Tuple2[T1, T2]) & (IArrayExt[T1 | T2])] = js.native
    def batch[T1, T2, T3](values: js.Tuple3[T1 | js.Promise[T1], T2 | js.Promise[T2], T3 | js.Promise[T3]]): js.Promise[(js.Tuple3[T1, T2, T3]) & (IArrayExt[T1 | T2 | T3])] = js.native
    def batch[T1, T2, T3](values: js.Tuple3[T1 | js.Promise[T1], T2 | js.Promise[T2], T3 | js.Promise[T3]], options: Cb): js.Promise[(js.Tuple3[T1, T2, T3]) & (IArrayExt[T1 | T2 | T3])] = js.native
    def batch[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Promise[T1], T2 | js.Promise[T2], T3 | js.Promise[T3], T4 | js.Promise[T4]]
    ): js.Promise[(js.Tuple4[T1, T2, T3, T4]) & (IArrayExt[T1 | T2 | T3 | T4])] = js.native
    def batch[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Promise[T1], T2 | js.Promise[T2], T3 | js.Promise[T3], T4 | js.Promise[T4]],
      options: Cb
    ): js.Promise[(js.Tuple4[T1, T2, T3, T4]) & (IArrayExt[T1 | T2 | T3 | T4])] = js.native
    def batch[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5]
        ]
    ): js.Promise[(js.Tuple5[T1, T2, T3, T4, T5]) & (IArrayExt[T1 | T2 | T3 | T4 | T5])] = js.native
    def batch[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5]
        ],
      options: Cb
    ): js.Promise[(js.Tuple5[T1, T2, T3, T4, T5]) & (IArrayExt[T1 | T2 | T3 | T4 | T5])] = js.native
    def batch[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6]
        ]
    ): js.Promise[(js.Tuple6[T1, T2, T3, T4, T5, T6]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6])] = js.native
    def batch[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6]
        ],
      options: Cb
    ): js.Promise[(js.Tuple6[T1, T2, T3, T4, T5, T6]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6])] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7]
        ]
    ): js.Promise[
        (js.Tuple7[T1, T2, T3, T4, T5, T6, T7]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7]
        ],
      options: Cb
    ): js.Promise[
        (js.Tuple7[T1, T2, T3, T4, T5, T6, T7]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8]
        ]
    ): js.Promise[
        (js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8]
        ],
      options: Cb
    ): js.Promise[
        (js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8], 
          T9 | js.Promise[T9]
        ]
    ): js.Promise[
        (js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8], 
          T9 | js.Promise[T9]
        ],
      options: Cb
    ): js.Promise[
        (js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8], 
          T9 | js.Promise[T9], 
          T10 | js.Promise[T10]
        ]
    ): js.Promise[
        (js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10])
      ] = js.native
    def batch[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Promise[T1], 
          T2 | js.Promise[T2], 
          T3 | js.Promise[T3], 
          T4 | js.Promise[T4], 
          T5 | js.Promise[T5], 
          T6 | js.Promise[T6], 
          T7 | js.Promise[T7], 
          T8 | js.Promise[T8], 
          T9 | js.Promise[T9], 
          T10 | js.Promise[T10]
        ],
      options: Cb
    ): js.Promise[
        (js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) & (IArrayExt[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10])
      ] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#page
    def page(source: js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any]): js.Promise[IPageResult] = js.native
    def page(source: js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any], options: Dest): js.Promise[IPageResult] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#sequence
    def sequence(source: js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any]): js.Promise[ISequenceResult | IArrayExt[Any]] = js.native
    def sequence(source: js.Function3[/* index */ Double, /* data */ Any, /* delay */ Double, Any], options: Limit): js.Promise[ISequenceResult | IArrayExt[Any]] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/stream.html
  @js.native
  trait IStream extends StObject {
    
    // API: http://vitaly-t.github.io/spex/stream.html#.read
    def read(
      stream: Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[Any], /* delay */ Double, Any]
    ): js.Promise[IStreamReadResult] = js.native
    def read(
      stream: Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[Any], /* delay */ Double, Any],
      options: IStreamReadOptions
    ): js.Promise[IStreamReadResult] = js.native
  }
  
  trait IStreamReadOptions extends StObject {
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var readChunks: js.UndefOr[Boolean] = js.undefined
    
    var readSize: js.UndefOr[Double] = js.undefined
  }
  object IStreamReadOptions {
    
    inline def apply(): IStreamReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStreamReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStreamReadOptions] (val x: Self) extends AnyVal {
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setReadChunks(value: Boolean): Self = StObject.set(x, "readChunks", value.asInstanceOf[js.Any])
      
      inline def setReadChunksUndefined: Self = StObject.set(x, "readChunks", js.undefined)
      
      inline def setReadSize(value: Double): Self = StObject.set(x, "readSize", value.asInstanceOf[js.Any])
      
      inline def setReadSizeUndefined: Self = StObject.set(x, "readSize", js.undefined)
    }
  }
  
  trait IStreamReadResult extends StObject {
    
    val calls: Double
    
    val duration: Double
    
    val length: Double
    
    val reads: Double
  }
  object IStreamReadResult {
    
    inline def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStreamReadResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStreamReadResult] (val x: Self) extends AnyVal {
      
      inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    }
  }
}
