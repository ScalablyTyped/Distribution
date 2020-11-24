package typings.realm.Realm

import typings.realm.Realm.Services.HTTP
import typings.realm.Realm.Services.MongoDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MongoDB Realm Services bound to an app.
  */
@js.native
trait Services_ extends js.Object {
  
  /** Get the interface to the HTTP service */
  def http(): HTTP = js.native
  def http(serviceName: String): HTTP = js.native
  
  /** Get the interface to the remote MongoDB service */
  def mongodb(): MongoDB = js.native
  def mongodb(serviceName: String): MongoDB = js.native
}
