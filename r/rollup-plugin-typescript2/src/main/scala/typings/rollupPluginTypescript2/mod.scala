package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.Shortcut
import typings.rollup.mod.PluginImpl
import typings.rollupPluginTypescript2.anon.TypeoftsTypes
import typings.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rollup-plugin-typescript2", JSImport.Default)
  @js.native
  val default: PluginImpl[RPT2Options] = js.native
  
  /* Inlined std.Partial<rollup-plugin-typescript2.rollup-plugin-typescript2/dist/ioptions.IOptions> */
  trait RPT2Options extends StObject {
    
    var abortOnError: js.UndefOr[Boolean] = js.undefined
    
    var cacheRoot: js.UndefOr[String] = js.undefined
    
    var check: js.UndefOr[Boolean] = js.undefined
    
    var clean: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var objectHashIgnoreUnknownHack: js.UndefOr[Boolean] = js.undefined
    
    var rollupCommonJSResolveHack: js.UndefOr[Boolean] = js.undefined
    
    var sourceMapCallback: js.UndefOr[js.Function2[/* id */ String, /* map */ String, Unit]] = js.undefined
    
    var transformers: js.UndefOr[js.Array[TransformerFactoryCreator]] = js.undefined
    
    var tsconfig: js.UndefOr[String] = js.undefined
    
    var tsconfigDefaults: js.UndefOr[Any] = js.undefined
    
    var tsconfigOverride: js.UndefOr[Any] = js.undefined
    
    var typescript: js.UndefOr[TypeoftsTypes] = js.undefined
    
    var useTsconfigDeclarationDir: js.UndefOr[Boolean] = js.undefined
    
    var verbosity: js.UndefOr[Double] = js.undefined
  }
  object RPT2Options {
    
    inline def apply(): RPT2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RPT2Options]
    }
    
    extension [Self <: RPT2Options](x: Self) {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      inline def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      inline def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setObjectHashIgnoreUnknownHack(value: Boolean): Self = StObject.set(x, "objectHashIgnoreUnknownHack", value.asInstanceOf[js.Any])
      
      inline def setObjectHashIgnoreUnknownHackUndefined: Self = StObject.set(x, "objectHashIgnoreUnknownHack", js.undefined)
      
      inline def setRollupCommonJSResolveHack(value: Boolean): Self = StObject.set(x, "rollupCommonJSResolveHack", value.asInstanceOf[js.Any])
      
      inline def setRollupCommonJSResolveHackUndefined: Self = StObject.set(x, "rollupCommonJSResolveHack", js.undefined)
      
      inline def setSourceMapCallback(value: (/* id */ String, /* map */ String) => Unit): Self = StObject.set(x, "sourceMapCallback", js.Any.fromFunction2(value))
      
      inline def setSourceMapCallbackUndefined: Self = StObject.set(x, "sourceMapCallback", js.undefined)
      
      inline def setTransformers(value: js.Array[TransformerFactoryCreator]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: TransformerFactoryCreator*): Self = StObject.set(x, "transformers", js.Array(value*))
      
      inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigDefaults(value: Any): Self = StObject.set(x, "tsconfigDefaults", value.asInstanceOf[js.Any])
      
      inline def setTsconfigDefaultsUndefined: Self = StObject.set(x, "tsconfigDefaults", js.undefined)
      
      inline def setTsconfigOverride(value: Any): Self = StObject.set(x, "tsconfigOverride", value.asInstanceOf[js.Any])
      
      inline def setTsconfigOverrideUndefined: Self = StObject.set(x, "tsconfigOverride", js.undefined)
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
      
      inline def setTypescript(value: TypeoftsTypes): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
      
      inline def setUseTsconfigDeclarationDir(value: Boolean): Self = StObject.set(x, "useTsconfigDeclarationDir", value.asInstanceOf[js.Any])
      
      inline def setUseTsconfigDeclarationDirUndefined: Self = StObject.set(x, "useTsconfigDeclarationDir", js.undefined)
      
      inline def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
      
      inline def setVerbosityUndefined: Self = StObject.set(x, "verbosity", js.undefined)
    }
  }
  
  type _To = PluginImpl[RPT2Options]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginImpl[RPT2Options] = default
}
