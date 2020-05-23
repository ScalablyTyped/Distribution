package typings.reactNativeCollapsible.accordionMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCollapsible.mod.EasingMode
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typings.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps[T] extends js.Object {
  /**
    * Control which indices in the sections array are currently open. If empty, closes all sections.
    */
  var activeSections: js.Array[Double]
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Optional styling for the Accordion container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Controls whether user can interact with accordion
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
    *
    * @default easeOutCubic
    */
  var easing: js.UndefOr[EasingMode | js.Any] = js.undefined
  /**
    * Expand content from the bottom instead of the top
    *
    * @default false
    */
  var expandFromBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
    *
    * @default false
    */
  var expandMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that should return a renderable representing the footer
    */
  var renderFooter: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.undefined
  /**
    * A function that should return a renderable representing the section title above the touchable
    */
  var renderSectionTitle: js.UndefOr[
    js.Function4[
      /* content */ T, 
      /* index */ Double, 
      /* isActive */ Boolean, 
      /* sections */ js.Array[T], 
      ReactElement
    ]
  ] = js.undefined
  /**
    * Optional styling for the section container
    */
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * An array of sections passed to the render methods
    */
  var sections: js.Array[T]
  /**
    * Component to use for the Touchable
    *
    * @default TouchableHighlight
    */
  var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Object of props to pass to the touchable component
    */
  var touchableProps: js.UndefOr[js.Object] = js.undefined
  /**
    * The color of the underlay that will show through when tapping on headers.
    *
    * @default black
    */
  var underlayColor: js.UndefOr[String] = js.undefined
  /**
    * A function that is called when the currently active section(s) are updated.
    */
  def onChange(indexes: js.Array[Double]): Unit
  /**
    * A function that should return a renderable representing the content
    */
  def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement
  /**
    * A function that should return a renderable representing the header
    */
  def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement
}

object AccordionProps {
  @scala.inline
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Unit,
    renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
    renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
    sections: js.Array[T],
    align: top | center | bottom = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: EasingMode | js.Any = null,
    expandFromBottom: js.UndefOr[Boolean] = js.undefined,
    expandMultiple: js.UndefOr[Boolean] = js.undefined,
    renderFooter: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    renderSectionTitle: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement = null,
    sectionContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    touchableComponent: ComponentClass[js.Object, ComponentState] = null,
    touchableProps: js.Object = null,
    underlayColor: String = null
  ): AccordionProps[T] = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(expandFromBottom)) __obj.updateDynamic("expandFromBottom")(expandFromBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandMultiple)) __obj.updateDynamic("expandMultiple")(expandMultiple.get.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction4(renderFooter))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction4(renderSectionTitle))
    if (!js.isUndefined(sectionContainerStyle)) __obj.updateDynamic("sectionContainerStyle")(sectionContainerStyle.asInstanceOf[js.Any])
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    if (touchableProps != null) __obj.updateDynamic("touchableProps")(touchableProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps[T]]
  }
}

