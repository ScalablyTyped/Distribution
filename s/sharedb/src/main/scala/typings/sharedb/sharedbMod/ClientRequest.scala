package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  /** Short name of the request's action */
  var a: RequestAction
}

object ClientRequest {
  @scala.inline
  def apply(a: RequestAction, StringDictionary: /* name */ StringDictionary[js.Any] = null): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ClientRequest]
  }
}

