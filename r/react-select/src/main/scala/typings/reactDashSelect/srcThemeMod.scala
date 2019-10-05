package typings.reactDashSelect

import typings.reactDashSelect.srcTypesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/theme", JSImport.Namespace)
@js.native
object srcThemeMod extends js.Object {
  val borderRadius: Double = js.native
  val defaultTheme: Theme = js.native
  @js.native
  object colors extends js.Object {
    var danger: String = js.native
    var dangerLight: String = js.native
    var neutral0: String = js.native
    var neutral1: String = js.native
    var neutral10: String = js.native
    var neutral100: String = js.native
    var neutral10a: String = js.native
    var neutral1a: String = js.native
    var neutral2: String = js.native
    var neutral20: String = js.native
    var neutral20a: String = js.native
    var neutral2a: String = js.native
    var neutral3: String = js.native
    var neutral30: String = js.native
    var neutral30a: String = js.native
    var neutral3a: String = js.native
    var neutral4: String = js.native
    var neutral40: String = js.native
    var neutral40a: String = js.native
    var neutral4a: String = js.native
    var neutral5: String = js.native
    var neutral50: String = js.native
    var neutral50a: String = js.native
    var neutral5a: String = js.native
    var neutral60: String = js.native
    var neutral60a: String = js.native
    var neutral70: String = js.native
    var neutral70a: String = js.native
    var neutral80: String = js.native
    var neutral80a: String = js.native
    var neutral90: String = js.native
    var neutral90a: String = js.native
    var primary: String = js.native
    var primary25: String = js.native
    var primary50: String = js.native
    var primary75: String = js.native
    var text: String = js.native
    var textLight: String = js.native
  }
  
  @js.native
  object spacing extends js.Object {
    /* Used to calculate consistent margin/padding on elements */
    var baseUnit: Double = js.native
    /* The minimum height of the control */
    var controlHeight: Double = js.native
    /* The amount of space between the control and menu */
    var menuGutter: Double = js.native
  }
  
  type ThemeConfig = Theme | (js.Function1[/* theme */ Theme, Theme])
}

