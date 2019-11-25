package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`storybookjs/knobs`
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.knobs
import typings.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import typings.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobType
import typings.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnobOptions
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsKnobOptions
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeKnobSingleValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeOptionsProp
import typings.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeOptionsProp
import typings.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeOptionsProp
import typings.atStorybookAddonDashKnobs.distTypeDashDefsMod.Knob
import typings.std.Date
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs", JSImport.Namespace)
@js.native
object atStorybookAddonDashKnobsMod extends js.Object {
  val ADDON_ID: `storybookjs/knobs` = js.native
  val CHANGE: String = js.native
  val CLICK: String = js.native
  val PANEL_ID: String = js.native
  val PARAM_KEY: knobs = js.native
  val RESET: String = js.native
  val SET: String = js.native
  val SET_OPTIONS: String = js.native
  def array(name: String, value: ArrayTypeKnobValue): js.Array[String] = js.native
  def array(name: String, value: ArrayTypeKnobValue, separator: String): js.Array[String] = js.native
  def array(name: String, value: ArrayTypeKnobValue, separator: String, groupId: String): js.Array[String] = js.native
  def boolean(name: String, value: Boolean): Boolean = js.native
  def boolean(name: String, value: Boolean, groupId: String): Boolean = js.native
  def button(name: String, callback: ButtonTypeOnClickProp): js.UndefOr[scala.Nothing] = js.native
  def button(name: String, callback: ButtonTypeOnClickProp, groupId: String): js.UndefOr[scala.Nothing] = js.native
  def color(name: String, value: String): String = js.native
  def color(name: String, value: String, groupId: String): String = js.native
  def date(name: String): Double = js.native
  def date(name: String, value: Date): Double = js.native
  def date(name: String, value: Date, groupId: String): Double = js.native
  def files(name: String, accept: String): js.Array[String] = js.native
  def files(name: String, accept: String, value: js.Array[String]): js.Array[String] = js.native
  def files(name: String, accept: String, value: js.Array[String], groupId: String): js.Array[String] = js.native
  def knob[T /* <: KnobType */, V](name: String, options: Knob[T]): V = js.native
  def number(name: String, value: Double): Double = js.native
  def number(name: String, value: Double, options: NumberTypeKnobOptions): Double = js.native
  def number(name: String, value: Double, options: NumberTypeKnobOptions, groupId: String): Double = js.native
  def `object`[T](name: String, value: T): T = js.native
  def `object`[T](name: String, value: T, groupId: String): T = js.native
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions
  ): T = js.native
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions,
    groupId: String
  ): T = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[js.UndefOr[scala.Nothing]]): js.UndefOr[scala.Nothing] = js.native
  def radios(
    name: String,
    options: RadiosTypeOptionsProp[js.UndefOr[scala.Nothing]],
    value: js.UndefOr[scala.Nothing],
    groupId: String
  ): js.UndefOr[scala.Nothing] = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String): String = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String, groupId: String): String = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double): Double = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double, groupId: String): Double = js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Null], value: Null, groupId: String): Null = js.native
  @JSName("radios")
  def radios_Null(name: String, options: RadiosTypeOptionsProp[Null]): Null = js.native
  def select(name: String, options: SelectTypeOptionsProp[js.UndefOr[scala.Nothing]]): js.UndefOr[scala.Nothing] = js.native
  def select(
    name: String,
    options: SelectTypeOptionsProp[js.UndefOr[scala.Nothing]],
    value: js.UndefOr[scala.Nothing],
    groupId: String
  ): js.UndefOr[scala.Nothing] = js.native
  def select(name: String, options: SelectTypeOptionsProp[String], value: String): String = js.native
  def select(name: String, options: SelectTypeOptionsProp[String], value: String, groupId: String): String = js.native
  def select(name: String, options: SelectTypeOptionsProp[js.Array[PropertyKey]], value: js.Array[PropertyKey]): js.Array[PropertyKey] = js.native
  def select(
    name: String,
    options: SelectTypeOptionsProp[js.Array[PropertyKey]],
    value: js.Array[PropertyKey],
    groupId: String
  ): js.Array[PropertyKey] = js.native
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double): Double = js.native
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double, groupId: String): Double = js.native
  def select(name: String, options: SelectTypeOptionsProp[Null], value: Null, groupId: String): Null = js.native
  @JSName("select")
  def select_Null(name: String, options: SelectTypeOptionsProp[Null]): Null = js.native
  def text(name: String, value: String): String = js.native
  def text(name: String, value: String, groupId: String): String = js.native
  def withKnobs(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
}

