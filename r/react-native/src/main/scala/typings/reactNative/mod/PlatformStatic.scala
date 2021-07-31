package typings.reactNative.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformStatic extends StObject {
  
  var Version: Double | String = js.native
  
  var isTV: Boolean = js.native
  
  def select[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType ]:? T}
    */ typings.reactNative.reactNativeStrings.PlatformStatic & TopLevel[js.Any]
  ): js.UndefOr[T] = js.native
  /**
    * @see https://reactnative.dev/docs/platform-specific-code#content
    */
  @JSName("select")
  def select_T_T[T](specifics: typings.reactNative.reactNativeStrings.PlatformStatic & TopLevel[js.Any] & Default[T]): T = js.native
}
