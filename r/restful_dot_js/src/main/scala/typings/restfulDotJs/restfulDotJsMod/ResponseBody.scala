package typings.restfulDotJs.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBody[T] extends js.Object {
  def apply(): T = js.native
  /**
    * Query a collection child of the entity.
    * @param entity
    */
  def all(entity: String): CollectionEndpoint = js.native
  /**
    * Get the JS object unserialized from the response body (which must be in JSON)
    */
  def data(): T = js.native
  /**
    * Get the id of the entity.
    */
  def id(): js.Any = js.native
  /**
    * Query a member child of the entity.
    * @param entity
    * @param id
    */
  def one(entity: String, id: js.Any): MemberEndpoint = js.native
  /**
    * Delete the member link to the entity. Returns a promise with the response.
    */
  def remove(): Unit = js.native
  def remove(headers: Headers): Unit = js.native
  /**
    * Update the member link to the entity. Returns a promise with the response.
    * @param headers
    */
  def save(): Unit = js.native
  def save(headers: Headers): Unit = js.native
  /**
    * Get the entity url.
    */
  def url(): String = js.native
}

