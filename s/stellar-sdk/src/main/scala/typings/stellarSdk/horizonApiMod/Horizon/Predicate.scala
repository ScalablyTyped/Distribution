package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends js.Object {
  
  var abs_before: js.UndefOr[String] = js.native
  
  var and: js.UndefOr[js.Array[Predicate]] = js.native
  
  var not: js.UndefOr[Predicate] = js.native
  
  var or: js.UndefOr[js.Array[Predicate]] = js.native
  
  var rel_before: js.UndefOr[String] = js.native
}
object Predicate {
  
  @scala.inline
  def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    
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
    def setAbs_before(value: String): Self = this.set("abs_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbs_before: Self = this.set("abs_before", js.undefined)
    
    @scala.inline
    def setAndVarargs(value: Predicate*): Self = this.set("and", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: js.Array[Predicate]): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    
    @scala.inline
    def setNot(value: Predicate): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setOrVarargs(value: Predicate*): Self = this.set("or", js.Array(value :_*))
    
    @scala.inline
    def setOr(value: js.Array[Predicate]): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    
    @scala.inline
    def setRel_before(value: String): Self = this.set("rel_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel_before: Self = this.set("rel_before", js.undefined)
  }
}
