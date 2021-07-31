package typings.storybookVue

import typings.storybookAddons.typesMod.Annotations
import typings.storybookAddons.typesMod.BaseMeta
import typings.storybookAddons.typesMod.BaseStory
import typings.storybookVue.typesMod.StoryFnVueReturnType
import typings.vue.optionsMod.AsyncComponent
import typings.vue.optionsMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  trait Meta[Args]
    extends StObject
       with BaseMeta[VueComponent]
       with Annotations[Args, VueReturnType]
  object Meta {
    
    @scala.inline
    def apply[Args](title: String): Meta[Args] = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta[Args]]
    }
  }
  
  @js.native
  trait Story[Args]
    extends StObject
       with BaseStory[Args, VueReturnType]
       with Annotations[Args, VueReturnType]
  
  type VueComponent = (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
  
  type VueReturnType = StoryFnVueReturnType
}
