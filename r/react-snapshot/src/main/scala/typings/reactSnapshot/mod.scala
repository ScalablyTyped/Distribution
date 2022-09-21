package typings.reactSnapshot

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(rootComponent: Component[js.Object, js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render(rootComponent: Component[js.Object, js.Object, Any], domElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(rootComponent: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render(rootComponent: Element, domElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
