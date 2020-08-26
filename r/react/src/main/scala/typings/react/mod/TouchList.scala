package typings.react.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  var length: Double = js.native
  def identifiedTouch(identifier: Double): Touch = js.native
  def item(index: Double): Touch = js.native
}

object TouchList {
  @scala.inline
  def apply(identifiedTouch: Double => Touch, item: Double => Touch, length: Double): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1(identifiedTouch), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchList]
  }
  @scala.inline
  implicit class TouchListOps[Self <: TouchList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifiedTouch(value: Double => Touch): Self = this.set("identifiedTouch", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => Touch): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

