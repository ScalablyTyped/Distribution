package typings.resolveExports

import org.scalablytyped.runtime.StringDictionary
import typings.resolveExports.anon.BrowserFields
import typings.resolveExports.anon.Fields
import typings.resolveExports.anon.`0`
import typings.resolveExports.mod.Exports_.Output
import typings.resolveExports.mod.Exports_.Value
import typings.resolveExports.resolveExportsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("resolve.exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exports[T](pkg: T, target: String): Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exports")(pkg.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Output | Unit]
  inline def exports[T](pkg: T, target: String, options: Options): Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exports")(pkg.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output | Unit]
  
  inline def imports[T](pkg: T): typings.resolveExports.mod.Imports_.Output | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any]).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: String): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: String, options: Options): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  inline def imports[T](pkg: T, entry: Unit, options: Options): typings.resolveExports.mod.Imports_.Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imports")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Unit]
  
  inline def legacy[T](pkg: T): Browser | String = ^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any]).asInstanceOf[Browser | String]
  inline def legacy[T](pkg: T, options: typings.resolveExports.anon.Browser): Browser | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Browser | Unit]
  inline def legacy[T](pkg: T, options: BrowserFields): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
  inline def legacy[T](pkg: T, options: Fields): String | `false` | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | `false` | Unit]
  inline def legacy[T](pkg: T, options: `0`): Browser | String = (^.asInstanceOf[js.Dynamic].applyDynamic("legacy")(pkg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Browser | String]
  
  inline def resolve[T](pkg: T): typings.resolveExports.mod.Imports_.Output | Output | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any]).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: String): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: String, options: Options): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  inline def resolve[T](pkg: T, entry: Unit, options: Options): typings.resolveExports.mod.Imports_.Output | Output | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pkg.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.resolveExports.mod.Imports_.Output | Output | Unit]
  
  type Browser = js.Array[String] | String | (StringDictionary[String | `false`])
  
  type Condition = String
  
  object Exports_ {
    
    type Entry = /* template literal string: .${string} */ String
    
    type Output = js.Array[Path]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Value = resolve.exports.resolve.exports.Path | null | {[c: resolve.exports.resolve.exports.Condition] : resolve.exports.resolve.exports.Exports.Value} | std.Array<resolve.exports.resolve.exports.Exports.Value>
    }}}
    to avoid circular code involving: 
    - resolve.exports.resolve.exports.Exports
    - resolve.exports.resolve.exports.Exports.Value
    */
    type Value = Path | Null | StringDictionary[Any] | js.Array[Any]
  }
  type Exports_ = Path | StringDictionary[Value]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Imports = {[entry: resolve.exports.resolve.exports.Imports.Entry] : resolve.exports.resolve.exports.Imports.Value}
  }}}
  to avoid circular code involving: 
  - resolve.exports.resolve.exports.Imports
  - resolve.exports.resolve.exports.Imports.Value
  */
  trait Imports_
    extends StObject
       with /* entry */ StringDictionary[typings.resolveExports.mod.Imports_.Value]
  object Imports_ {
    
    inline def apply(): Imports_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imports_]
    }
    
    type Entry = /* template literal string: #${string} */ String
    
    type External = String
    
    type Output = js.Array[External | Path]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Value = resolve.exports.resolve.exports.Imports.External | resolve.exports.resolve.exports.Path | null | {[c: resolve.exports.resolve.exports.Condition] : resolve.exports.resolve.exports.Imports.Value} | std.Array<resolve.exports.resolve.exports.Imports.Value>
    }}}
    to avoid circular code involving: 
    - resolve.exports.resolve.exports.Imports.Value
    */
    type Value = External | Path | Null | StringDictionary[Any] | js.Array[Any]
  }
  
  trait Options extends StObject {
    
    /**
    	 * When true, adds the "browser" conditions.
    	 * Otherwise the "node" condition is enabled.
    	 * @default false
    	 */
    var browser: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Any custom conditions to match.
    	 * @note Array order does not matter. Priority is determined by the key-order of conditions defined within a package's imports/exports mapping.
    	 * @default []
    	 */
    var conditions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    	 * When true, adds the "require" condition.
    	 * Otherwise the "import" condition is enabled.
    	 * @default false
    	 */
    var require: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Prevents "require", "import", "browser", and/or "node" conditions from being added automatically.
    	 * When enabled, only `options.conditions` are added alongside the "default" condition.
    	 * @important Enabling this deviates from Node.js default behavior.
    	 * @default false
    	 */
    var unsafe: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Boolean): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      inline def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
  
  trait Package
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var browser: js.UndefOr[Browser] = js.undefined
    
    var exports: js.UndefOr[Exports_] = js.undefined
    
    var imports: js.UndefOr[Imports_] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var version: js.UndefOr[String] = js.undefined
  }
  object Package {
    
    inline def apply(name: String): Package = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Package]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setBrowserVarargs(value: String*): Self = StObject.set(x, "browser", js.Array(value*))
      
      inline def setExports(value: Exports_): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
      
      inline def setImports(value: Imports_): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type Path = /* template literal string: ./${string} */ String
}
