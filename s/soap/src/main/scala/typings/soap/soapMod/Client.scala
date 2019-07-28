package typings.soap.soapMod

import typings.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends typings.soap.libClientMod.Client {
  def this(wsdl: typings.soap.libWsdlMod.WSDL) = this()
  def this(wsdl: typings.soap.libWsdlMod.WSDL, endpoint: String) = this()
  def this(wsdl: typings.soap.libWsdlMod.WSDL, endpoint: String, options: IOptions) = this()
}

