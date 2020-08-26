package typings.reactForm.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nested[T] extends /* key */ StringDictionary[T | Nested[T]]

object Nested {
  @scala.inline
  def apply[T](): Nested[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nested[T]]
  }
}

