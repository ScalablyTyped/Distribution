package typings.reactMdUtils.useActiveDescendantMovementMod

import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardMovementMod.BaseKeyboardMovementOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDescendantOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends BaseKeyboardMovementOptions[D, CE, IE] {
  /**
    * The base id that should be used to generate the `aria-activedescendant`
    * value id. This will be passed into the `getId` option.
    */
  var baseId: String = js.native
  /**
    * The default index that should be "focused" when the component mounts. This
    * is set to `-1` by default so that it only gains a new "focused" index when
    * the container element is focused.
    */
  var defaultFocusedIndex: js.UndefOr[js.Function0[Double] | Double] = js.native
  /**
    * The function that should generate an id based on the provided `id` and
    * `index` of the item.
    */
  var getId: js.UndefOr[js.Function2[/* id */ String, /* index */ Double, String]] = js.native
  /**
    * An optional function to call when the enter key has been pressed while the
    * container element has keyboard focus. This is normally used for triggering
    * click events for that specific item.
    */
  var onEnter: js.UndefOr[KeyHandler[IE]] = js.native
  /**
    * An optional function to call when the space key has been pressed while the
    * container element has keyboard focus. This is normally used for triggering
    * click events for that specific item and will always call
    * `event.preventDefault()` to prevent the page scrolling behavior.
    */
  var onSpace: js.UndefOr[KeyHandler[IE]] = js.native
}

object ActiveDescendantOptions {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE](
    baseId: String,
    decrementKeys: js.Array[IncrementMovementKey],
    incrementKeys: js.Array[IncrementMovementKey],
    items: js.Array[D],
    jumpToFirstKeys: js.Array[JumpMovementKey],
    jumpToLastKeys: js.Array[JumpMovementKey]
  ): ActiveDescendantOptions[D, CE, IE] = {
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDescendantOptions[D, CE, IE]]
  }
  @scala.inline
  implicit class ActiveDescendantOptionsOps[Self <: ActiveDescendantOptions[_, _, _], D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE] (val x: Self with (ActiveDescendantOptions[D, CE, IE])) extends AnyVal {
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
    def setBaseId(value: String): Self = this.set("baseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFocusedIndexFunction0(value: () => Double): Self = this.set("defaultFocusedIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setDefaultFocusedIndex(value: js.Function0[Double] | Double): Self = this.set("defaultFocusedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFocusedIndex: Self = this.set("defaultFocusedIndex", js.undefined)
    @scala.inline
    def setGetId(value: (/* id */ String, /* index */ Double) => String): Self = this.set("getId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetId: Self = this.set("getId", js.undefined)
    @scala.inline
    def setOnEnter(value: (/* focusedIndex */ Double, /* itemRef */ IE | Null) => Unit): Self = this.set("onEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnSpace(value: (/* focusedIndex */ Double, /* itemRef */ IE | Null) => Unit): Self = this.set("onSpace", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSpace: Self = this.set("onSpace", js.undefined)
  }
  
}

