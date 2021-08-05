package typings.reactSpringShared

import typings.reactSpringShared.esmTypesMod.InterpolatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmStringInterpolationMod {
  
  @JSImport("@react-spring/shared/esm/stringInterpolation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStringInterpolator(config: InterpolatorConfig[String]): js.Function1[/* input */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringInterpolator")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ Double, String]]
}
