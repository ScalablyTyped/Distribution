package typings.rcMenu

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextIdContextMod {
  
  @JSImport("rc-menu/es/context/IdContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu/es/context/IdContext", "IdContext")
  @js.native
  val IdContext: Context[String] = js.native
  
  inline def getMenuId(uuid: String, eventKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuId")(uuid.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useMenuId(eventKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuId")(eventKey.asInstanceOf[js.Any]).asInstanceOf[String]
}
