package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.recoilStrings.hasValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents[T] extends Loadable[T] {
  
  var contents: T = js.native
  
  var state: hasValue = js.native
}
object Contents {
  
  @scala.inline
  def apply[T](contents: T, state: hasValue): Contents[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents[T]]
  }
  
  @scala.inline
  implicit class ContentsOps[Self <: Contents[_], T] (val x: Self with Contents[T]) extends AnyVal {
    
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
    def setContents(value: T): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: hasValue): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
