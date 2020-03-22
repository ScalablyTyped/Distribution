package typings.reactTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyedProps extends TableCommonProps {
  var key: Key
}

object TableKeyedProps {
  @scala.inline
  def apply(key: Key, className: String = null, style: CSSProperties = null): TableKeyedProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyedProps]
  }
}

