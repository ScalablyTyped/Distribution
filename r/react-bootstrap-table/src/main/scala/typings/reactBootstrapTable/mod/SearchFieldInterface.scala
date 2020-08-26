package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFieldInterface extends js.Object {
  /**
    * getValue should return the current search text.
    */
  def getValue(): String = js.native
  /**
    * setValue should update the current search text to the given value.
    */
  def setValue(search: String): Unit = js.native
}

object SearchFieldInterface {
  @scala.inline
  def apply(getValue: () => String, setValue: String => Unit): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[SearchFieldInterface]
  }
  @scala.inline
  implicit class SearchFieldInterfaceOps[Self <: SearchFieldInterface] (val x: Self) extends AnyVal {
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
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def setSetValue(value: String => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
  
}

