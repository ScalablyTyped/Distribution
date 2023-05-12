package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptions
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
  
  var declaration: js.UndefOr[Boolean] = js.undefined
  
  var declarationMap: js.UndefOr[Boolean] = js.undefined
  
  var dry: js.UndefOr[Boolean] = js.undefined
  
  var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var incremental: js.UndefOr[Boolean] = js.undefined
  
  var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var traceResolution: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object BuildOptions {
  
  inline def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
    
    inline def setAssumeChangesOnlyAffectDirectDependencies(value: Boolean): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
    
    inline def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
    
    inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationMap(value: Boolean): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
    
    inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
    
    inline def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
    
    inline def setEmitDeclarationOnly(value: Boolean): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
    
    inline def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
    
    inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setTraceResolution(value: Boolean): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
    
    inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
