package typings.slug.slugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slug", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val charmap: CharMap = js.native
  val multicharmap: CharMap = js.native
  def apply(string: String): String = js.native
  def apply(string: String, opts: Mode | String): String = js.native
}

