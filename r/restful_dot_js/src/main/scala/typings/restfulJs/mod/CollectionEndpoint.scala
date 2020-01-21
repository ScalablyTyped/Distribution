package typings.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionEndpoint extends Endpoint[CollectionEndpoint] {
  /**
    * Delete a member in a collection. Returns a promise with the response.
    * @param id
    * @param data
    * @param headers
    */
  def delete[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
  def delete[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def delete[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  /**
    * Get a member in a collection. Returns a promise with an entity.
    * @param id
    */
  def get[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
  def get[T](id: js.Any, params: js.Any): js.Promise[MemberResponse[T]] = js.native
  def get[T](id: js.Any, params: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  /**
    * Get a full collection. Returns a promise with an array of entities.
    */
  def getAll[T](): js.Promise[CollectionResponse[T]] = js.native
  def getAll[T](params: js.Any): js.Promise[CollectionResponse[T]] = js.native
  def getAll[T](params: js.Any, headers: Headers): js.Promise[CollectionResponse[T]] = js.native
  /**
    * Perform a HEAD request on a member in a collection. Returns a promise with the response.
    * @param id
    * @param headers
    */
  def head[T](id: js.Any): js.Promise[MemberResponse[T]] = js.native
  def head[T](id: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  /**
    * Patch a member in a collection. Returns a promise with the response.
    * @param id
    * @param data
    * @param headers
    */
  def patch[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def patch[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  /**
    * Create a member in a collection. Returns a promise with the response.
    */
  def post[T](data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def post[T](data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
  /**
    * Update a member in a collection. Returns a promise with the response.
    * @param id
    * @param data
    * @param headers
    */
  def put[T](id: js.Any, data: js.Any): js.Promise[MemberResponse[T]] = js.native
  def put[T](id: js.Any, data: js.Any, headers: Headers): js.Promise[MemberResponse[T]] = js.native
}

