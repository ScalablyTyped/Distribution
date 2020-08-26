package typings.reactTransitionGroup.transitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */]
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * A function child can be used instead of a React element. This function is
    * called with the current transition status ('entering', 'entered',
    * 'exiting',  'exited', 'unmounted'), which can be used to apply context
    * specific props to a component.
    * ```jsx
    *    <Transition in={this.state.in} timeout={150}>
    *        {state => (
    *            <MyComponent className={`fade fade-${state}`} />
    *        )}
    *    </Transition>
    * ```
    */
  var children: js.UndefOr[TransitionChildren] = js.native
  /**
    * Show the component; triggers the enter or exit states
    */
  var in: js.UndefOr[Boolean] = js.native
  /**
    * By default the child component is mounted immediately along with the
    * parent Transition component. If you want to "lazy mount" the component on
    * the first `in={true}` you can set `mountOnEnter`. After the first enter
    * transition the component will stay mounted, even on "exited", unless you
    * also specify `unmountOnExit`.
    */
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * A React reference to DOM element that need to transition: https://stackoverflow.com/a/51127130/4671932
    * When `nodeRef` prop is used, node is not passed to callback functions (e.g. onEnter) because user already has direct access to the node.
    * When changing `key` prop of `Transition` in a `TransitionGroup` a new `nodeRef` need to be provided to `Transition` with changed `key`
    * prop (@see https://github.com/reactjs/react-transition-group/blob/master/test/Transition-test.js).
    */
  var nodeRef: js.UndefOr[Ref[RefElement]] = js.native
  /**
    * Callback fired before the "entering" status is applied. An extra
    * parameter `isAppearing` is supplied to indicate if the enter stage is
    * occurring on the initial mount
    */
  var onEnter: js.UndefOr[EnterHandler[RefElement]] = js.native
  /**
    * Callback fired after the "entered" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntered: js.UndefOr[EnterHandler[RefElement]] = js.native
  /**
    * Callback fired after the "entering" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntering: js.UndefOr[EnterHandler[RefElement]] = js.native
  /**
    * Callback fired before the "exiting" status is applied.
    */
  var onExit: js.UndefOr[ExitHandler[RefElement]] = js.native
  /**
    * Callback fired after the "exited" status is applied.
    */
  var onExited: js.UndefOr[ExitHandler[RefElement]] = js.native
  /**
    * Callback fired after the "exiting" status is applied.
    */
  var onExiting: js.UndefOr[ExitHandler[RefElement]] = js.native
  /**
    * By default the child component stays mounted after it reaches the
    * 'exited' state. Set `unmountOnExit` if you'd prefer to unmount the
    * component after it finishes exiting.
    */
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object BaseTransitionProps {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.std.HTMLElement] */ RefElement](): BaseTransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTransitionProps[RefElement]]
  }
  @scala.inline
  implicit class BaseTransitionPropsOps[Self <: BaseTransitionProps[_], /* <: js.UndefOr[typings.std.HTMLElement] */ RefElement] (val x: Self with BaseTransitionProps[RefElement]) extends AnyVal {
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
    def setChildrenFunction1(value: /* status */ TransitionStatus => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: TransitionChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setMountOnEnter(value: Boolean): Self = this.set("mountOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOnEnter: Self = this.set("mountOnEnter", js.undefined)
    @scala.inline
    def setNodeRefFunction1(value: /* instance */ RefElement | Null => Unit): Self = this.set("nodeRef", js.Any.fromFunction1(value))
    @scala.inline
    def setNodeRef(value: Ref[RefElement]): Self = this.set("nodeRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeRef: Self = this.set("nodeRef", js.undefined)
    @scala.inline
    def setNodeRefNull: Self = this.set("nodeRef", null)
    @scala.inline
    def setOnEnter(value: EnterHandler[RefElement]): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: EnterHandler[RefElement]): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: EnterHandler[RefElement]): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: ExitHandler[RefElement]): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: ExitHandler[RefElement]): Self = this.set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: ExitHandler[RefElement]): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
    @scala.inline
    def setUnmountOnExit(value: Boolean): Self = this.set("unmountOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmountOnExit: Self = this.set("unmountOnExit", js.undefined)
  }
  
}

