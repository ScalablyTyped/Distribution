package typings.reactNativeAppearance

import typings.reactNativeAppearance.appearanceTypesMod.ColorSchemeName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeAppearanceStrings {
  @js.native
  sealed trait dark extends ColorSchemeName
  
  @js.native
  sealed trait light extends ColorSchemeName
  
  @js.native
  sealed trait `no-preference` extends ColorSchemeName
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def `no-preference`: `no-preference` = "no-preference".asInstanceOf[`no-preference`]
}

