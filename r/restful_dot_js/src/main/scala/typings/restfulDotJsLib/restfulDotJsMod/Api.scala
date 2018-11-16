package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends Endpoint[Api] {
  def all(name: java.lang.String): CollectionEndpoint = js.native
  def allUrl(name: java.lang.String, url: java.lang.String): CollectionEndpoint = js.native
  def baseUrl(): java.lang.String = js.native
  def baseUrl(protocol: java.lang.String): Api = js.native
  def customUrl(): java.lang.String = js.native
  def customUrl(url: java.lang.String): Api = js.native
  def one(name: java.lang.String, id: js.Any): MemberEndpoint = js.native
  def oneUrl(name: java.lang.String, url: java.lang.String): MemberEndpoint = js.native
  def port(): scala.Double = js.native
  def port(port: scala.Double): Api = js.native
  def prefixUrl(): java.lang.String = js.native
  def prefixUrl(prefix: java.lang.String): Api = js.native
  def protocol(): java.lang.String = js.native
  def protocol(protocol: java.lang.String): Api = js.native
}

