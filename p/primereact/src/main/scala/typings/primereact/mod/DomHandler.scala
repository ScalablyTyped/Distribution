package typings.primereact.mod

import typings.primereact.anon.Browser
import typings.primereact.anon.Height
import typings.primereact.anon.Left
import typings.primereact.anon.Name
import typings.primereact.anon.Width
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("primereact", "DomHandler")
@js.native
open class DomHandler ()
  extends typings.primereact.utilsMod.DomHandler
/* static members */
object DomHandler {
  
  @JSImport("primereact", "DomHandler")
  @js.native
  val ^ : js.Any = js.native
  
  inline def absolutePosition(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("absolutePosition")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addClass(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addMultipleClasses(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMultipleClasses")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def alignOverlay(overlay: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: String, calculateMinWidth: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any], calculateMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def alignOverlay(overlay: HTMLElement, target: HTMLElement, appendTo: Unit, calculateMinWidth: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alignOverlay")(overlay.asInstanceOf[js.Any], target.asInstanceOf[js.Any], appendTo.asInstanceOf[js.Any], calculateMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendChild(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyStyle(el: HTMLElement, style: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(el.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def calculateScrollbarWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateScrollbarWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def clearSelection(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSelection")().asInstanceOf[Unit]
  
  inline def createInlineStyle(nonce: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineStyle")(nonce.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def exportCSV(csv: Any, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exportCSV")(csv.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fadeIn(el: HTMLElement, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(el.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fadeOut(el: HTMLElement, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(el.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find(el: HTMLElement, selector: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def findCollisionPosition(position: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findCollisionPosition")(position.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def findSingle(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findSingle")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: String, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: String, at: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: String, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def flipfitCollision(el: HTMLElement, target: HTMLElement, my: Unit, at: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flipfitCollision")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any], my.asInstanceOf[js.Any], at.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def focus(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focus(el: HTMLElement, scrollTo: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(el.asInstanceOf[js.Any], scrollTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBrowser(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowser")().asInstanceOf[js.Object]
  
  inline def getBrowserLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserLanguage")().asInstanceOf[String]
  
  inline def getClientHeight(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientHeight")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getClientWidth(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientWidth")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCursorOffset(el: HTMLElement): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: String, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: String, nextText: Unit, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: String, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
  inline def getCursorOffset(el: HTMLElement, prevText: Unit, nextText: Unit, currentText: String): Left = (^.asInstanceOf[js.Dynamic].applyDynamic("getCursorOffset")(el.asInstanceOf[js.Any], prevText.asInstanceOf[js.Any], nextText.asInstanceOf[js.Any], currentText.asInstanceOf[js.Any])).asInstanceOf[Left]
  
  inline def getFirstFocusableElement(el: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getFirstFocusableElement(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFocusableElements(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getFocusableElements(el: HTMLElement, selector: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getHiddenElementDimensions(el: HTMLElement): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementDimensions")(el.asInstanceOf[js.Any]).asInstanceOf[Width]
  
  inline def getHiddenElementOuterHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementOuterHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getHiddenElementOuterWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHiddenElementOuterWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getLastFocusableElement(el: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(el.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getLastFocusableElement(el: HTMLElement, selector: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getOffset(el: HTMLElement): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffset")(el.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  inline def getOuterHeight(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHeight")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getOuterWidth(el: HTMLElement, margin: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterWidth")(el.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getParents(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getParents(el: HTMLElement, parents: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(el.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getScrollableParents(el: HTMLElement): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollableParents")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getTargetElement(target: Any): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetElement")(target.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getUserAgent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserAgent")().asInstanceOf[String]
  
  inline def getViewport(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewport")().asInstanceOf[Height]
  
  inline def getWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getWindowScrollLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollLeft")().asInstanceOf[Double]
  
  inline def getWindowScrollTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowScrollTop")().asInstanceOf[Double]
  
  inline def hasClass(el: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDOM")().asInstanceOf[Boolean]
  
  inline def index(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def innerWidth(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("innerWidth")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def invokeElementMethod(el: HTMLElement, methodName: String, arg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeElementMethod")(el.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  inline def isClickable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClickable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExist(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExist")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isTouchDevice(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchDevice")().asInstanceOf[Boolean]
  
  inline def isVisible(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def relativePosition(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePosition")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeChild(el: HTMLElement, target: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeChild")(el.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeClass(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeInlineStyle(styleElement: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInlineStyle")(styleElement.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def removeMultipleClasses(el: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeMultipleClasses")(el.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveUserAgent(): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgent")().asInstanceOf[Browser]
  
  inline def saveAs(file: Name): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def scrollInView(container: HTMLElement, item: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollInView")(container.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def width(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("width")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
}
