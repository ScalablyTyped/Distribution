package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRemove extends js.Object {
  
  var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.native
}
object OnRemove {
  
  @scala.inline
  def apply(): OnRemove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRemove]
  }
  
  @scala.inline
  implicit class OnRemoveOps[Self <: OnRemove] (val x: Self) extends AnyVal {
    
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
    def setOnRemove(value: /* decorationSpec */ StringDictionary[js.Any] => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnRemoveNull: Self = this.set("onRemove", null)
  }
}
