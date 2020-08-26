package typings.rx.global

import org.scalablytyped.runtime.TopLevel
import typings.rx.Iterable
import typings.rx.SetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Set")
@js.native
class Set[T] ()
  extends typings.rx.Set[T] {
  def this(iterable: Iterable[T]) = this()
}

@JSGlobal("Set")
@js.native
object Set extends TopLevel[SetConstructor]

