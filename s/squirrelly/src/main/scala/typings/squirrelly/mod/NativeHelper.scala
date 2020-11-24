package typings.squirrelly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeHelper extends js.Object {
  
  var blocks: js.UndefOr[Blocks] = js.native
  
  var helperEnd: js.UndefOr[js.Function0[String]] = js.native
  
  var helperStart: js.UndefOr[
    js.Function2[/* param */ js.UndefOr[String], /* id */ js.UndefOr[String], String]
  ] = js.native
  
  var selfClosing: js.UndefOr[js.Function1[/* param */ js.UndefOr[String], String]] = js.native
}
object NativeHelper {
  
  @scala.inline
  def apply(): NativeHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeHelper]
  }
  
  @scala.inline
  implicit class NativeHelperOps[Self <: NativeHelper] (val x: Self) extends AnyVal {
    
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
    def setBlocks(value: Blocks): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    
    @scala.inline
    def setHelperEnd(value: () => String): Self = this.set("helperEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHelperEnd: Self = this.set("helperEnd", js.undefined)
    
    @scala.inline
    def setHelperStart(value: (/* param */ js.UndefOr[String], /* id */ js.UndefOr[String]) => String): Self = this.set("helperStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHelperStart: Self = this.set("helperStart", js.undefined)
    
    @scala.inline
    def setSelfClosing(value: /* param */ js.UndefOr[String] => String): Self = this.set("selfClosing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelfClosing: Self = this.set("selfClosing", js.undefined)
  }
}
