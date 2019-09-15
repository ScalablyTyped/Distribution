package typings.atStorybookTheming.atStorybookThemingMod

import typings.atEmotionCore.atEmotionCoreMod.ClassNamesProps
import typings.atEmotionCore.atEmotionCoreMod.GlobalProps
import typings.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
import typings.atEmotionStyled.atEmotionStyledMod.CreateStyled
import typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import typings.atStorybookTheming.Anon_Background
import typings.atStorybookTheming.Anon_Typography
import typings.atStorybookTheming.atStorybookThemingStrings.theme
import typings.atStorybookTheming.distCreateMod.Rest
import typings.atStorybookTheming.distGlobalMod.Return
import typings.atStorybookTheming.distTypesMod.Theme
import typings.atStorybookTheming.distTypesMod.ThemeVars
import typings.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps
import typings.emotionDashTheming.typesHelperMod.AddOptionalTo
import typings.emotionDashTheming.typesHelperMod.PropsOf
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.Provider
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.SFC
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: Provider[EmotionCache] = js.native
  val ThemeContext: Context[js.Object] = js.native
  val styled: CreateStyled[Theme] = js.native
  def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = js.native
  def Global[Theme](props: GlobalProps[Theme]): ReactElement = js.native
  def ThemeProvider[Theme](props: ThemeProviderProps[Theme]): ReactElement = js.native
  def convert(): Theme = js.native
  def convert(inherit: ThemeVars): Theme = js.native
  def create(): ThemeVars = js.native
  def create(vars: ThemeVars): ThemeVars = js.native
  def create(vars: ThemeVars, rest: Rest): ThemeVars = js.native
  def createGlobal(hasColorBackgroundTypography: Anon_Background): Return = js.native
  def createReset(hasTypography: Anon_Typography): Return = js.native
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  def darken(color: String): String = js.native
  def ensure(input: ThemeVars): Theme = js.native
  def keyframes(args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  def keyframes(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  def lighten(color: String): String = js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props with ClassAttributes[RefType]] = js.native
  def withTheme[C /* <: ComponentType[_] */](component: C): SFC[AddOptionalTo[PropsOf[C], theme]] = js.native
}

