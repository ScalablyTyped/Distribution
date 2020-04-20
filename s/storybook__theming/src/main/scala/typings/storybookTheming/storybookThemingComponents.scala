package typings.storybookTheming

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookThemingComponents extends storybookThemingProps {
  @scala.inline
  def CacheProvider: ComponentType[CacheProviderProps[EmotionCache]] = typings.storybookTheming.mod.CacheProvider.asInstanceOf[ComponentType[CacheProviderProps[EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[ClassNamesProps[Theme]] = typings.storybookTheming.mod.ClassNames.asInstanceOf[ComponentType[ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[GlobalProps[Theme]] = typings.storybookTheming.mod.Global.asInstanceOf[ComponentType[GlobalProps[Theme]]]
  @scala.inline
  def ThemeProvider[Theme]: ComponentType[ThemeProviderProps[Theme]] = typings.storybookTheming.mod.ThemeProvider.asInstanceOf[ComponentType[ThemeProviderProps[Theme]]]
}

