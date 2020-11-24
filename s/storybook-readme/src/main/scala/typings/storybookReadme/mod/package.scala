package typings.storybookReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DecoratorPattern = typings.storybookAddons.typesMod.DecoratorFunction[typings.storybookReact.typesMod.StoryFnReactReturnType]
  
  type HOCPattern = typings.storybookAddons.typesMod.DecoratorFunction[typings.storybookReact.typesMod.StoryFnReactReturnType]
  
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Readme = java.lang.String | js.Array[java.lang.String]
  
  type RenderFunction = typings.storybookAddons.typesMod.StoryFn[typings.storybookReact.typesMod.StoryFnReactReturnType]
}
