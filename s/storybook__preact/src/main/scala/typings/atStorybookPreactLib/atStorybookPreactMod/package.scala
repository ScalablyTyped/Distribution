package typings
package atStorybookPreactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookPreactMod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = (preactLib.preactMod.AnyComponent[js.Object, js.Object]) | preactLib.preactMod.Global.JSXNs.Element
  type StoryDecorator = js.Function2[
    /* story */ RenderFunction, 
    /* context */ atStorybookPreactLib.Anon_Kind, 
    Renderable | scala.Null
  ]
}
