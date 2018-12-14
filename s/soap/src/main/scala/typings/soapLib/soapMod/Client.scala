package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter
     with /* method */ org.scalablytyped.runtime.StringDictionary[ISoapMethod | WSDL | js.Function] {
  def this(wsdl: WSDL) = this()
  def this(wsdl: WSDL, endpoint: java.lang.String) = this()
  def this(wsdl: WSDL, endpoint: java.lang.String, options: IOptions) = this()
  var wsdl: WSDL = js.native
  def addBodyAttribute(bodyAttribute: js.Any): scala.Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: java.lang.String): scala.Unit = js.native
  def addBodyAttribute(bodyAttribute: js.Any, name: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  def addBodyAttribute(
    bodyAttribute: js.Any,
    name: java.lang.String,
    namespace: java.lang.String,
    xmlns: java.lang.String
  ): scala.Unit = js.native
  def addHttpHeader(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def addSoapHeader(soapHeader: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any): scala.Double = js.native
  def addSoapHeader(soapHeader: js.Any, name: java.lang.String, namespace: js.Any, xmlns: java.lang.String): scala.Double = js.native
  def changeSoapHeader(index: scala.Double, soapHeader: js.Any): scala.Unit = js.native
  def changeSoapHeader(index: scala.Double, soapHeader: js.Any, name: java.lang.String): scala.Unit = js.native
  def changeSoapHeader(index: scala.Double, soapHeader: js.Any, name: java.lang.String, namespace: java.lang.String): scala.Unit = js.native
  def changeSoapHeader(
    index: scala.Double,
    soapHeader: js.Any,
    name: java.lang.String,
    namespace: java.lang.String,
    xmlns: java.lang.String
  ): scala.Unit = js.native
  def clearBodyAttributes(): scala.Unit = js.native
  def clearHttpHeaders(): scala.Unit = js.native
  def clearSoapHeaders(): scala.Unit = js.native
  def describe(): js.Any = js.native
  def getBodyAttributes(): js.Array[_] = js.native
  def getHttpHeaders(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getSoapHeaders(): js.Array[java.lang.String] = js.native
  def setEndpoint(endpoint: java.lang.String): scala.Unit = js.native
  def setSOAPAction(action: java.lang.String): scala.Unit = js.native
  def setSecurity(security: ISecurity): scala.Unit = js.native
}

