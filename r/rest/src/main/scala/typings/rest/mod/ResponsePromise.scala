package typings.rest.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePromise extends Promise[Response] {
  def entity(): Promise[_] = js.native
  def header(headerName: String): Promise[_] = js.native
  def headers(): Promise[Headers] = js.native
  def status(): Promise[Double] = js.native
}

