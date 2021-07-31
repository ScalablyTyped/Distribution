package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
trait LimitRangeItem extends StObject {
  
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
    */
  var defaultRequest: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: Input[String]
}
object LimitRangeItem {
  
  @scala.inline
  def apply(`type`: Input[String]): LimitRangeItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
  
  @scala.inline
  implicit class LimitRangeItemMutableBuilder[Self <: LimitRangeItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRequest(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "defaultRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRequestUndefined: Self = StObject.set(x, "defaultRequest", js.undefined)
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMax(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLimitRequestRatio(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "maxLimitRequestRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLimitRequestRatioUndefined: Self = StObject.set(x, "maxLimitRequestRatio", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
