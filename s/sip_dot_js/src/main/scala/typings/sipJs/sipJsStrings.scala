package typings.sipJs

import typings.sipJs.libApiUserAgentOptionsMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipJsStrings {
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait `class` extends StObject
  inline def `class`: `class` = "class".asInstanceOf[`class`]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait literal extends StObject
  inline def literal: literal = "literal".asInstanceOf[literal]
  
  @js.native
  sealed trait log
    extends StObject
       with LogLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait other extends StObject
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
}
