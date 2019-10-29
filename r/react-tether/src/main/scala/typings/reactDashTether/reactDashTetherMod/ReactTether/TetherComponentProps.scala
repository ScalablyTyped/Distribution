package typings.reactDashTether.reactDashTetherMod.ReactTether

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import typings.reactDashTether.reactDashTetherMod.TetherComponent
import typings.std.Element
import typings.std.HTMLElement
import typings.tether.tetherMod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TetherComponentProps
  extends Props[TetherComponent]
     with ITetherOptions {
  var className: js.UndefOr[String] = js.undefined
  @JSName("constraints")
  var constraints_TetherComponentProps: js.UndefOr[js.Array[Constraints]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onRepositioned: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* data */ UpdateEventData, Unit]] = js.undefined
  var renderElement: js.UndefOr[RenderProp] = js.undefined
  var renderElementTag: js.UndefOr[String] = js.undefined
  var renderElementTo: js.UndefOr[Element | String] = js.undefined
  var renderTarget: js.UndefOr[RenderProp] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TetherComponentProps {
  @scala.inline
  def apply(
    attachment: String,
    bodyElement: HTMLElement = null,
    children: ReactNode = null,
    className: String = null,
    classPrefix: String = null,
    classes: StringDictionary[Boolean | String] = null,
    constraints: js.Array[Constraints] = null,
    element: HTMLElement | String | js.Any = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    key: Key = null,
    offset: String = null,
    onRepositioned: () => Unit = null,
    onUpdate: /* data */ UpdateEventData => Unit = null,
    optimizations: js.Any = null,
    ref: LegacyRef[TetherComponent] = null,
    renderElement: /* ref */ RefObject[HTMLElement] => ReactNode = null,
    renderElementTag: String = null,
    renderElementTo: Element | String = null,
    renderTarget: /* ref */ RefObject[HTMLElement] => ReactNode = null,
    style: CSSProperties = null,
    target: HTMLElement | String | js.Any = null,
    targetAttachment: String = null,
    targetModifier: String = null,
    targetOffset: String = null
  ): TetherComponentProps = {
    val __obj = js.Dynamic.literal(attachment = attachment)
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
    if (onRepositioned != null) __obj.updateDynamic("onRepositioned")(js.Any.fromFunction0(onRepositioned))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (optimizations != null) __obj.updateDynamic("optimizations")(optimizations)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderElement != null) __obj.updateDynamic("renderElement")(js.Any.fromFunction1(renderElement))
    if (renderElementTag != null) __obj.updateDynamic("renderElementTag")(renderElementTag)
    if (renderElementTo != null) __obj.updateDynamic("renderElementTo")(renderElementTo.asInstanceOf[js.Any])
    if (renderTarget != null) __obj.updateDynamic("renderTarget")(js.Any.fromFunction1(renderTarget))
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetAttachment != null) __obj.updateDynamic("targetAttachment")(targetAttachment)
    if (targetModifier != null) __obj.updateDynamic("targetModifier")(targetModifier)
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset)
    __obj.asInstanceOf[TetherComponentProps]
  }
}

