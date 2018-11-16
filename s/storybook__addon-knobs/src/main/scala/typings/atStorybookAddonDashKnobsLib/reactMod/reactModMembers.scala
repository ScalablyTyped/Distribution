package typings
package atStorybookAddonDashKnobsLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/react", JSImport.Namespace)
@js.native
object reactModMembers extends js.Object {
  def array[T](name: java.lang.String, value: js.Array[T]): js.Array[T] = js.native
  def array[T](name: java.lang.String, value: js.Array[T], separator: java.lang.String): js.Array[T] = js.native
  def array[T](name: java.lang.String, value: js.Array[T], separator: java.lang.String, groupId: java.lang.String): js.Array[T] = js.native
  def boolean(name: java.lang.String, value: scala.Boolean): scala.Boolean = js.native
  def boolean(name: java.lang.String, value: scala.Boolean, groupId: java.lang.String): scala.Boolean = js.native
  def button(name: java.lang.String, handler: js.Function0[_]): scala.Unit = js.native
  def button(name: java.lang.String, handler: js.Function0[_], groupId: java.lang.String): scala.Unit = js.native
  def color(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def color(name: java.lang.String, value: java.lang.String, groupId: java.lang.String): java.lang.String = js.native
  def date(name: java.lang.String): stdLib.Date = js.native
  def date(name: java.lang.String, value: stdLib.Date): stdLib.Date = js.native
  def date(name: java.lang.String, value: stdLib.Date, groupId: java.lang.String): stdLib.Date = js.native
  def files(label: java.lang.String, accept: java.lang.String, defaultValue: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def knob[T](name: java.lang.String, options: atStorybookAddonDashKnobsLib.addonDashKnobsMod.KnobOption[T]): T = js.native
  def number(name: java.lang.String, value: scala.Double): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.addonDashKnobsMod.EmptyNumberOptions
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.addonDashKnobsMod.EmptyNumberOptions,
    groupId: java.lang.String
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.addonDashKnobsMod.NumberOptions
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.addonDashKnobsMod.NumberOptions,
    groupId: java.lang.String
  ): scala.Double = js.native
  def `object`[T](name: java.lang.String, value: T): T = js.native
  def `object`[T](name: java.lang.String, value: T, groupId: java.lang.String): T = js.native
  def select[T /* <: scala.Double */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.NumberDictionary[java.lang.String],
    value: T
  ): T = js.native
  def select[T /* <: scala.Double */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.NumberDictionary[java.lang.String],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  def select[T /* <: java.lang.String */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    value: T
  ): T = js.native
  def select[T /* <: java.lang.String */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.addonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T): T = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.addonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T, groupId: java.lang.String): T = js.native
  def selectV2[T /* <: java.lang.String | scala.Double */](name: java.lang.String, options: ScalablyTyped.runtime.StringDictionary[T | js.Array[T]], value: T): T = js.native
  def selectV2[T /* <: java.lang.String | scala.Double */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.StringDictionary[T | js.Array[T]],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  def selectV2[T /* <: java.lang.String | scala.Double */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.StringDictionary[T | js.Array[T]],
    value: js.Array[T]
  ): T = js.native
  def selectV2[T /* <: java.lang.String | scala.Double */](
    name: java.lang.String,
    options: ScalablyTyped.runtime.StringDictionary[T | js.Array[T]],
    value: js.Array[T],
    groupId: java.lang.String
  ): T = js.native
  def selectV2[T /* <: atStorybookAddonDashKnobsLib.addonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T): T = js.native
  def selectV2[T /* <: atStorybookAddonDashKnobsLib.addonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T, groupId: java.lang.String): T = js.native
  def text(name: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String, groupId: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: scala.Null, groupId: java.lang.String): java.lang.String = js.native
  def withKnobs(
    storyFn: atStorybookReactLib.reactMod.RenderFunction,
    context: atStorybookAddonDashKnobsLib.addonDashKnobsMod.StoryContext
  ): reactLib.reactMod.ReactNs.ReactElement[atStorybookAddonDashKnobsLib.addonDashKnobsMod.WrapStoryProps] = js.native
  def withKnobsOptions(options: atStorybookAddonDashKnobsLib.Anon_Timestamps): js.Function2[
    /* storyFn */ atStorybookReactLib.reactMod.RenderFunction, 
    /* context */ atStorybookAddonDashKnobsLib.addonDashKnobsMod.StoryContext, 
    reactLib.reactMod.ReactNs.ReactElement[atStorybookAddonDashKnobsLib.addonDashKnobsMod.WrapStoryProps]
  ] = js.native
}

