package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generator[T, TReturn, TNext] extends Iterator[T, TReturn, TNext] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Generator[T, TReturn, TNext]] = js.native
  @JSName("return")
  def return_MGenerator(value: TReturn): IteratorResult[T, TReturn] = js.native
  @JSName("throw")
  def throw_MGenerator(e: js.Any): IteratorResult[T, TReturn] = js.native
}

