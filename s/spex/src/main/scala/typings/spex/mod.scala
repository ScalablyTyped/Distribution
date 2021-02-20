package typings.spex

import typings.spex.anon.Cb
import typings.spex.anon.Dest
import typings.spex.anon.Limit
import typings.spex.anon.Typeoferrors
import typings.std.Array
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spex", JSImport.Namespace)
  @js.native
  def apply(promise: js.Any): ISpex = js.native
  
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
    class BatchError () extends Error {
      
      // extended properties:
      var data: js.Array[IBatchData] = js.native
      
      var first: js.Any = js.native
      
      // API: http://vitaly-t.github.io/spex/errors.BatchError.html#.getErrors
      def getErrors(): js.Array[_] = js.native
      
      @JSName("stack")
      var stack_BatchError: String = js.native
      
      var stat: IBatchStat = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.PageError.html
    @JSImport("spex", "errors.PageError")
    @js.native
    class PageError () extends Error {
      
      var dest: js.Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: js.Any = js.native
      
      var index: Double = js.native
      
      var reason: String = js.native
      
      var source: js.Any = js.native
      
      @JSName("stack")
      var stack_PageError: String = js.native
    }
    
    // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
    @JSImport("spex", "errors.SequenceError")
    @js.native
    class SequenceError () extends Error {
      
      var dest: js.Any = js.native
      
      var duration: Double = js.native
      
      // extended properties:
      var error: js.Any = js.native
      
      var index: Double = js.native
      
      var reason: String = js.native
      
      var source: js.Any = js.native
      
      @JSName("stack")
      var stack_SequenceError: String = js.native
    }
  }
  
  @js.native
  trait IArrayExt[T] extends Array[T] {
    
    var duration: Double = js.native
  }
  
  @js.native
  trait IBatchData extends StObject {
    
    var origin: js.UndefOr[IOriginData] = js.native
    
    var result: js.Any = js.native
    
    var success: Boolean = js.native
  }
  object IBatchData {
    
    @scala.inline
    def apply(result: js.Any, success: Boolean): IBatchData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchData]
    }
    
    @scala.inline
    implicit class IBatchDataMutableBuilder[Self <: IBatchData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: IOriginData): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBatchStat extends StObject {
    
    var duration: Double = js.native
    
    var failed: Double = js.native
    
    var succeeded: Double = js.native
    
    var total: Double = js.native
  }
  object IBatchStat {
    
    @scala.inline
    def apply(duration: Double, failed: Double, succeeded: Double, total: Double): IBatchStat = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBatchStat]
    }
    
    @scala.inline
    implicit class IBatchStatMutableBuilder[Self <: IBatchStat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOriginData extends StObject {
    
    var result: js.Any = js.native
    
    var success: Boolean = js.native
  }
  object IOriginData {
    
    @scala.inline
    def apply(result: js.Any, success: Boolean): IOriginData = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOriginData]
    }
    
    @scala.inline
    implicit class IOriginDataMutableBuilder[Self <: IOriginData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPageResult extends StObject {
    
    var duration: Double = js.native
    
    var pages: Double = js.native
    
    var total: Double = js.native
  }
  object IPageResult {
    
    @scala.inline
    def apply(duration: Double, pages: Double, total: Double): IPageResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageResult]
    }
    
    @scala.inline
    implicit class IPageResultMutableBuilder[Self <: IPageResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISequenceResult extends StObject {
    
    var duration: Double = js.native
    
    var total: Double = js.native
  }
  object ISequenceResult {
    
    @scala.inline
    def apply(duration: Double, total: Double): ISequenceResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISequenceResult]
    }
    
    @scala.inline
    implicit class ISequenceResultMutableBuilder[Self <: ISequenceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpex extends ISpexBase {
    
    // API: http://vitaly-t.github.io/spex/errors.html
    var errors: Typeoferrors = js.native
    
    // API: http://vitaly-t.github.io/spex/stream.html
    var stream: IStream = js.native
  }
  
  // Subset of the base methods only, to be used by pg-promise
  @js.native
  trait ISpexBase extends StObject {
    
    // API: http://vitaly-t.github.io/spex/global.html#batch
    def batch(values: js.Array[_]): js.Promise[IArrayExt[_]] = js.native
    def batch(values: js.Array[_], options: Cb): js.Promise[IArrayExt[_]] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#page
    def page(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]): js.Promise[IPageResult] = js.native
    def page(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _], options: Dest): js.Promise[IPageResult] = js.native
    
    // API: http://vitaly-t.github.io/spex/global.html#sequence
    def sequence(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]): js.Promise[ISequenceResult | IArrayExt[_]] = js.native
    def sequence(source: js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _], options: Limit): js.Promise[ISequenceResult | IArrayExt[_]] = js.native
  }
  
  // API: http://vitaly-t.github.io/spex/stream.html
  @js.native
  trait IStream extends StObject {
    
    // API: http://vitaly-t.github.io/spex/stream.html#.read
    def read(
      stream: js.Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[_], /* delay */ Double, _]
    ): js.Promise[IStreamReadResult] = js.native
    def read(
      stream: js.Any,
      receiver: js.Function3[/* index */ Double, /* data */ js.Array[_], /* delay */ Double, _],
      options: IStreamReadOptions
    ): js.Promise[IStreamReadResult] = js.native
  }
  
  @js.native
  trait IStreamReadOptions extends StObject {
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var readChunks: js.UndefOr[Boolean] = js.native
    
    var readSize: js.UndefOr[Double] = js.native
  }
  object IStreamReadOptions {
    
    @scala.inline
    def apply(): IStreamReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStreamReadOptions]
    }
    
    @scala.inline
    implicit class IStreamReadOptionsMutableBuilder[Self <: IStreamReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setReadChunks(value: Boolean): Self = StObject.set(x, "readChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadChunksUndefined: Self = StObject.set(x, "readChunks", js.undefined)
      
      @scala.inline
      def setReadSize(value: Double): Self = StObject.set(x, "readSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadSizeUndefined: Self = StObject.set(x, "readSize", js.undefined)
    }
  }
  
  @js.native
  trait IStreamReadResult extends StObject {
    
    var calls: Double = js.native
    
    var duration: Double = js.native
    
    var length: Double = js.native
    
    var reads: Double = js.native
  }
  object IStreamReadResult {
    
    @scala.inline
    def apply(calls: Double, duration: Double, length: Double, reads: Double): IStreamReadResult = {
      val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStreamReadResult]
    }
    
    @scala.inline
    implicit class IStreamReadResultMutableBuilder[Self <: IStreamReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    }
  }
}
