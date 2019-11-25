package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.fieldpath
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFieldPath extends js.Object {
  var elements: js.UndefOr[js.Array[String]] = js.undefined
  var string: js.UndefOr[String] = js.undefined
  var `type`: fieldpath | string
}

object NativeFieldPath {
  @scala.inline
  def apply(`type`: fieldpath | string, elements: js.Array[String] = null, string: String = null): NativeFieldPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFieldPath]
  }
}

