package typings
package reactDashTetherLib.reactDashTetherMod.ReactTetherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherComponentProps
  extends reactLib.reactMod.ReactNs.Props[reactDashTetherLib.reactDashTetherMod.TetherComponent]
     with tetherLib.tetherMod.TetherNs.ITetherOptions {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onRepositioned: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderElementTag: js.UndefOr[java.lang.String] = js.undefined
  var renderElementTo: js.UndefOr[java.lang.String | reactDashTetherLib.Anon_AppendChild] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TetherComponentProps {
  @scala.inline
  def apply(
    attachment: java.lang.String,
    bodyElement: stdLib.HTMLElement = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classPrefix: java.lang.String = null,
    classes: org.scalablytyped.runtime.StringDictionary[scala.Boolean | java.lang.String] = null,
    constraints: js.Array[tetherLib.tetherMod.TetherNs.ITetherConstraint] = null,
    element: stdLib.HTMLElement | java.lang.String | js.Any = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    offset: java.lang.String = null,
    onRepositioned: js.Function0[scala.Unit] = null,
    onUpdate: js.Function0[scala.Unit] = null,
    optimizations: js.Any = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[reactDashTetherLib.reactDashTetherMod.TetherComponent] = null,
    renderElementTag: java.lang.String = null,
    renderElementTo: java.lang.String | reactDashTetherLib.Anon_AppendChild = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    target: stdLib.HTMLElement | java.lang.String | js.Any = null,
    targetAttachment: java.lang.String = null,
    targetModifier: java.lang.String = null,
    targetOffset: java.lang.String = null
  ): TetherComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachment")(attachment)
    if (bodyElement != null) __obj.updateDynamic("bodyElement")(bodyElement)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (constraints != null) __obj.updateDynamic("constraints")(constraints)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (onRepositioned != null) __obj.updateDynamic("onRepositioned")(onRepositioned)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderElementTag != null) __obj.updateDynamic("renderElementTag")(renderElementTag)
    if (renderElementTo != null) __obj.updateDynamic("renderElementTo")(renderElementTo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment)
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier)
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset)
    __obj.asInstanceOf[TetherComponentProps]
  }
}

