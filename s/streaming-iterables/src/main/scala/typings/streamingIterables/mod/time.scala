package typings.streamingIterables.mod

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("streaming-iterables", "time")
@js.native
object time extends js.Object {
  
  def apply(): CurriedTimeResult = js.native
  def apply(config: TimeConfig): CurriedTimeResult = js.native
  def apply[T](config: TimeConfig, iterable: AsyncIterable[T]): UnwrapAnyIterable[AsyncIterable[T]] = js.native
  def apply[T](config: TimeConfig, iterable: Iterable[T]): UnwrapAnyIterable[Iterable[T]] = js.native
}
