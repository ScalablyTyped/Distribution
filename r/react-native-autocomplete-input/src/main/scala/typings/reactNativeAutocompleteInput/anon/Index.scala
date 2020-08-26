package typings.reactNativeAutocompleteInput.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index[T] extends js.Object {
  var index: Double = js.native
  var item: T = js.native
}

object Index {
  @scala.inline
  def apply[T](index: Double, item: T): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index[_], T] (val x: Self with Index[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

