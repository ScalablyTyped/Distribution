package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod {
  
  /**
    * Create a SourceStream that reads the values from an array or object and then stops.
    */
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](): Source[T] = js.native
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](
    arrayOrObject: js.UndefOr[scala.Nothing],
    onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]
  ): Source[T] = js.native
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](arrayOrObject: js.Array[T]): Source[T] = js.native
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](arrayOrObject: Record[_, T]): Source[T] = js.native
  @JSImport("pull-stream/sources/values", JSImport.Namespace)
  @js.native
  def apply[T](arrayOrObject: Record[_, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
}
