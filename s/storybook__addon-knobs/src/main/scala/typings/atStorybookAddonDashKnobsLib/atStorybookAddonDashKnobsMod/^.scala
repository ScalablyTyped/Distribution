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
  def knob[T](name: java.lang.String, options: KnobOption[T]): T = js.native
  def number(name: java.lang.String, value: scala.Double): scala.Double = js.native
  def number(name: java.lang.String, value: scala.Double, options: EmptyNumberOptions): scala.Double = js.native
  def number(
    name: java.lang.String,
    value: scala.Double,
    options: EmptyNumberOptions,
    groupId: java.lang.String
  ): scala.Double = js.native
  def number(name: java.lang.String, value: scala.Double, options: NumberOptions): scala.Double = js.native
  def number(name: java.lang.String, value: scala.Double, options: NumberOptions, groupId: java.lang.String): scala.Double = js.native
  def `object`[T](name: java.lang.String, value: T): T = js.native
  def `object`[T](name: java.lang.String, value: T, groupId: java.lang.String): T = js.native
  def radios[T](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T]): T = js.native
  def radios[T](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T], value: T): T = js.native
  def radios[T](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  def select[T /* <: stdLib.Exclude[
    js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double], 
    js.UndefOr[scala.Nothing]
  ] */](name: java.lang.String, options: js.Array[T], value: T): T = js.native
  def select[T /* <: stdLib.Exclude[
    js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Double], 
    js.UndefOr[scala.Nothing]
  ] */](name: java.lang.String, options: js.Array[T], value: T, groupId: java.lang.String): T = js.native
  def select[T](name: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[T], value: T): T = js.native
  def select[T](
    name: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[T],
    value: T,
    groupId: java.lang.String
  ): T = js.native
  def text(name: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: java.lang.String, groupId: java.lang.String): java.lang.String = js.native
  def text(name: java.lang.String, value: scala.Null, groupId: java.lang.String): java.lang.String = js.native
  def withKnobs(storyFn: atStorybookReactLib.atStorybookReactMod.RenderFunction, context: StoryContext): reactLib.reactMod.ReactNs.ReactElement[WrapStoryProps] = js.native
  def withKnobsOptions(options: atStorybookAddonDashKnobsLib.Anon_Debounce): js.Function2[
    /* storyFn */ atStorybookReactLib.atStorybookReactMod.RenderFunction, 
    /* context */ StoryContext, 
    reactLib.reactMod.ReactNs.ReactElement[WrapStoryProps]
  ] = js.native
}

