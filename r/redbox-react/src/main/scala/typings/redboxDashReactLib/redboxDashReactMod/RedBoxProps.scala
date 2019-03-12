package typings
package redboxDashReactLib.redboxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedBoxProps
  extends reactLib.reactMod.ReactNs.Props[RedBoxError] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var editorScheme: js.UndefOr[java.lang.String] = js.undefined
  var error: stdLib.Error
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var useColumns: js.UndefOr[scala.Boolean] = js.undefined
  var useLines: js.UndefOr[scala.Boolean] = js.undefined
}

object RedBoxProps {
  @scala.inline
  def apply(
    error: stdLib.Error,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    editorScheme: java.lang.String = null,
    filename: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[RedBoxError] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useColumns: js.UndefOr[scala.Boolean] = js.undefined,
    useLines: js.UndefOr[scala.Boolean] = js.undefined
  ): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (editorScheme != null) __obj.updateDynamic("editorScheme")(editorScheme)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useColumns)) __obj.updateDynamic("useColumns")(useColumns)
    if (!js.isUndefined(useLines)) __obj.updateDynamic("useLines")(useLines)
    __obj.asInstanceOf[RedBoxProps]
  }
}

