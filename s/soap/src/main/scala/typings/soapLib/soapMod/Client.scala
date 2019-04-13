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
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def getBodyAttributes(): js.Array[_] = js.native
  def getHttpHeaders(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  def getSoapHeaders(): js.Array[java.lang.String] = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def setEndpoint(endpoint: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
  def setSOAPAction(action: java.lang.String): scala.Unit = js.native
  def setSecurity(security: ISecurity): scala.Unit = js.native
}

