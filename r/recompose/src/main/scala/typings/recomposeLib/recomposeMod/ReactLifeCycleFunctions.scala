package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends js.Object {
  var componentDidCatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ stdLib.Error, 
      /* info */ reactLib.reactMod.ErrorInfo, 
      scala.Unit
    ]
  ] = js.undefined
  var componentDidMount: js.UndefOr[
    js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ]
  ] = js.undefined
  var componentDidUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      scala.Unit
    ]
  ] = js.undefined
  var componentWillMount: js.UndefOr[
    js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ]
  ] = js.undefined
  var componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      scala.Unit
    ]
  ] = js.undefined
  var componentWillUnmount: js.UndefOr[
    js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ]
  ] = js.undefined
  var componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      scala.Unit
    ]
  ] = js.undefined
  var shouldComponentUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      scala.Boolean
    ]
  ] = js.undefined
}

object ReactLifeCycleFunctions {
  @scala.inline
  def apply[TProps, TState, TInstance](
    componentDidCatch: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ stdLib.Error, 
      /* info */ reactLib.reactMod.ErrorInfo, 
      scala.Unit
    ] = null,
    componentDidMount: js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ] = null,
    componentDidUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      scala.Unit
    ] = null,
    componentWillMount: js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ] = null,
    componentWillReceiveProps: js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      scala.Unit
    ] = null,
    componentWillUnmount: js.ThisFunction0[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      scala.Unit
    ] = null,
    componentWillUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      scala.Unit
    ] = null,
    shouldComponentUpdate: js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      scala.Boolean
    ] = null
  ): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
    val __obj = js.Dynamic.literal()
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

