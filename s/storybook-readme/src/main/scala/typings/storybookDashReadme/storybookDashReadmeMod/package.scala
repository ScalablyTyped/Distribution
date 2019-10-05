package typings.storybookDashReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashReadmeMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.Global.JSX.Element
  import typings.storybookDashReadme.Anon_Kind

  type DecoratorPattern = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
  type HOCPattern = js.Function1[/* story */ RenderFunction, Renderable | Null]
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  type Readme = String | js.Array[String]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = ComponentType[js.Object] | Element
}
