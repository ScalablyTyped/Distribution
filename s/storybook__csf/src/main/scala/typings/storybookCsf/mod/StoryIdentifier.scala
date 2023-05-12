package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryIdentifier extends StObject {
  
  var componentId: ComponentId
  
  var id: StoryId
  
  /** @deprecated */
  var kind: ComponentTitle
  
  var name: StoryName
  
  /** @deprecated */
  var story: StoryName
  
  var tags: js.Array[Tag]
  
  var title: ComponentTitle
}
object StoryIdentifier {
  
  inline def apply(
    componentId: ComponentId,
    id: StoryId,
    kind: ComponentTitle,
    name: StoryName,
    story: StoryName,
    tags: js.Array[Tag],
    title: ComponentTitle
  ): StoryIdentifier = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryIdentifier] (val x: Self) extends AnyVal {
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ComponentTitle): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStory(value: StoryName): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: ComponentTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
