package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import typings.reactNativeFirebase.reactNativeFirebaseStrings.fieldpath
import typings.reactNativeFirebase.reactNativeFirebaseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFieldPath extends js.Object {
  var elements: js.UndefOr[js.Array[String]] = js.native
  var string: js.UndefOr[String] = js.native
  var `type`: fieldpath | string = js.native
}

object NativeFieldPath {
  @scala.inline
  def apply(`type`: fieldpath | string): NativeFieldPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFieldPath]
  }
  @scala.inline
  implicit class NativeFieldPathOps[Self <: NativeFieldPath] (val x: Self) extends AnyVal {
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
    def setType(value: fieldpath | string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementsVarargs(value: String*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[String]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
  
}

