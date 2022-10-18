package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsCiMod {
  
  @JSImport("snyk/dist/lib/is-ci", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCI(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCI")().asInstanceOf[Boolean]
}
