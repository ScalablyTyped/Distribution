package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.ieMod.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object seleniumDashWebdriverStrings {
  @js.native
  sealed trait DEBUG extends Level
  
  @js.native
  sealed trait ERROR extends Level
  
  @js.native
  sealed trait FATAL extends Level
  
  @js.native
  sealed trait INFO extends Level
  
  @js.native
  sealed trait TRACE extends Level
  
  @js.native
  sealed trait WARN extends Level
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def FATAL: FATAL = "FATAL".asInstanceOf[FATAL]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
}

