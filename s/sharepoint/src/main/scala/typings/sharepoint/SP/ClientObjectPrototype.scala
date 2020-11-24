package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientObjectPrototype extends js.Object {
  
  def retrieve(): Unit = js.native
  def retrieve(propertyNames: js.Array[String]): Unit = js.native
  
  def retrieveCollectionObject(propertyName: String): ClientObjectCollectionPrototype = js.native
  
  def retrieveObject(propertyName: String): ClientObjectPrototype = js.native
}
