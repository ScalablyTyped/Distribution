package typings.sigstore

import typings.tufJs.mod.Updater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTufTargetMod {
  
  @JSImport("sigstore/dist/tuf/target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readTarget(tuf: Updater, targetPath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTarget")(tuf.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
