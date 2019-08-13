package typings.recompose.recomposeMod

import typings.react.reactMod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.undefined
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.undefined
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.undefined
  var componentDidCatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ Error, 
      /* info */ ErrorInfo, 
      Unit
    ]
  ] = js.undefined
  var componentDidMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.undefined
  var componentDidUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      Unit
    ]
  ] = js.undefined
  var componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.undefined
  var componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.undefined
  var componentWillUnmount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.undefined
  var componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.undefined
  var shouldComponentUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Boolean
    ]
  ] = js.undefined
}

object ReactLifeCycleFunctions {
  @scala.inline
  def apply[TProps, TState, TInstance](
    UNSAFE_componentWillMount: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit] = null,
    UNSAFE_componentWillReceiveProps: js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ] = null,
    UNSAFE_componentWillUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ] = null,
    componentDidCatch: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ Error, 
      /* info */ ErrorInfo, 
      Unit
    ] = null,
    componentDidMount: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit] = null,
    componentDidUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      Unit
    ] = null,
    componentWillMount: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit] = null,
    componentWillReceiveProps: js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ] = null,
    componentWillUnmount: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit] = null,
    componentWillUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ] = null,
    shouldComponentUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Boolean
    ] = null
  ): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
    val __obj = js.Dynamic.literal()
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
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(shouldComponentUpdate)
    __obj.asInstanceOf[ReactLifeCycleFunctions[TProps, TState, TInstance]]
  }
}

