package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionElasticsearch extends StObject {
  
  /**
    * The endpoint of your Elasticsearch domain.
    */
  var endpoint: String
  
  /**
    * The unique identifier for the document you are storing.
    */
  var id: String
  
  /**
    * The Elasticsearch index where you want to store your data.
    */
  var index: String
  
  /**
    * The IAM role ARN that has access to Elasticsearch.
    */
  var roleArn: String
  
  /**
    * The type of document you are storing.
    */
  var `type`: String
}
object TopicRuleErrorActionElasticsearch {
  
  inline def apply(endpoint: String, id: String, index: String, roleArn: String, `type`: String): TopicRuleErrorActionElasticsearch = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionElasticsearch]
  }
  
  extension [Self <: TopicRuleErrorActionElasticsearch](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
