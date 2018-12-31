package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends js.Object {
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

