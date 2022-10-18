package typings.reactMdUtils

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScrollIntoViewMod {
  
  @JSImport("@react-md/utils/types/scrollIntoView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrollIntoView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")().asInstanceOf[Unit]
  inline def scrollIntoView(container: Null, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scrollIntoView(container: HTMLElement, element: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(container.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
