package typings.reactFilepond.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProps extends js.Object {
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[FilePondOrigin] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var src: String
  var `type`: js.UndefOr[String] = js.undefined
}

object FileProps {
  @scala.inline
  def apply(
    src: String,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    origin: FilePondOrigin = null,
    size: Int | Double = null,
    `type`: String = null
  ): FileProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProps]
  }
}

