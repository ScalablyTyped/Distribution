package typings
package storybookDashReadmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashReadmeMod {
  type DecoratorPattern = js.Function2[
    /* story */ RenderFunction, 
    /* context */ storybookDashReadmeLib.Anon_Kind, 
    Renderable | scala.Null
  ]
  type HOCPattern = js.Function1[/* story */ RenderFunction, Renderable | scala.Null]
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  type Readme = java.lang.String | js.Array[java.lang.String]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = reactLib.reactMod.ComponentType[js.Object] | reactLib.reactMod.Global.JSXNs.Element
}
