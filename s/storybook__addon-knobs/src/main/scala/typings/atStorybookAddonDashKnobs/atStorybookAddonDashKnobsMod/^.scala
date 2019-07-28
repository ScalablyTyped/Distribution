package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookAddonDashKnobs.Anon_Debounce
import typings.atStorybookReact.atStorybookReactMod.RenderFunction
import typings.react.reactMod.ReactElement
import typings.std.Date
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def array[T](name: String, value: js.Array[T]): js.Array[T] = js.native
  def array[T](name: String, value: js.Array[T], separator: String): js.Array[T] = js.native
  def array[T](name: String, value: js.Array[T], separator: String, groupId: String): js.Array[T] = js.native
  def boolean(name: String, value: Boolean): Boolean = js.native
  def boolean(name: String, value: Boolean, groupId: String): Boolean = js.native
  def button(name: String, handler: js.Function0[_]): Unit = js.native
  def button(name: String, handler: js.Function0[_], groupId: String): Unit = js.native
  def color(name: String, value: String): String = js.native
  def color(name: String, value: String, groupId: String): String = js.native
  def date(name: String): Double = js.native
  def date(name: String, value: Date): Double = js.native
  def date(name: String, value: Date, groupId: String): Double = js.native
  def files(label: String, accept: String, defaultValue: js.Array[String]): js.Array[String] = js.native
  def knob[T](name: String, options: KnobOption[T]): T = js.native
  def number(name: String, value: Double): Double = js.native
  def number(name: String, value: Double, options: EmptyNumberOptions): Double = js.native
  def number(name: String, value: Double, options: EmptyNumberOptions, groupId: String): Double = js.native
  def number(name: String, value: Double, options: NumberOptions): Double = js.native
  def number(name: String, value: Double, options: NumberOptions, groupId: String): Double = js.native
  def `object`[T](name: String, value: T): T = js.native
  def `object`[T](name: String, value: T, groupId: String): T = js.native
  def optionsKnob[T](label: String, values: StringDictionary[T]): js.Array[T] = js.native
  def optionsKnob[T](label: String, values: StringDictionary[T], defaultValue: T): T = js.native
  def optionsKnob[T](label: String, values: StringDictionary[T], defaultValue: T, options: OptionsKnobOptions): T = js.native
  def optionsKnob[T](label: String, values: StringDictionary[T], defaultValue: js.Array[T]): js.Array[T] = js.native
  def optionsKnob[T](label: String, values: StringDictionary[T], defaultValue: js.Array[T], options: OptionsKnobOptions): js.Array[T] = js.native
  @JSName("optionsKnob")
  def optionsKnob_T_T[T](label: String, values: StringDictionary[T]): T = js.native
  def radios[T](name: String, options: StringDictionary[T]): T = js.native
  def radios[T](name: String, options: StringDictionary[T], value: T): T = js.native
  def radios[T](name: String, options: StringDictionary[T], value: T, groupId: String): T = js.native
  def select[T /* <: Exclude[js.UndefOr[String | js.Array[String] | Double], js.UndefOr[scala.Nothing]] */](name: String, options: js.Array[T], value: T): T = js.native
  def select[T /* <: Exclude[js.UndefOr[String | js.Array[String] | Double], js.UndefOr[scala.Nothing]] */](name: String, options: js.Array[T], value: T, groupId: String): T = js.native
  def select[T](name: String, options: StringDictionary[T], value: T): T = js.native
  def select[T](name: String, options: StringDictionary[T], value: T, groupId: String): T = js.native
  def text(name: String): String = js.native
  def text(name: String, value: String): String = js.native
  def text(name: String, value: String, groupId: String): String = js.native
  def text(name: String, value: Null, groupId: String): String = js.native
  def withKnobs(storyFn: RenderFunction, context: StoryContext): ReactElement = js.native
  def withKnobsOptions(options: Anon_Debounce): js.Function2[/* storyFn */ RenderFunction, /* context */ StoryContext, ReactElement] = js.native
}

