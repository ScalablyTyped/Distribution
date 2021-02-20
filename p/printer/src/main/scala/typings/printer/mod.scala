package typings.printer

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.printer.printerStrings.AUTO
import typings.printer.printerStrings.CANCEL
import typings.printer.printerStrings.COMMAND
import typings.printer.printerStrings.JPEG
import typings.printer.printerStrings.PDF
import typings.printer.printerStrings.POSTSCRIPT
import typings.printer.printerStrings.RAW
import typings.printer.printerStrings.TEXT
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("printer", "getDefaultPrinterName")
  @js.native
  def getDefaultPrinterName(): js.UndefOr[String] = js.native
  
  @JSImport("printer", "getJob")
  @js.native
  def getJob(printerName: String, jobId: Double): JobDetails = js.native
  
  @JSImport("printer", "getPrinter")
  @js.native
  def getPrinter(printerName: String): PrinterDetails = js.native
  
  @JSImport("printer", "getPrinterDriverOptions")
  @js.native
  def getPrinterDriverOptions(printerName: String): PrinterDriverOptions = js.native
  
  @JSImport("printer", "getPrinters")
  @js.native
  def getPrinters(): js.Array[PrinterDetails] = js.native
  
  @JSImport("printer", "getSelectedPaperSize")
  @js.native
  def getSelectedPaperSize(printerName: String): String = js.native
  
  @JSImport("printer", "getSupportedJobCommands")
  @js.native
  def getSupportedJobCommands(): js.Array[String] = js.native
  
  @JSImport("printer", "getSupportedPrintFormats")
  @js.native
  def getSupportedPrintFormats(): js.Array[String] = js.native
  
  @JSImport("printer", "printDirect")
  @js.native
  def printDirect(options: PrintDirectOptions): Unit = js.native
  
  @JSImport("printer", "printFile")
  @js.native
  def printFile(options: PrintFileOptions): Unit = js.native
  
  @JSImport("printer", "setJob")
  @js.native
  def setJob(printerName: String, jobId: Double, command: String): Unit = js.native
  @JSImport("printer", "setJob")
  @js.native
  def setJob_CANCEL(printerName: String, jobId: Double, command: CANCEL): Unit = js.native
  
  @js.native
  trait JobDetails extends StObject {
    
    var completedTime: Date = js.native
    
    var creationTime: Date = js.native
    
    var format: String = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var printerName: String = js.native
    
    var priority: Double = js.native
    
    var processingTime: Date = js.native
    
    var size: Double = js.native
    
    var status: js.Array[JobStatus] = js.native
    
    var user: String = js.native
  }
  object JobDetails {
    
    @scala.inline
    def apply(
      completedTime: Date,
      creationTime: Date,
      format: String,
      id: Double,
      name: String,
      printerName: String,
      priority: Double,
      processingTime: Date,
      size: Double,
      status: js.Array[JobStatus],
      user: String
    ): JobDetails = {
      val __obj = js.Dynamic.literal(completedTime = completedTime.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processingTime = processingTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobDetails]
    }
    
    @scala.inline
    implicit class JobDetailsMutableBuilder[Self <: JobDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompletedTime(value: Date): Self = StObject.set(x, "completedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationTime(value: Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessingTime(value: Date): Self = StObject.set(x, "processingTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: js.Array[JobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusVarargs(value: JobStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait PrintDirectOptions extends StObject {
    
    var data: String | Buffer = js.native
    
    var error: js.UndefOr[PrintOnErrorFunction] = js.native
    
    var options: js.UndefOr[StringDictionary[String]] = js.native
    
    var printer: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[PrintOnSuccessFunction] = js.native
    
    var `type`: js.UndefOr[RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO] = js.native
  }
  object PrintDirectOptions {
    
    @scala.inline
    def apply(data: String | Buffer): PrintDirectOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintDirectOptions]
    }
    
    @scala.inline
    implicit class PrintDirectOptionsMutableBuilder[Self <: PrintDirectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: /* err */ Error => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* jobId */ String => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setType(value: RAW | TEXT | PDF | JPEG | POSTSCRIPT | COMMAND | AUTO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PrintFileOptions extends StObject {
    
    var error: js.UndefOr[PrintOnErrorFunction] = js.native
    
    var filename: String = js.native
    
    var printer: js.UndefOr[String] = js.native
    
    var success: js.UndefOr[PrintOnSuccessFunction] = js.native
  }
  object PrintFileOptions {
    
    @scala.inline
    def apply(filename: String): PrintFileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrintFileOptions]
    }
    
    @scala.inline
    implicit class PrintFileOptionsMutableBuilder[Self <: PrintFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* err */ Error => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinter(value: String): Self = StObject.set(x, "printer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrinterUndefined: Self = StObject.set(x, "printer", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* jobId */ String => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  type PrintOnErrorFunction = js.Function1[/* err */ Error, js.Any]
  
  type PrintOnSuccessFunction = js.Function1[/* jobId */ String, js.Any]
  
  @js.native
  trait PrinterDetails extends StObject {
    
    var isDefault: Boolean = js.native
    
    var name: String = js.native
    
    var options: StringDictionary[String] = js.native
  }
  object PrinterDetails {
    
    @scala.inline
    def apply(isDefault: Boolean, name: String, options: StringDictionary[String]): PrinterDetails = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrinterDetails]
    }
    
    @scala.inline
    implicit class PrinterDetailsMutableBuilder[Self <: PrinterDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type PrinterDriverOptions = StringDictionary[StringDictionary[Boolean]]
}
