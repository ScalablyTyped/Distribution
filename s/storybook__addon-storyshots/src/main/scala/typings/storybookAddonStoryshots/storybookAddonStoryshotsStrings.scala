package typings.storybookAddonStoryshots

import typings.storybookAddonStoryshots.supportedFrameworkMod.SupportedFramework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonStoryshotsStrings {
  @js.native
  sealed trait DIR extends js.Object
  
  @js.native
  sealed trait FILE extends js.Object
  
  @js.native
  sealed trait angular extends SupportedFramework
  
  @js.native
  sealed trait html extends SupportedFramework
  
  @js.native
  sealed trait preact extends SupportedFramework
  
  @js.native
  sealed trait react extends SupportedFramework
  
  @js.native
  sealed trait `react-native` extends SupportedFramework
  
  @js.native
  sealed trait riot extends SupportedFramework
  
  @js.native
  sealed trait svelte extends SupportedFramework
  
  @js.native
  sealed trait vue extends SupportedFramework
  
  @scala.inline
  def DIR: DIR = "DIR".asInstanceOf[DIR]
  @scala.inline
  def FILE: FILE = "FILE".asInstanceOf[FILE]
  @scala.inline
  def angular: angular = "angular".asInstanceOf[angular]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def preact: preact = "preact".asInstanceOf[preact]
  @scala.inline
  def react: react = "react".asInstanceOf[react]
  @scala.inline
  def `react-native`: `react-native` = "react-native".asInstanceOf[`react-native`]
  @scala.inline
  def riot: riot = "riot".asInstanceOf[riot]
  @scala.inline
  def svelte: svelte = "svelte".asInstanceOf[svelte]
  @scala.inline
  def vue: vue = "vue".asInstanceOf[vue]
}

