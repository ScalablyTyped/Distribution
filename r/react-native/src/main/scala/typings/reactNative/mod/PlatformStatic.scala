package typings.reactNative.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.anon.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformStatic extends js.Object {
  var Version: Double | String = js.native
  var isTV: Boolean = js.native
  def select[T](
    specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType ]:? T}
    */ typings.reactNative.reactNativeStrings.PlatformStatic with TopLevel[js.Any]
  ): js.UndefOr[T] = js.native
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_T_T[T](
    specifics: typings.reactNative.reactNativeStrings.PlatformStatic with TopLevel[js.Any] with Default[T]
  ): T = js.native
}

