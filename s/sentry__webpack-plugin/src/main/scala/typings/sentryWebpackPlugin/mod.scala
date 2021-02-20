package typings.sentryWebpackPlugin

import typings.std.Error
import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  type EntriesFunction = js.Function1[/* key */ String, Boolean]
  
  type ErrorHandlerFunction = js.Function2[/* err */ Error, /* invokeErr */ js.Function0[Unit], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var configFile: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var dryRun: js.UndefOr[Boolean] = js.native
    
    var entries: js.UndefOr[js.Array[_] | RegExp | EntriesFunction] = js.native
    
    var errorHandler: js.UndefOr[ErrorHandlerFunction] = js.native
    
    var ext: js.UndefOr[js.Array[String]] = js.native
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    var ignoreFile: js.UndefOr[String] = js.native
    
    var include: String | js.Array[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var rewrite: js.UndefOr[Boolean] = js.native
    
    var setCommits: js.UndefOr[SetCommitsOptions] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
    
    var sourceMapReference: js.UndefOr[Boolean] = js.native
    
    var stripCommonPrefix: js.UndefOr[Boolean] = js.native
    
    var stripPrefix: js.UndefOr[js.Array[js.Any]] = js.native
    
    var urlPrefix: js.UndefOr[String] = js.native
    
    var urlSuffix: js.UndefOr[String] = js.native
    
    var validate: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(include: String | js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      @scala.inline
      def setEntries(value: js.Array[_] | RegExp | EntriesFunction): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesFunction1(value: /* key */ String => Boolean): Self = StObject.set(x, "entries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      @scala.inline
      def setEntriesVarargs(value: js.Any*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      @scala.inline
      def setErrorHandler(value: (/* err */ Error, /* invokeErr */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setExt(value: js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value :_*))
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFile(value: String): Self = StObject.set(x, "ignoreFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFileUndefined: Self = StObject.set(x, "ignoreFile", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setRewrite(value: Boolean): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
      
      @scala.inline
      def setSetCommits(value: SetCommitsOptions): Self = StObject.set(x, "setCommits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCommitsUndefined: Self = StObject.set(x, "setCommits", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      @scala.inline
      def setSourceMapReference(value: Boolean): Self = StObject.set(x, "sourceMapReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapReferenceUndefined: Self = StObject.set(x, "sourceMapReference", js.undefined)
      
      @scala.inline
      def setStripCommonPrefix(value: Boolean): Self = StObject.set(x, "stripCommonPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripCommonPrefixUndefined: Self = StObject.set(x, "stripCommonPrefix", js.undefined)
      
      @scala.inline
      def setStripPrefix(value: js.Array[js.Any]): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      @scala.inline
      def setStripPrefixVarargs(value: js.Any*): Self = StObject.set(x, "stripPrefix", js.Array(value :_*))
      
      @scala.inline
      def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      @scala.inline
      def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type SentryPlugin = Plugin
  
  @js.native
  trait SetCommitsOptions extends StObject {
    
    var auto: js.UndefOr[Boolean] = js.native
    
    var commit: js.UndefOr[String] = js.native
    
    var previousCommit: js.UndefOr[String] = js.native
    
    var repo: String = js.native
  }
  object SetCommitsOptions {
    
    @scala.inline
    def apply(repo: String): SetCommitsOptions = {
      val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetCommitsOptions]
    }
    
    @scala.inline
    implicit class SetCommitsOptionsMutableBuilder[Self <: SetCommitsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      @scala.inline
      def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      @scala.inline
      def setPreviousCommit(value: String): Self = StObject.set(x, "previousCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCommitUndefined: Self = StObject.set(x, "previousCommit", js.undefined)
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
}
