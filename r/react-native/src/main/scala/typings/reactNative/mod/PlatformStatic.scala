package typings.reactNative.mod

import typings.reactNative.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformStatic extends StObject {
  
  var Version: Double | String = js.native
  
  var constants: PlatformConstants = js.native
  
  var isTV: Boolean = js.native
  
  var isTesting: Boolean = js.native
  
  def select[T](
    specifics: /* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-native.react-native.PlatformOSType ]:? T} */ js.Any
  ): js.UndefOr[T] = js.native
  /**
    * @see https://reactnative.dev/docs/platform-specific-code#content
    */
  @JSName("select")
  def select_T_T[T](
    specifics: ((/* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-native.react-native.PlatformOSType ]:? T} */ js.Any) & Default[T]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ platform in react-native.react-native.PlatformOSType ]: T} */ js.Any)
  ): T = js.native
}
