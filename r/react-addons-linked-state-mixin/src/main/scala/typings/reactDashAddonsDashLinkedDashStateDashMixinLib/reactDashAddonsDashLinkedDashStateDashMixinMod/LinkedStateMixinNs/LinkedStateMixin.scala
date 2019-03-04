package typings
package reactDashAddonsDashLinkedDashStateDashMixinLib.reactDashAddonsDashLinkedDashStateDashMixinMod.LinkedStateMixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedStateMixin
  extends reactLib.reactMod.ReactNs.Mixin[js.Any, js.Any] {
  def linkState[T](key: java.lang.String): ReactLink[T]
}

object LinkedStateMixin {
  @scala.inline
  def apply(
    linkState: js.Function1[java.lang.String, ReactLink[js.Any]],
    UNSAFE_componentWillMount: js.Function0[scala.Unit] = null,
    UNSAFE_componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[js.Any], /* nextContext */ js.Any, scala.Unit] = null,
    UNSAFE_componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[js.Any], 
      /* nextState */ stdLib.Readonly[js.Any], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    childContextTypes: reactLib.reactMod.ReactNs.ValidationMap[_] = null,
    componentDidCatch: js.Function2[
      /* error */ stdLib.Error, 
      /* errorInfo */ reactLib.reactMod.ReactNs.ErrorInfo, 
      scala.Unit
    ] = null,
    componentDidMount: js.Function0[scala.Unit] = null,
    componentDidUpdate: js.Function3[
      /* prevProps */ stdLib.Readonly[js.Any], 
      /* prevState */ stdLib.Readonly[js.Any], 
      /* snapshot */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    componentWillMount: js.Function0[scala.Unit] = null,
    componentWillReceiveProps: js.Function2[/* nextProps */ stdLib.Readonly[js.Any], /* nextContext */ js.Any, scala.Unit] = null,
    componentWillUnmount: js.Function0[scala.Unit] = null,
    componentWillUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[js.Any], 
      /* nextState */ stdLib.Readonly[js.Any], 
      /* nextContext */ js.Any, 
      scala.Unit
    ] = null,
    contextTypes: reactLib.reactMod.ReactNs.ValidationMap[_] = null,
    displayName: java.lang.String = null,
    getDefaultProps: js.Function0[js.Any] = null,
    getInitialState: js.Function0[js.Any] = null,
    getSnapshotBeforeUpdate: js.Function2[
      /* prevProps */ stdLib.Readonly[js.Any], 
      /* prevState */ stdLib.Readonly[js.Any], 
      js.Any | scala.Null
    ] = null,
    mixins: js.Array[reactLib.reactMod.ReactNs.Mixin[js.Any, js.Any]] = null,
    propTypes: reactLib.reactMod.ReactNs.ValidationMap[_] = null,
    shouldComponentUpdate: js.Function3[
      /* nextProps */ stdLib.Readonly[js.Any], 
      /* nextState */ stdLib.Readonly[js.Any], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ] = null,
    statics: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): LinkedStateMixin = {
    val __obj = js.Dynamic.literal(linkState = linkState)
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(UNSAFE_componentWillMount)
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(UNSAFE_componentWillReceiveProps)
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(UNSAFE_componentWillUpdate)
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes)
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(componentDidCatch)
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(componentDidMount)
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(componentDidUpdate)
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(componentWillMount)
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(componentWillReceiveProps)
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(componentWillUnmount)
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(componentWillUpdate)
    if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (getDefaultProps != null) __obj.updateDynamic("getDefaultProps")(getDefaultProps)
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(getInitialState)
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(getSnapshotBeforeUpdate)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes)
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(shouldComponentUpdate)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    __obj.asInstanceOf[LinkedStateMixin]
  }
}

