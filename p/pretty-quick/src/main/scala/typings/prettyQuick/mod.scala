package typings.prettyQuick

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.mod.ResolveConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Runs Prettier on your changed files.
    * Supported source control managers:
    * * Git
    * * Mercurial
    */
  inline def apply(currentDirectory: String): Results = ^.asInstanceOf[js.Dynamic].apply(currentDirectory.asInstanceOf[js.Any]).asInstanceOf[Results]
  inline def apply(currentDirectory: String, options: Options): Results = (^.asInstanceOf[js.Dynamic].apply(currentDirectory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Results]
  
  @JSImport("pretty-quick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with // ...args support
  /* key */ StringDictionary[Any] {
    
    var bail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'master' | 'default'
      */
    var branch: js.UndefOr[String] = js.undefined
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[ResolveConfigOptions] = js.undefined
    
    var ignorePath: js.UndefOr[String] = js.undefined
    
    var onCheckFile: js.UndefOr[js.Function2[/* file */ String, /* isFormatted */ Boolean, Unit]] = js.undefined
    
    var onExamineFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
    
    var onFoundChangedFiles: js.UndefOr[js.Function1[/* changedFiles */ js.Array[String], Unit]] = js.undefined
    
    var onFoundSinceRevision: js.UndefOr[js.Function2[/* name */ String, /* revision */ String, Unit]] = js.undefined
    
    var onPartiallyStagedFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
    
    var onWriteFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.undefined
    
    var pattern: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** @default true */
    var restage: js.UndefOr[Boolean] = js.undefined
    
    var since: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var staged: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setConfig(value: ResolveConfigOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setOnCheckFile(value: (/* file */ String, /* isFormatted */ Boolean) => Unit): Self = StObject.set(x, "onCheckFile", js.Any.fromFunction2(value))
      
      inline def setOnCheckFileUndefined: Self = StObject.set(x, "onCheckFile", js.undefined)
      
      inline def setOnExamineFile(value: /* file */ String => Unit): Self = StObject.set(x, "onExamineFile", js.Any.fromFunction1(value))
      
      inline def setOnExamineFileUndefined: Self = StObject.set(x, "onExamineFile", js.undefined)
      
      inline def setOnFoundChangedFiles(value: /* changedFiles */ js.Array[String] => Unit): Self = StObject.set(x, "onFoundChangedFiles", js.Any.fromFunction1(value))
      
      inline def setOnFoundChangedFilesUndefined: Self = StObject.set(x, "onFoundChangedFiles", js.undefined)
      
      inline def setOnFoundSinceRevision(value: (/* name */ String, /* revision */ String) => Unit): Self = StObject.set(x, "onFoundSinceRevision", js.Any.fromFunction2(value))
      
      inline def setOnFoundSinceRevisionUndefined: Self = StObject.set(x, "onFoundSinceRevision", js.undefined)
      
      inline def setOnPartiallyStagedFile(value: /* file */ String => Unit): Self = StObject.set(x, "onPartiallyStagedFile", js.Any.fromFunction1(value))
      
      inline def setOnPartiallyStagedFileUndefined: Self = StObject.set(x, "onPartiallyStagedFile", js.undefined)
      
      inline def setOnWriteFile(value: /* file */ String => Unit): Self = StObject.set(x, "onWriteFile", js.Any.fromFunction1(value))
      
      inline def setOnWriteFileUndefined: Self = StObject.set(x, "onWriteFile", js.undefined)
      
      inline def setPattern(value: String | js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
      
      inline def setRestage(value: Boolean): Self = StObject.set(x, "restage", value.asInstanceOf[js.Any])
      
      inline def setRestageUndefined: Self = StObject.set(x, "restage", js.undefined)
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setStaged(value: Boolean): Self = StObject.set(x, "staged", value.asInstanceOf[js.Any])
      
      inline def setStagedUndefined: Self = StObject.set(x, "staged", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Results extends StObject {
    
    val errors: js.Array[String]
    
    val success: Boolean
  }
  object Results {
    
    inline def apply(errors: js.Array[String], success: Boolean): Results = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
