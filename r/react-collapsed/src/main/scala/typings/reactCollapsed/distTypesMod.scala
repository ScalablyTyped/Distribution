package typings.reactCollapsed

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Dispatch
import typings.react.mod.MouseEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.react.mod.TransitionEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type AriaBoolean = Boolean
  
  type AssignableRef[ValueType] = (js.Function1[/* instance */ ValueType | Null, Unit]) | (MutableRefObject[ValueType | Null])
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactCollapsed.reactCollapsedStrings.submit
    - typings.reactCollapsed.reactCollapsedStrings.reset
    - typings.reactCollapsed.reactCollapsedStrings.button
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    inline def button: typings.reactCollapsed.reactCollapsedStrings.button = "button".asInstanceOf[typings.reactCollapsed.reactCollapsedStrings.button]
    
    inline def reset: typings.reactCollapsed.reactCollapsedStrings.reset = "reset".asInstanceOf[typings.reactCollapsed.reactCollapsedStrings.reset]
    
    inline def submit: typings.reactCollapsed.reactCollapsedStrings.submit = "submit".asInstanceOf[typings.reactCollapsed.reactCollapsedStrings.submit]
  }
  
  trait GetCollapsePropsInput
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* e */ TransitionEvent[Element], Unit]] = js.undefined
    
    var ref: js.UndefOr[js.Function1[/* node */ ReactNode, js.UndefOr[Unit | Null]]] = js.undefined
    
    var refKey: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object GetCollapsePropsInput {
    
    inline def apply(): GetCollapsePropsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCollapsePropsInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCollapsePropsInput] (val x: Self) extends AnyVal {
      
      inline def setOnTransitionEnd(value: /* e */ TransitionEvent[Element] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setRef(value: /* node */ ReactNode => js.UndefOr[Unit | Null]): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefKey(value: String): Self = StObject.set(x, "refKey", value.asInstanceOf[js.Any])
      
      inline def setRefKeyUndefined: Self = StObject.set(x, "refKey", js.undefined)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GetCollapsePropsOutput extends StObject {
    
    var `aria-hidden`: AriaBoolean
    
    var id: String
    
    def onTransitionEnd(e: TransitionEvent[Element]): Unit
    
    var style: CSSProperties
  }
  object GetCollapsePropsOutput {
    
    inline def apply(
      `aria-hidden`: AriaBoolean,
      id: String,
      onTransitionEnd: TransitionEvent[Element] => Unit,
      style: CSSProperties
    ): GetCollapsePropsOutput = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onTransitionEnd = js.Any.fromFunction1(onTransitionEnd), style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCollapsePropsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCollapsePropsOutput] (val x: Self) extends AnyVal {
      
      inline def `setAria-hidden`(value: AriaBoolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnTransitionEnd(value: TransitionEvent[Element] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTogglePropsInput
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  }
  object GetTogglePropsInput {
    
    inline def apply(): GetTogglePropsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTogglePropsInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTogglePropsInput] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait GetTogglePropsOutput extends StObject {
    
    var `aria-controls`: String
    
    var `aria-expanded`: AriaBoolean
    
    var disabled: Boolean
    
    var id: String
    
    def onClick(e: MouseEvent[Element, NativeMouseEvent]): Unit
    
    var role: String
    
    var tabIndex: Double
    
    var `type`: ButtonType
  }
  object GetTogglePropsOutput {
    
    inline def apply(
      `aria-controls`: String,
      `aria-expanded`: AriaBoolean,
      disabled: Boolean,
      id: String,
      onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      role: String,
      tabIndex: Double,
      `type`: ButtonType
    ): GetTogglePropsOutput = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), role = role.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTogglePropsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTogglePropsOutput] (val x: Self) extends AnyVal {
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-expanded`(value: AriaBoolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseCollapseInput extends StObject {
    
    var collapseStyles: js.UndefOr[js.Object] = js.undefined
    
    var collapsedHeight: js.UndefOr[Double] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var expandStyles: js.UndefOr[js.Object] = js.undefined
    
    var hasDisabledAnimation: js.UndefOr[Boolean] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var onCollapseEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCollapseStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpandEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpandStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object UseCollapseInput {
    
    inline def apply(): UseCollapseInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCollapseInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseCollapseInput] (val x: Self) extends AnyVal {
      
      inline def setCollapseStyles(value: js.Object): Self = StObject.set(x, "collapseStyles", value.asInstanceOf[js.Any])
      
      inline def setCollapseStylesUndefined: Self = StObject.set(x, "collapseStyles", js.undefined)
      
      inline def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setExpandStyles(value: js.Object): Self = StObject.set(x, "expandStyles", value.asInstanceOf[js.Any])
      
      inline def setExpandStylesUndefined: Self = StObject.set(x, "expandStyles", js.undefined)
      
      inline def setHasDisabledAnimation(value: Boolean): Self = StObject.set(x, "hasDisabledAnimation", value.asInstanceOf[js.Any])
      
      inline def setHasDisabledAnimationUndefined: Self = StObject.set(x, "hasDisabledAnimation", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setOnCollapseEnd(value: () => Unit): Self = StObject.set(x, "onCollapseEnd", js.Any.fromFunction0(value))
      
      inline def setOnCollapseEndUndefined: Self = StObject.set(x, "onCollapseEnd", js.undefined)
      
      inline def setOnCollapseStart(value: () => Unit): Self = StObject.set(x, "onCollapseStart", js.Any.fromFunction0(value))
      
      inline def setOnCollapseStartUndefined: Self = StObject.set(x, "onCollapseStart", js.undefined)
      
      inline def setOnExpandEnd(value: () => Unit): Self = StObject.set(x, "onExpandEnd", js.Any.fromFunction0(value))
      
      inline def setOnExpandEndUndefined: Self = StObject.set(x, "onExpandEnd", js.undefined)
      
      inline def setOnExpandStart(value: () => Unit): Self = StObject.set(x, "onExpandStart", js.Any.fromFunction0(value))
      
      inline def setOnExpandStartUndefined: Self = StObject.set(x, "onExpandStart", js.undefined)
    }
  }
  
  @js.native
  trait UseCollapseOutput extends StObject {
    
    def getCollapseProps(): GetCollapsePropsOutput = js.native
    def getCollapseProps(config: GetCollapsePropsInput): GetCollapsePropsOutput = js.native
    
    def getToggleProps(): GetTogglePropsOutput = js.native
    def getToggleProps(config: GetTogglePropsInput): GetTogglePropsOutput = js.native
    
    var isExpanded: Boolean = js.native
    
    var setExpanded: Dispatch[SetStateAction[Boolean]] = js.native
  }
}
