package typings.reactNativeCommunityCliHermes

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcemapUtilsMod {
  
  @JSImport("@react-native-community/cli-hermes/build/profileHermes/sourcemapUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSourcemap(ctx: Config): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourcemap")(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findSourcemap(ctx: Config, port: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSourcemap")(ctx.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def generateSourcemap(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSourcemap")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def generateSourcemap(port: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSourcemap")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
