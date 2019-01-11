package typings
package atStorybookReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookReactMod {
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.Global.JSXNs.Element
  type StoryDecorator = js.Function2[
    /* story */ RenderFunction, 
    /* context */ atStorybookReactLib.Anon_Kind, 
    Renderable | scala.Null
  ]
}
