package typings
package reactDashReduxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashReduxMod {
  type AdvancedComponentDecorator[TProps, TOwnProps] = js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[TProps], 
    reactLib.reactMod.ReactNs.ComponentClass[TOwnProps, reactLib.reactMod.ReactNs.ComponentState]
  ]
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ js.Any, 
    reactDashReduxLib.ConnectedComponentClass[
      js.Any, 
      (reactDashReduxLib.Omit[reactDashReduxLib.GetProps[_], java.lang.String]) with TNeedsProps
    ]
  ]
  type MapDispatchToPropsFactory[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    reactDashReduxLib.MapDispatchToProps[TDispatchProps, TOwnProps]
  ]
  type MapDispatchToPropsFunction[TDispatchProps, TOwnProps] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* ownProps */ TOwnProps, 
    TDispatchProps
  ]
  type MapStateToProps[TStateProps, TOwnProps, State] = js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]
  type MapStateToPropsFactory[TStateProps, TOwnProps, State] = js.Function2[
    /* initialState */ State, 
    /* ownProps */ TOwnProps, 
    MapStateToProps[TStateProps, TOwnProps, State]
  ]
  type MergeProps[TStateProps, TDispatchProps, TOwnProps, TMergedProps] = js.Function3[
    /* stateProps */ TStateProps, 
    /* dispatchProps */ TDispatchProps, 
    /* ownProps */ TOwnProps, 
    TMergedProps
  ]
  type Selector[S, TProps, TOwnProps] = js.Function2[/* state */ S, /* ownProps */ TOwnProps, TProps]
  type SelectorFactory[S, TProps, TOwnProps, TFactoryOptions] = js.Function2[
    /* dispatch */ reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.Action[js.Any]], 
    /* factoryOptions */ TFactoryOptions, 
    Selector[S, TProps, TOwnProps]
  ]
}
