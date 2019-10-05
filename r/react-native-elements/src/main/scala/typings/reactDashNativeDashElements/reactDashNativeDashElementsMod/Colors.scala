package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashNativeDashElements.Anon_Android
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  val disabled: String
  val divider: String
  val error: String
  val grey0: String
  val grey1: String
  val grey2: String
  val grey3: String
  val grey4: String
  val grey5: String
  val greyOutline: String
  val platform: Anon_Android
  val primary: String
  val searchBg: String
  val secondary: String
  val success: String
  val warning: String
}

object Colors {
  @scala.inline
  def apply(
    disabled: String,
    divider: String,
    error: String,
    grey0: String,
    grey1: String,
    grey2: String,
    grey3: String,
    grey4: String,
    grey5: String,
    greyOutline: String,
    platform: Anon_Android,
    primary: String,
    searchBg: String,
    secondary: String,
    success: String,
    warning: String
  ): Colors = {
    val __obj = js.Dynamic.literal(disabled = disabled, divider = divider, error = error, grey0 = grey0, grey1 = grey1, grey2 = grey2, grey3 = grey3, grey4 = grey4, grey5 = grey5, greyOutline = greyOutline, platform = platform, primary = primary, searchBg = searchBg, secondary = secondary, success = success, warning = warning)
  
    __obj.asInstanceOf[Colors]
  }
}

@JSImport("react-native-elements", "colors")
@js.native
object colors extends TopLevel[Colors]

