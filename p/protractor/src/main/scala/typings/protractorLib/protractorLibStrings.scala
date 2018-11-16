package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object protractorLibStrings {
  @js.native
  sealed trait DEBUG extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait INFO extends js.Object
  
  @js.native
  sealed trait WARN extends js.Object
  
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  def WARN: WARN = "WARN".asInstanceOf[WARN]
}

