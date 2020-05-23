package typings.rbx

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.rbx.anon.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/prop-types-extensions", JSImport.Namespace)
@js.native
object propTypesExtensionsMod extends js.Object {
  val renderablePropType: Requireable[String | (js.Function1[/* repeated */ js.Any, js.Any]) | InferProps[Render]] = js.native
}

