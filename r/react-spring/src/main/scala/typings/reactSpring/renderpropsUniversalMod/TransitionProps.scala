package typings.reactSpring.renderpropsUniversalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-spring.react-spring/renderprops-universal.SpringBaseProps, std.Exclude<keyof react-spring.react-spring/renderprops-universal.SpringBaseProps, 'config'>> */
@js.native
trait TransitionProps[TItem, TInit /* <: js.Object */, TFrom /* <: js.Object */, TEnter /* <: js.Object */, TLeave /* <: js.Object */, TUpdate /* <: js.Object */, SpringProps /* <: js.Object */, DS /* <: js.Object */] extends js.Object {
  /**
    * A single function-child that receives the individual item and return a functional component ((item, state, index) => props => view)
    */
  var children: js.UndefOr[
    js.Function3[
      /* item */ TItem, 
      /* state */ State, 
      /* index */ Double, 
      Boolean | Null | (SpringRendererFunc[TInit with TFrom with TEnter with TLeave with TUpdate])
    ]
  ] = js.native
  /**
    * Spring config, or for individual keys: fn((item,type) => config), where "type" can be either enter, leave or update
    * @default config.default
    */
  var config: js.UndefOr[SpringConfig | (js.Function2[/* item */ TItem, /* type */ State, SpringConfig])] = js.native
  var delay: js.UndefOr[Double] = js.native
  /**
    * Values that apply to new elements, or: item => values
    * @default {}
    */
  var enter: js.UndefOr[TEnter | (js.Function1[/* item */ TItem, TEnter])] = js.native
  /**
    * Base values (from -> enter), or: item => values
    * @default {}
    */
  var from: js.UndefOr[TFrom | (js.Function1[/* item */ TItem, TFrom])] = js.native
  var immediate: js.UndefOr[Boolean | (js.Function1[/* key */ String, Boolean])] = js.native
  /**
    * First-render initial values, if present overrides "from" on the first render pass. It can be "null" to skip first mounting transition. Otherwise it can take an object or a function (item => object)
    */
  var initial: js.UndefOr[TInit | (js.Function1[/* item */ TItem, TInit]) | Null] = js.native
  /**
    * An array of items to be displayed, this is used by Transition as the primary means of detecting changes.
    * @default {}
    */
  var items: js.Array[TItem] | TItem = js.native
  /**
    * The same keys you would normally hand over to React in a list. Keys can be specified as a key-accessor function, an array of keys, or a single value
    */
  var keys: js.UndefOr[
    (js.Function1[/* item */ TItem, TransitionKeyProps]) | js.Array[TransitionKeyProps] | TransitionKeyProps
  ] = js.native
  /**
    * Values that apply to leaving elements, or: item => values
    * @default {}
    */
  var leave: js.UndefOr[TLeave | (js.Function1[/* item */ TItem, TLeave])] = js.native
  var native: js.UndefOr[Boolean] = js.native
  /**
    * Calls back once a transition is about to wrap up
    */
  var onDestroyed: js.UndefOr[js.Function1[/* item */ TItem, Unit]] = js.native
  /**
    * Callback when the animation comes to a still-stand
    */
  var onRest: js.UndefOr[js.Function1[/* ds */ DS, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Useful in combination with "unique", when true it forces incoming items that already exist to restart instead of adapting to their current values
    * @default false
    */
  var reset: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
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
  var update: js.UndefOr[TUpdate | (js.Function1[/* item */ TItem, TUpdate])] = js.native
}

object TransitionProps {
  @scala.inline
  def apply[TItem, /* <: js.Object */ TInit, /* <: js.Object */ TFrom, /* <: js.Object */ TEnter, /* <: js.Object */ TLeave, /* <: js.Object */ TUpdate, /* <: js.Object */ SpringProps, /* <: js.Object */ DS](items: js.Array[TItem] | TItem): TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, SpringProps, DS] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, SpringProps, DS]]
  }
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps[_, _, _, _, _, _, _, _], TItem, /* <: js.Object */ TInit, /* <: js.Object */ TFrom, /* <: js.Object */ TEnter, /* <: js.Object */ TLeave, /* <: js.Object */ TUpdate, /* <: js.Object */ SpringProps, /* <: js.Object */ DS] (val x: Self with (TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, SpringProps, DS])) extends AnyVal {
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
    def setItemsVarargs(value: TItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TItem] | TItem): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(
      value: (/* item */ TItem, /* state */ State, /* index */ Double) => Boolean | Null | (SpringRendererFunc[TInit with TFrom with TEnter with TLeave with TUpdate])
    ): Self = this.set("children", js.Any.fromFunction3(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setConfigFunction2(value: (/* item */ TItem, /* type */ State) => SpringConfig): Self = this.set("config", js.Any.fromFunction2(value))
    @scala.inline
    def setConfig(value: SpringConfig | (js.Function2[/* item */ TItem, /* type */ State, SpringConfig])): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnterFunction1(value: /* item */ TItem => TEnter): Self = this.set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def setEnter(value: TEnter | (js.Function1[/* item */ TItem, TEnter])): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setFromFunction1(value: /* item */ TItem => TFrom): Self = this.set("from", js.Any.fromFunction1(value))
    @scala.inline
    def setFrom(value: TFrom | (js.Function1[/* item */ TItem, TFrom])): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setImmediateFunction1(value: /* key */ String => Boolean): Self = this.set("immediate", js.Any.fromFunction1(value))
    @scala.inline
    def setImmediate(value: Boolean | (js.Function1[/* key */ String, Boolean])): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setInitialFunction1(value: /* item */ TItem => TInit): Self = this.set("initial", js.Any.fromFunction1(value))
    @scala.inline
    def setInitial(value: TInit | (js.Function1[/* item */ TItem, TInit])): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setInitialNull: Self = this.set("initial", null)
    @scala.inline
    def setKeysVarargs(value: TransitionKeyProps*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeysFunction1(value: /* item */ TItem => TransitionKeyProps): Self = this.set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def setKeys(
      value: (js.Function1[/* item */ TItem, TransitionKeyProps]) | js.Array[TransitionKeyProps] | TransitionKeyProps
    ): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLeaveFunction1(value: /* item */ TItem => TLeave): Self = this.set("leave", js.Any.fromFunction1(value))
    @scala.inline
    def setLeave(value: TLeave | (js.Function1[/* item */ TItem, TLeave])): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setOnDestroyed(value: /* item */ TItem => Unit): Self = this.set("onDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDestroyed: Self = this.set("onDestroyed", js.undefined)
    @scala.inline
    def setOnRest(value: /* ds */ DS => Unit): Self = this.set("onRest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setTrail(value: Double): Self = this.set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    @scala.inline
    def setUpdateFunction1(value: /* item */ TItem => TUpdate): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: TUpdate | (js.Function1[/* item */ TItem, TUpdate])): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

