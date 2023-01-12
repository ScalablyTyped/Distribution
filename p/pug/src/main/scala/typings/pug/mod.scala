package typings.pug

import org.scalablytyped.runtime.StringDictionary
import typings.pug.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(template: String): compileTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[compileTemplate]
  inline def compile(template: String, options: Options): compileTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[compileTemplate]
  
  inline def compileClient(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compileClient")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compileClient(template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compileClient")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compileClientWithDependenciesTracked(template: String): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("compileClientWithDependenciesTracked")(template.asInstanceOf[js.Any]).asInstanceOf[Body]
  inline def compileClientWithDependenciesTracked(template: String, options: Options): Body = (^.asInstanceOf[js.Dynamic].applyDynamic("compileClientWithDependenciesTracked")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Body]
  
  inline def compileFile(path: String): compileTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(path.asInstanceOf[js.Any]).asInstanceOf[compileTemplate]
  inline def compileFile(path: String, options: Options): compileTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[compileTemplate]
  
  inline def compileFileClient(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFileClient")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compileFileClient(path: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileClient")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def render(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(template: String, callback: js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(template: String, options: Options & LocalsObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(
    template: String,
    options: Options & LocalsObject,
    callback: js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderFile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderFile(path: String, callback: js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderFile(path: String, options: Options & LocalsObject): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def renderFile(
    path: String,
    options: Options & LocalsObject,
    callback: js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type LocalsObject = StringDictionary[Any]
  
  trait Options extends StObject {
    
    /** The root directory of all absolute inclusion. */
    var basedir: js.UndefOr[String] = js.undefined
    
    /** If set to true, compiled functions are cached. filename must be set as the cache key. Only applies to render functions. Defaults to false. */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, the function source will be included in the compiled template for better error messages (sometimes useful in development). It is enabled by default unless used with Express in production mode. */
    var compileDebug: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, the tokens and function body are logged to stdout. */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** If the doctype is not specified as part of the template, you can specify it here. It is sometimes useful to get self-closing tags and remove mirroring of boolean attributes; see doctype documentation for more information. */
    var doctype: js.UndefOr[String] = js.undefined
    
    /** The name of the file being compiled. Used in exceptions, and required for relative includes and extends. Defaults to 'Pug'. */
    var filename: js.UndefOr[String] = js.undefined
    
    /** Hash table of custom filters. Defaults to undefined. */
    var filters: js.UndefOr[Any] = js.undefined
    
    /** Add a list of global names to make accessible in templates. */
    var globals: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Inline runtime functions instead of require-ing them from a shared version. For compileClient functions, the default is true so that one does not have to include the runtime. For all other compilation or rendering types, the default is false. */
    var inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined
    
    /** The name of the template function. Only applies to compileClient functions. Defaults to 'template'. */
    var name: js.UndefOr[String] = js.undefined
    
    /** Adds whitespace to the resulting HTML to make it easier for a human to read using '  ' as indentation. If a string is specified, that will be used as indentation instead (e.g. '\t'). Defaults to false. */
    var pretty: js.UndefOr[Boolean | String] = js.undefined
    
    /** Use a self namespace to hold the locals. It will speed up the compilation, but instead of writing variable you will have to write self.variable to access a property of the locals object. Defaults to false. */
    var self: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBasedir(value: String): Self = StObject.set(x, "basedir", value.asInstanceOf[js.Any])
      
      inline def setBasedirUndefined: Self = StObject.set(x, "basedir", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCompileDebug(value: Boolean): Self = StObject.set(x, "compileDebug", value.asInstanceOf[js.Any])
      
      inline def setCompileDebugUndefined: Self = StObject.set(x, "compileDebug", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDoctype(value: String): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilters(value: Any): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value*))
      
      inline def setInlineRuntimeFunctions(value: Boolean): Self = StObject.set(x, "inlineRuntimeFunctions", value.asInstanceOf[js.Any])
      
      inline def setInlineRuntimeFunctionsUndefined: Self = StObject.set(x, "inlineRuntimeFunctions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPretty(value: Boolean | String): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
    }
  }
  
  type compileTemplate = js.Function1[/* locals */ js.UndefOr[LocalsObject], String]
}
