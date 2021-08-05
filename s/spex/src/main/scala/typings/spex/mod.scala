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
  
  inline def apply(promise: js.Any): ISpex = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[ISpex]
  
  @JSImport("spex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // PromiseAdapter class;
  // API: http://vitaly-t.github.io/spex/PromiseAdapter.html
  @JSImport("spex", "PromiseAdapter")
  @js.native
  class PromiseAdapter protected () extends StObject {
    def this(
      create: js.Function1[/* cb */ js.Any, js.Object],
      resolve: js.Function1[/* data */ js.Any, Unit],
      reject: js.Function1[/* reason */ js.Any, Unit]
    ) = this()
  }
  
  // Errors namespace
  // API: http://vitaly-t.github.io/spex/errors.html
  object errors {
    
    // API: http://vitaly-t.github.io/spex/errors.BatchError.html
    @JSImport("spex", "errors.BatchError")
    @js.native
    class BatchError ()
      extends StObject
         with Error {
      
      // extended properties:
      var data: js.Array[IBatchData] = js.native
      
      var first: js.Any = js.native
      
      // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
      def getErrors(): js.Array[js.Any] = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      @JSName("stack")
      var stack_BatchError: String = js.native
      
      var stat: IBatchStat = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.PageError.html
    @JSImport("spex", "errors.PageError")
    @js.native
    class PageError ()
      extends StObject
         with Error {
      
      var dest: js.Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: js.Any = js.native
      
      var index: Double = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      var reason: String = js.native
      
      var source: js.Any = js.native
      
      @JSName("stack")
      var stack_PageError: String = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
    @JSImport("spex", "errors.SequenceError")
    @js.native
    class SequenceError ()
      extends StObject
         with Error {
      
      var dest: js.Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: js.Any = js.native
      
      var index: Double = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      var reason: String = js.native
      
      var source: js.Any = js.native
      
      @JSName("stack")
      var stack_SequenceError: String = js.native
    }
  }
  
  @js.native
  trait IArrayExt[T]
    extends StObject
       with Array[T] {
    
    var duration: Double = js.native
  }
  
  trait IBatchData extends StObject {
    
    var origin: js.UndefOr[IOriginData] = js.undefined
    
    var result: js.Any
    
    var success: Boolean
  }
  object IBatchData {
    
    inline def apply(result: js.Any, success: Boolean): IBatchData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchData]
    }
    
    extension [Self <: IBatchData](x: Self) {
      
      inline def setOrigin(value: IOriginData): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBatchStat extends StObject {
    
    var duration: Double
    
    var failed: Double
    
    var succeeded: Double
    
    var total: Double
  }
  object IBatchStat {
    
    inline def apply(duration: Double, failed: Double, succeeded: Double, total: Double): IBatchStat = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchStat]
    }
    
    extension [Self <: IBatchStat](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOriginData extends StObject {
    
    var result: js.Any
    
    var success: Boolean
  }
  object IOriginData {
    
    inline def apply(result: js.Any, success: Boolean): IOriginData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOriginData]
    }
    
    extension [Self <: IOriginData](x: Self) {
      
      inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPageResult extends StObject {
    
    var duration: Double
    
    var pages: Double
    
    var total: Double
  }
  object IPageResult {
    
    inline def apply(duration: Double, pages: Double, total: Double): IPageResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageResult]
    }
    
    extension [Self <: IPageResult](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISequenceResult extends StObject {
    
    var duration: Double
    
    var total: Double
  }
  object ISequenceResult {
    
    inline def apply(duration: Double, total: Double): ISequenceResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISequenceResult]
    }
    
    extension [Self <: ISequenceResult](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpex
    extends StObject
       with ISpexBase {
    
    // API: http://vitaly-t.github.io/spex/errors.html
    var errors: Typeoferrors = js.native
    
    // API: http://vitaly-t.github.io/spex/stream.html
    var stream: IStream = js.native
  }
  
  // Subset of the base methods only, to be used by pg-promise
  @js.native
  trait ISpexBase extends StObject {
    
    // API: http://vitaly-t.github.io/spex/global.html#batch
    def batch(values: js.Array[js.Any]): js.Promise[IArrayExt[js.Any]] = js.native
    def batch(values: js.Array[js.Any], options: Cb): js.Promise[IArrayExt[js.Any]] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#page
    def page(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any]): js.Promise[IPageResult] = js.native
    def page(
      source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any],
      options: Dest
    ): js.Promise[IPageResult] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#sequence
    def sequence(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any]): js.Promise[ISequenceResult | IArrayExt[js.Any]] = js.native
    def sequence(
      source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, js.Any],
      options: Limit
    ): js.Promise[ISequenceResult | IArrayExt[js.Any]] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/stream.html
  @js.native
  trait IStream extends StObject {
    
    // API: http://vitaly-t.github.io/spex/stream.html#.read
    def read(
      stream: js.Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[js.Any], /* delay */ Double, js.Any]
    ): js.Promise[IStreamReadResult] = js.native
    def read(
      stream: js.Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[js.Any], /* delay */ Double, js.Any],
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
    
    extension [Self <: IStreamReadOptions](x: Self) {
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setReadChunks(value: Boolean): Self = StObject.set(x, "readChunks", value.asInstanceOf[js.Any])
      
      inline def setReadChunksUndefined: Self = StObject.set(x, "readChunks", js.undefined)
      
      inline def setReadSize(value: Double): Self = StObject.set(x, "readSize", value.asInstanceOf[js.Any])
      
      inline def setReadSizeUndefined: Self = StObject.set(x, "readSize", js.undefined)
    }
  }
  
  trait IStreamReadResult extends StObject {
    
    var calls: Double
    
    var duration: Double
    
    var length: Double
    
    var reads: Double
  }
  object IStreamReadResult {
    
    inline def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStreamReadResult]
    }
    
    extension [Self <: IStreamReadResult](x: Self) {
      
      inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    }
  }
}
