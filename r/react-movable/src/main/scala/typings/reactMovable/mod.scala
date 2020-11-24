package typings.reactMovable

import typings.reactMovable.anon.LockVertically
import typings.reactMovable.listMod.default
import typings.reactMovable.typesMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-movable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  
  def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  @js.native
  class List[Value] protected () extends default[Value] {
    def this(props: IProps[Value]) = this()
  }
  /* static members */
  @js.native
  object List extends js.Object {
    
    var defaultProps: LockVertically = js.native
  }
}
