package typings
package atStorybookThemingLib.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: reactLib.reactMod.Provider[atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache] = js.native
  val ThemeContext: reactLib.reactMod.Context[js.Object] = js.native
  val styled: atEmotionStyledLib.atEmotionStyledMod.CreateStyled[js.Any] = js.native
  def ClassNames[Theme](props: atEmotionCoreLib.atEmotionCoreMod.ClassNamesProps[Theme]): reactLib.reactMod.ReactElement[_] = js.native
  def Global[Theme](props: atEmotionCoreLib.atEmotionCoreMod.GlobalProps[Theme]): reactLib.reactMod.ReactElement[_] = js.native
  def ThemeProvider[Theme](props: emotionDashThemingLib.emotionDashThemingMod.ThemeProviderProps[Theme]): reactLib.reactMod.ReactElement[_] = js.native
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

