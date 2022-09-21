package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorBooleans.`false`
import typings.reactNativeCommunityCliDoctor.reactNativeCommunityCliDoctorBooleans.`true`
import typings.reactNativeCommunityCliDoctor.typesMod.EnvironmentInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envinfoMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/envinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns information about the running system.
    * If `json === true`, or no options are passed,
    * the return type will be an `EnvironmentInfo`.
    * If set to `false`, it will be a `string`.
    */
  inline def default(): js.Promise[EnvironmentInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[EnvironmentInfo]]
  
  inline def default_false(json: `false`): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def default_true(json: `true`): js.Promise[EnvironmentInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(json.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EnvironmentInfo]]
}
