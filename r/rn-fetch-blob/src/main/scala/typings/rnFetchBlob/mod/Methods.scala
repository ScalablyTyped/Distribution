package typings.rnFetchBlob.mod

import typings.rnFetchBlob.rnFetchBlobStrings.delete_
import typings.rnFetchBlob.rnFetchBlobStrings.get_
import typings.rnFetchBlob.rnFetchBlobStrings.post_
import typings.rnFetchBlob.rnFetchBlobStrings.put_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rnFetchBlob.rnFetchBlobStrings.POST
  - typings.rnFetchBlob.rnFetchBlobStrings.GET
  - typings.rnFetchBlob.rnFetchBlobStrings.DELETE
  - typings.rnFetchBlob.rnFetchBlobStrings.PUT
  - typings.rnFetchBlob.rnFetchBlobStrings.post_
  - typings.rnFetchBlob.rnFetchBlobStrings.get_
  - typings.rnFetchBlob.rnFetchBlobStrings.delete_
  - typings.rnFetchBlob.rnFetchBlobStrings.put_
*/
trait Methods extends js.Object

object Methods {
  @scala.inline
  def DELETE: typings.rnFetchBlob.rnFetchBlobStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.rnFetchBlob.rnFetchBlobStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.rnFetchBlob.rnFetchBlobStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.rnFetchBlob.rnFetchBlobStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def get: get_ = this.cast("get")
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def put: put_ = this.cast("put")
}

