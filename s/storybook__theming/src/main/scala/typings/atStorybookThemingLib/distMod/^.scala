package typings
package atStorybookThemingLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: reactLib.reactMod.ReactNs.Provider[atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache] = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[js.Object] = js.native
  val background: atStorybookThemingLib.Anon_App = js.native
  val color: atStorybookThemingLib.Anon_Ancillary = js.native
  val jsx: atEmotionCoreLib.Anon_A = js.native
  val styled: atEmotionStyledLib.atEmotionStyledMod.CreateStyled[js.Any] = js.native
  val themes: atStorybookThemingLib.Anon_Dark = js.native
  val typography: atStorybookThemingLib.Anon_Fonts = js.native
  def ClassNames[Theme](props: atEmotionCoreLib.atEmotionCoreMod.ClassNamesProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def Global[Theme](props: atEmotionCoreLib.atEmotionCoreMod.GlobalProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def ThemeProvider[Theme](props: emotionDashThemingLib.emotionDashThemingMod.ThemeProviderProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def convert(): atStorybookThemingLib.distBaseMod.Theme = js.native
  def convert(inherit: atStorybookThemingLib.distBaseMod.ThemeVars): atStorybookThemingLib.distBaseMod.Theme = js.native
  def create(): atStorybookThemingLib.distBaseMod.ThemeVars = js.native
  def create(vars: atStorybookThemingLib.distBaseMod.ThemeVars): atStorybookThemingLib.distBaseMod.ThemeVars = js.native
  def create(vars: atStorybookThemingLib.distBaseMod.ThemeVars, rest: atStorybookThemingLib.distCreateMod.Rest): atStorybookThemingLib.distBaseMod.ThemeVars = js.native
  def createGlobal(hasColorBackgroundTypography: atStorybookThemingLib.Anon_BackgroundColor): atStorybookThemingLib.distGlobalMod.Return = js.native
  def createReset(hasTypography: atStorybookThemingLib.Anon_Typography): atStorybookThemingLib.distGlobalMod.Return = js.native
  def css(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def css(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def ensure(input: atStorybookThemingLib.distBaseMod.ThemeVars): atStorybookThemingLib.distBaseMod.Theme = js.native
  def keyframes(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def keyframes(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[
      /* props */ Props, 
      /* context */ atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache, 
      /* ref */ reactLib.reactMod.ReactNs.Ref[RefType], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): reactLib.reactMod.ReactNs.SFC[Props with reactLib.reactMod.ReactNs.ClassAttributes[RefType]] = js.native
  def withTheme[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](component: C): reactLib.reactMod.ReactNs.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      atStorybookThemingLib.atStorybookThemingLibStrings.theme
    ]
  ] = js.native
}

