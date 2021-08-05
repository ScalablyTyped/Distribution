package typings.sharepoint.global

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object CSSUtil {
  
  @JSGlobal("CSSUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def AddClass(elem: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddClass")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def HasClass(elem: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("HasClass")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def RemoveClass(elem: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RemoveClass")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCurrentEltStyleByNames(elem: HTMLElement, styleNames: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentEltStyleByNames")(elem.asInstanceOf[js.Any], styleNames.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCurrentStyle(elem: HTMLElement, cssStyle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStyle")(elem.asInstanceOf[js.Any], cssStyle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCurrentStyleCorrect(element: HTMLElement, camelStyleName: String, dashStyleName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStyleCorrect")(element.asInstanceOf[js.Any], camelStyleName.asInstanceOf[js.Any], dashStyleName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getOpacity(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpacity")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def numToPx(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numToPx")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pxToFloat(pxString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pxToFloat")(pxString.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pxToNum(px: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pxToNum")(px.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setOpacity(element: HTMLElement, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOpacity")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
