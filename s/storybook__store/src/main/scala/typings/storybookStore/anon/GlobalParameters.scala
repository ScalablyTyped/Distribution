package typings.storybookStore.anon

import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalParameters extends StObject {
  
  var globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.Globals */ Any
  
  var kindParameters: Parameters[js.Function1[/* args */ Any, Any]]
  
  var stories: Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework, imported_csf.Args> */ Any
  ]
  
  var v: Double
}
object GlobalParameters {
  
  inline def apply(
    globals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.Globals */ Any,
    kindParameters: Parameters[js.Function1[/* args */ Any, Any]],
    stories: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework, imported_csf.Args> */ Any
    ],
    v: Double
  ): GlobalParameters = {
    val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any], kindParameters = kindParameters.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalParameters]
  }
  
  extension [Self <: GlobalParameters](x: Self) {
    
    inline def setGlobals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.Globals */ Any
    ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setKindParameters(value: Parameters[js.Function1[/* args */ Any, Any]]): Self = StObject.set(x, "kindParameters", value.asInstanceOf[js.Any])
    
    inline def setStories(
      value: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework, imported_csf.Args> */ Any
        ]
    ): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
