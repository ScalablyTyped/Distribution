package typings.rollupPluginAlias

import org.scalablytyped.runtime.StringDictionary
import typings.rollup.mod.ObjectHook
import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rollup/plugin-alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: RollupAliasOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait Alias extends StObject {
    
    var customResolver: js.UndefOr[ResolverFunction | ResolverObject | Null] = js.undefined
    
    var find: String | js.RegExp
    
    var replacement: String
  }
  object Alias {
    
    inline def apply(find: String | js.RegExp, replacement: String): Alias = {
      val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alias]
    }
    
    extension [Self <: Alias](x: Self) {
      
      inline def setCustomResolver(value: ResolverFunction | ResolverObject): Self = StObject.set(x, "customResolver", value.asInstanceOf[js.Any])
      
      inline def setCustomResolverNull: Self = StObject.set(x, "customResolver", null)
      
      inline def setCustomResolverUndefined: Self = StObject.set(x, "customResolver", js.undefined)
      
      inline def setFind(value: String | js.RegExp): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function ? T : never
    }}}
    */
  type MapToFunction[T] = T
  
  trait ResolvedAlias extends StObject {
    
    var find: String | js.RegExp
    
    var replacement: String
    
    var resolverFunction: ResolverFunction | Null
  }
  object ResolvedAlias {
    
    inline def apply(find: String | js.RegExp, replacement: String): ResolvedAlias = {
      val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], resolverFunction = null)
      __obj.asInstanceOf[ResolvedAlias]
    }
    
    extension [Self <: ResolvedAlias](x: Self) {
      
      inline def setFind(value: String | js.RegExp): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setResolverFunction(value: ResolverFunction): Self = StObject.set(x, "resolverFunction", value.asInstanceOf[js.Any])
      
      inline def setResolverFunctionNull: Self = StObject.set(x, "resolverFunction", null)
    }
  }
  
  type ResolverFunction = MapToFunction[
    ObjectHook[
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveIdHook> : rollup.rollup.ResolveIdHook */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: 'resolveId' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
    ]
  ]
  
  trait ResolverObject extends StObject {
    
    var buildStart: js.UndefOr[
        ObjectHook[
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
        ]
      ] = js.undefined
    
    var resolveId: ResolverFunction
  }
  object ResolverObject {
    
    inline def apply(resolveId: ResolverFunction): ResolverObject = {
      val __obj = js.Dynamic.literal(resolveId = resolveId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverObject]
    }
    
    extension [Self <: ResolverObject](x: Self) {
      
      inline def setBuildStart(
        value: ObjectHook[
              /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
            ]
      ): Self = StObject.set(x, "buildStart", value.asInstanceOf[js.Any])
      
      inline def setBuildStartUndefined: Self = StObject.set(x, "buildStart", js.undefined)
      
      inline def setResolveId(value: ResolverFunction): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RollupAliasOptions extends StObject {
    
    /**
      * Instructs the plugin to use an alternative resolving algorithm,
      * rather than the Rollup's resolver.
      * @default null
      */
    var customResolver: js.UndefOr[ResolverFunction | ResolverObject | Null] = js.undefined
    
    /**
      * Specifies an `Object`, or an `Array` of `Object`,
      * which defines aliases used to replace values in `import` or `require` statements.
      * With either format, the order of the entries is important,
      * in that the first defined rules are applied first.
      */
    var entries: js.UndefOr[js.Array[Alias] | StringDictionary[String]] = js.undefined
  }
  object RollupAliasOptions {
    
    inline def apply(): RollupAliasOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RollupAliasOptions]
    }
    
    extension [Self <: RollupAliasOptions](x: Self) {
      
      inline def setCustomResolver(value: ResolverFunction | ResolverObject): Self = StObject.set(x, "customResolver", value.asInstanceOf[js.Any])
      
      inline def setCustomResolverNull: Self = StObject.set(x, "customResolver", null)
      
      inline def setCustomResolverUndefined: Self = StObject.set(x, "customResolver", js.undefined)
      
      inline def setEntries(value: js.Array[Alias] | StringDictionary[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEntriesVarargs(value: Alias*): Self = StObject.set(x, "entries", js.Array(value*))
    }
  }
}
