package typings
package reactDashFilepondLib.reactDashFilepondMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileProps extends js.Object {
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[reactDashFilepondLib.FilePondOrigin] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var src: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object FileProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    metadata: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null,
    origin: reactDashFilepondLib.FilePondOrigin = null,
    size: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
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

