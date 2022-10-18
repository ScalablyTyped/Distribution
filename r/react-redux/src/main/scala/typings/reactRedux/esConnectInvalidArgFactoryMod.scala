package typings.reactRedux

import typings.reactRedux.anon.WrappedComponentName
import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConnectInvalidArgFactoryMod {
  
  @JSImport("react-redux/es/connect/invalidArgFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInvalidArgFactory(arg: Any, name: String): js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* options */ WrappedComponentName, 
    scala.Nothing
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidArgFactory")(arg.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* dispatch */ Dispatch[Action[Any]], 
    /* options */ WrappedComponentName, 
    scala.Nothing
  ]]
}
