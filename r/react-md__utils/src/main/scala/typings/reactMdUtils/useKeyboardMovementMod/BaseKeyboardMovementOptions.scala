package typings.reactMdUtils.useKeyboardMovementMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.reactMdUtils.findMatchIndexMod.FindMatchIndex
import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardSearchMod.SearchData
import typings.reactMdUtils.utilsMod.GetItemValue_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<@react-md/utils.@react-md/utils/types/search/useKeyboardSearch.BaseKeyboardSearchOptions<D, CE>, 'onChange'> */
/* Inlined parent @react-md/utils.@react-md/utils/types/wia-aria/movement/types.MovementConfig */
@js.native
trait BaseKeyboardMovementOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends js.Object {
  /**
    * The keys that can trigger a move to the previous item. If the `loopable`
    * config is enabled, this will loop to the last item if the first item is
    * currently "focused".
    */
  var decrementKeys: js.Array[IncrementMovementKey] = js.native
  var findMatchIndex: js.UndefOr[FindMatchIndex] = js.native
  var getItemValue: js.UndefOr[GetItemValue_[D]] = js.native
  /**
    * The keys that can trigger a move to the next item. If the `loopable` config
    * is enabled, this will loop to the first item if the last item is currently
    * "focused".
    */
  var incrementKeys: js.Array[IncrementMovementKey] = js.native
  var items: js.Array[D] = js.native
  /**
    * The keys that can trigger a move to the first item.
    */
  var jumpToFirstKeys: js.Array[JumpMovementKey] = js.native
  /**
    * The keys that can trigger a move to the last item.
    */
  var jumpToLastKeys: js.Array[JumpMovementKey] = js.native
  /**
    * Boolean if the keyboard movement should be able to loop around once it has
    * reached the start or end of all the items.
    */
  var loopable: js.UndefOr[Boolean] = js.native
  /**
    * A required change event handler that will be called whenever a user types a
    * letter and it causes a new item to be "found". This should normally be
    * something that either updates the `aria-activedescendant` id to the new
    * found item's id or manually focus the item's DOM node.
    */
  var onChange: js.UndefOr[js.Function2[/* data */ SearchData[D, CE], /* itemRefs */ ItemRefList[IE], Unit]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[CE]] = js.native
  var resetTime: js.UndefOr[Double] = js.native
  /**
    * Boolean if the movement should also include printable characters search
    * movement.
    */
  var searchable: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the event should trigger `event.stopPropagation()` when the
    * custom keyboard movement is triggered. This should generally be kept as
    * `false` or `undefined` by default, but enabled when creating more complex
    * 2-dimensional movement cases such as grids.
    */
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var valueKey: js.UndefOr[String] = js.native
}

object BaseKeyboardMovementOptions {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE](
    decrementKeys: js.Array[IncrementMovementKey],
    incrementKeys: js.Array[IncrementMovementKey],
    items: js.Array[D],
    jumpToFirstKeys: js.Array[JumpMovementKey],
    jumpToLastKeys: js.Array[JumpMovementKey]
  ): BaseKeyboardMovementOptions[D, CE, IE] = {
    val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseKeyboardMovementOptions[D, CE, IE]]
  }
  @scala.inline
  implicit class BaseKeyboardMovementOptionsOps[Self <: BaseKeyboardMovementOptions[_, _, _], D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE] (val x: Self with (BaseKeyboardMovementOptions[D, CE, IE])) extends AnyVal {
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
    def setDecrementKeysVarargs(value: IncrementMovementKey*): Self = this.set("decrementKeys", js.Array(value :_*))
    @scala.inline
    def setDecrementKeys(value: js.Array[IncrementMovementKey]): Self = this.set("decrementKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncrementKeysVarargs(value: IncrementMovementKey*): Self = this.set("incrementKeys", js.Array(value :_*))
    @scala.inline
    def setIncrementKeys(value: js.Array[IncrementMovementKey]): Self = this.set("incrementKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: D*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[D]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpToFirstKeysVarargs(value: JumpMovementKey*): Self = this.set("jumpToFirstKeys", js.Array(value :_*))
    @scala.inline
    def setJumpToFirstKeys(value: js.Array[JumpMovementKey]): Self = this.set("jumpToFirstKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setJumpToLastKeysVarargs(value: JumpMovementKey*): Self = this.set("jumpToLastKeys", js.Array(value :_*))
    @scala.inline
    def setJumpToLastKeys(value: js.Array[JumpMovementKey]): Self = this.set("jumpToLastKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindMatchIndex(
      value: (/* value */ String, /* values */ js.Array[String], /* startIndex */ Double, /* isSelfMatchable */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("findMatchIndex", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFindMatchIndex: Self = this.set("findMatchIndex", js.undefined)
    @scala.inline
    def setGetItemValue(value: (D, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemValue: Self = this.set("getItemValue", js.undefined)
    @scala.inline
    def setLoopable(value: Boolean): Self = this.set("loopable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopable: Self = this.set("loopable", js.undefined)
    @scala.inline
    def setOnChange(value: (/* data */ SearchData[D, CE], /* itemRefs */ ItemRefList[IE]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[CE] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setResetTime(value: Double): Self = this.set("resetTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetTime: Self = this.set("resetTime", js.undefined)
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
  
}

