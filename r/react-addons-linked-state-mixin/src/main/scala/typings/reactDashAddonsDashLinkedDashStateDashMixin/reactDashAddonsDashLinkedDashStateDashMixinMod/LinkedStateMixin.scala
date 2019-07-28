package typings.reactDashAddonsDashLinkedDashStateDashMixin.reactDashAddonsDashLinkedDashStateDashMixinMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ErrorInfo
import typings.react.reactMod.Mixin
import typings.react.reactMod.ValidationMap
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedStateMixin
  extends Mixin[js.Any, js.Any] {
  def linkState[T](key: String): ReactLink[T]
}

object LinkedStateMixin {
  @scala.inline
  def apply(
    linkState: String => ReactLink[js.Any],
    UNSAFE_componentWillMount: () => Unit = null,
    UNSAFE_componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Unit = null,
    UNSAFE_componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Unit = null,
    childContextTypes: ValidationMap[_] = null,
    componentDidCatch: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    componentDidMount: () => Unit = null,
    componentDidUpdate: (js.Any, js.Any, /* snapshot */ js.UndefOr[js.Any]) => Unit = null,
    componentWillMount: () => Unit = null,
    componentWillReceiveProps: (js.Any, /* nextContext */ js.Any) => Unit = null,
    componentWillUnmount: () => Unit = null,
    componentWillUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Unit = null,
    contextTypes: ValidationMap[_] = null,
    displayName: String = null,
    getDefaultProps: () => js.Any = null,
    getInitialState: () => js.Any = null,
    getSnapshotBeforeUpdate: (js.Any, js.Any) => js.Any | Null = null,
    mixins: js.Array[Mixin[js.Any, js.Any]] = null,
    propTypes: ValidationMap[_] = null,
    shouldComponentUpdate: (js.Any, js.Any, /* nextContext */ js.Any) => Boolean = null,
    statics: StringDictionary[js.Any] = null
  ): LinkedStateMixin = {
    val __obj = js.Dynamic.literal(linkState = js.Any.fromFunction1(linkState))
    if (UNSAFE_componentWillMount != null) __obj.updateDynamic("UNSAFE_componentWillMount")(js.Any.fromFunction0(UNSAFE_componentWillMount))
    if (UNSAFE_componentWillReceiveProps != null) __obj.updateDynamic("UNSAFE_componentWillReceiveProps")(js.Any.fromFunction2(UNSAFE_componentWillReceiveProps))
    if (UNSAFE_componentWillUpdate != null) __obj.updateDynamic("UNSAFE_componentWillUpdate")(js.Any.fromFunction3(UNSAFE_componentWillUpdate))
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes)
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (getDefaultProps != null) __obj.updateDynamic("getDefaultProps")(js.Any.fromFunction0(getDefaultProps))
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(js.Any.fromFunction0(getInitialState))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes)
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    __obj.asInstanceOf[LinkedStateMixin]
  }
}

