package typings.realmNetworkTransport.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TODO: Determine if the shape of an error response is specific to each service or widely used
  */
@JSImport("realm-network-transport", "MongoDBRealmError")
@js.native
class MongoDBRealmError protected () extends Error {
  def this(method: Method, url: String, statusCode: Double, statusText: String, response: js.Any) = this()
  
  val errorCode: js.UndefOr[String] = js.native
  
  val link: js.UndefOr[String] = js.native
  
  val method: Method = js.native
  
  val statusCode: Double = js.native
  
  val statusText: String = js.native
  
  val url: String = js.native
}
