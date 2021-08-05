package typings.reactBootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecationWarningMod {
  
  @JSImport("react-bootstrap/lib/utils/deprecationWarning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(oldname: js.Any, newname: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oldname.asInstanceOf[js.Any], newname.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(oldname: js.Any, newname: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oldname.asInstanceOf[js.Any], newname.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetWarned")().asInstanceOf[Unit]
  
  inline def wrapper(Component: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapper")(Component.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
