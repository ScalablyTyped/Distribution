package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddons.hooksMod.HooksContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryContext
  extends StObject
     with StoryIdentifier
     with /* key */ StringDictionary[js.Any] {
  
  var argTypes: ArgTypes
  
  var args: Args
  
  var globals: Args
  
  var hooks: js.UndefOr[HooksContext] = js.undefined
  
  var parameters: Parameters
  
  var viewMode: js.UndefOr[ViewMode] = js.undefined
}
object StoryContext {
  
  inline def apply(
    argTypes: ArgTypes,
    args: Args,
    globals: Args,
    id: StoryId,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters
  ): StoryContext = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryContext]
  }
  
  extension [Self <: StoryContext](x: Self) {
    
    inline def setArgTypes(value: ArgTypes): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setGlobals(value: Args): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setHooks(value: HooksContext): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
