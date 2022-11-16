package typings.requireDirectory

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @description function for requiring directory content as hash of modules
    * @param m module for which has will be created
    * @param path path to directory, if you want to build hash for another one (default to __dirname)
    * @param options object with options for require-directory call
    * @returns hash of modules in specified directory
    */
  inline def apply[T, U](m: NodeModule): RequireDirectoryResult[U] = ^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any]).asInstanceOf[RequireDirectoryResult[U]]
  inline def apply[T, U](m: NodeModule, path: String): RequireDirectoryResult[U] = (^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[RequireDirectoryResult[U]]
  inline def apply[T, U](m: NodeModule, path: String, options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = (^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequireDirectoryResult[U]]
  inline def apply[T, U](m: NodeModule, path: Unit, options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = (^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequireDirectoryResult[U]]
  inline def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = (^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[RequireDirectoryResult[U]]
  inline def apply[T, U](m: NodeModule, path: RequireDirectoryOptions[T, U], options: RequireDirectoryOptions[T, U]): RequireDirectoryResult[U] = (^.asInstanceOf[js.Dynamic].apply(m.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequireDirectoryResult[U]]
  
  @JSImport("require-directory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description default options that is used for "require-directory" module
    */
  @JSImport("require-directory", "defaults")
  @js.native
  val defaults: RequireDirectoryOptions[Any, Any] = js.native
  
  /**
    * @description function that checks path for whitelisting/blacklisting
    * @param path path of required module
    * @returns true if path have to be whitelisted/blacklisted, false otherwise
    */
  type CheckPathFn = js.Function1[/* path */ String, Boolean]
  
  trait RequireDirectoryOptions[T, U] extends StObject {
    
    /**
      * @description RegExp or function for blacklisting modules
      * @default undefined
      */
    var exclude: js.UndefOr[js.RegExp | CheckPathFn] = js.undefined
    
    /**
      * @description array of file extensions that will be included in resulting hash as modules
      * @default "['js', 'json', 'coffee']"
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @description RegExp or function for whitelisting modules
      * @default undefined
      */
    var include: js.UndefOr[js.RegExp | CheckPathFn] = js.undefined
    
    /**
      * @description option to include subdirectories
      * @default true
      */
    var recurse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @description function for renaming modules in resulting hash
      * @param name name of required module
      * @returns transformed name of module
      * @default "change nothing"
      */
    var rename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    
    /**
      * @description function that will be called for each required module
      * @param obj required module
      * @returns transformed module OR nothing (in second case module itself will be added to hash)
      * @default "change nothing"
      */
    var visit: js.UndefOr[js.Function1[/* obj */ T, U | Unit]] = js.undefined
  }
  object RequireDirectoryOptions {
    
    inline def apply[T, U](): RequireDirectoryOptions[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireDirectoryOptions[T, U]]
    }
    
    extension [Self <: RequireDirectoryOptions[?, ?], T, U](x: Self & (RequireDirectoryOptions[T, U])) {
      
      inline def setExclude(value: js.RegExp | CheckPathFn): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setInclude(value: js.RegExp | CheckPathFn): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
      
      inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
      
      inline def setRename(value: /* name */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setVisit(value: /* obj */ T => U | Unit): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      inline def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RequireDirectoryResult = {[index: string] : require-directory.require-directory.RequireDirectoryResult<T> | T}
  }}}
  to avoid circular code involving: 
  - require-directory.require-directory.RequireDirectoryResult
  */
  trait RequireDirectoryResult[T]
    extends StObject
       with /**
    * @description module itself or hash of modules in subdirectory with name of this directory
    */
  /* index */ StringDictionary[RequireDirectoryResult[T] | T]
  object RequireDirectoryResult {
    
    inline def apply[T](): RequireDirectoryResult[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequireDirectoryResult[T]]
    }
  }
}
