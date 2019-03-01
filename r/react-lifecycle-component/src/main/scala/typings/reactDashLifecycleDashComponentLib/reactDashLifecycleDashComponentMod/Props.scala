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
    UNSAFE_componentWillMount: js.Function0[scala.Unit] = null,
    UNSAFE_componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit] = null,
    UNSAFE_componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    componentDidCatch: js.Function2[
      /* error */ stdLib.Error, 
      /* errorInfo */ reactLib.reactMod.ReactNs.ErrorInfo, 
      scala.Unit
    ] = null,
    componentDidMount: js.Function0[scala.Unit] = null,
    componentDidUpdate: js.Function3[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      /* snapshot */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    componentWillMount: js.Function0[scala.Unit] = null,
    componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit] = null,
    componentWillUnmount: js.Function0[scala.Unit] = null,
    componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    getSnapshotBeforeUpdate: js.Function2[
      /* prevProps */ stdLib.Readonly[P], 
      /* prevState */ stdLib.Readonly[S], 
      js.Any | scala.Null
    ] = null,
    shouldComponentUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ] = null
  ): Props[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(UNSAFE_componentWillMount)
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(UNSAFE_componentWillReceiveProps)
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(UNSAFE_componentWillUpdate)
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(componentDidCatch)
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(componentDidMount)
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate)
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(componentWillMount)
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(componentWillReceiveProps)
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(componentWillUnmount)
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(componentWillUpdate)
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(getSnapshotBeforeUpdate)
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(shouldComponentUpdate)
    __obj.asInstanceOf[Props[P, S]]
  }
}

