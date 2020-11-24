package typings.regeneratorRuntime.anon

import typings.regeneratorRuntime.mod.CompletionRecord
import typings.regeneratorRuntime.mod.ContextLocation
import typings.regeneratorRuntime.regeneratorRuntimeStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly tryLoc :'root'} & std.Omit<regenerator-runtime.regenerator-runtime.TryEntry, 'tryLoc'> */
@js.native
trait readonlytryLocrootOmitTry extends js.Object {
  
  var afterLoc: js.UndefOr[ContextLocation] = js.native
  
  var catchLoc: js.UndefOr[Double] = js.native
  
  var completion: js.UndefOr[CompletionRecord] = js.native
  
  var finallyLoc: js.UndefOr[Double] = js.native
  
  val tryLoc: root = js.native
}
object readonlytryLocrootOmitTry {
  
  @scala.inline
  def apply(tryLoc: root): readonlytryLocrootOmitTry = {
    val __obj = js.Dynamic.literal(tryLoc = tryLoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[readonlytryLocrootOmitTry]
  }
  
  @scala.inline
  implicit class readonlytryLocrootOmitTryOps[Self <: readonlytryLocrootOmitTry] (val x: Self) extends AnyVal {
    
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
    def setTryLoc(value: root): Self = this.set("tryLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterLoc(value: ContextLocation): Self = this.set("afterLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterLoc: Self = this.set("afterLoc", js.undefined)
    
    @scala.inline
    def setCatchLoc(value: Double): Self = this.set("catchLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatchLoc: Self = this.set("catchLoc", js.undefined)
    
    @scala.inline
    def setCompletion(value: CompletionRecord): Self = this.set("completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletion: Self = this.set("completion", js.undefined)
    
    @scala.inline
    def setFinallyLoc(value: Double): Self = this.set("finallyLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinallyLoc: Self = this.set("finallyLoc", js.undefined)
  }
}
