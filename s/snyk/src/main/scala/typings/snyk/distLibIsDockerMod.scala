package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsDockerMod {
  
  @JSImport("snyk/dist/lib/is-docker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDocker(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocker")().asInstanceOf[Boolean]
}
