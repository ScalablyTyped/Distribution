package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("pull-stream/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pull-stream/sources", "count")
  @js.native
  val count: js.Function1[/* max */ js.UndefOr[Double], Source[Double]] = js.native
  
  @JSImport("pull-stream/sources", "empty")
  @js.native
  val empty: js.Function0[Source[scala.Nothing]] = js.native
  
  @JSImport("pull-stream/sources", "error")
  @js.native
  val error: js.Function1[/* err */ EndOrError, Source[scala.Nothing]] = js.native
  
  inline def infinite[T](): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("infinite")().asInstanceOf[Source[T]]
  inline def infinite[T](generator: js.Function0[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("infinite")(generator.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  @JSImport("pull-stream/sources", "keys")
  @js.native
  val keys: js.Function1[/* obj */ js.Object | js.Array[js.Any], Source[String]] = js.native
  
  inline def once[T](): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")().asInstanceOf[Source[T]]
  inline def once[T](value: T): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def once[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def once[T](value: Unit, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  
  inline def values[T](): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[Source[T]]
  inline def values[T](arrayOrObject: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def values[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def values[T](arrayOrObject: Unit, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def values[T](arrayOrObject: Record[js.Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def values[T](arrayOrObject: Record[js.Any, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
}
