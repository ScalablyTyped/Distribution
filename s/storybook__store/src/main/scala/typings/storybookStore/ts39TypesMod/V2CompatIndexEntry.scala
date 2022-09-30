package typings.storybookStore.ts39TypesMod

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V2CompatIndexEntry
  extends StObject
     with StoryIndexEntry {
  
  var kind: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['title'] */ js.Any
  
  var parameters: Parameters[js.Function1[/* args */ Any, Any]]
  
  var story: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['name'] */ js.Any
}
object V2CompatIndexEntry {
  
  inline def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    importPath: Path,
    kind: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['title'] */ js.Any,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
    parameters: Parameters[js.Function1[/* args */ Any, Any]],
    story: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['name'] */ js.Any,
    title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  ): V2CompatIndexEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], importPath = importPath.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[V2CompatIndexEntry]
  }
  
  extension [Self <: V2CompatIndexEntry](x: Self) {
    
    inline def setKind(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['title'] */ js.Any
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters[js.Function1[/* args */ Any, Any]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStory(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.StoryIndexEntry['name'] */ js.Any
    ): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
  }
}
