package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import typings.reactNativeFirebase.mod.RNFirebase.firestore.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var error: js.UndefOr[ObserverOnError] = js.undefined
  var next: ObserverOnNext
}

object Observer {
  @scala.inline
  def apply(next: /* querySnapshot */ QuerySnapshot => Unit, error: /* err */ SnapshotError => Unit = null): Observer = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[Observer]
  }
}

