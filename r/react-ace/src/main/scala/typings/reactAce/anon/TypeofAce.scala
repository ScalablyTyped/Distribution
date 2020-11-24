package typings.reactAce.anon

import org.scalablytyped.runtime.Instantiable1
import typings.aceBuilds.mod.Ace.EditSession
import typings.aceBuilds.mod.Ace.SelectionCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAce extends js.Object {
  
  var Selection: Instantiable = js.native
  
  var SelectionCls: Instantiable1[/* session */ EditSession, typings.aceBuilds.mod.Ace.SelectionCls] = js.native
}
object TypeofAce {
  
  @scala.inline
  def apply(Selection: Instantiable, SelectionCls: Instantiable1[/* session */ EditSession, SelectionCls]): TypeofAce = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], SelectionCls = SelectionCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAce]
  }
  
  @scala.inline
  implicit class TypeofAceOps[Self <: TypeofAce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSelection(value: Instantiable): Self = this.set("Selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionCls(value: Instantiable1[/* session */ EditSession, SelectionCls]): Self = this.set("SelectionCls", value.asInstanceOf[js.Any])
  }
}
