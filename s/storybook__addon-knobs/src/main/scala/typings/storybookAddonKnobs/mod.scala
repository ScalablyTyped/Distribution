package typings.storybookAddonKnobs

import typings.std.Date
import typings.std.PropertyKey
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typings.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typings.storybookAddonKnobs.numberMod.NumberTypeKnobOptions
import typings.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue
import typings.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue
import typings.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import typings.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import typings.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typings.storybookAddonKnobs.typeDefsMod.Knob
import typings.storybookAddonKnobs.typesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-knobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-knobs", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs", "CHANGE")
  @js.native
  val CHANGE: String = js.native
  
  @JSImport("@storybook/addon-knobs", "CLICK")
  @js.native
  val CLICK: String = js.native
  
  @JSImport("@storybook/addon-knobs", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-knobs", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs", "RESET")
  @js.native
  val RESET: String = js.native
  
  @JSImport("@storybook/addon-knobs", "SET")
  @js.native
  val SET: String = js.native
  
  @JSImport("@storybook/addon-knobs", "SET_OPTIONS")
  @js.native
  val SET_OPTIONS: String = js.native
  
  @scala.inline
  def array(name: String, value: ArrayTypeKnobValue): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def array(name: String, value: ArrayTypeKnobValue, separator: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def array(name: String, value: ArrayTypeKnobValue, separator: String, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def array(name: String, value: ArrayTypeKnobValue, separator: Unit, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def boolean(name: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def boolean(name: String, value: Boolean, groupId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def button(name: String, callback: ButtonTypeOnClickProp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("button")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def button(name: String, callback: ButtonTypeOnClickProp, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("button")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def color(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def color(name: String, value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def date(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def date(name: String, value: Unit, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def date(name: String, value: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def date(name: String, value: Date, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def files(name: String, accept: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def files(name: String, accept: String, value: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def files(name: String, accept: String, value: js.Array[String], groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def files(name: String, accept: String, value: Unit, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def knob[T /* <: KnobType */, V](name: String, options: Knob[T]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("knob")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[V]
  
  @scala.inline
  def number(name: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def number(name: String, value: Double, options: Unit, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def number(name: String, value: Double, options: NumberTypeKnobOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def number(name: String, value: Double, options: NumberTypeKnobOptions, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def `object`[T](name: String, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def `object`[T](name: String, value: T, groupId: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsKnob")(name.asInstanceOf[js.Any], valuesObj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optionsObj.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions,
    groupId: String
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsKnob")(name.asInstanceOf[js.Any], valuesObj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optionsObj.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[Null]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[Null], value: Null, groupId: String): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Null]
  @scala.inline
  def radios(name: String, options: RadiosTypeOptionsProp[Unit], value: Unit, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def radios_Unit(name: String, options: RadiosTypeOptionsProp[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Null]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[String], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[String], value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[js.Array[PropertyKey]], value: js.Array[PropertyKey]): js.Array[PropertyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertyKey]]
  @scala.inline
  def select(
    name: String,
    options: SelectTypeOptionsProp[js.Array[PropertyKey]],
    value: js.Array[PropertyKey],
    groupId: String
  ): js.Array[PropertyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertyKey]]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean, groupId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Null], value: Null, groupId: String): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Null]
  @scala.inline
  def select(name: String, options: SelectTypeOptionsProp[Unit], value: Unit, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def select_Unit(name: String, options: SelectTypeOptionsProp[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def text(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def text(name: String, value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def withKnobs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withKnobs")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
