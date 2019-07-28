package typings.protractor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object protractorStrings {
  @js.native
  sealed trait DEBUG extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait INFO extends js.Object
  
  @js.native
  sealed trait WARN extends js.Object
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
}

