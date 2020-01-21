package typings.storybookTheming

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookThemingComponents extends storybookThemingProps {
  @scala.inline
  def CacheProvider: ComponentType[CacheProviderProps[EmotionCache]] = typings.storybookTheming.mod.CacheProvider.asInstanceOf[typings.react.mod.ComponentType[CacheProviderProps[typings.emotionUtils.mod.EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[ClassNamesProps[Theme]] = typings.storybookTheming.mod.ClassNames.asInstanceOf[typings.react.mod.ComponentType[ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[GlobalProps[Theme]] = typings.storybookTheming.mod.Global.asInstanceOf[typings.react.mod.ComponentType[GlobalProps[Theme]]]
  @scala.inline
  def ThemeProvider[Theme]: ComponentType[ThemeProviderProps[Theme]] = typings.storybookTheming.mod.ThemeProvider.asInstanceOf[typings.react.mod.ComponentType[ThemeProviderProps[Theme]]]
}

