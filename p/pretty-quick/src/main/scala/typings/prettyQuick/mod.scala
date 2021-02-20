package typings.prettyQuick

import org.scalablytyped.runtime.StringDictionary
import typings.prettier.mod.ResolveConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Runs Prettier on your changed files.
    * Supported source control managers:
    * * Git
    * * Mercurial
    */
  @JSImport("pretty-quick", JSImport.Namespace)
  @js.native
  def apply(currentDirectory: String): Results = js.native
  @JSImport("pretty-quick", JSImport.Namespace)
  @js.native
  def apply(currentDirectory: String, options: Options): Results = js.native
  
  @js.native
  trait Options
    extends // ...args support
  /* key */ StringDictionary[js.Any] {
    
    var bail: js.UndefOr[Boolean] = js.native
    
    /**
      * @default 'master' | 'default'
      */
    var branch: js.UndefOr[String] = js.native
    
    var check: js.UndefOr[Boolean] = js.native
    
    var config: js.UndefOr[ResolveConfigOptions] = js.native
    
    var onCheckFile: js.UndefOr[js.Function2[/* file */ String, /* isFormatted */ Boolean, Unit]] = js.native
    
    var onExamineFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
    
    var onFoundChangedFiles: js.UndefOr[js.Function1[/* changedFiles */ js.Array[String], Unit]] = js.native
    
    var onFoundSinceRevision: js.UndefOr[js.Function2[/* name */ String, /* revision */ String, Unit]] = js.native
    
    var onPartiallyStagedFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
    
    var onWriteFile: js.UndefOr[js.Function1[/* file */ String, Unit]] = js.native
    
    var pattern: js.UndefOr[String | js.Array[String]] = js.native
    
    /** @default true */
    var restage: js.UndefOr[Boolean] = js.native
    
    var since: js.UndefOr[String] = js.native
    
    /** @default false */
    var staged: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setConfig(value: ResolveConfigOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setOnCheckFile(value: (/* file */ String, /* isFormatted */ Boolean) => Unit): Self = StObject.set(x, "onCheckFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckFileUndefined: Self = StObject.set(x, "onCheckFile", js.undefined)
      
      @scala.inline
      def setOnExamineFile(value: /* file */ String => Unit): Self = StObject.set(x, "onExamineFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExamineFileUndefined: Self = StObject.set(x, "onExamineFile", js.undefined)
      
      @scala.inline
      def setOnFoundChangedFiles(value: /* changedFiles */ js.Array[String] => Unit): Self = StObject.set(x, "onFoundChangedFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFoundChangedFilesUndefined: Self = StObject.set(x, "onFoundChangedFiles", js.undefined)
      
      @scala.inline
      def setOnFoundSinceRevision(value: (/* name */ String, /* revision */ String) => Unit): Self = StObject.set(x, "onFoundSinceRevision", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFoundSinceRevisionUndefined: Self = StObject.set(x, "onFoundSinceRevision", js.undefined)
      
      @scala.inline
      def setOnPartiallyStagedFile(value: /* file */ String => Unit): Self = StObject.set(x, "onPartiallyStagedFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPartiallyStagedFileUndefined: Self = StObject.set(x, "onPartiallyStagedFile", js.undefined)
      
      @scala.inline
      def setOnWriteFile(value: /* file */ String => Unit): Self = StObject.set(x, "onWriteFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWriteFileUndefined: Self = StObject.set(x, "onWriteFile", js.undefined)
      
      @scala.inline
      def setPattern(value: String | js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
      
      @scala.inline
      def setRestage(value: Boolean): Self = StObject.set(x, "restage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestageUndefined: Self = StObject.set(x, "restage", js.undefined)
      
      @scala.inline
      def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      @scala.inline
      def setStaged(value: Boolean): Self = StObject.set(x, "staged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStagedUndefined: Self = StObject.set(x, "staged", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    val errors: js.Array[String] = js.native
    
    val success: Boolean = js.native
  }
  object Results {
    
    @scala.inline
    def apply(errors: js.Array[String], success: Boolean): Results = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
