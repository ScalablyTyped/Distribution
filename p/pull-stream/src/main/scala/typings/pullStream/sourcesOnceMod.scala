package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesOnceMod {
  
  /**
    * Create a stream with a single value.
    */
  inline def apply[T](): Source[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[T]]
  inline def apply[T](value: T): Source[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def apply[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  inline def apply[T](value: Unit, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], Any]): Source[T] = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], onAbort.asInstanceOf[js.Any])).asInstanceOf[Source[T]]
  
  @JSImport("pull-stream/sources/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
