package typings.slate.slateMod

import typings.slate.Anon_Operations
import typings.slate.slateStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProperties[T /* <: Controller */] extends js.Object {
  var `object`: js.UndefOr[editor] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* change */ Anon_Operations, Unit]] = js.undefined
  var plugins: js.UndefOr[Plugins[T]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Value] = js.undefined
}

object EditorProperties {
  @scala.inline
  def apply[T /* <: Controller */](
    `object`: editor = null,
    onChange: /* change */ Anon_Operations => Unit = null,
    plugins: Plugins[T] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    value: Value = null
  ): EditorProperties[T] = {
    val __obj = js.Dynamic.literal()
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProperties[T]]
  }
}

