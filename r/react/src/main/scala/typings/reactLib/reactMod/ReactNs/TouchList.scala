package typings
package reactLib.reactMod.ReactNs

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
    identifiedTouch: js.Function1[scala.Double, Touch],
    item: js.Function1[scala.Double, Touch],
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Touch] = null
  ): TouchList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifiedTouch")(identifiedTouch)
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("length")(length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TouchList]
  }
}

