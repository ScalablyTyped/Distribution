package typings.rest.mod

import typings.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsePromise extends Promise_[Response] {
  def entity(): Promise_[_] = js.native
  def header(headerName: String): Promise_[_] = js.native
  def headers(): Promise_[Headers] = js.native
  def status(): Promise_[Double] = js.native
}

