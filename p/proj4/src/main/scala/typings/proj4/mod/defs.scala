package typings.proj4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("proj4", "defs")
@js.native
object defs extends js.Object {
  def apply(name: String): ProjectionDefinition = js.native
  def apply(name: String, projection: String): Unit = js.native
  def apply(name: String, projection: ProjectionDefinition): Unit = js.native
  def apply(name: js.Array[js.Array[String]]): js.Array[js.UndefOr[scala.Nothing]] = js.native
}

