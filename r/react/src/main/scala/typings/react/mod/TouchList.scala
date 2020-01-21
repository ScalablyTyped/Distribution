package typings.react.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchList extends /* index */ NumberDictionary[Touch] {
  var length: Double
  def identifiedTouch(identifier: Double): Touch
  def item(index: Double): Touch
}

object TouchList {
  @scala.inline
  def apply(
    identifiedTouch: Double => Touch,
    item: Double => Touch,
    length: Double,
    NumberDictionary: /* index */ NumberDictionary[Touch] = null
  ): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TouchList]
  }
}

