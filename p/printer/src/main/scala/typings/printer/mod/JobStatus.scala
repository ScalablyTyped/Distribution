package typings.printer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.printer.printerStrings.PAUSED
  - typings.printer.printerStrings.PRINTING
  - typings.printer.printerStrings.PRINTED
  - typings.printer.printerStrings.CANCELLED
  - typings.printer.printerStrings.PENDING
  - typings.printer.printerStrings.ABORTED
*/
trait JobStatus extends js.Object
object JobStatus {
  
  @scala.inline
  def ABORTED: typings.printer.printerStrings.ABORTED = "ABORTED".asInstanceOf[typings.printer.printerStrings.ABORTED]
  
  @scala.inline
  def CANCELLED: typings.printer.printerStrings.CANCELLED = "CANCELLED".asInstanceOf[typings.printer.printerStrings.CANCELLED]
  
  @scala.inline
  def PAUSED: typings.printer.printerStrings.PAUSED = "PAUSED".asInstanceOf[typings.printer.printerStrings.PAUSED]
  
  @scala.inline
  def PENDING: typings.printer.printerStrings.PENDING = "PENDING".asInstanceOf[typings.printer.printerStrings.PENDING]
  
  @scala.inline
  def PRINTED: typings.printer.printerStrings.PRINTED = "PRINTED".asInstanceOf[typings.printer.printerStrings.PRINTED]
  
  @scala.inline
  def PRINTING: typings.printer.printerStrings.PRINTING = "PRINTING".asInstanceOf[typings.printer.printerStrings.PRINTING]
}
