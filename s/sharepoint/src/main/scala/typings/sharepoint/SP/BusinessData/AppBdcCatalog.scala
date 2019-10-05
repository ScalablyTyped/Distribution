package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.AppBdcCatalog")
@js.native
class AppBdcCatalog () extends ClientObject {
  def getConnectionId(lobSystemName: String, lobSystemInstanceName: String): StringResult = js.native
  def getEntity(namespace: String, name: String): Entity = js.native
  def getLobSystemInstanceProperty(lobSystemName: String, lobSystemInstanceName: String, propertyName: String): StringResult = js.native
  def getLobSystemProperty(lobSystemName: String, propertyName: String): StringResult = js.native
  def getPermissibleConnections(): js.Array[String] = js.native
  def setConnectionId(lobSystemName: String, lobSystemInstanceName: String, connectionId: String): Unit = js.native
  def setLobSystemInstanceProperty(lobSystemName: String, lobSystemInstanceName: String, propertyName: String, propertyValue: String): Unit = js.native
  def setLobSystemProperty(lobSystemName: String, propertyName: String, propertyValue: String): Unit = js.native
}

