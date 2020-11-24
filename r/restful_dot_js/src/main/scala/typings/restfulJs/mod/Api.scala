package typings.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api extends Endpoint[Api] {
  
  def all(name: String): CollectionEndpoint = js.native
  
  def allUrl(name: String, url: String): CollectionEndpoint = js.native
  
  def baseUrl(): String = js.native
  def baseUrl(protocol: String): Api = js.native
  
  def customUrl(): String = js.native
  def customUrl(url: String): Api = js.native
  
  def one(name: String, id: js.Any): MemberEndpoint = js.native
  
  def oneUrl(name: String, url: String): MemberEndpoint = js.native
  
  def port(): Double = js.native
  def port(port: Double): Api = js.native
  
  def prefixUrl(): String = js.native
  def prefixUrl(prefix: String): Api = js.native
  
  def protocol(): String = js.native
  def protocol(protocol: String): Api = js.native
}
