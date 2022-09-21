package typings.rollupPluginJson

import typings.rollup.mod.Plugin
import typings.rollupPluginutils.mod.FilterPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/plugin-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupJsonOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait RollupJsonOptions extends StObject {
    
    /**
      * Ignores indent and generates the smallest code
      * @default false
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * All JSON files will be parsed by default,
      * but you can also specifically exclude files
      */
    var exclude: js.UndefOr[FilterPattern] = js.undefined
    
    /**
      * All JSON files will be parsed by default,
      * but you can also specifically include files
      */
    var include: js.UndefOr[FilterPattern] = js.undefined
    
    /**
      * Specify indentation for the generated default export
      * @default '\t'
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * Generate a named export for every property of the JSON object
      * @default true
      */
    var namedExports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For tree-shaking, properties will be declared as variables, using
      * either `var` or `const`.
      * @default false
      */
    var preferConst: js.UndefOr[Boolean] = js.undefined
  }
  object RollupJsonOptions {
    
    inline def apply(): RollupJsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupJsonOptions]
    }
    
    extension [Self <: RollupJsonOptions](x: Self) {
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setExclude(value: FilterPattern): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: FilterPattern): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeNull: Self = StObject.set(x, "include", null)
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setPreferConst(value: Boolean): Self = StObject.set(x, "preferConst", value.asInstanceOf[js.Any])
      
      inline def setPreferConstUndefined: Self = StObject.set(x, "preferConst", js.undefined)
    }
  }
}
