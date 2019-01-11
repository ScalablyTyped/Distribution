package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def knob[T](
    name: java.lang.String,
    options: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.KnobOption[T]
  ): T = js.native
  def number(name: java.lang.String, value: scala.Double): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.EmptyNumberOptions
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.EmptyNumberOptions,
    groupId: java.lang.String
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.NumberOptions
  ): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.NumberOptions,
    groupId: java.lang.String
  ): scala.Double = js.native
  def `object`[T](name: java.lang.String, value: T): T = js.native
  def `object`[T](name: java.lang.String, value: T, groupId: java.lang.String): T = js.native
  def radios[T](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T]): java.lang.String = js.native
  def radios[T](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T], value: T): java.lang.String = js.native
  def radios[T](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T],
    value: T,
    groupId: java.lang.String
  ): java.lang.String = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T): T = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](name: java.lang.String, options: js.Array[T], value: T, groupId: java.lang.String): T = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T | js.Array[T]],
    value: T
  ): T | js.Array[T] = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T | js.Array[T]],
    value: T,
    groupId: java.lang.String
  ): T | js.Array[T] = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T | js.Array[T]],
    value: js.Array[T]
  ): T | js.Array[T] = js.native
  def select[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T | js.Array[T]],
    value: js.Array[T],
    groupId: java.lang.String
  ): T | js.Array[T] = js.native
  @JSName("select")
  def select_TSelectValueArray[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Array[T]],
    value: js.Array[T]
  ): js.Array[T] = js.native
  @JSName("select")
  def select_TSelectValueArray[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Array[T]],
    value: js.Array[T],
    groupId: java.lang.String
  ): js.Array[T] = js.native
  @JSName("select")
  def select_TSelectValueT[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T], value: T): T = js.native
  @JSName("select")
  def select_TSelectValueT[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  @JSName("select")
  def select_TSelectValueT[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T], value: js.Array[T]): T = js.native
  @JSName("select")
  def select_TSelectValueT[T /* <: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.SelectValue */](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T],
    value: js.Array[T],
    groupId: java.lang.String
  ): T = js.native
  def text(name: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String, groupId: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: scala.Null, groupId: java.lang.String): java.lang.String = js.native
  def withKnobs(
    storyFn: atStorybookReactLib.atStorybookReactMod.RenderFunction,
    context: atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.StoryContext
  ): reactLib.reactMod.ReactNs.ReactElement[atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.WrapStoryProps] = js.native
  def withKnobsOptions(options: atStorybookAddonDashKnobsLib.Anon_Debounce): js.Function2[
    /* storyFn */ atStorybookReactLib.atStorybookReactMod.RenderFunction, 
    /* context */ atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.StoryContext, 
    reactLib.reactMod.ReactNs.ReactElement[atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod.WrapStoryProps]
  ] = js.native
}

