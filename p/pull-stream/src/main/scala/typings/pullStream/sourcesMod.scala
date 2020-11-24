package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  
  val count: js.Function1[/* max */ js.UndefOr[Double], Source[Double]] = js.native
  
  val empty: js.Function0[Source[scala.Nothing]] = js.native
  
  val error: js.Function1[/* err */ EndOrError, Source[scala.Nothing]] = js.native
  
  val keys: js.Function1[/* obj */ js.Object | js.Array[js.Any], Source[String]] = js.native
  
  @js.native
  object infinite extends js.Object {
    
    def apply[T](): Source[T] = js.native
    def apply[T](generator: js.Function0[T]): Source[T] = js.native
  }
  
  @js.native
  object once extends js.Object {
    
    def apply[T](): Source[T] = js.native
    def apply[T](value: T): Source[T] = js.native
    def apply[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
    def apply[T](value: js.UndefOr[scala.Nothing], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  }
  
  @js.native
  object values extends js.Object {
    
    def apply[T](): Source[T] = js.native
    def apply[T](
      arrayOrObject: js.UndefOr[scala.Nothing],
      onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]
    ): Source[T] = js.native
    def apply[T](arrayOrObject: js.Array[T]): Source[T] = js.native
    def apply[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
    def apply[T](arrayOrObject: Record[_, T]): Source[T] = js.native
    def apply[T](arrayOrObject: Record[_, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  }
}
