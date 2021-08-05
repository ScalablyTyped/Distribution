package typings.printer

import typings.printer.mod.JobStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printerStrings {
  
  @js.native
  sealed trait ABORTED
    extends StObject
       with JobStatus
  inline def ABORTED: ABORTED = "ABORTED".asInstanceOf[ABORTED]
  
  @js.native
  sealed trait AUTO extends StObject
  inline def AUTO: AUTO = "AUTO".asInstanceOf[AUTO]
  
  @js.native
  sealed trait CANCEL extends StObject
  inline def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with JobStatus
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait COMMAND extends StObject
  inline def COMMAND: COMMAND = "COMMAND".asInstanceOf[COMMAND]
  
  @js.native
  sealed trait JPEG extends StObject
  inline def JPEG: JPEG = "JPEG".asInstanceOf[JPEG]
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with JobStatus
  inline def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  
  @js.native
  sealed trait PDF extends StObject
  inline def PDF: PDF = "PDF".asInstanceOf[PDF]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with JobStatus
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait POSTSCRIPT extends StObject
  inline def POSTSCRIPT: POSTSCRIPT = "POSTSCRIPT".asInstanceOf[POSTSCRIPT]
  
  @js.native
  sealed trait PRINTED
    extends StObject
       with JobStatus
  inline def PRINTED: PRINTED = "PRINTED".asInstanceOf[PRINTED]
  
  @js.native
  sealed trait PRINTING
    extends StObject
       with JobStatus
  inline def PRINTING: PRINTING = "PRINTING".asInstanceOf[PRINTING]
  
  @js.native
  sealed trait RAW extends StObject
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait TEXT extends StObject
  inline def TEXT: TEXT = "TEXT".asInstanceOf[TEXT]
}
