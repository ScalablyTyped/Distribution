package typings.reactNativeFirebase.mod.RNFirebase.database

import typings.reactNativeFirebase.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseStatics extends js.Object {
  /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
  var ServerValue: AnonKey
}

object DatabaseStatics {
  @scala.inline
  def apply(ServerValue: AnonKey): DatabaseStatics = {
    val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseStatics]
  }
}

