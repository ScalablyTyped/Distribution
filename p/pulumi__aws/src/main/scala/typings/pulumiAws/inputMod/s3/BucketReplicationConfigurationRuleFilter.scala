package typings.pulumiAws.inputMod.s3

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleFilter extends StObject {
  
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A map of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object BucketReplicationConfigurationRuleFilter {
  
  inline def apply(): BucketReplicationConfigurationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketReplicationConfigurationRuleFilter]
  }
  
  extension [Self <: BucketReplicationConfigurationRuleFilter](x: Self) {
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
