package typings.stringifyEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Encode special characters in `value`.
    */
  inline def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: String, options: StringifyEntitiesOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("stringify-entities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait StringifyEntitiesOptions extends StObject {
    
    /**
      * Only needed when operating dangerously with `omitOptionalSemicolons: true`.
      * Create character references which don’t fail in attributes (`boolean?`, default: `false`).
      */
    var attribute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to only escape possibly dangerous characters (`boolean`, default: `false`).
      * Those characters are `"`, `&`, `'`, `<`, `>`, and `` ` ``.
      */
    var escapeOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to omit semicolons when possible (`boolean?`, default: `false`).
      * **Note**: This creates what HTML calls “parse errors” but is otherwise still valid HTML — don’t use this except when building a minifier.
      *
      * Omitting semicolons is possible for legacy named references in certain cases, and numeric references in some cases.
      */
    var omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to only escape the given subset of characters (`Array.<string>`).
      */
    var subset: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Prefer named character references (`&amp;`) where possible (`boolean?`, default: `false`).
      */
    var useNamedReferences: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer the shortest possible reference, if that results in less bytes (`boolean?`, default: `false`).
      * **Note**: `useNamedReferences` can be omitted when using `useShortestReferences`.
      */
    var useShortestReferences: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyEntitiesOptions {
    
    inline def apply(): StringifyEntitiesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyEntitiesOptions]
    }
    
    extension [Self <: StringifyEntitiesOptions](x: Self) {
      
      inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setEscapeOnly(value: Boolean): Self = StObject.set(x, "escapeOnly", value.asInstanceOf[js.Any])
      
      inline def setEscapeOnlyUndefined: Self = StObject.set(x, "escapeOnly", js.undefined)
      
      inline def setOmitOptionalSemicolons(value: Boolean): Self = StObject.set(x, "omitOptionalSemicolons", value.asInstanceOf[js.Any])
      
      inline def setOmitOptionalSemicolonsUndefined: Self = StObject.set(x, "omitOptionalSemicolons", js.undefined)
      
      inline def setSubset(value: js.Array[String]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
      
      inline def setSubsetUndefined: Self = StObject.set(x, "subset", js.undefined)
      
      inline def setSubsetVarargs(value: String*): Self = StObject.set(x, "subset", js.Array(value :_*))
      
      inline def setUseNamedReferences(value: Boolean): Self = StObject.set(x, "useNamedReferences", value.asInstanceOf[js.Any])
      
      inline def setUseNamedReferencesUndefined: Self = StObject.set(x, "useNamedReferences", js.undefined)
      
      inline def setUseShortestReferences(value: Boolean): Self = StObject.set(x, "useShortestReferences", value.asInstanceOf[js.Any])
      
      inline def setUseShortestReferencesUndefined: Self = StObject.set(x, "useShortestReferences", js.undefined)
    }
  }
}
