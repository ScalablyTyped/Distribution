package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectPrototype")
@js.native
class ClientObjectPrototype () extends js.Object {
  def retrieve(): Unit = js.native
  def retrieve(propertyNames: js.Array[String]): Unit = js.native
  def retrieveCollectionObject(propertyName: String): ClientObjectCollectionPrototype = js.native
  def retrieveObject(propertyName: String): ClientObjectPrototype = js.native
}

