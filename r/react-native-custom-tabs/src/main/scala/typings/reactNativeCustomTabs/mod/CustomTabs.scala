package typings.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-custom-tabs", "CustomTabs")
@js.native
object CustomTabs extends js.Object {
  
  def openURL(url: String): js.Promise[Boolean] = js.native
  def openURL(url: String, options: CustomTabsOptions): js.Promise[Boolean] = js.native
}
