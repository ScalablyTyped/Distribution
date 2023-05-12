package typings.remixRunWebFetch

import typings.node.streamMod.Writable
import typings.remixRunWebFetch.anon.ReadableHighWaterMark
import typings.remixRunWebFetch.distSrcBodyMod.Body
import typings.remixRunWebFetch.distSrcBodyMod.StreamIterableIterator
import typings.std.AsyncIterable
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object bodyMod {
  
  @JSImport("@remix-run/web-fetch/body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(instance: Body): ReadableStream[js.typedarray.Uint8Array] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(instance.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array] | Null]
  
  inline def extractContentType(source: Body): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractContentType")(source.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def fromAsyncIterable(content: AsyncIterable[js.typedarray.Uint8Array]): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(content.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def fromStream(source: typings.node.streamMod.^ & ReadableHighWaterMark): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(source.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def getTotalBytes(source: Body): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalBytes")(source.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def streamIterator[T](stream: ReadableStream[T]): StreamIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamIterator")(stream.asInstanceOf[js.Any]).asInstanceOf[StreamIterableIterator[T]]
  
  inline def writeToStream(dest: Writable, param1: Body): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(dest.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
