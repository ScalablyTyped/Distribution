package typings.recompose.mod

import typings.react.mod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// lifecycle: https://github.com/acdlite/recompose/blob/master/docs/API.md#lifecycle
@js.native
trait ReactLifeCycleFunctions[TProps, TState, TInstance] extends js.Object {
  
  var UNSAFE_componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* error */ Error, 
      /* info */ ErrorInfo, 
      Unit
    ]
  ] = js.native
  
  var componentDidMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* prevProps */ TProps, 
      /* prevState */ TState, 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  
  var componentWillReceiveProps: js.UndefOr[
    js.ThisFunction1[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      Unit
    ]
  ] = js.native
  
  var componentWillUnmount: js.UndefOr[
    js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
  ] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Unit
    ]
  ] = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
      /* nextProps */ TProps, 
      /* nextState */ TState, 
      Boolean
    ]
  ] = js.native
}
object ReactLifeCycleFunctions {
  
  @scala.inline
  def apply[TProps, TState, TInstance](): ReactLifeCycleFunctions[TProps, TState, TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactLifeCycleFunctions[TProps, TState, TInstance]]
  }
  
  @scala.inline
  implicit class ReactLifeCycleFunctionsOps[Self <: ReactLifeCycleFunctions[_, _, _], TProps, TState, TInstance] (val x: Self with (ReactLifeCycleFunctions[TProps, TState, TInstance])) extends AnyVal {
    
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
    def setUNSAFE_componentWillMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self = this.set("UNSAFE_componentWillMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSAFE_componentWillMount: Self = this.set("UNSAFE_componentWillMount", js.undefined)
    
    @scala.inline
    def setUNSAFE_componentWillReceiveProps(
      value: js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
    ): Self = this.set("UNSAFE_componentWillReceiveProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSAFE_componentWillReceiveProps: Self = this.set("UNSAFE_componentWillReceiveProps", js.undefined)
    
    @scala.inline
    def setUNSAFE_componentWillUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
    ): Self = this.set("UNSAFE_componentWillUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUNSAFE_componentWillUpdate: Self = this.set("UNSAFE_componentWillUpdate", js.undefined)
    
    @scala.inline
    def setComponentDidCatch(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* error */ Error, 
          /* info */ ErrorInfo, 
          Unit
        ]
    ): Self = this.set("componentDidCatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentDidCatch: Self = this.set("componentDidCatch", js.undefined)
    
    @scala.inline
    def setComponentDidMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self = this.set("componentDidMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentDidMount: Self = this.set("componentDidMount", js.undefined)
    
    @scala.inline
    def setComponentDidUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* prevProps */ TProps, 
          /* prevState */ TState, 
          Unit
        ]
    ): Self = this.set("componentDidUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentDidUpdate: Self = this.set("componentDidUpdate", js.undefined)
    
    @scala.inline
    def setComponentWillMount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self = this.set("componentWillMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentWillMount: Self = this.set("componentWillMount", js.undefined)
    
    @scala.inline
    def setComponentWillReceiveProps(
      value: js.ThisFunction1[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          Unit
        ]
    ): Self = this.set("componentWillReceiveProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentWillReceiveProps: Self = this.set("componentWillReceiveProps", js.undefined)
    
    @scala.inline
    def setComponentWillUnmount(
      value: js.ThisFunction0[/* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], Unit]
    ): Self = this.set("componentWillUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentWillUnmount: Self = this.set("componentWillUnmount", js.undefined)
    
    @scala.inline
    def setComponentWillUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Unit
        ]
    ): Self = this.set("componentWillUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentWillUpdate: Self = this.set("componentWillUpdate", js.undefined)
    
    @scala.inline
    def setShouldComponentUpdate(
      value: js.ThisFunction2[
          /* this */ ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance], 
          /* nextProps */ TProps, 
          /* nextState */ TState, 
          Boolean
        ]
    ): Self = this.set("shouldComponentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldComponentUpdate: Self = this.set("shouldComponentUpdate", js.undefined)
  }
}
