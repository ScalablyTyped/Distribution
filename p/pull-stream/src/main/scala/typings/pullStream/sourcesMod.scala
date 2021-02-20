package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("pull-stream/sources", "count")
  @js.native
  val count: js.Function1[/* max */ js.UndefOr[Double], Source[Double]] = js.native
  
  @JSImport("pull-stream/sources", "empty")
  @js.native
  val empty: js.Function0[Source[scala.Nothing]] = js.native
  
  @JSImport("pull-stream/sources", "error")
  @js.native
  val error: js.Function1[/* err */ EndOrError, Source[scala.Nothing]] = js.native
  
  @JSImport("pull-stream/sources", "infinite")
  @js.native
  def infinite[T](): Source[T] = js.native
  @JSImport("pull-stream/sources", "infinite")
  @js.native
  def infinite[T](generator: js.Function0[T]): Source[T] = js.native
  
  @JSImport("pull-stream/sources", "keys")
  @js.native
  val keys: js.Function1[/* obj */ js.Object | js.Array[js.Any], Source[String]] = js.native
  
  @JSImport("pull-stream/sources", "once")
  @js.native
  def once[T](): Source[T] = js.native
  @JSImport("pull-stream/sources", "once")
  @js.native
  def once[T](value: T): Source[T] = js.native
  @JSImport("pull-stream/sources", "once")
  @js.native
  def once[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  @JSImport("pull-stream/sources", "once")
  @js.native
  def once[T](value: js.UndefOr[scala.Nothing], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](): Source[T] = js.native
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](
    arrayOrObject: js.UndefOr[scala.Nothing],
    onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]
  ): Source[T] = js.native
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](arrayOrObject: js.Array[T]): Source[T] = js.native
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](arrayOrObject: js.Array[T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](arrayOrObject: Record[_, T]): Source[T] = js.native
  @JSImport("pull-stream/sources", "values")
  @js.native
  def values[T](arrayOrObject: Record[_, T], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
}
