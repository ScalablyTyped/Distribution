package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest
  extends /* propertyName */ StringDictionary[js.Any] {
  /** Short name of the request's action */
  var a: RequestAction
}

object ClientRequest {
  @scala.inline
  def apply(a: RequestAction, StringDictionary: /* propertyName */ StringDictionary[js.Any] = null): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ClientRequest]
  }
}

