package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends StObject {
  
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
  implicit class PredicateMutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbs_before(value: String): Self = StObject.set(x, "abs_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbs_beforeUndefined: Self = StObject.set(x, "abs_before", js.undefined)
    
    @scala.inline
    def setAnd(value: js.Array[Predicate]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    @scala.inline
    def setAndVarargs(value: Predicate*): Self = StObject.set(x, "and", js.Array(value :_*))
    
    @scala.inline
    def setNot(value: Predicate): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setOr(value: js.Array[Predicate]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    @scala.inline
    def setOrVarargs(value: Predicate*): Self = StObject.set(x, "or", js.Array(value :_*))
    
    @scala.inline
    def setRel_before(value: String): Self = StObject.set(x, "rel_before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRel_beforeUndefined: Self = StObject.set(x, "rel_before", js.undefined)
  }
}
