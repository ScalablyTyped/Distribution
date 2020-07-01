package typings.reactColor.compactMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompactPickerStylesProps extends js.Object {
  var Compact: CSSProperties
  var clear: CSSProperties
  var compact: CSSProperties
}

object CompactPickerStylesProps {
  @scala.inline
  def apply(Compact: CSSProperties, clear: CSSProperties, compact: CSSProperties): CompactPickerStylesProps = {
    val __obj = js.Dynamic.literal(Compact = Compact.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactPickerStylesProps]
  }
}

