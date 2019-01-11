package typings
package reactDashSelectLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def animatedScrollTo(
    element: reactLib.Element,
    to: scala.Double,
    duration: scala.Double,
    callback: js.Function1[/* element */ reactLib.Element, scala.Unit]
  ): scala.Unit = js.native
  def classNames(): java.lang.String = js.native
  def classNames(prefix: java.lang.String): java.lang.String = js.native
  def classNames(prefix: java.lang.String, cssKey: java.lang.String): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: java.lang.String,
    state: reactDashSelectLib.libTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: java.lang.String,
    state: reactDashSelectLib.libTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: scala.Null,
    state: reactDashSelectLib.libTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: java.lang.String,
    cssKey: scala.Null,
    state: reactDashSelectLib.libTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(prefix: scala.Null, cssKey: java.lang.String): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: java.lang.String,
    state: reactDashSelectLib.libTypesMod.ClassNamesState
  ): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: java.lang.String,
    state: reactDashSelectLib.libTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def classNames(prefix: scala.Null, cssKey: scala.Null, state: reactDashSelectLib.libTypesMod.ClassNamesState): java.lang.String = js.native
  def classNames(
    prefix: scala.Null,
    cssKey: scala.Null,
    state: reactDashSelectLib.libTypesMod.ClassNamesState,
    className: java.lang.String
  ): java.lang.String = js.native
  def cleanValue[OptionType](value: reactDashSelectLib.libTypesMod.ValueType[OptionType]): reactDashSelectLib.libTypesMod.OptionsType[OptionType] = js.native
  def emptyString(): java.lang.String = js.native
  def getBoundingClientObj(element: reactLib.HTMLElement): reactDashSelectLib.Anon_Bottom = js.native
  def getScrollParent(element: reactLib.reactMod.ReactNs.Ref[_]): reactLib.Element = js.native
  def getScrollTop(el: reactLib.Element): scala.Double = js.native
  def handleInputChange(inputValue: java.lang.String, actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta): java.lang.String = js.native
  def handleInputChange(
    inputValue: java.lang.String,
    actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta,
    onInputChange: js.Function2[
      /* inputValue */ java.lang.String, 
      /* actionMeta */ reactDashSelectLib.libTypesMod.InputActionMeta, 
      java.lang.String | scala.Unit
    ]
  ): java.lang.String = js.native
  def isDocumentElement(el: reactLib.Element): scala.Boolean = js.native
  def isMobileDevice(): scala.Boolean = js.native
  def isTouchCapable(): scala.Boolean = js.native
  def noop(): scala.Unit = js.native
  def normalizedHeight(el: reactLib.Element): scala.Double = js.native
  def scrollIntoView(menuEl: reactLib.HTMLElement, focusedEl: reactLib.HTMLElement): scala.Unit = js.native
  def scrollTo(el: reactLib.Element, top: scala.Double): scala.Unit = js.native
  def toKey(str: java.lang.String): java.lang.String = js.native
}

