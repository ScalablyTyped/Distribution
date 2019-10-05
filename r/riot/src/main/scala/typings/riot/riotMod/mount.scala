package typings.riot.riotMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "mount")
@js.native
object mount extends js.Object {
  def apply(selector: String): js.Array[TagInstance] = js.native
  def apply(selector: String, opts: TagOpts): js.Array[TagInstance] = js.native
  def apply(selector: String, tagName: String): js.Array[TagInstance] = js.native
  def apply(selector: String, tagName: String, opts: TagOpts): js.Array[TagInstance] = js.native
  def apply(selector: Element, tagName: String): js.Array[TagInstance] = js.native
  def apply(selector: Element, tagName: String, opts: TagOpts): js.Array[TagInstance] = js.native
}

