package typings.storybookUi.anon

import typings.storybookAddons.distMod.Addon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  var list: js.Array[Addon] = js.native
}
object List {
  
  @scala.inline
  def apply(list: js.Array[Addon]): List = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: js.Array[Addon]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: Addon*): Self = StObject.set(x, "list", js.Array(value :_*))
  }
}
