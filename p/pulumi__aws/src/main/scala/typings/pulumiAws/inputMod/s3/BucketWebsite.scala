package typings.pulumiAws.inputMod.s3

import typings.pulumiAws.routingRulesMod.RoutingRule
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketWebsite extends StObject {
  
  /**
    * An absolute path to the document to return in case of a 4XX error.
    */
  var errorDocument: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
    */
  var indexDocument: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var redirectAllRequestsTo: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
    * describing redirect behavior and when redirects are applied.
    */
  var routingRules: js.UndefOr[Input[String | js.Array[Input[RoutingRule]]]] = js.undefined
}
object BucketWebsite {
  
  @scala.inline
  def apply(): BucketWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketWebsite]
  }
  
  @scala.inline
  implicit class BucketWebsiteMutableBuilder[Self <: BucketWebsite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDocument(value: Input[String]): Self = StObject.set(x, "errorDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDocumentUndefined: Self = StObject.set(x, "errorDocument", js.undefined)
    
    @scala.inline
    def setIndexDocument(value: Input[String]): Self = StObject.set(x, "indexDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexDocumentUndefined: Self = StObject.set(x, "indexDocument", js.undefined)
    
    @scala.inline
    def setRedirectAllRequestsTo(value: Input[String]): Self = StObject.set(x, "redirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "redirectAllRequestsTo", js.undefined)
    
    @scala.inline
    def setRoutingRules(value: Input[String | js.Array[Input[RoutingRule]]]): Self = StObject.set(x, "routingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingRulesUndefined: Self = StObject.set(x, "routingRules", js.undefined)
    
    @scala.inline
    def setRoutingRulesVarargs(value: Input[RoutingRule]*): Self = StObject.set(x, "routingRules", js.Array(value :_*))
  }
}
