package typings.soap.soapMod

import typings.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "createClient")
@js.native
object createClient extends js.Object {
  def apply(url: String, callback: CreateClientCallback): Unit = js.native
  def apply(url: String, callback: CreateClientCallback, endpoint: String): Unit = js.native
  def apply(url: String, options: IOptions, callback: CreateClientCallback): Unit = js.native
  def apply(url: String, options: IOptions, callback: CreateClientCallback, endpoint: String): Unit = js.native
}

