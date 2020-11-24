package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'beginsWith'> */
@js.native
trait PickImplbeginsWith extends js.Object {
  
  var beginsWith: String = js.native
}
object PickImplbeginsWith {
  
  @scala.inline
  def apply(beginsWith: String): PickImplbeginsWith = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeginsWith]
  }
  
  @scala.inline
  implicit class PickImplbeginsWithOps[Self <: PickImplbeginsWith] (val x: Self) extends AnyVal {
    
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
    def setBeginsWith(value: String): Self = this.set("beginsWith", value.asInstanceOf[js.Any])
  }
}
