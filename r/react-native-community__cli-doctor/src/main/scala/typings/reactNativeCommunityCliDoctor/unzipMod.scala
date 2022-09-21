package typings.reactNativeCommunityCliDoctor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unzipMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/unzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unzip(source: String, destination: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
