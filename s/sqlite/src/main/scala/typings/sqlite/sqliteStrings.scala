package typings.sqlite

import typings.sqlite.interfacesMod.ISqlite.ConfigureOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteStrings {
  
  @js.native
  sealed trait busyTimeout extends ConfigureOption
  @scala.inline
  def busyTimeout: busyTimeout = "busyTimeout".asInstanceOf[busyTimeout]
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait open extends StObject
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait profile extends ConfigureOption
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait trace extends ConfigureOption
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
}
