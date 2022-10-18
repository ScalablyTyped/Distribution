package typings.snyk

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCopyMod {
  
  @JSImport("snyk/dist/cli/copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(str: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
