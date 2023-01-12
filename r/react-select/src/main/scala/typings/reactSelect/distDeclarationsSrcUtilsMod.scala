package typings.reactSelect

import typings.reactSelect.anon.Bottom
import typings.reactSelect.distDeclarationsSrcTypesMod.ClassNamesState
import typings.reactSelect.distDeclarationsSrcTypesMod.CommonPropsAndClassName
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.InputActionMeta
import typings.reactSelect.distDeclarationsSrcTypesMod.MultiValue
import typings.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typings.reactSelect.distDeclarationsSrcTypesMod.Options
import typings.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typings.reactSelect.distDeclarationsSrcTypesMod.SingleValue
import typings.reactSelect.reactSelectStrings.className
import typings.reactSelect.reactSelectStrings.clearValue
import typings.reactSelect.reactSelectStrings.cx
import typings.reactSelect.reactSelectStrings.getStyles
import typings.reactSelect.reactSelectStrings.getValue
import typings.reactSelect.reactSelectStrings.hasValue
import typings.reactSelect.reactSelectStrings.isMulti
import typings.reactSelect.reactSelectStrings.isRtl
import typings.reactSelect.reactSelectStrings.options
import typings.reactSelect.reactSelectStrings.selectOption
import typings.reactSelect.reactSelectStrings.selectProps
import typings.reactSelect.reactSelectStrings.setValue
import typings.reactSelect.reactSelectStrings.theme
import typings.std.HTMLElement
import typings.std.Omit
import typings.std.Partial
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUtilsMod {
  
  @JSImport("react-select/dist/declarations/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animatedScrollTo(element: Window & (/* globalThis */ Any), to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(element: Window & (/* globalThis */ Any), to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(
    element: Window & (/* globalThis */ Any),
    to: Double,
    duration: Double,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(
    element: Window & (/* globalThis */ Any),
    to: Double,
    duration: Unit,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(element: HTMLElement, to: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(element: HTMLElement, to: Double, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(
    element: HTMLElement,
    to: Double,
    duration: Double,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def animatedScrollTo(
    element: HTMLElement,
    to: Double,
    duration: Unit,
    callback: js.Function1[/* element */ HTMLElement | (Window & (/* globalThis */ Any)), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("animatedScrollTo")(element.asInstanceOf[js.Any], to.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def classNames(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")().asInstanceOf[String]
  inline def classNames(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def classNames(prefix: String, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: String, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: String, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Null, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Null, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Null, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Unit, state: Unit, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Unit, state: ClassNamesState): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def classNames(prefix: Unit, state: ClassNamesState, className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(prefix.asInstanceOf[js.Any], state.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def cleanCommonProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](props: (Partial[CommonPropsAndClassName[Option, IsMulti, Group]]) & AdditionalProps): Omit[
    AdditionalProps, 
    /* keyof react-select.react-select/dist/declarations/src/types.CommonPropsAndClassName<Option, IsMulti, Group> */ className | cx | getStyles | hasValue | isMulti | isRtl | options | selectProps | theme | clearValue | getValue | selectOption | setValue
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanCommonProps")(props.asInstanceOf[js.Any]).asInstanceOf[Omit[
    AdditionalProps, 
    /* keyof react-select.react-select/dist/declarations/src/types.CommonPropsAndClassName<Option, IsMulti, Group> */ className | cx | getStyles | hasValue | isMulti | isRtl | options | selectProps | theme | clearValue | getValue | selectOption | setValue
  ]]
  
  inline def cleanValue[Option](value: PropsValue[Option]): Options[Option] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanValue")(value.asInstanceOf[js.Any]).asInstanceOf[Options[Option]]
  
  inline def emptyString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyString")().asInstanceOf[String]
  
  inline def getBoundingClientObj(element: HTMLElement): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundingClientObj")(element.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def getScrollParent(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollParent")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def getScrollTop(el: Window & (/* globalThis */ Any)): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollTop(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def handleInputChange(inputValue: String, actionMeta: InputActionMeta): String = (^.asInstanceOf[js.Dynamic].applyDynamic("handleInputChange")(inputValue.asInstanceOf[js.Any], actionMeta.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def handleInputChange(
    inputValue: String,
    actionMeta: InputActionMeta,
    onInputChange: js.Function2[/* newValue */ String, /* actionMeta */ InputActionMeta, String | Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("handleInputChange")(inputValue.asInstanceOf[js.Any], actionMeta.asInstanceOf[js.Any], onInputChange.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isArray[T](arg: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isDocumentElement(el: Window & (/* globalThis */ Any)): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDocumentElement(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMobileDevice(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobileDevice")().asInstanceOf[Boolean]
  
  inline def isTouchCapable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchCapable")().asInstanceOf[Boolean]
  
  inline def multiValueAsValue[Option, IsMulti /* <: Boolean */](multiValue: MultiValue[Option]): OnChangeValue[Option, IsMulti] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiValueAsValue")(multiValue.asInstanceOf[js.Any]).asInstanceOf[OnChangeValue[Option, IsMulti]]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def normalizedHeight(el: Window & (/* globalThis */ Any)): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizedHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def normalizedHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizedHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def notNullish[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notNullish")().asInstanceOf[/* is T */ Boolean]
  inline def notNullish[T](item: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notNullish")(item.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def removeProps[Props /* <: js.Object */, K /* <: js.Array[String] */](
    propsObj: Props,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param properties because its type K is not an array type */ properties: K
  ): Omit[
    Props, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProps")(propsObj.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Omit[
    Props, 
    /* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any
  ]]
  
  inline def scrollIntoView(menuEl: HTMLElement, focusedEl: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(menuEl.asInstanceOf[js.Any], focusedEl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollTo(el: Window & (/* globalThis */ Any), top: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(el.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollTo(el: HTMLElement, top: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(el.asInstanceOf[js.Any], top.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def singleValueAsValue[Option, IsMulti /* <: Boolean */](singleValue: SingleValue[Option]): OnChangeValue[Option, IsMulti] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleValueAsValue")(singleValue.asInstanceOf[js.Any]).asInstanceOf[OnChangeValue[Option, IsMulti]]
  
  @JSImport("react-select/dist/declarations/src/utils", "supportsPassiveEvents")
  @js.native
  val supportsPassiveEvents: Boolean = js.native
  
  inline def toKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def valueTernary[Option, IsMulti /* <: Boolean */](isMulti: IsMulti, multiValue: MultiValue[Option], singleValue: SingleValue[Option]): OnChangeValue[Option, IsMulti] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueTernary")(isMulti.asInstanceOf[js.Any], multiValue.asInstanceOf[js.Any], singleValue.asInstanceOf[js.Any])).asInstanceOf[OnChangeValue[Option, IsMulti]]
  inline def valueTernary[Option, IsMulti /* <: Boolean */](isMulti: Unit, multiValue: MultiValue[Option], singleValue: SingleValue[Option]): OnChangeValue[Option, IsMulti] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueTernary")(isMulti.asInstanceOf[js.Any], multiValue.asInstanceOf[js.Any], singleValue.asInstanceOf[js.Any])).asInstanceOf[OnChangeValue[Option, IsMulti]]
  
  trait RectType extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var width: Double
  }
  object RectType {
    
    inline def apply(bottom: Double, height: Double, left: Double, right: Double, width: Double): RectType = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectType] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
