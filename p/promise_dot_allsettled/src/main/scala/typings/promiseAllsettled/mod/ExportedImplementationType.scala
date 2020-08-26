package typings.promiseAllsettled.mod

import typings.promiseAllsettled.anon.FnCall
import typings.promiseAllsettled.implementationMod.PromiseTuple
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {None (): std.Promise<[]>, None <T extends [unknown, ...std.Array<unknown>]>(iterable : promise.allsettled.promise.allsettled/implementation.PromiseTuple<T>): std.Promise<promise.allsettled.promise.allsettled/implementation.PromiseResultTuple<T>>, None <T>(iterable : std.Iterable<std.Promise<T> | T>): std.Promise<std.Array<promise.allsettled.promise.allsettled/types.PromiseResult<T, unknown>>>} & {  getPolyfill :(): typeof implementation,   implementation :{None (): std.Promise<[]>, None <T extends [unknown, ...std.Array<unknown>]>(iterable : promise.allsettled.promise.allsettled/implementation.PromiseTuple<T>): std.Promise<promise.allsettled.promise.allsettled/implementation.PromiseResultTuple<T>>, None <T>(iterable : std.Iterable<std.Promise<T> | T>): std.Promise<std.Array<promise.allsettled.promise.allsettled/types.PromiseResult<T, unknown>>>},   shim :(): typeof implementation} */
@js.native
trait ExportedImplementationType extends js.Object {
  @JSName("getPolyfill")
  var getPolyfill_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  @JSName("implementation")
  var implementation_Original: FnCall = js.native
  @JSName("shim")
  var shim_Original: js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any
  ] = js.native
  def apply(): js.Promise[js.Array[js.Any]] = js.native
  def apply[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[typings.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def apply[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[typings.promiseAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  def getPolyfill(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
  def implementation(): js.Promise[js.Array[js.Any]] = js.native
  def implementation[T /* <: Array[js.Any] */](iterable: PromiseTuple[T]): js.Promise[typings.promiseAllsettled.implementationMod.PromiseResultTuple[T]] = js.native
  def implementation[T](iterable: Iterable[js.Promise[T] | T]): js.Promise[js.Array[typings.promiseAllsettled.typesMod.PromiseResult[T, _]]] = js.native
  def shim(): /* import warning: importer.ImportType#apply Failed type conversion: typeof implementation */ js.Any = js.native
}

