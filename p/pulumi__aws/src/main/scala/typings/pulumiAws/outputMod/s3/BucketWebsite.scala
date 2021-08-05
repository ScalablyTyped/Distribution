package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketWebsite extends StObject {
  
  /**
    * An absolute path to the document to return in case of a 4XX error.
    */
  var errorDocument: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
    */
  var indexDocument: js.UndefOr[String] = js.undefined
  
  /**
    * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var redirectAllRequestsTo: js.UndefOr[String] = js.undefined
  
  /**
    * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
    * describing redirect behavior and when redirects are applied.
    */
  var routingRules: js.UndefOr[String] = js.undefined
}
object BucketWebsite {
  
  inline def apply(): BucketWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketWebsite]
  }
  
  extension [Self <: BucketWebsite](x: Self) {
    
    inline def setErrorDocument(value: String): Self = StObject.set(x, "errorDocument", value.asInstanceOf[js.Any])
    
    inline def setErrorDocumentUndefined: Self = StObject.set(x, "errorDocument", js.undefined)
    
    inline def setIndexDocument(value: String): Self = StObject.set(x, "indexDocument", value.asInstanceOf[js.Any])
    
    inline def setIndexDocumentUndefined: Self = StObject.set(x, "indexDocument", js.undefined)
    
    inline def setRedirectAllRequestsTo(value: String): Self = StObject.set(x, "redirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "redirectAllRequestsTo", js.undefined)
    
    inline def setRoutingRules(value: String): Self = StObject.set(x, "routingRules", value.asInstanceOf[js.Any])
    
    inline def setRoutingRulesUndefined: Self = StObject.set(x, "routingRules", js.undefined)
  }
}
