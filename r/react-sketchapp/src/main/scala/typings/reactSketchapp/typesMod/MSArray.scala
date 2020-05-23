package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSArray[T] extends /* key */ NumberDictionary[T] {
  var length: Double
}

object MSArray {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* n */ NumberDictionary[T] = null): MSArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[MSArray[T]]
  }
}

