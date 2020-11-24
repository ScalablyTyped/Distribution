package typings.sentryUtils

import typings.sentryUtils.instrumentMod.InstrumentHandlerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryUtilsStrings {
  
  @scala.inline
  def console: console = "console".asInstanceOf[console]
  
  @scala.inline
  def dom: dom = "dom".asInstanceOf[dom]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  
  @scala.inline
  def sentry: sentry = "sentry".asInstanceOf[sentry]
  
  @scala.inline
  def unhandledrejection: unhandledrejection = "unhandledrejection".asInstanceOf[unhandledrejection]
  
  @scala.inline
  def xhr: xhr = "xhr".asInstanceOf[xhr]
  
  @js.native
  sealed trait console extends InstrumentHandlerType
  
  @js.native
  sealed trait dom extends InstrumentHandlerType
  
  @js.native
  sealed trait error extends InstrumentHandlerType
  
  @js.native
  sealed trait fetch extends InstrumentHandlerType
  
  @js.native
  sealed trait history extends InstrumentHandlerType
  
  @js.native
  sealed trait sentry extends InstrumentHandlerType
  
  @js.native
  sealed trait unhandledrejection extends InstrumentHandlerType
  
  @js.native
  sealed trait xhr extends InstrumentHandlerType
}
