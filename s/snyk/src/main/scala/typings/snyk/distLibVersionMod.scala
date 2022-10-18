package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibVersionMod {
  
  @JSImport("snyk/dist/lib/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersion")().asInstanceOf[String]
  
  inline def isStandaloneBuild(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandaloneBuild")().asInstanceOf[Boolean]
}
