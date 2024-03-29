package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typings.std.ArrayLike
import typings.std.AsyncIterable
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableInnerFromMod {
  
  @JSImport("rxjs/internal/observable/innerFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArrayLike[T](array: ArrayLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayLike")(array.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromAsyncIterable[T](asyncIterable: AsyncIterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(asyncIterable.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromInteropObservable[T](obj: Any): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInteropObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromIterable[T](iterable: js.Iterable[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromPromise[T](promise: PromiseLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def fromReadableStreamLike[T](readableStream: ReadableStreamLike[T]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReadableStreamLike")(readableStream.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
  
  inline def innerFrom[O /* <: ObservableInput[Any] */](input: O): Observable[ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("innerFrom")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[ObservedValueOf[O]]]
}
