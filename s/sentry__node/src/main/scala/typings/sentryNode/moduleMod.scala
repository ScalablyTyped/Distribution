package typings.sentryNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleMod {
  
  @JSImport("@sentry/node/types/module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModule(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModule")().asInstanceOf[js.UndefOr[String]]
  inline def getModule(filename: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModule")(filename.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
