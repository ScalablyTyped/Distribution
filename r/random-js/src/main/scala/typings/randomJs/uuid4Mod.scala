package typings.randomJs

import typings.randomJs.typesMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/uuid4", JSImport.Namespace)
@js.native
object uuid4Mod extends js.Object {
  def uuid4(engine: Engine): String = js.native
}

