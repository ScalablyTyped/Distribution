package typings.recaptcha2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recaptcha2 extends js.Object {
  def formElement(htmlClass: String): String = js.native
  def getRequestOptions[T /* <: js.Object */](body: T): RequestOptions[T] = js.native
  def translateErrors(errorCodes: String): String = js.native
  def translateErrors(errorCodes: js.Array[String]): js.Array[String] = js.native
  def validate(token: String): js.Promise[Unit] = js.native
  def validateRequest(req: js.Object, ip: String): js.Promise[Unit] = js.native
}

