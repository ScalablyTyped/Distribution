package typings.reactRedux

import typings.reactRedux.anon.Call
import typings.reactRedux.anon.DisplayName
import typings.reactRedux.anon.MapToProps
import typings.reactRedux.anon.WrappedComponentName
import typings.reactRedux.esConnectSelectorFactoryMod.MapStateToPropsParam
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectMapStateToPropsMod {
  
  @JSImport("react-redux/es/connect/mapStateToProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapStateToPropsFactory[TStateProps, TOwnProps, State](mapStateToProps: MapStateToPropsParam[TStateProps, TOwnProps, State]): (js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* param1 */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mapStateToPropsFactory")(mapStateToProps.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* param1 */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ])]
}
