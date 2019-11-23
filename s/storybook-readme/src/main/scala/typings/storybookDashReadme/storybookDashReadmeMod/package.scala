package typings.storybookDashReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashReadmeMod {
  import typings.atStorybookAddons.distTypesMod.DecoratorFunction
  import typings.atStorybookAddons.distTypesMod.StoryFn
  import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType

  type DecoratorPattern = DecoratorFunction[StoryFnReactReturnType]
  type HOCPattern = DecoratorFunction[StoryFnReactReturnType]
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  type Readme = String | js.Array[String]
  type RenderFunction = StoryFn[StoryFnReactReturnType]
}
