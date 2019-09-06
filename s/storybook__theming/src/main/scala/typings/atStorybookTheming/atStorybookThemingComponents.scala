package typings.atStorybookTheming

import typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atStorybookThemingComponents extends atStorybookThemingProps {
  @scala.inline
  def CacheProvider: ComponentType[ProviderProps[EmotionCache]] = typings.atStorybookTheming.atStorybookThemingMod.^.CacheProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[typings.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme]] = typings.atStorybookTheming.atStorybookThemingMod.^.asInstanceOf[js.Dynamic].selectDynamic("ClassNames").asInstanceOf[typings.react.reactMod.ComponentType[typings.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[typings.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme]] = typings.atStorybookTheming.atStorybookThemingMod.^.asInstanceOf[js.Dynamic].selectDynamic("Global").asInstanceOf[typings.react.reactMod.ComponentType[typings.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme]]]
  @scala.inline
  def ThemeProvider[Theme]: ComponentType[typings.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps[Theme]] = typings.atStorybookTheming.atStorybookThemingMod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeProvider").asInstanceOf[typings.react.reactMod.ComponentType[typings.emotionDashTheming.emotionDashThemingMod.ThemeProviderProps[Theme]]]
  @scala.inline
  def `jsx<apply>`[P /* <: js.Object */]: ComponentType[String] = typings.atStorybookTheming.atStorybookThemingMod.jsx.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[java.lang.String]]
}

