package typings.soap.mod

import typings.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends typings.soap.clientMod.Client {
  def this(wsdl: typings.soap.wsdlMod.WSDL) = this()
  def this(wsdl: typings.soap.wsdlMod.WSDL, endpoint: String) = this()
  def this(wsdl: typings.soap.wsdlMod.WSDL, endpoint: String, options: IOptions) = this()
}

