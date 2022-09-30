package typings.reactRedux

import typings.reactRedux.anon.Call
import typings.reactRedux.anon.DisplayName
import typings.reactRedux.anon.MapToProps
import typings.reactRedux.anon.WrappedComponentName
import typings.reactRedux.selectorFactoryMod.MapDispatchToPropsParam
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapDispatchToPropsMod {
  
  @JSImport("react-redux/es/connect/mapDispatchToProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapDispatchToPropsFactory[TDispatchProps, TOwnProps](): (js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mapDispatchToPropsFactory")().asInstanceOf[(js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ])]
  inline def mapDispatchToPropsFactory[TDispatchProps, TOwnProps](mapDispatchToProps: MapDispatchToPropsParam[TDispatchProps, TOwnProps]): (js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("mapDispatchToPropsFactory")(mapDispatchToProps.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* dispatch */ Dispatch[AnyAction], Call]) | (js.Function2[
    /* dispatch */ Dispatch[Action[Any] | AnyAction], 
    (/* hasDisplayName */ DisplayName) | (/* options */ WrappedComponentName), 
    MapToProps | scala.Nothing
  ])]
}
