package typings.reactOverlays

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeFindDOMNodeMod {
  
  @JSImport("react-overlays/cjs/safeFindDOMNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Element | Text | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Element | Text | Null]
  @scala.inline
  def default(componentOrElement: ComponentClass[js.Object, ComponentState]): Element | Text | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentOrElement.asInstanceOf[js.Any]).asInstanceOf[Element | Text | Null]
  @scala.inline
  def default(componentOrElement: Element): Element | Text | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentOrElement.asInstanceOf[js.Any]).asInstanceOf[Element | Text | Null]
}
