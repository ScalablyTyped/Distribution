package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.`null`
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.`object`
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.array
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.boolean
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.date
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.documentid
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.fieldvalue
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.geopoint
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.number
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.reference
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMap extends js.Object {
  var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
  var value: js.Any
}

object TypeMap {
  @scala.inline
  def apply(
    `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
    value: js.Any
  ): TypeMap = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeMap]
  }
}

