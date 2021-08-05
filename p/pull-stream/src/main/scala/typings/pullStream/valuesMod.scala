package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod {
  
  /**
    * Create a SourceStream that reads the values from an array or object and then stops.
    */
  inline def apply[T](): Source[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Unit, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Record[js.Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def apply[T](arrayOrObject: Record[js.Any, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], js.Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(arrayOrObject.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
