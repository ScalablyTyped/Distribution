package typings.promiseTheWorld

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  inline def apply(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("promise-the-world/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
