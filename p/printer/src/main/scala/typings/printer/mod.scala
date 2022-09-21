package typings.printer

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.printer.printerStrings.AUTO
import typings.printer.printerStrings.CANCEL
import typings.printer.printerStrings.COMMAND
import typings.printer.printerStrings.JPEG
import typings.printer.printerStrings.PDF
import typings.printer.printerStrings.POSTSCRIPT
import typings.printer.printerStrings.RAW
import typings.printer.printerStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("printer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultPrinterName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultPrinterName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getJob(printerName: String, jobId: Double): JobDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("getJob")(printerName.asInstanceOf[js.Any], jobId.asInstanceOf[js.Any])).asInstanceOf[JobDetails]
  
  inline def getPrinter(printerName: String): PrinterDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinter")(printerName.asInstanceOf[js.Any]).asInstanceOf[PrinterDetails]
  
  inline def getPrinterDriverOptions(printerName: String): PrinterDriverOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinterDriverOptions")(printerName.asInstanceOf[js.Any]).asInstanceOf[PrinterDriverOptions]
  
  inline def getPrinters(): js.Array[PrinterDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinters")().asInstanceOf[js.Array[PrinterDetails]]
  
  inline def getSelectedPaperSize(printerName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedPaperSize")(printerName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSupportedJobCommands(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedJobCommands")().asInstanceOf[js.Array[String]]
  
  inline def getSupportedPrintFormats(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedPrintFormats")().asInstanceOf[js.Array[String]]
  
  inline def printDirect(options: PrintDirectOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printDirect")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printFile(options: PrintFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setJob(printerName: String, jobId: Double, command: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setJob")(printerName.asInstanceOf[js.Any], jobId.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setJob_CANCEL(printerName: String, jobId: Double, command: CANCEL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setJob")(printerName.asInstanceOf[js.Any], jobId.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JobDetails extends StObject {
    
    var completedTime: js.Date
    
    var creationTime: js.Date
    
    var format: String
    
    var id: Double
    
    var name: String
    
    var printerName: String
    
    var priority: Double
    
    var processingTime: js.Date
    
    var size: Double
    
    var status: js.Array[JobStatus]
    
    var user: String
  }
  object JobDetails {
    
    inline def apply(
      completedTime: js.Date,
      creationTime: js.Date,
      format: String,
      id: Double,
      name: String,
      printerName: String,
      priority: Double,
      processingTime: js.Date,
      size: Double,
      status: js.Array[JobStatus],
      user: String
    ): JobDetails = {
      val __obj = js.Dynamic.literal(completedTime = completedTime.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processingTime = processingTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobDetails]
    }
    
    extension [Self <: JobDetails](x: Self) {
      
      inline def setCompletedTime(value: js.Date): Self = StObject.set(x, "completedTime", value.asInstanceOf[js.Any])
      
      inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setProcessingTime(value: js.Date): Self = StObject.set(x, "processingTime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: js.Array[JobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusVarargs(value: JobStatus*): Self = StObject.set(x, "status", js.Array(value*))
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.printer.printerStrings.PAUSED
    - typings.printer.printerStrings.PRINTING
    - typings.printer.printerStrings.PRINTED
    - typings.printer.printerStrings.CANCELLED
    - typings.printer.printerStrings.PENDING
    - typings.printer.printerStrings.ABORTED
  */
  trait JobStatus extends StObject
  object JobStatus {
    
    inline def ABORTED: typings.printer.printerStrings.ABORTED = "ABORTED".asInstanceOf[typings.printer.printerStrings.ABORTED]
    
    inline def CANCELLED: typings.printer.printerStrings.CANCELLED = "CANCELLED".asInstanceOf[typings.printer.printerStrings.CANCELLED]
    
    inline def PAUSED: typings.printer.printerStrings.PAUSED = "PAUSED".asInstanceOf[typings.printer.printerStrings.PAUSED]
    
    inline def PENDING: typings.printer.printerStrings.PENDING = "PENDING".asInstanceOf[typings.printer.printerStrings.PENDING]
    
    inline def PRINTED: typings.printer.printerStrings.PRINTED = "PRINTED".asInstanceOf[typings.printer.printerStrings.PRINTED]
    
    inline def PRINTING: typings.printer.printerStrings.PRINTING = "PRINTING".asInstanceOf[typings.printer.printerStrings.PRINTING]
  }
  
  trait PrintDirectOptions extends StObject {
    
    var data: String | Buffer
    
    var error: js.UndefOr[PrintOnErrorFunction] = js.undefined
    
    var options: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var printer: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[PrintOnSuccessFunction] = js.undefined
    
    var `type`: js.UndefOr[RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO] = js.undefined
  }
  object PrintDirectOptions {
    
    inline def apply(data: String | Buffer): PrintDirectOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintDirectOptions]
    }
    
    extension [Self <: PrintDirectOptions](x: Self) {
      
      inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: /* err */ js.Error => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
      
      inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      inline def setSuccess(value: /* jobId */ String => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setType(value: RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PrintFileOptions extends StObject {
    
    var error: js.UndefOr[PrintOnErrorFunction] = js.undefined
    
    var filename: String
    
    var printer: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[PrintOnSuccessFunction] = js.undefined
  }
  object PrintFileOptions {
    
    inline def apply(filename: String): PrintFileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintFileOptions]
    }
    
    extension [Self <: PrintFileOptions](x: Self) {
      
      inline def setError(value: /* err */ js.Error => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
      
      inline def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      inline def setSuccess(value: /* jobId */ String => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  type PrintOnErrorFunction = js.Function1[/* err */ js.Error, Any]
  
  type PrintOnSuccessFunction = js.Function1[/* jobId */ String, Any]
  
  trait PrinterDetails extends StObject {
    
    var isDefault: Boolean
    
    var name: String
    
    var options: StringDictionary[String]
  }
  object PrinterDetails {
    
    inline def apply(isDefault: Boolean, name: String, options: StringDictionary[String]): PrinterDetails = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterDetails]
    }
    
    extension [Self <: PrinterDetails](x: Self) {
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type PrinterDriverOptions = StringDictionary[StringDictionary[Boolean]]
}
