package typings.reduxTimeout

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-timeout", "WATCH_ALL")
  @js.native
  val WATCH_ALL: String = js.native
  
  inline def addTimeout(timeout: Double, action: String, toCall: js.Function1[/* args */ Any, Unit]): AnyAction = (^.asInstanceOf[js.Dynamic].applyDynamic("addTimeout")(timeout.asInstanceOf[js.Any], action.asInstanceOf[js.Any], toCall.asInstanceOf[js.Any])).asInstanceOf[AnyAction]
  inline def addTimeout(timeout: Double, action: js.Array[String], toCall: js.Function1[/* args */ Any, Unit]): AnyAction = (^.asInstanceOf[js.Dynamic].applyDynamic("addTimeout")(timeout.asInstanceOf[js.Any], action.asInstanceOf[js.Any], toCall.asInstanceOf[js.Any])).asInstanceOf[AnyAction]
  
  inline def reduxTimeout(): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reduxTimeout")().asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  inline def removeTimeout(action: String): AnyAction = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTimeout")(action.asInstanceOf[js.Any]).asInstanceOf[AnyAction]
  inline def removeTimeout(action: js.Array[String]): AnyAction = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTimeout")(action.asInstanceOf[js.Any]).asInstanceOf[AnyAction]
}
