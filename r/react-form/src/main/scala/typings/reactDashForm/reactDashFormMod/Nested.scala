package typings.reactDashForm.reactDashFormMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nested[T] extends /* key */ StringDictionary[T | Nested[T]]

object Nested {
  @scala.inline
  def apply[T](StringDictionary: /* key */ StringDictionary[T | Nested[T]] = null): Nested[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Nested[T]]
  }
}

