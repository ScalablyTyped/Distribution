package typings.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  def createGlobal(hasColorBackgroundTypography: AnonBackground): Return = js.native
  def createReset(hasTypography: AnonTypography): Return = js.native
  type Return = StringDictionary[StringDictionary[Value]]
  type Value = String | Double
}

