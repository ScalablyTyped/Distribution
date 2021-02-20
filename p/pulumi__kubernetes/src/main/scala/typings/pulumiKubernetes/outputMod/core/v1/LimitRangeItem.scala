package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
@js.native
trait LimitRangeItem extends StObject {
  
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: StringDictionary[String] = js.native
  
  /**
    * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
    */
  var defaultRequest: StringDictionary[String] = js.native
  
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: StringDictionary[String] = js.native
  
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: StringDictionary[String] = js.native
  
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: StringDictionary[String] = js.native
  
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: String = js.native
}
object LimitRangeItem {
  
  @scala.inline
  def apply(
    default: StringDictionary[String],
    defaultRequest: StringDictionary[String],
    max: StringDictionary[String],
    maxLimitRequestRatio: StringDictionary[String],
    min: StringDictionary[String],
    `type`: String
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], defaultRequest = defaultRequest.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLimitRequestRatio = maxLimitRequestRatio.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
  
  @scala.inline
  implicit class LimitRangeItemMutableBuilder[Self <: LimitRangeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: StringDictionary[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRequest(value: StringDictionary[String]): Self = StObject.set(x, "defaultRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: StringDictionary[String]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLimitRequestRatio(value: StringDictionary[String]): Self = StObject.set(x, "maxLimitRequestRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: StringDictionary[String]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
