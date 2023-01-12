package typings.stringifyEntities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilFormatSmartMod {
  
  @JSImport("stringify-entities/lib/util/format-smart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatSmart(code: Double, next: Double, options: FormatSmartOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatSmart")(code.asInstanceOf[js.Any], next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait FormatSmartOptions extends StObject {
    
    /**
      * Create character references which don’t fail in attributes.
      * **Note**: `attribute` only applies when operating dangerously with
      * `omitOptionalSemicolons: true`.
      */
    var attribute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to omit semicolons when possible.
      * **Note**: This creates what HTML calls “parse errors” but is otherwise still valid HTML — don’t use this except when building a minifier.
      * Omitting semicolons is possible for certain named and numeric references in some cases.
      */
    var omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer named character references (`&amp;`) where possible.
      */
    var useNamedReferences: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefer the shortest possible reference, if that results in less bytes.
      * **Note**: `useNamedReferences` can be omitted when using `useShortestReferences`.
      */
    var useShortestReferences: js.UndefOr[Boolean] = js.undefined
  }
  object FormatSmartOptions {
    
    inline def apply(): FormatSmartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatSmartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatSmartOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setOmitOptionalSemicolons(value: Boolean): Self = StObject.set(x, "omitOptionalSemicolons", value.asInstanceOf[js.Any])
      
      inline def setOmitOptionalSemicolonsUndefined: Self = StObject.set(x, "omitOptionalSemicolons", js.undefined)
      
      inline def setUseNamedReferences(value: Boolean): Self = StObject.set(x, "useNamedReferences", value.asInstanceOf[js.Any])
      
      inline def setUseNamedReferencesUndefined: Self = StObject.set(x, "useNamedReferences", js.undefined)
      
      inline def setUseShortestReferences(value: Boolean): Self = StObject.set(x, "useShortestReferences", value.asInstanceOf[js.Any])
      
      inline def setUseShortestReferencesUndefined: Self = StObject.set(x, "useShortestReferences", js.undefined)
    }
  }
}
