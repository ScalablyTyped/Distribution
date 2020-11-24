package typings.relayRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _FragmentRefs[Refs /* <: String */] extends js.Object {
  
  @JSName(" $fragmentRefs")
  var Space$fragmentRefs: FragmentRefs[Refs] = js.native
}
object _FragmentRefs {
  
  @scala.inline
  def apply[Refs /* <: String */](Space$fragmentRefs: FragmentRefs[Refs]): _FragmentRefs[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FragmentRefs[Refs]]
  }
  
  @scala.inline
  implicit class _FragmentRefsOps[Self <: _FragmentRefs[_], Refs /* <: String */] (val x: Self with _FragmentRefs[Refs]) extends AnyVal {
    
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
    def setSpace$fragmentRefs(value: FragmentRefs[Refs]): Self = this.set(" $fragmentRefs", value.asInstanceOf[js.Any])
  }
}
