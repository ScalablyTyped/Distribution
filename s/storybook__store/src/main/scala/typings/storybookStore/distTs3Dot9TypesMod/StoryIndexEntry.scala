package typings.storybookStore.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryIndexEntry extends StObject {
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  
  var importPath: Path
  
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
  
  var title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
}
object StoryIndexEntry {
  
  inline def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    importPath: Path,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
    title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  ): StoryIndexEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], importPath = importPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryIndexEntry]
  }
  
  extension [Self <: StoryIndexEntry](x: Self) {
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImportPath(value: Path): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
    
    inline def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTitle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
    ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
