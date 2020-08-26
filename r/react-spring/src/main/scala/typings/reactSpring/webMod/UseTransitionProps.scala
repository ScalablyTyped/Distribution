package typings.reactSpring.webMod

import typings.reactSpring.renderpropsUniversalMod.SpringConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTransitionProps[TItem, DS /* <: js.Object */] extends HooksBaseProps {
  /**
    * Spring config, or for individual items: fn(item => config)
    * @default config.default
    */
  var config: js.UndefOr[SpringConfig | (js.Function1[/* item */ TItem, SpringConfig])] = js.native
  /**
    * Values that apply to new elements, or: item => values
    * @default {}
    */
  var enter: js.UndefOr[
    InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])
  ] = js.native
  var from: js.UndefOr[InferFrom[DS] | (js.Function1[/* item */ TItem, InferFrom[DS]])] = js.native
  /**
    * Initial (first time) base values, optional (can be null)
    */
  var initial: js.UndefOr[InferFrom[DS] | (js.Function1[/* item */ TItem, InferFrom[DS]]) | Null] = js.native
  /**
    * Values that apply to leaving elements, or: item => values
    * @default {}
    */
  var leave: js.UndefOr[
    InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])
  ] = js.native
  /**
    * Called when objects have disappeared for good
    */
  var onDestroyed: js.UndefOr[js.Function1[/* isDestroyed */ Boolean, Unit]] = js.native
  /**
    * Trailing delay in ms
    */
  var trail: js.UndefOr[Double] = js.native
  /**
    * When true enforces that an item can only occur once instead of allowing two or more items with the same key to co-exist in a stack
    * @default false
    */
  var unique: js.UndefOr[Boolean] = js.native
  /**
    * Values that apply to elements that are neither entering nor leaving (you can use this to update present elements), or: item => values
    */
  var update: js.UndefOr[
    InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])
  ] = js.native
}

object UseTransitionProps {
  @scala.inline
  def apply[TItem, /* <: js.Object */ DS](): UseTransitionProps[TItem, DS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTransitionProps[TItem, DS]]
  }
  @scala.inline
  implicit class UseTransitionPropsOps[Self <: UseTransitionProps[_, _], TItem, /* <: js.Object */ DS] (val x: Self with (UseTransitionProps[TItem, DS])) extends AnyVal {
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
    def setConfigFunction1(value: /* item */ TItem => SpringConfig): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: SpringConfig | (js.Function1[/* item */ TItem, SpringConfig])): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setEnterVarargs(value: InferFrom[DS]*): Self = this.set("enter", js.Array(value :_*))
    @scala.inline
    def setEnterFunction1(value: /* item */ TItem => InferFrom[DS]): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def setEnter(value: InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setFromFunction1(value: /* item */ TItem => InferFrom[DS]): Self = this.set("from", js.Any.fromFunction1(value))
    @scala.inline
    def setFrom(value: InferFrom[DS] | (js.Function1[/* item */ TItem, InferFrom[DS]])): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setInitialFunction1(value: /* item */ TItem => InferFrom[DS]): Self = this.set("initial", js.Any.fromFunction1(value))
    @scala.inline
    def setInitial(value: InferFrom[DS] | (js.Function1[/* item */ TItem, InferFrom[DS]])): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setInitialNull: Self = this.set("initial", null)
    @scala.inline
    def setLeaveVarargs(value: InferFrom[DS]*): Self = this.set("leave", js.Array(value :_*))
    @scala.inline
    def setLeaveFunction1(value: /* item */ TItem => InferFrom[DS]): Self = this.set("leave", js.Any.fromFunction1(value))
    @scala.inline
    def setLeave(value: InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setOnDestroyed(value: /* isDestroyed */ Boolean => Unit): Self = this.set("onDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyed: Self = this.set("onDestroyed", js.undefined)
    @scala.inline
    def setTrail(value: Double): Self = this.set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    @scala.inline
    def setUpdateVarargs(value: InferFrom[DS]*): Self = this.set("update", js.Array(value :_*))
    @scala.inline
    def setUpdateFunction1(value: /* item */ TItem => InferFrom[DS]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: InferFrom[DS] | js.Array[InferFrom[DS]] | (js.Function1[/* item */ TItem, InferFrom[DS]])): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

