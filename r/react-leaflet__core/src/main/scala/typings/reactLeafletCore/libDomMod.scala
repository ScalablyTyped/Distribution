package typings.reactLeafletCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomMod {
  
  @JSImport("@react-leaflet/core/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClassName(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeClassName(element: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateClassName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")().asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: String, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: Unit, prevClassName: Unit, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: String, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateClassName(element: HTMLElement, prevClassName: Unit, nextClassName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateClassName")(element.asInstanceOf[js.Any], prevClassName.asInstanceOf[js.Any], nextClassName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
