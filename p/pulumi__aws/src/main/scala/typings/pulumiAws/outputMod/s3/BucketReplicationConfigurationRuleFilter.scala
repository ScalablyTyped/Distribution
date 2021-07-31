package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRuleFilter extends StObject {
  
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies. Must be less than or equal to 1024 characters in length.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * A map of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}
object BucketReplicationConfigurationRuleFilter {
  
  @scala.inline
  def apply(): BucketReplicationConfigurationRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketReplicationConfigurationRuleFilter]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleFilterMutableBuilder[Self <: BucketReplicationConfigurationRuleFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
