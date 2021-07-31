package typings.sortobject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Object */](obj: T): T = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def apply[T /* <: js.Object */](obj: T, comparator: js.Function2[/* a */ String, /* b */ String, Double]): T = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("sortobject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
