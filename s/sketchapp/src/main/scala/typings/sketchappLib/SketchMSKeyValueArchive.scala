package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSKeyValueArchive extends js.Object {
  var _archive: SketchMSEncodedBase64BinaryPlist
}

object SketchMSKeyValueArchive {
  @scala.inline
  def apply(_archive: SketchMSEncodedBase64BinaryPlist): SketchMSKeyValueArchive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_archive")(_archive)
    __obj.asInstanceOf[SketchMSKeyValueArchive]
  }
}

