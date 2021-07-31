package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsElementMod {
  
  @JSImport("@react-md/utils/types/containsElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def containsElement(container: CheckableThing, child: CheckableThing): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsElement")(container.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type CheckableElement = HTMLElement | Null
  
  type CheckableThing = CheckableElement | MutableRefObject[CheckableElement]
}
