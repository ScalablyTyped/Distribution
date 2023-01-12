package typings.rcedit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(exePath: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(exePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("rcedit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * EXE metadata that can be changed.
    */
  trait Options extends StObject {
    
    /**
      * The path to the [application manifest](https://docs.microsoft.com/en-us/windows/win32/sbscs/application-manifests)
      * XML that is to be embedded in the EXE.
      */
    var `application-manifest`: js.UndefOr[String] = js.undefined
    
    /**
      * See [MSDN](https://docs.microsoft.com/en-us/windows/win32/msi/version) for the version format.
      */
    var `file-version`: js.UndefOr[String] = js.undefined
    
    /**
      * Absolute path to the [ICO-formatted icon](https://en.wikipedia.org/wiki/ICO_(file_format))
      * to set as the application's icon.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * See [MSDN](https://docs.microsoft.com/en-us/windows/win32/msi/version) for the version format.
      */
    var `product-version`: js.UndefOr[String] = js.undefined
    
    /** See [MSDN](https://docs.microsoft.com/en-us/previous-versions/visualstudio/visual-studio-2015/deployment/trustinfo-element-clickonce-application?view=vs-2015#requestedexecutionlevel) for details. */
    var `requested-execution-level`: js.UndefOr[RequestedExecutionLevel] = js.undefined
    
    /** The metadata within a version-information resource. */
    var `version-string`: js.UndefOr[VersionStringOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def `setApplication-manifest`(value: String): Self = StObject.set(x, "application-manifest", value.asInstanceOf[js.Any])
      
      inline def `setApplication-manifestUndefined`: Self = StObject.set(x, "application-manifest", js.undefined)
      
      inline def `setFile-version`(value: String): Self = StObject.set(x, "file-version", value.asInstanceOf[js.Any])
      
      inline def `setFile-versionUndefined`: Self = StObject.set(x, "file-version", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def `setProduct-version`(value: String): Self = StObject.set(x, "product-version", value.asInstanceOf[js.Any])
      
      inline def `setProduct-versionUndefined`: Self = StObject.set(x, "product-version", js.undefined)
      
      inline def `setRequested-execution-level`(value: RequestedExecutionLevel): Self = StObject.set(x, "requested-execution-level", value.asInstanceOf[js.Any])
      
      inline def `setRequested-execution-levelUndefined`: Self = StObject.set(x, "requested-execution-level", js.undefined)
      
      inline def `setVersion-string`(value: VersionStringOptions): Self = StObject.set(x, "version-string", value.asInstanceOf[js.Any])
      
      inline def `setVersion-stringUndefined`: Self = StObject.set(x, "version-string", js.undefined)
    }
  }
  
  /** See [MSDN](https://docs.microsoft.com/en-us/previous-versions/visualstudio/visual-studio-2015/deployment/trustinfo-element-clickonce-application?view=vs-2015#requestedexecutionlevel) for details. */
  /* Rewritten from type alias, can be one of: 
    - typings.rcedit.rceditStrings.asInvoker
    - typings.rcedit.rceditStrings.highestAvailable
    - typings.rcedit.rceditStrings.requireAdministrator
  */
  trait RequestedExecutionLevel extends StObject
  object RequestedExecutionLevel {
    
    inline def asInvoker: typings.rcedit.rceditStrings.asInvoker = "asInvoker".asInstanceOf[typings.rcedit.rceditStrings.asInvoker]
    
    inline def highestAvailable: typings.rcedit.rceditStrings.highestAvailable = "highestAvailable".asInstanceOf[typings.rcedit.rceditStrings.highestAvailable]
    
    inline def requireAdministrator: typings.rcedit.rceditStrings.requireAdministrator = "requireAdministrator".asInstanceOf[typings.rcedit.rceditStrings.requireAdministrator]
  }
  
  /**
    * Basic user-supplied metadata embedded in the application. Docstrings are copied from MSDN.
    *
    * See [MSDN](https://docs.microsoft.com/en-us/windows/win32/menurc/stringfileinfo-block) for details.
    */
  trait VersionStringOptions extends StObject {
    
    /** Additional information that should be displayed for diagnostic purposes. */
    var Comments: js.UndefOr[String] = js.undefined
    
    /** Company that produced the executable. */
    var CompanyName: js.UndefOr[String] = js.undefined
    
    /** File description to be presented to users. */
    var FileDescription: js.UndefOr[String] = js.undefined
    
    /** Internal name of the file. Usually, this string should be the original filename, without the extension. */
    var InternalFilename: js.UndefOr[String] = js.undefined
    
    /** Copyright notices that apply, including the full text of all notices, legal symbols, copyright dates, etc. */
    var LegalCopyright: js.UndefOr[String] = js.undefined
    
    /** Trademarks and registered trademarks, including the full text of all notices, legal symbols, trademark numbers, etc. */
    var LegalTrademarks1: js.UndefOr[String] = js.undefined
    
    /** Trademarks and registered trademarks, including the full text of all notices, legal symbols, trademark numbers, etc. */
    var LegalTrademarks2: js.UndefOr[String] = js.undefined
    
    /** Original name of the file, not including a path. */
    var OriginalFilename: js.UndefOr[String] = js.undefined
    
    /** Name of the product with which the file is distributed. */
    var ProductName: js.UndefOr[String] = js.undefined
  }
  object VersionStringOptions {
    
    inline def apply(): VersionStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VersionStringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VersionStringOptions] (val x: Self) extends AnyVal {
      
      inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
      
      inline def setFileDescription(value: String): Self = StObject.set(x, "FileDescription", value.asInstanceOf[js.Any])
      
      inline def setFileDescriptionUndefined: Self = StObject.set(x, "FileDescription", js.undefined)
      
      inline def setInternalFilename(value: String): Self = StObject.set(x, "InternalFilename", value.asInstanceOf[js.Any])
      
      inline def setInternalFilenameUndefined: Self = StObject.set(x, "InternalFilename", js.undefined)
      
      inline def setLegalCopyright(value: String): Self = StObject.set(x, "LegalCopyright", value.asInstanceOf[js.Any])
      
      inline def setLegalCopyrightUndefined: Self = StObject.set(x, "LegalCopyright", js.undefined)
      
      inline def setLegalTrademarks1(value: String): Self = StObject.set(x, "LegalTrademarks1", value.asInstanceOf[js.Any])
      
      inline def setLegalTrademarks1Undefined: Self = StObject.set(x, "LegalTrademarks1", js.undefined)
      
      inline def setLegalTrademarks2(value: String): Self = StObject.set(x, "LegalTrademarks2", value.asInstanceOf[js.Any])
      
      inline def setLegalTrademarks2Undefined: Self = StObject.set(x, "LegalTrademarks2", js.undefined)
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "OriginalFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilenameUndefined: Self = StObject.set(x, "OriginalFilename", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    }
  }
}
