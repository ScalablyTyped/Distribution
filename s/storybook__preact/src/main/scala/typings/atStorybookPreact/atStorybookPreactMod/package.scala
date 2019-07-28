package typings.atStorybookPreact

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookPreact.Anon_Kind
import typings.preact.preactMod.AnyComponent
import typings.preact.preactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookPreactMod {
  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = (AnyComponent[js.Object, js.Object]) | Element
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
