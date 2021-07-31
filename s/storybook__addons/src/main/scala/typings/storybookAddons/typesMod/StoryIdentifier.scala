package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryIdentifier extends StObject {
  
  var id: StoryId
  
  var kind: StoryKind
  
  var name: StoryName
}
object StoryIdentifier {
  
  @scala.inline
  def apply(id: StoryId, kind: StoryKind, name: StoryName): StoryIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryIdentifier]
  }
  
  @scala.inline
  implicit class StoryIdentifierMutableBuilder[Self <: StoryIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
