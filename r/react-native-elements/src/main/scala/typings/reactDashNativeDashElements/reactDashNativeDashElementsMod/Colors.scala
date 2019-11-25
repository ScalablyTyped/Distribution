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
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], grey0 = grey0.asInstanceOf[js.Any], grey1 = grey1.asInstanceOf[js.Any], grey2 = grey2.asInstanceOf[js.Any], grey3 = grey3.asInstanceOf[js.Any], grey4 = grey4.asInstanceOf[js.Any], grey5 = grey5.asInstanceOf[js.Any], greyOutline = greyOutline.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], searchBg = searchBg.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Colors]
  }
}

@JSImport("react-native-elements", "colors")
@js.native
object colors extends TopLevel[Colors]

