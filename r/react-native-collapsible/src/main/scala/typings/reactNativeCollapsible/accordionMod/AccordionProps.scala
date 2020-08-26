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

@js.native
trait AccordionProps[T] extends js.Object {
  /**
    * Control which indices in the sections array are currently open. If empty, closes all sections.
    */
  var activeSections: js.Array[Double] = js.native
  /**
    * Alignment of the content when transitioning, can be top, center or bottom
    *
    * @default top
    */
  var align: js.UndefOr[top | center | bottom] = js.native
  /**
    * Optional styling for the Accordion container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Controls whether user can interact with accordion
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration of transition in milliseconds
    *
    * @default 300
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions.
    *
    * @default easeOutCubic
    */
  var easing: js.UndefOr[EasingMode | js.Any] = js.native
  /**
    * Expand content from the bottom instead of the top
    *
    * @default false
    */
  var expandFromBottom: js.UndefOr[Boolean] = js.native
  /**
    * Allow more than one section to be expanded at a time. Defaults to false for legacy behavior.
    *
    * @default false
    */
  var expandMultiple: js.UndefOr[Boolean] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Optional styling for the section container
    */
  var sectionContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * An array of sections passed to the render methods
    */
  var sections: js.Array[T] = js.native
  /**
    * Component to use for the Touchable
    *
    * @default TouchableHighlight
    */
  var touchableComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Object of props to pass to the touchable component
    */
  var touchableProps: js.UndefOr[js.Object] = js.native
  /**
    * The color of the underlay that will show through when tapping on headers.
    *
    * @default black
    */
  var underlayColor: js.UndefOr[String] = js.native
  /**
    * A function that is called when the currently active section(s) are updated.
    */
  def onChange(indexes: js.Array[Double]): Unit = js.native
  /**
    * A function that should return a renderable representing the content
    */
  def renderContent(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
  /**
    * A function that should return a renderable representing the header
    */
  def renderHeader(content: T, index: Double, isActive: Boolean, sections: js.Array[T]): ReactElement = js.native
}

object AccordionProps {
  @scala.inline
  def apply[T](
    activeSections: js.Array[Double],
    onChange: js.Array[Double] => Unit,
    renderContent: (T, Double, Boolean, js.Array[T]) => ReactElement,
    renderHeader: (T, Double, Boolean, js.Array[T]) => ReactElement,
    sections: js.Array[T]
  ): AccordionProps[T] = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps[T]]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps[_], T] (val x: Self with AccordionProps[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveSectionsVarargs(value: Double*): Self = this.set("activeSections", js.Array(value :_*))
    @scala.inline
    def setActiveSections(value: js.Array[Double]): Self = this.set("activeSections", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: js.Array[Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderContent(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = this.set("renderContent", js.Any.fromFunction4(value))
    @scala.inline
    def setRenderHeader(value: (T, Double, Boolean, js.Array[T]) => ReactElement): Self = this.set("renderHeader", js.Any.fromFunction4(value))
    @scala.inline
    def setSectionsVarargs(value: T*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[T]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: top | center | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: EasingMode | js.Any): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setExpandFromBottom(value: Boolean): Self = this.set("expandFromBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandFromBottom: Self = this.set("expandFromBottom", js.undefined)
    @scala.inline
    def setExpandMultiple(value: Boolean): Self = this.set("expandMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandMultiple: Self = this.set("expandMultiple", js.undefined)
    @scala.inline
    def setRenderFooter(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderFooter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    @scala.inline
    def setRenderSectionTitle(
      value: (/* content */ T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => ReactElement
    ): Self = this.set("renderSectionTitle", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRenderSectionTitle: Self = this.set("renderSectionTitle", js.undefined)
    @scala.inline
    def setSectionContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("sectionContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionContainerStyle: Self = this.set("sectionContainerStyle", js.undefined)
    @scala.inline
    def setSectionContainerStyleNull: Self = this.set("sectionContainerStyle", null)
    @scala.inline
    def setTouchableComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("touchableComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchableComponent: Self = this.set("touchableComponent", js.undefined)
    @scala.inline
    def setTouchableProps(value: js.Object): Self = this.set("touchableProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchableProps: Self = this.set("touchableProps", js.undefined)
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
  
}

