package typings.storybookStore.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionSpecifier extends StObject {
  
  var args: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ] = js.undefined
  
  var globals: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ] = js.undefined
  
  var storySpecifier: StorySpecifier
  
  var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
}
object SelectionSpecifier {
  
  inline def apply(
    storySpecifier: StorySpecifier,
    viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
  ): SelectionSpecifier = {
    val __obj = js.Dynamic.literal(storySpecifier = storySpecifier.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSpecifier]
  }
  
  extension [Self <: SelectionSpecifier](x: Self) {
    
    inline def setArgs(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setGlobals(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setStorySpecifier(value: StorySpecifier): Self = StObject.set(x, "storySpecifier", value.asInstanceOf[js.Any])
    
    inline def setViewMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
