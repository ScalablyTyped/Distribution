package typings.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typings.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typings.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typings.reactNativeFirebase.reactNativeFirebaseStrings.array
import typings.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typings.reactNativeFirebase.reactNativeFirebaseStrings.date
import typings.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typings.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typings.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typings.reactNativeFirebase.reactNativeFirebaseStrings.number
import typings.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typings.reactNativeFirebase.reactNativeFirebaseStrings.string
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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeMap]
  }
}

