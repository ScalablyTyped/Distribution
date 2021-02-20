package typings.pug

import org.scalablytyped.runtime.StringDictionary
import typings.pug.anon.Body
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pug", "compile")
  @js.native
  def compile(template: String): compileTemplate = js.native
  @JSImport("pug", "compile")
  @js.native
  def compile(template: String, options: Options): compileTemplate = js.native
  
  @JSImport("pug", "compileClient")
  @js.native
  def compileClient(template: String): String = js.native
  @JSImport("pug", "compileClient")
  @js.native
  def compileClient(template: String, options: Options): String = js.native
  
  @JSImport("pug", "compileClientWithDependenciesTracked")
  @js.native
  def compileClientWithDependenciesTracked(template: String): Body = js.native
  @JSImport("pug", "compileClientWithDependenciesTracked")
  @js.native
  def compileClientWithDependenciesTracked(template: String, options: Options): Body = js.native
  
  @JSImport("pug", "compileFile")
  @js.native
  def compileFile(path: String): compileTemplate = js.native
  @JSImport("pug", "compileFile")
  @js.native
  def compileFile(path: String, options: Options): compileTemplate = js.native
  
  @JSImport("pug", "compileFileClient")
  @js.native
  def compileFileClient(path: String): String = js.native
  @JSImport("pug", "compileFileClient")
  @js.native
  def compileFileClient(path: String, options: Options): String = js.native
  
  @JSImport("pug", "render")
  @js.native
  def render(template: String): String = js.native
  @JSImport("pug", "render")
  @js.native
  def render(template: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  @JSImport("pug", "render")
  @js.native
  def render(template: String, options: Options with LocalsObject): String = js.native
  @JSImport("pug", "render")
  @js.native
  def render(
    template: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  ): Unit = js.native
  
  @JSImport("pug", "renderFile")
  @js.native
  def renderFile(path: String): String = js.native
  @JSImport("pug", "renderFile")
  @js.native
  def renderFile(path: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  @JSImport("pug", "renderFile")
  @js.native
  def renderFile(path: String, options: Options with LocalsObject): String = js.native
  @JSImport("pug", "renderFile")
  @js.native
  def renderFile(
    path: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  ): Unit = js.native
  
  type LocalsObject = StringDictionary[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    /** The root directory of all absolute inclusion. */
    var basedir: js.UndefOr[String] = js.native
    
    /** If set to true, compiled functions are cached. filename must be set as the cache key. Only applies to render functions. Defaults to false. */
    var cache: js.UndefOr[Boolean] = js.native
    
    /** If set to true, the function source will be included in the compiled template for better error messages (sometimes useful in development). It is enabled by default unless used with Express in production mode. */
    var compileDebug: js.UndefOr[Boolean] = js.native
    
    /** If set to true, the tokens and function body are logged to stdout. */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** If the doctype is not specified as part of the template, you can specify it here. It is sometimes useful to get self-closing tags and remove mirroring of boolean attributes; see doctype documentation for more information. */
    var doctype: js.UndefOr[String] = js.native
    
    /** The name of the file being compiled. Used in exceptions, and required for relative includes and extends. Defaults to 'Pug'. */
    var filename: js.UndefOr[String] = js.native
    
    /** Hash table of custom filters. Defaults to undefined. */
    var filters: js.UndefOr[js.Any] = js.native
    
    /** Add a list of global names to make accessible in templates. */
    var globals: js.UndefOr[js.Array[String]] = js.native
    
    /** Inline runtime functions instead of require-ing them from a shared version. For compileClient functions, the default is true so that one does not have to include the runtime. For all other compilation or rendering types, the default is false. */
    var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.native
    
    /** The name of the template function. Only applies to compileClient functions. Defaults to 'template'. */
    var name: js.UndefOr[String] = js.native
    
    /** Adds whitespace to the resulting HTML to make it easier for a human to read using '  ' as indentation. If a string is specified, that will be used as indentation instead (e.g. '\t'). Defaults to false. */
    var pretty: js.UndefOr[Boolean | String] = js.native
    
    /** Use a self namespace to hold the locals. It will speed up the compilation, but instead of writing variable you will have to write self.variable to access a property of the locals object. Defaults to false. */
    var self: js.UndefOr[Boolean] = js.native
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
      def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      @scala.inline
      def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value :_*))
      
      @scala.inline
      def setInlineRuntimeFunctions(value: Boolean): Self = StObject.set(x, "inlineRuntimeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRuntimeFunctionsUndefined: Self = StObject.set(x, "inlineRuntimeFunctions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  type compileTemplate = js.Function1[/* locals */ js.UndefOr[LocalsObject], String]
}
