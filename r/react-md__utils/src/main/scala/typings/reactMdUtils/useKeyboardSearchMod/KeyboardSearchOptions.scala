package typings.reactMdUtils.useKeyboardSearchMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardSearchOptions[D, E /* <: HTMLElement */] extends BaseKeyboardSearchOptions[D, E] {
  /**
    * The current index that should be "focused" due to a keyboard search. This
    * should be updated whenever the `onChange` callback is fired.
    */
  var searchIndex: Double = js.native
}

object KeyboardSearchOptions {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ E](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit, searchIndex: Double): KeyboardSearchOptions[D, E] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), searchIndex = searchIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardSearchOptions[D, E]]
  }
  @scala.inline
  implicit class KeyboardSearchOptionsOps[Self <: KeyboardSearchOptions[_, _], D, /* <: typings.std.HTMLElement */ E] (val x: Self with (KeyboardSearchOptions[D, E])) extends AnyVal {
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
    def setSearchIndex(value: Double): Self = this.set("searchIndex", value.asInstanceOf[js.Any])
  }
  
}

