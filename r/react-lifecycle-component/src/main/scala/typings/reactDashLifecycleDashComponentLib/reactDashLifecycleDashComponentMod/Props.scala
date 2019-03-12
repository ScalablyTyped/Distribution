package typings
package reactDashLifecycleDashComponentLib.reactDashLifecycleDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[P, S]
  extends reactLib.reactMod.ReactNs.ComponentLifecycle[P, S, js.Any]
     with LifecycleStateProps[P, S]

object Props {
  @scala.inline
  def apply[P, S](
    component: reactLib.reactMod.ReactNs.ComponentClass[P, S],
    UNSAFE_componentWillMount: () => scala.Unit = null,
    UNSAFE_componentWillReceiveProps: (/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any) => scala.Unit = null,
    UNSAFE_componentWillUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Unit = null,
    componentDidCatch: (/* error */ stdLib.Error, /* errorInfo */ reactLib.reactMod.ReactNs.ErrorInfo) => scala.Unit = null,
    componentDidMount: () => scala.Unit = null,
    componentDidUpdate: (/* prevProps */ stdLib.Readonly[P], /* prevState */ stdLib.Readonly[S], /* snapshot */ js.UndefOr[js.Any]) => scala.Unit = null,
    componentWillMount: () => scala.Unit = null,
    componentWillReceiveProps: (/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any) => scala.Unit = null,
    componentWillUnmount: () => scala.Unit = null,
    componentWillUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Unit = null,
    getSnapshotBeforeUpdate: (/* prevProps */ stdLib.Readonly[P], /* prevState */ stdLib.Readonly[S]) => js.Any | scala.Null = null,
    shouldComponentUpdate: (/* nextProps */ stdLib.Readonly[P], /* nextState */ stdLib.Readonly[S], /* nextContext */ js.Any) => scala.Boolean = null
  ): Props[P, S] = {
    val __obj = js.Dynamic.literal(component = component)
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

