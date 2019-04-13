package typings
package recaptcha2Lib.recaptcha2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recaptcha2 extends js.Object {
  def formElement(htmlClass: java.lang.String): java.lang.String = js.native
  def getRequestOptions[T /* <: js.Object */](body: T): RequestOptions[T] = js.native
  def translateErrors(errorCodes: java.lang.String): java.lang.String = js.native
  def translateErrors(errorCodes: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def validate(token: java.lang.String): js.Promise[scala.Unit] = js.native
  def validateRequest(req: js.Object, ip: java.lang.String): js.Promise[scala.Unit] = js.native
}

