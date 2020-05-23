package typings.storybookAddonKnobs.dateMod

import typings.storybookAddonKnobs.anon.KnobOnChange
import typings.storybookAddonKnobs.anon.Valid
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
  var propTypes: KnobOnChange = js.native
  def deserialize(value: Double): Double = js.native
  def getDerivedStateFromProps(): Valid = js.native
  def serialize(value: Double): Double = js.native
}

