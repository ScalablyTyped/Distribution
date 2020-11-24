package typings.reactNavigationCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCurrentOptions extends js.Object {
  
  def addOptionsGetter(key: String, getter: js.Function0[js.UndefOr[js.Object | Null]]): js.Function0[Unit] = js.native
  
  def getCurrentOptions(): js.UndefOr[js.Object | Null] = js.native
}
object GetCurrentOptions {
  
  @scala.inline
  def apply(
    addOptionsGetter: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit],
    getCurrentOptions: () => js.UndefOr[js.Object | Null]
  ): GetCurrentOptions = {
    val __obj = js.Dynamic.literal(addOptionsGetter = js.Any.fromFunction2(addOptionsGetter), getCurrentOptions = js.Any.fromFunction0(getCurrentOptions))
    __obj.asInstanceOf[GetCurrentOptions]
  }
  
  @scala.inline
  implicit class GetCurrentOptionsOps[Self <: GetCurrentOptions] (val x: Self) extends AnyVal {
    
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
    def setAddOptionsGetter(value: (String, js.Function0[js.UndefOr[js.Object | Null]]) => js.Function0[Unit]): Self = this.set("addOptionsGetter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCurrentOptions(value: () => js.UndefOr[js.Object | Null]): Self = this.set("getCurrentOptions", js.Any.fromFunction0(value))
  }
}
