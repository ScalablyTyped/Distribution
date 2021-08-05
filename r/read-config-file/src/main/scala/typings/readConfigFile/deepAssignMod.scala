package typings.readConfigFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepAssignMod {
  
  @JSImport("read-config-file/out/deepAssign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepAssign[T](target: T, objects: js.Any*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepAssign")(target.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[T]
}
