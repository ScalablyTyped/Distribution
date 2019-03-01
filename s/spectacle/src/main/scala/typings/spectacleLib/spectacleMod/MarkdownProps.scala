package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownProps extends js.Object {
  var mdastConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object MarkdownProps {
  @scala.inline
  def apply(
    mdastConfig: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String] = null,
    source: java.lang.String = null
  ): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (mdastConfig != null) __obj.updateDynamic("mdastConfig")(mdastConfig)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MarkdownProps]
  }
}

