package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallId extends js.Object {
  var callId: java.lang.String
  var localTag: java.lang.String
  var remoteTag: java.lang.String
}

object Anon_CallId {
  @scala.inline
  def apply(
    callId: java.lang.String,
    localTag: java.lang.String,
    remoteTag: java.lang.String,
    toString: () => java.lang.String
  ): Anon_CallId = {
    val __obj = js.Dynamic.literal(callId = callId, localTag = localTag, remoteTag = remoteTag, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Anon_CallId]
  }
}

