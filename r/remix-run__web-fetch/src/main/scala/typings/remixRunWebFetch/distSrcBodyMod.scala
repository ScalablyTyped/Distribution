package typings.remixRunWebFetch

import typings.node.streamMod.Writable
import typings.remixRunWebFetch.anon.ReadableHighWaterMark
import typings.remixRunWebFetch.anon.Size
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.BodyInit
import typings.std.FormData
import typings.std.Headers
import typings.std.IteratorResult
import typings.std.ReadableStream
import typings.std.ReadableStreamDefaultReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBodyMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@remix-run/web-fetch/dist/src/body", JSImport.Default)
  @js.native
  /**
    * @param {BodyInit|Stream|null} body
    * @param {{size?:number}} options
    */
  open class default ()
    extends StObject
       with Body {
    def this(body: typings.node.streamMod.^) = this()
    def this(body: BodyInit) = this()
    def this(body: Null, param1: Size) = this()
    def this(body: typings.node.streamMod.^, param1: Size) = this()
    def this(body: BodyInit, param1: Size) = this()
  }
  
  inline def clone_(instance: Body): ReadableStream[js.typedarray.Uint8Array] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(instance.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array] | Null]
  
  inline def extractContentType(source: Body): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractContentType")(source.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def fromAsyncIterable(content: AsyncIterable[js.typedarray.Uint8Array]): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(content.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def fromStream(source: typings.node.streamMod.^ & ReadableHighWaterMark): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def getTotalBytes(source: Body): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalBytes")(source.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def streamIterator[T](stream: ReadableStream[T]): StreamIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamIterator")(stream.asInstanceOf[js.Any]).asInstanceOf[StreamIterableIterator[T]]
  
  inline def writeToStream(dest: Writable, param1: Body): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(dest.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Body * / any */ @js.native
  trait Body extends StObject {
    
    /**
      * Decode response as ArrayBuffer
      *
      * @return {Promise<ArrayBuffer>}
      */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Return raw response as Blob
      *
      * @return Promise
      */
    def blob(): js.Promise[Blob] = js.native
    
    def body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
    
    def bodyUsed: Boolean = js.native
    
    /**
      * @returns {Promise<FormData>}
      */
    def formData(): js.Promise[FormData] = js.native
    
    /** @type {Headers} */
    def headers: Headers = js.native
    
    /**
      * Decode response as json
      *
      * @return  Promise
      */
    def json(): js.Promise[Any] = js.native
    
    var size: Double = js.native
    
    /**
      * Decode response as text
      *
      * @return  Promise
      */
    def text(): js.Promise[String] = js.native
  }
  
  /**
    * @template T
    * @implements {AsyncGenerator<T, void, void>}
    */
  @js.native
  trait StreamIterableIterator[T]
    extends StObject
       with AsyncGenerator[T, Unit, Unit] {
    
    def getReader(): ReadableStreamDefaultReader[T] = js.native
    
    /**
      * @returns {Promise<IteratorResult<T, void>>}
      */
    def next(): js.Promise[IteratorResult[T, Unit]] = js.native
    
    var reader: ReadableStreamDefaultReader[T] | Null = js.native
    
    /**
      * @returns {Promise<IteratorResult<T, void>>}
      */
    @JSName("return")
    def return_MStreamIterableIterator(): js.Promise[IteratorResult[T, Unit]] = js.native
    
    var stream: ReadableStream[T] = js.native
    
    /**
      *
      * @param {any} error
      * @returns {Promise<IteratorResult<T, void>>}
      */
    @JSName("throw")
    def throw_MStreamIterableIterator(error: Any): js.Promise[IteratorResult[T, Unit]] = js.native
  }
}
