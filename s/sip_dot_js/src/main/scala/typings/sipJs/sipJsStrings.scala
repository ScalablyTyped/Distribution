package typings.sipJs

import typings.sipJs.userAgentOptionsMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sipJsStrings {
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait `class` extends js.Object
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait literal extends js.Object
  
  @js.native
  sealed trait log extends LogLevel
  
  @js.native
  sealed trait other extends js.Object
  
  @js.native
  sealed trait warn extends LogLevel
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def literal: literal = "literal".asInstanceOf[literal]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

