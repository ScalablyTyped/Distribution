package typings.spectacle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownProps extends js.Object {
  var mdastConfig: js.UndefOr[StringDictionary[Double | String]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object MarkdownProps {
  @scala.inline
  def apply(mdastConfig: StringDictionary[Double | String] = null, source: String = null): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (mdastConfig != null) __obj.updateDynamic("mdastConfig")(mdastConfig.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownProps]
  }
}

