package typings.storybookReact

import typings.react.mod.ComponentType
import typings.storybookAddons.typesMod.Annotations
import typings.storybookAddons.typesMod.BaseMeta
import typings.storybookAddons.typesMod.BaseStory
import typings.storybookReact.typesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  trait Meta[Args]
    extends StObject
       with BaseMeta[ReactComponent]
       with Annotations[Args, ReactReturnType]
  object Meta {
    
    @scala.inline
    def apply[Args](title: String): Meta[Args] = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta[Args]]
    }
  }
  
  type ReactComponent = ComponentType[js.Any]
  
  type ReactReturnType = StoryFnReactReturnType
  
  @js.native
  trait Story[Args]
    extends StObject
       with BaseStory[Args, ReactReturnType]
       with Annotations[Args, ReactReturnType]
}
