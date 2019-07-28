package typings.reactDashFilepond.reactDashFilepondMod

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
    val __obj = js.Dynamic.literal(src = src)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileProps]
  }
}

