package typings.reactNativeWindowsCli

import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildArch
import typings.reactNativeWindowsCli.runWindowsOptionsMod.BuildConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeWindowsCliStrings {
  
  @js.native
  sealed trait ARM
    extends StObject
       with BuildArch
  @scala.inline
  def ARM: ARM = "ARM".asInstanceOf[ARM]
  
  @js.native
  sealed trait ARM64
    extends StObject
       with BuildArch
  @scala.inline
  def ARM64: ARM64 = "ARM64".asInstanceOf[ARM64]
  
  @js.native
  sealed trait Debug
    extends StObject
       with BuildConfig
  @scala.inline
  def Debug: Debug = "Debug".asInstanceOf[Debug]
  
  @js.native
  sealed trait DebugBundle
    extends StObject
       with BuildConfig
  @scala.inline
  def DebugBundle: DebugBundle = "DebugBundle".asInstanceOf[DebugBundle]
  
  @js.native
  sealed trait Release
    extends StObject
       with BuildConfig
  @scala.inline
  def Release: Release = "Release".asInstanceOf[Release]
  
  @js.native
  sealed trait ReleaseBundle
    extends StObject
       with BuildConfig
  @scala.inline
  def ReleaseBundle: ReleaseBundle = "ReleaseBundle".asInstanceOf[ReleaseBundle]
  
  @js.native
  sealed trait cpp extends StObject
  @scala.inline
  def cpp: cpp = "cpp".asInstanceOf[cpp]
  
  @js.native
  sealed trait cs extends StObject
  @scala.inline
  def cs: cs = "cs".asInstanceOf[cs]
  
  @js.native
  sealed trait x64
    extends StObject
       with BuildArch
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
  
  @js.native
  sealed trait x86
    extends StObject
       with BuildArch
  @scala.inline
  def x86: x86 = "x86".asInstanceOf[x86]
}
