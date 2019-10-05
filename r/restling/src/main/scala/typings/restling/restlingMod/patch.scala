package typings.restling.restlingMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "patch")
@js.native
object patch extends js.Object {
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
}

