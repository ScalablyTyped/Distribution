package typings
package reactDashSelectLib.srcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def animatedScrollTo(
    element: stdLib.Element,
    to: scala.Double,
    duration: scala.Double,
    callback: js.Function1[/* element */ stdLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def classNames(): java.lang.String = js.native
  def classNames(prefix: java.lang.String): java.lang.String = js.native
  def classNames(prefix: java.lang.String, cssKey: java.lang.String): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: java.lang.String,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: java.lang.String,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: scala.Null,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: scala.Null,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(prefix: scala.Null, cssKey: java.lang.String): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: java.lang.String,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: java.lang.String,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(prefix: scala.Null, cssKey: scala.Null, state: reactDashSelectLib.srcTypesMod.ClassNamesState): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: scala.Null,
    state: reactDashSelectLib.srcTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def cleanValue[OptionType](value: reactDashSelectLib.srcTypesMod.ValueType[OptionType]): reactDashSelectLib.srcTypesMod.OptionsType[OptionType] = js.native
  def emptyString(): java.lang.String = js.native
  def getBoundingClientObj(element: stdLib.HTMLElement): reactDashSelectLib.Anon_Bottom = js.native
  def getScrollParent(element: reactLib.reactMod.Ref[_]): stdLib.Element = js.native
  def getScrollTop(el: stdLib.Element): scala.Double = js.native
  def handleInputChange(inputValue: java.lang.String, actionMeta: reactDashSelectLib.srcTypesMod.InputActionMeta): java.lang.String = js.native
  def handleInputChange(
    inputValue: java.lang.String,
    actionMeta: reactDashSelectLib.srcTypesMod.InputActionMeta,
    onInputChange: js.Function2[
      /* inputValue */ java.lang.String, 
      /* actionMeta */ reactDashSelectLib.srcTypesMod.InputActionMeta, 
      java.lang.String | scala.Unit
    ]
  ): java.lang.String = js.native
  def isDocumentElement(el: stdLib.Element): scala.Boolean = js.native
  def isMobileDevice(): scala.Boolean = js.native
  def isTouchCapable(): scala.Boolean = js.native
  def noop(): scala.Unit = js.native
  def normalizedHeight(el: stdLib.Element): scala.Double = js.native
  def scrollIntoView(menuEl: stdLib.HTMLElement, focusedEl: stdLib.HTMLElement): scala.Unit = js.native
  def scrollTo(el: stdLib.Element, top: scala.Double): scala.Unit = js.native
  def toKey(str: java.lang.String): java.lang.String = js.native
}

