package typings.protractorHttpMock.mod.requests

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request methods type
  */
/* Rewritten from type alias, can be one of: 
  - typings.protractorHttpMock.protractorHttpMockStrings.GET
  - typings.protractorHttpMock.protractorHttpMockStrings.POST
  - typings.protractorHttpMock.protractorHttpMockStrings.DELETE
  - typings.protractorHttpMock.protractorHttpMockStrings.PUT
  - typings.protractorHttpMock.protractorHttpMockStrings.HEAD
  - typings.protractorHttpMock.protractorHttpMockStrings.PATCH
  - typings.protractorHttpMock.protractorHttpMockStrings.JSONP
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typings.protractorHttpMock.protractorHttpMockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.protractorHttpMock.protractorHttpMockStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.protractorHttpMock.protractorHttpMockStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def JSONP: typings.protractorHttpMock.protractorHttpMockStrings.JSONP = this.cast("JSONP")
  @scala.inline
  def PATCH: typings.protractorHttpMock.protractorHttpMockStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.protractorHttpMock.protractorHttpMockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.protractorHttpMock.protractorHttpMockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

