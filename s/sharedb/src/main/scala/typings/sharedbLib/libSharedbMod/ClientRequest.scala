package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[JSONValue] {
  /** Short name of the request's action */
  var a: RequestAction
}

object ClientRequest {
  @scala.inline
  def apply(
    a: RequestAction,
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[JSONValue] = null
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ClientRequest]
  }
}

