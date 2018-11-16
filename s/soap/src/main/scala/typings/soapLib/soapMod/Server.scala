package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Server")
@js.native
class Server protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(server: js.Any, path: java.lang.String, services: IServices, wsdl: WSDL, options: IServerOptions) = this()
  var path: java.lang.String = js.native
  var services: IServices = js.native
  var wsdl: WSDL = js.native
  def addSoapHeader(soapHeader: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any, xmlns: java.lang.String): scala.Double = js.native
  def authenticate(security: ISecurity): scala.Boolean = js.native
  def authorizeConnection(req: js.Any): scala.Boolean = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: js.Any, soapHeader: js.Any, name: js.Any, namespace: js.Any, xmlns: js.Any): scala.Unit = js.native
  def clearSoapHeaders(): scala.Unit = js.native
  def getSoapHeaders(): js.Array[java.lang.String] = js.native
  def log(`type`: java.lang.String, data: js.Any): js.Any = js.native
}

