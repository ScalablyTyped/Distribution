package typings.storybookReact

import typings.react.mod.ComponentType
import typings.storybookAddons.typesMod.Annotations
import typings.storybookAddons.typesMod.BaseMeta
import typings.storybookAddons.typesMod.BaseStory
import typings.storybookReact.typesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  type Meta[Args] = BaseMeta[ReactComponent] with (Annotations[Args, ReactReturnType])
  
  type ReactComponent = ComponentType[js.Any]
  
  type ReactReturnType = StoryFnReactReturnType
  
  type Story[Args] = (BaseStory[Args, ReactReturnType]) with (Annotations[Args, ReactReturnType])
}
