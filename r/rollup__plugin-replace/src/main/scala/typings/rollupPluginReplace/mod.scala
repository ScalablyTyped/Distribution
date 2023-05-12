package typings.rollupPluginReplace

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.Plugin
import typings.rollupPluginutils.mod.FilterPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/plugin-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupReplaceOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  type Replacement = String | (js.Function1[/* id */ String, String])
  
  trait RollupReplaceOptions
    extends StObject
       with /**
    * All other options are treated as `string: replacement` replacers,
    * or `string: (id) => replacement` functions.
    */
  /* str */ StringDictionary[
          js.UndefOr[Replacement | FilterPattern | StringDictionary[Replacement] | Boolean]
        ] {
    
    /**
      * To replace every occurrence of `<@foo@>` instead of every occurrence
      * of `foo`, supply delimiters
      */
    var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    /**
      * Files that should be excluded, if `include` is otherwise too permissive.
      */
    var exclude: js.UndefOr[FilterPattern] = js.undefined
    
    /**
      * A picomatch pattern, or array of patterns, of files that should be
      * processed by this plugin (if omitted, all files are included by default)
      */
    var include: js.UndefOr[FilterPattern] = js.undefined
    
    /**
      * Prevents replacing strings where they are followed by a single equals
      * sign.
      */
    var preventAssignment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If false, skips source map generation. This will improve performance.
      * @default true
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can separate values to replace from other options.
      */
    var values: js.UndefOr[StringDictionary[Replacement]] = js.undefined
  }
  object RollupReplaceOptions {
    
    inline def apply(): RollupReplaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupReplaceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RollupReplaceOptions] (val x: Self) extends AnyVal {
      
      inline def setDelimiters(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      inline def setExclude(value: FilterPattern): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: FilterPattern): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeNull: Self = StObject.set(x, "include", null)
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setPreventAssignment(value: Boolean): Self = StObject.set(x, "preventAssignment", value.asInstanceOf[js.Any])
      
      inline def setPreventAssignmentUndefined: Self = StObject.set(x, "preventAssignment", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setValues(value: StringDictionary[Replacement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
