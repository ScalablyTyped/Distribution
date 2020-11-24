package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildArch
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeWindowsCliStrings {
  
  @scala.inline
  def ARM: ARM = "ARM".asInstanceOf[ARM]
  
  @scala.inline
  def ARM64: ARM64 = "ARM64".asInstanceOf[ARM64]
  
  @scala.inline
  def Debug: Debug = "Debug".asInstanceOf[Debug]
  
  @scala.inline
  def DebugBundle: DebugBundle = "DebugBundle".asInstanceOf[DebugBundle]
  
  @scala.inline
  def Release: Release = "Release".asInstanceOf[Release]
  
  @scala.inline
  def ReleaseBundle: ReleaseBundle = "ReleaseBundle".asInstanceOf[ReleaseBundle]
  
  @scala.inline
  def cpp: cpp = "cpp".asInstanceOf[cpp]
  
  @scala.inline
  def cs: cs = "cs".asInstanceOf[cs]
  
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
  
  @scala.inline
  def x86: x86 = "x86".asInstanceOf[x86]
  
  @js.native
  sealed trait ARM extends BuildArch
  
  @js.native
  sealed trait ARM64 extends BuildArch
  
  @js.native
  sealed trait Debug extends BuildConfig
  
  @js.native
  sealed trait DebugBundle extends BuildConfig
  
  @js.native
  sealed trait Release extends BuildConfig
  
  @js.native
  sealed trait ReleaseBundle extends BuildConfig
  
  @js.native
  sealed trait cpp extends js.Object
  
  @js.native
  sealed trait cs extends js.Object
  
  @js.native
  sealed trait x64 extends BuildArch
  
  @js.native
  sealed trait x86 extends BuildArch
}
