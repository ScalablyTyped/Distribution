package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Touch] {
  var length: scala.Double
  def identifiedTouch(identifier: scala.Double): Touch
  def item(index: scala.Double): Touch
}

object TouchList {
  @scala.inline
  def apply(
    identifiedTouch: scala.Double => Touch,
    item: scala.Double => Touch,
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Touch] = null
  ): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TouchList]
  }
}

