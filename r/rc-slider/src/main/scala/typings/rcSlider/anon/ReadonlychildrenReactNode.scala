package typings.rcSlider.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  children :react.react.ReactNode | undefined}> */
@js.native
trait ReadonlychildrenReactNode extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.native
}
object ReadonlychildrenReactNode {
  
  @scala.inline
  def apply(): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
  
  @scala.inline
  implicit class ReadonlychildrenReactNodeMutableBuilder[Self <: ReadonlychildrenReactNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
