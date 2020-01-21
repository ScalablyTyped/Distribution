package typings.reactLifecycleComponent.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentLifecycle
import typings.react.mod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[P, S]
  extends ComponentLifecycle[P, S, js.Any]
     with LifecycleStateProps[P, S]

object Props {
  @scala.inline
  def apply[P, S](
    component: ComponentClass[P, S],
    UNSAFE_componentWillMount: () => Unit = null,
    UNSAFE_componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit = null,
    UNSAFE_componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit = null,
    componentDidCatch: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    componentDidMount: () => Unit = null,
    componentDidUpdate: (P, S, /* snapshot */ js.UndefOr[js.Any]) => Unit = null,
    componentWillMount: () => Unit = null,
    componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit = null,
    componentWillUnmount: () => Unit = null,
    componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit = null,
    getSnapshotBeforeUpdate: (P, S) => js.Any | Null = null,
    shouldComponentUpdate: (P, S, /* nextContext */ js.Any) => Boolean = null
  ): Props[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(js.Any.fromFunction0(UNSAFE_componentWillMount))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2(UNSAFE_componentWillReceiveProps))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3(UNSAFE_componentWillUpdate))
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    __obj.asInstanceOf[Props[P, S]]
  }
}

