package typings.reactDnd

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneWithRefMod {
  
  @JSImport("react-dnd/lib/utils/cloneWithRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cloneWithRef(element: js.Any, newRef: js.Any): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneWithRef")(element.asInstanceOf[js.Any], newRef.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
}
