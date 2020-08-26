package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/build/package/modules/props", JSImport.Namespace)
@js.native
object propsMod extends js.Object {
  val propsModule: Module = js.native
  type Props = Record[String, js.Any]
}

