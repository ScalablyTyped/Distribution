package typings.reactNativeFirebase.mod.RNFirebase.database

import typings.reactNativeFirebase.AnonTIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseStatics extends js.Object {
  /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
  var ServerValue: AnonTIMESTAMP
}

object DatabaseStatics {
  @scala.inline
  def apply(ServerValue: AnonTIMESTAMP): DatabaseStatics = {
    val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseStatics]
  }
}

