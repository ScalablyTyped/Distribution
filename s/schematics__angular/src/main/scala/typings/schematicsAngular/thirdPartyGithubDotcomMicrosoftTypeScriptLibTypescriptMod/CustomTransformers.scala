package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTransformers extends StObject {
  
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.undefined
  
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]] = js.undefined
  
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.undefined
}
object CustomTransformers {
  
  inline def apply(): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTransformers]
  }
  
  extension [Self <: CustomTransformers](x: Self) {
    
    inline def setAfter(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarations(value: js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarationsUndefined: Self = StObject.set(x, "afterDeclarations", js.undefined)
    
    inline def setAfterDeclarationsVarargs(value: ((TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory)*): Self = StObject.set(x, "afterDeclarations", js.Array(value*))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(value: (TransformerFactory[SourceFile] | CustomTransformerFactory)*): Self = StObject.set(x, "before", js.Array(value*))
  }
}
