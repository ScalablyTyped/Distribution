package typings.atStorybookReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookReact.Anon_Kind
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.Global.JSX.Element

  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = ComponentType[js.Object] | Element
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
