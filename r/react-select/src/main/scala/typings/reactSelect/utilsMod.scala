package typings.reactSelect

import typings.react.mod.Ref
import typings.reactSelect.anon.Bottom
import typings.reactSelect.typesMod.ClassNamesState
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-select/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def animatedScrollTo(element: Window & (/* globalThis */ js.Any), to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(element: Window & (/* globalThis */ js.Any), to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(
    element: Window & (/* globalThis */ js.Any),
    to: Double,
    duration: Double,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ js.Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(
    element: Window & (/* globalThis */ js.Any),
    to: Double,
    duration: Unit,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ js.Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(element: HTMLElement, to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(element: HTMLElement, to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(
    element: HTMLElement,
    to: Double,
    duration: Double,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ js.Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def animatedScrollTo(
    element: HTMLElement,
    to: Double,
    duration: Unit,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ js.Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def classNames(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")().asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: String, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: String, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: String, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Null, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Null, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Null, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Unit, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Unit, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: String, cssKey: Unit, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: String, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: String, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: String, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Null, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Null, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Null, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Unit, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Unit, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Null, cssKey: Unit, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: String, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: String, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: String, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Null, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Null, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Null, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Unit, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Unit, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def classNames(prefix: Unit, cssKey: Unit, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], cssKey.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def cleanValue[OptionType /* <: OptionTypeBase */](value: ValueType[OptionType]): OptionsType[OptionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanValue")(value.asInstanceOf[js.Any]).asInstanceOf[OptionsType[OptionType]]
  
  @scala.inline
  def emptyString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyString")().asInstanceOf[String]
  
  @scala.inline
  def getBoundingClientObj(element: HTMLElement): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientObj")(element.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  @scala.inline
  def getScrollParent(element: Ref[js.Any]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getScrollTop(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def handleInputChange(inputValue: String, actionMeta: InputActionMeta): String = (^.asInstanceOf[js.Dynamic].applyDynamic("handleInputChange")(inputValue.asInstanceOf[js.Any], actionMeta.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def handleInputChange(
    inputValue: String,
    actionMeta: InputActionMeta,
    onInputChange: js.Function2[/* inputValue */ String, /* actionMeta */ InputActionMeta, String | Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("handleInputChange")(inputValue.asInstanceOf[js.Any], actionMeta.asInstanceOf[js.Any], onInputChange.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isDocumentElement(el: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMobileDevice(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileDevice")().asInstanceOf[Boolean]
  
  @scala.inline
  def isTouchCapable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchCapable")().asInstanceOf[Boolean]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def normalizedHeight(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizedHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def scrollIntoView(menuEl: HTMLElement, focusedEl: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(menuEl.asInstanceOf[js.Any], focusedEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def scrollTo(el: Element, top: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(el.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait RectType extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var width: Double
  }
  object RectType {
    
    @scala.inline
    def apply(bottom: Double, height: Double, left: Double, right: Double, width: Double): RectType = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectType]
    }
    
    @scala.inline
    implicit class RectTypeMutableBuilder[Self <: RectType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
