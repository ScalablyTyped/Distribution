package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.anon.TypeoftsTypes
import typings.typescript.mod.Bundle
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.LanguageService
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Transformer
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioptionsMod {
  
  trait ICustomTransformer extends StObject {
    
    var after: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
    
    var afterDeclarations: js.UndefOr[TransformerFactory[Bundle | SourceFile]] = js.undefined
    
    var before: js.UndefOr[TransformerFactory[SourceFile]] = js.undefined
  }
  object ICustomTransformer {
    
    inline def apply(): ICustomTransformer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomTransformer]
    }
    
    extension [Self <: ICustomTransformer](x: Self) {
      
      inline def setAfter(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterDeclarations(value: /* context */ TransformationContext => Transformer[Bundle | SourceFile]): Self = StObject.set(x, "afterDeclarations", js.Any.fromFunction1(value))
      
      inline def setAfterDeclarationsUndefined: Self = StObject.set(x, "afterDeclarations", js.undefined)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  trait IOptions extends StObject {
    
    var abortOnError: Boolean
    
    var cacheRoot: String
    
    var check: Boolean
    
    var clean: Boolean
    
    var cwd: String
    
    var exclude: String | js.Array[String]
    
    var include: String | js.Array[String]
    
    var objectHashIgnoreUnknownHack: Boolean
    
    var rollupCommonJSResolveHack: Boolean
    
    def sourceMapCallback(id: String, map: String): Unit
    
    var transformers: js.Array[TransformerFactoryCreator]
    
    var tsconfig: js.UndefOr[String] = js.undefined
    
    var tsconfigDefaults: js.Any
    
    var tsconfigOverride: js.Any
    
    var typescript: TypeoftsTypes
    
    var useTsconfigDeclarationDir: Boolean
    
    var verbosity: Double
  }
  object IOptions {
    
    inline def apply(
      abortOnError: Boolean,
      cacheRoot: String,
      check: Boolean,
      clean: Boolean,
      cwd: String,
      exclude: String | js.Array[String],
      include: String | js.Array[String],
      objectHashIgnoreUnknownHack: Boolean,
      rollupCommonJSResolveHack: Boolean,
      sourceMapCallback: (String, String) => Unit,
      transformers: js.Array[TransformerFactoryCreator],
      tsconfigDefaults: js.Any,
      tsconfigOverride: js.Any,
      typescript: TypeoftsTypes,
      useTsconfigDeclarationDir: Boolean,
      verbosity: Double
    ): IOptions = {
      val __obj = js.Dynamic.literal(abortOnError = abortOnError.asInstanceOf[js.Any], cacheRoot = cacheRoot.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], objectHashIgnoreUnknownHack = objectHashIgnoreUnknownHack.asInstanceOf[js.Any], rollupCommonJSResolveHack = rollupCommonJSResolveHack.asInstanceOf[js.Any], sourceMapCallback = js.Any.fromFunction2(sourceMapCallback), transformers = transformers.asInstanceOf[js.Any], tsconfigDefaults = tsconfigDefaults.asInstanceOf[js.Any], tsconfigOverride = tsconfigOverride.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any], useTsconfigDeclarationDir = useTsconfigDeclarationDir.asInstanceOf[js.Any], verbosity = verbosity.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setObjectHashIgnoreUnknownHack(value: Boolean): Self = StObject.set(x, "objectHashIgnoreUnknownHack", value.asInstanceOf[js.Any])
      
      inline def setRollupCommonJSResolveHack(value: Boolean): Self = StObject.set(x, "rollupCommonJSResolveHack", value.asInstanceOf[js.Any])
      
      inline def setSourceMapCallback(value: (String, String) => Unit): Self = StObject.set(x, "sourceMapCallback", js.Any.fromFunction2(value))
      
      inline def setTransformers(value: js.Array[TransformerFactoryCreator]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersVarargs(value: TransformerFactoryCreator*): Self = StObject.set(x, "transformers", js.Array(value :_*))
      
      inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigDefaults(value: js.Any): Self = StObject.set(x, "tsconfigDefaults", value.asInstanceOf[js.Any])
      
      inline def setTsconfigOverride(value: js.Any): Self = StObject.set(x, "tsconfigOverride", value.asInstanceOf[js.Any])
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
      
      inline def setTypescript(value: TypeoftsTypes): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      inline def setUseTsconfigDeclarationDir(value: Boolean): Self = StObject.set(x, "useTsconfigDeclarationDir", value.asInstanceOf[js.Any])
      
      inline def setVerbosity(value: Double): Self = StObject.set(x, "verbosity", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformerFactoryCreator = js.Function1[/* ls */ LanguageService, CustomTransformers | ICustomTransformer]
}
