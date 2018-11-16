package typings
package sharepointLib.SPNs.BusinessDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.AppBdcCatalog")
@js.native
class AppBdcCatalog ()
  extends sharepointLib.SPNs.ClientObject {
  def getConnectionId(lobSystemName: java.lang.String, lobSystemInstanceName: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  def getEntity(namespace: java.lang.String, name: java.lang.String): Entity = js.native
  def getLobSystemInstanceProperty(
    lobSystemName: java.lang.String,
    lobSystemInstanceName: java.lang.String,
    propertyName: java.lang.String
  ): sharepointLib.SPNs.StringResult = js.native
  def getLobSystemProperty(lobSystemName: java.lang.String, propertyName: java.lang.String): sharepointLib.SPNs.StringResult = js.native
  def getPermissibleConnections(): js.Array[java.lang.String] = js.native
  def setConnectionId(
    lobSystemName: java.lang.String,
    lobSystemInstanceName: java.lang.String,
    connectionId: java.lang.String
  ): scala.Unit = js.native
  def setLobSystemInstanceProperty(
    lobSystemName: java.lang.String,
    lobSystemInstanceName: java.lang.String,
    propertyName: java.lang.String,
    propertyValue: java.lang.String
  ): scala.Unit = js.native
  def setLobSystemProperty(lobSystemName: java.lang.String, propertyName: java.lang.String, propertyValue: java.lang.String): scala.Unit = js.native
}

