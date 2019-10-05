package typings.soap.soapMod

import typings.bluebird.bluebirdMod.^
import typings.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  def apply(url: String): ^[typings.soap.libClientMod.Client] = js.native
  def apply(url: String, options: IOptions): ^[typings.soap.libClientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): ^[typings.soap.libClientMod.Client] = js.native
}

