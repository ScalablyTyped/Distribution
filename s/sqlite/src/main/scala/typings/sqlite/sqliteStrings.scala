package typings.sqlite

import typings.sqlite.interfacesMod.ISqlite.ConfigureOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqliteStrings {
  
  @scala.inline
  def busyTimeout: busyTimeout = "busyTimeout".asInstanceOf[busyTimeout]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait busyTimeout extends ConfigureOption
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait profile extends ConfigureOption
  
  @js.native
  sealed trait trace extends ConfigureOption
}
