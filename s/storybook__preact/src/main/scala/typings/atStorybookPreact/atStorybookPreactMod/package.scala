package typings.atStorybookPreact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookPreactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookPreact.Anon_Kind
  import typings.preact.srcMod.AnyComponent
  import typings.react.reactMod.Global.JSXNs.Element

  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = (AnyComponent[js.Object, js.Object]) | Element | typings.preact.srcJsxMod.JSXInternalNs.Element
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
