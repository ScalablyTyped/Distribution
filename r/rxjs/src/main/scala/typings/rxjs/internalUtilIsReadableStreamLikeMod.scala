package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilIsReadableStreamLikeMod {
  
  @JSImport("rxjs/internal/util/isReadableStreamLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isReadableStreamLike[T](obj: Any): /* is rxjs.rxjs/dist/types/internal/types.ReadableStreamLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadableStreamLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/types.ReadableStreamLike<T> */ Boolean]
  
  inline def readableStreamLikeToAsyncGenerator[T](readableStream: ReadableStreamLike[T]): AsyncGenerator[T, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readableStreamLikeToAsyncGenerator")(readableStream.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Any, Any]]
}
