package typings
package serializeDashErrorLib.serializeDashErrorMod.SerializeErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObject
  extends /* keyof */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var message: java.lang.String
  var name: java.lang.String
  var stack: java.lang.String
}

object ErrorObject {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String,
    StringDictionary: /* keyof */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ErrorObject = {
    val __obj = js.Dynamic.literal(message = message, name = name, stack = stack)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ErrorObject]
  }
}

