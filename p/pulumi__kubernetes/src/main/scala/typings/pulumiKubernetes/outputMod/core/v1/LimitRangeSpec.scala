package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
trait LimitRangeSpec extends StObject {
  
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  var limits: js.Array[LimitRangeItem]
}
object LimitRangeSpec {
  
  @scala.inline
  def apply(limits: js.Array[LimitRangeItem]): LimitRangeSpec = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeSpec]
  }
  
  @scala.inline
  implicit class LimitRangeSpecMutableBuilder[Self <: LimitRangeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimits(value: js.Array[LimitRangeItem]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsVarargs(value: LimitRangeItem*): Self = StObject.set(x, "limits", js.Array(value :_*))
  }
}
