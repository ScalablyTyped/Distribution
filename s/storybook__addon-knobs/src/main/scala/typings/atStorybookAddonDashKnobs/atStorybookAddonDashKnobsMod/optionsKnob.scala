package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs", "optionsKnob")
@js.native
object optionsKnob extends js.Object {
  def apply[T](label: String, values: StringDictionary[T]): js.Array[T] = js.native
  def apply[T](label: String, values: StringDictionary[T], defaultValue: T): T = js.native
  def apply[T](label: String, values: StringDictionary[T], defaultValue: T, options: OptionsKnobOptions): T = js.native
  def apply[T](label: String, values: StringDictionary[T], defaultValue: js.Array[T]): js.Array[T] = js.native
  def apply[T](label: String, values: StringDictionary[T], defaultValue: js.Array[T], options: OptionsKnobOptions): js.Array[T] = js.native
}

