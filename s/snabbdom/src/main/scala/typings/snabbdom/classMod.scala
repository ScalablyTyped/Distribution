package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/modules/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  val classModule: Module = js.native
  val default: Module = js.native
  type Classes = Record[String, Boolean]
}

