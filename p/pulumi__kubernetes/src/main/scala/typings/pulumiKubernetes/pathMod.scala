package typings.pulumiKubernetes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@pulumi/kubernetes/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def quotePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quotePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def quoteWindowsPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quoteWindowsPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
