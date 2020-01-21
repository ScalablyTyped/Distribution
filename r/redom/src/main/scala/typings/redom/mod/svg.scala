package typings.redom.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "svg")
@js.native
object svg extends js.Object {
  def apply(query: RedomQuery, args: RedomQueryArgument*): SVGElement = js.native
  def extend(query: RedomQuery): RedomComponentConstructor = js.native
}

