package typings.requireRelative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("require-relative", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(id: String): js.Any = js.native
  def apply(id: String, relativeTo: String): js.Any = js.native
  def resolve(id: String): String = js.native
  def resolve(id: String, relativeTo: String): String = js.native
}

