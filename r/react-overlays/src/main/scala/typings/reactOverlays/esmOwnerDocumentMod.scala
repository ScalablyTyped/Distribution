package typings.reactOverlays

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmOwnerDocumentMod {
  
  @JSImport("react-overlays/esm/ownerDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Document]
  inline def default(componentOrElement: ComponentClass[js.Object, ComponentState]): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentOrElement.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def default(componentOrElement: Element): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentOrElement.asInstanceOf[js.Any]).asInstanceOf[Document]
}
