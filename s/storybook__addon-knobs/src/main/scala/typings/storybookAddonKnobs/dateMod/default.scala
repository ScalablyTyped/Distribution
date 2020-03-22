package typings.storybookAddonKnobs.dateMod

import typings.storybookAddonKnobs.AnonKnobOnChange
import typings.storybookAddonKnobs.AnonValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
@js.native
class default () extends DateType

/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: DateTypeProps = js.native
  var propTypes: AnonKnobOnChange = js.native
  def deserialize(value: Double): Double = js.native
  def getDerivedStateFromProps(): AnonValid = js.native
  def serialize(value: Double): Double = js.native
}

