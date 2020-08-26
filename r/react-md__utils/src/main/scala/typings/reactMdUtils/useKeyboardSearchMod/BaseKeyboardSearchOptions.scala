package typings.reactMdUtils.useKeyboardSearchMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdUtils.findMatchIndexMod.FindMatchIndex
import typings.reactMdUtils.utilsMod.BaseSearchOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseKeyboardSearchOptions[D, E /* <: HTMLElement */] extends BaseSearchOptions[D] {
  /**
    * The function used to find a match index within the `items` list. You most
    * likely won't want to change this.
    */
  var findMatchIndex: js.UndefOr[FindMatchIndex] = js.native
  /**
    * The list of items that should be searched whenever the user types a letter.
    */
  var items: js.Array[D] = js.native
  /**
    * A required change event handler that will be called whenever a user types a
    * letter and it causes a new item to be "found". This should normally be
    * something that either updates the `aria-activedescendant` id to the new
    * found item's id or manually focus the item's DOM node.
    */
  var onChange: SearchChangeEvent[D, E] = js.native
  /**
    * An optional `onKeyDown` event handler that should be merged with the search
    * functionality.
    *
    * Note: This will be called **before** the search functionality is triggered.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
  /**
    * The amount of time that a "search" value should be kept before resetting.
    * The default value works for most cases, but it might be nice to configure
    * it based on your use case.
    */
  var resetTime: js.UndefOr[Double] = js.native
}

object BaseKeyboardSearchOptions {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ E](items: js.Array[D], onChange: /* data */ SearchData[D, E] => Unit): BaseKeyboardSearchOptions[D, E] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[BaseKeyboardSearchOptions[D, E]]
  }
  @scala.inline
  implicit class BaseKeyboardSearchOptionsOps[Self <: BaseKeyboardSearchOptions[_, _], D, /* <: typings.std.HTMLElement */ E] (val x: Self with (BaseKeyboardSearchOptions[D, E])) extends AnyVal {
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
    def setItemsVarargs(value: D*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[D]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: /* data */ SearchData[D, E] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setFindMatchIndex(
      value: (/* value */ String, /* values */ js.Array[String], /* startIndex */ Double, /* isSelfMatchable */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("findMatchIndex", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFindMatchIndex: Self = this.set("findMatchIndex", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setResetTime(value: Double): Self = this.set("resetTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetTime: Self = this.set("resetTime", js.undefined)
  }
  
}

