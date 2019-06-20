package typings
package atStorybookThemingLib.atStorybookThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: reactLib.reactMod.Provider[atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache] = js.native
  val ThemeContext: reactLib.reactMod.Context[js.Object] = js.native
  val styled: atEmotionStyledLib.atEmotionStyledMod.CreateStyled[atStorybookThemingLib.distTypesMod.Theme] = js.native
  def ClassNames[Theme](props: atEmotionCoreLib.atEmotionCoreMod.ClassNamesProps[Theme]): reactLib.reactMod.ReactElement = js.native
  def Global[Theme](props: atEmotionCoreLib.atEmotionCoreMod.GlobalProps[Theme]): reactLib.reactMod.ReactElement = js.native
  def ThemeProvider[Theme](props: emotionDashThemingLib.emotionDashThemingMod.ThemeProviderProps[Theme]): reactLib.reactMod.ReactElement = js.native
  def convert(): atStorybookThemingLib.distTypesMod.Theme = js.native
  def convert(inherit: atStorybookThemingLib.distTypesMod.ThemeVars): atStorybookThemingLib.distTypesMod.Theme = js.native
  def create(): atStorybookThemingLib.distTypesMod.ThemeVars = js.native
  def create(vars: atStorybookThemingLib.distTypesMod.ThemeVars): atStorybookThemingLib.distTypesMod.ThemeVars = js.native
  def create(vars: atStorybookThemingLib.distTypesMod.ThemeVars, rest: atStorybookThemingLib.distCreateMod.Rest): atStorybookThemingLib.distTypesMod.ThemeVars = js.native
  def createGlobal(hasColorBackgroundTypography: atStorybookThemingLib.Anon_Background): atStorybookThemingLib.distGlobalMod.Return = js.native
  def createReset(hasTypography: atStorybookThemingLib.Anon_Typography): atStorybookThemingLib.distGlobalMod.Return = js.native
  def css(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def css(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def ensure(input: atStorybookThemingLib.distTypesMod.ThemeVars): atStorybookThemingLib.distTypesMod.Theme = js.native
  def keyframes(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def keyframes(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[
      /* props */ Props, 
      /* context */ atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache, 
      /* ref */ reactLib.reactMod.Ref[RefType], 
      reactLib.reactMod.ReactNode
    ]
  ): reactLib.reactMod.SFC[Props with reactLib.reactMod.ClassAttributes[RefType]] = js.native
  def withTheme[C /* <: reactLib.reactMod.ComponentType[_] */](component: C): reactLib.reactMod.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      atStorybookThemingLib.atStorybookThemingLibStrings.theme
    ]
  ] = js.native
}

