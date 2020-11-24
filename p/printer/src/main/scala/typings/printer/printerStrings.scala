package typings.printer

import typings.printer.mod.JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printerStrings {
  
  @scala.inline
  def ABORTED: ABORTED = "ABORTED".asInstanceOf[ABORTED]
  
  @scala.inline
  def AUTO: AUTO = "AUTO".asInstanceOf[AUTO]
  
  @scala.inline
  def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  
  @scala.inline
  def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @scala.inline
  def COMMAND: COMMAND = "COMMAND".asInstanceOf[COMMAND]
  
  @scala.inline
  def JPEG: JPEG = "JPEG".asInstanceOf[JPEG]
  
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @scala.inline
  def PDF: PDF = "PDF".asInstanceOf[PDF]
  
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @scala.inline
  def POSTSCRIPT: POSTSCRIPT = "POSTSCRIPT".asInstanceOf[POSTSCRIPT]
  
  @scala.inline
  def PRINTED: PRINTED = "PRINTED".asInstanceOf[PRINTED]
  
  @scala.inline
  def PRINTING: PRINTING = "PRINTING".asInstanceOf[PRINTING]
  
  @scala.inline
  def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @scala.inline
  def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
  
  @js.native
  sealed trait ABORTED extends JobStatus
  
  @js.native
  sealed trait AUTO extends js.Object
  
  @js.native
  sealed trait CANCEL extends js.Object
  
  @js.native
  sealed trait CANCELLED extends JobStatus
  
  @js.native
  sealed trait COMMAND extends js.Object
  
  @js.native
  sealed trait JPEG extends js.Object
  
  @js.native
  sealed trait PAUSED extends JobStatus
  
  @js.native
  sealed trait PDF extends js.Object
  
  @js.native
  sealed trait PENDING extends JobStatus
  
  @js.native
  sealed trait POSTSCRIPT extends js.Object
  
  @js.native
  sealed trait PRINTED extends JobStatus
  
  @js.native
  sealed trait PRINTING extends JobStatus
  
  @js.native
  sealed trait RAW extends js.Object
  
  @js.native
  sealed trait TEXT extends js.Object
}
