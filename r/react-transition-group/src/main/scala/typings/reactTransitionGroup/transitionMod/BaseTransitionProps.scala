package typings.reactTransitionGroup.transitionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var children: js.UndefOr[TransitionChildren] = js.undefined
  /**
    * Show the component; triggers the enter or exit states
    */
  var in: js.UndefOr[Boolean] = js.undefined
  /**
    * By default the child component is mounted immediately along with the
    * parent Transition component. If you want to "lazy mount" the component on
    * the first `in={true}` you can set `mountOnEnter`. After the first enter
    * transition the component will stay mounted, even on "exited", unless you
    * also specify `unmountOnExit`.
    */
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  /**
    * A React reference to DOM element that need to transition: https://stackoverflow.com/a/51127130/4671932
    * When `nodeRef` prop is used, node is not passed to callback functions (e.g. onEnter) because user already has direct access to the node.
    * When changing `key` prop of `Transition` in a `TransitionGroup` a new `nodeRef` need to be provided to `Transition` with changed `key`
    * prop (@see https://github.com/reactjs/react-transition-group/blob/master/test/Transition-test.js).
    */
  var nodeRef: js.UndefOr[Ref[RefElement]] = js.undefined
  /**
    * Callback fired before the "entering" status is applied. An extra
    * parameter `isAppearing` is supplied to indicate if the enter stage is
    * occurring on the initial mount
    */
  var onEnter: js.UndefOr[EnterHandler[RefElement]] = js.undefined
  /**
    * Callback fired after the "entered" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntered: js.UndefOr[EnterHandler[RefElement]] = js.undefined
  /**
    * Callback fired after the "entering" status is applied. An extra parameter
    * isAppearing is supplied to indicate if the enter stage is occurring on
    * the initial mount
    */
  var onEntering: js.UndefOr[EnterHandler[RefElement]] = js.undefined
  /**
    * Callback fired before the "exiting" status is applied.
    */
  var onExit: js.UndefOr[ExitHandler[RefElement]] = js.undefined
  /**
    * Callback fired after the "exited" status is applied.
    */
  var onExited: js.UndefOr[ExitHandler[RefElement]] = js.undefined
  /**
    * Callback fired after the "exiting" status is applied.
    */
  var onExiting: js.UndefOr[ExitHandler[RefElement]] = js.undefined
  /**
    * By default the child component stays mounted after it reaches the
    * 'exited' state. Set `unmountOnExit` if you'd prefer to unmount the
    * component after it finishes exiting.
    */
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object BaseTransitionProps {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.std.HTMLElement] */ RefElement](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    children: TransitionChildren = null,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    nodeRef: js.UndefOr[Null | Ref[RefElement]] = js.undefined,
    onEnter: EnterHandler[RefElement] = null,
    onEntered: EnterHandler[RefElement] = null,
    onEntering: EnterHandler[RefElement] = null,
    onExit: ExitHandler[RefElement] = null,
    onExited: ExitHandler[RefElement] = null,
    onExiting: ExitHandler[RefElement] = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): BaseTransitionProps[RefElement] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeRef)) __obj.updateDynamic("nodeRef")(nodeRef.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTransitionProps[RefElement]]
  }
}

