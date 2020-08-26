package typings.reactSpring.renderpropsUniversalMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailProps[TItem, DS /* <: js.Object */] extends TrailPropsWeaken {
  /**
    * Base values, optional
    */
  @JSName("from")
  var from_TrailProps: js.UndefOr[Partial[DS]] = js.native
  /**
    * An array of items to be displayed, use this if you need access to the actual items when distributing values as functions
    */
  var items: js.Array[TItem] | TItem = js.native
  /**
    * Item keys (the same keys you'd hand over to react in a list). If you specify items, keys can be an accessor function (item => item.key)
    * @default item => item
    */
  var keys: js.UndefOr[
    (js.Function1[/* item */ TItem, TrailKeyProps]) | js.Array[TrailKeyProps] | TrailKeyProps
  ] = js.native
  /**
    * Animates to ...
    */
  @JSName("to")
  var to_TrailProps: js.UndefOr[DS] = js.native
  /**
    * A single function-child that receives the individual item and return a functional component (item, index) => props => view)
    */
  @JSName("children")
  def children_MTrailProps(item: TItem, index: Double): SpringRendererFunc[DS] = js.native
}

object TrailProps {
  @scala.inline
  def apply[TItem, /* <: js.Object */ DS](children: (TItem, Double) => SpringRendererFunc[DS], items: js.Array[TItem] | TItem): TrailProps[TItem, DS] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailProps[TItem, DS]]
  }
  @scala.inline
  implicit class TrailPropsOps[Self <: TrailProps[_, _], TItem, /* <: js.Object */ DS] (val x: Self with (TrailProps[TItem, DS])) extends AnyVal {
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
    def setChildren(value: (TItem, Double) => SpringRendererFunc[DS]): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setItemsVarargs(value: TItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TItem] | TItem): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: Partial[DS]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setKeysVarargs(value: TrailKeyProps*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeysFunction1(value: /* item */ TItem => TrailKeyProps): Self = this.set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(value: (js.Function1[/* item */ TItem, TrailKeyProps]) | js.Array[TrailKeyProps] | TrailKeyProps): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setTo(value: DS): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

