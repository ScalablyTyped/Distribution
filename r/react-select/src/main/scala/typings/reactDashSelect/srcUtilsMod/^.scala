package typings.reactDashSelect.srcUtilsMod

import typings.react.reactMod.Ref
import typings.reactDashSelect.Anon_Bottom
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import typings.reactDashSelect.srcTypesMod.InputActionMeta
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def animatedScrollTo(
    element: Element,
    to: Double,
    duration: Double,
    callback: js.Function1[/* element */ Element, Unit]
  ): Unit = js.native
  def classNames(): String = js.native
  def classNames(prefix: String): String = js.native
  def classNames(prefix: String, cssKey: String): String = js.native
  def classNames(prefix: String, cssKey: String, state: ClassNamesState): String = js.native
  def classNames(prefix: String, cssKey: String, state: ClassNamesState, className: String): String = js.native
  def classNames(prefix: String, cssKey: Null, state: ClassNamesState): String = js.native
  def classNames(prefix: String, cssKey: Null, state: ClassNamesState, className: String): String = js.native
  def classNames(prefix: Null, cssKey: String): String = js.native
  def classNames(prefix: Null, cssKey: String, state: ClassNamesState): String = js.native
  def classNames(prefix: Null, cssKey: String, state: ClassNamesState, className: String): String = js.native
  def classNames(prefix: Null, cssKey: Null, state: ClassNamesState): String = js.native
  def classNames(prefix: Null, cssKey: Null, state: ClassNamesState, className: String): String = js.native
  def cleanValue[OptionType](value: ValueType[OptionType]): OptionsType[OptionType] = js.native
  def emptyString(): String = js.native
  def getBoundingClientObj(element: HTMLElement): Anon_Bottom = js.native
  def getScrollParent(element: Ref[_]): Element = js.native
  def getScrollTop(el: Element): Double = js.native
  def handleInputChange(inputValue: String, actionMeta: InputActionMeta): String = js.native
  def handleInputChange(
    inputValue: String,
    actionMeta: InputActionMeta,
    onInputChange: js.Function2[/* inputValue */ String, /* actionMeta */ InputActionMeta, String | Unit]
  ): String = js.native
  def isDocumentElement(el: Element): Boolean = js.native
  def isMobileDevice(): Boolean = js.native
  def isTouchCapable(): Boolean = js.native
  def noop(): Unit = js.native
  def normalizedHeight(el: Element): Double = js.native
  def scrollIntoView(menuEl: HTMLElement, focusedEl: HTMLElement): Unit = js.native
  def scrollTo(el: Element, top: Double): Unit = js.native
  def toKey(str: String): String = js.native
}

