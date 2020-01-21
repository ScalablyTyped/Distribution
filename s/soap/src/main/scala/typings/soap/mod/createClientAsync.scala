package typings.soap.mod

import typings.bluebird.mod.^
import typings.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  def apply(url: String): ^[typings.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions): ^[typings.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): ^[typings.soap.clientMod.Client] = js.native
}

