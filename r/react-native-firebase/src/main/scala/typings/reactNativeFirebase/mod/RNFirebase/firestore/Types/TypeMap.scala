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

@js.native
trait TypeMap extends js.Object {
  var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string = js.native
  var value: js.Any = js.native
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
  @scala.inline
  implicit class TypeMapOps[Self <: TypeMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(
      value: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

