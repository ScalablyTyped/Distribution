package typings.reactMdUtils.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseSearchOptions[T] extends js.Object {
  /**
    * A function that will get a string value from each item. The default
    * implementation will:
    *
    * - return a number as a string
    * - return a string as itself
    * - return the result of item() if it is a function (this will also be used
    *   if the `valueKey` on an object is a function).
    * - return item[valueKey] if it's an object (this uses typeof item === "object")
    * - return the empty string for all other data types
    */
  var getItemValue: js.UndefOr[GetItemValue_[T]] = js.native
  /**
    * The key to use to get a value string if the item is an object.
    */
  var valueKey: js.UndefOr[String] = js.native
}

object BaseSearchOptions {
  @scala.inline
  def apply[T](): BaseSearchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSearchOptions[T]]
  }
  @scala.inline
  implicit class BaseSearchOptionsOps[Self <: BaseSearchOptions[_], T] (val x: Self with BaseSearchOptions[T]) extends AnyVal {
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
    def setGetItemValue(value: (T, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemValue: Self = this.set("getItemValue", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
  
}

