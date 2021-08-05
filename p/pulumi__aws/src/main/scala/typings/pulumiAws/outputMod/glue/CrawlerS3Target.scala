package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerS3Target extends StObject {
  
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the DynamoDB table to crawl.
    */
  var path: String
}
object CrawlerS3Target {
  
  inline def apply(path: String): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerS3Target]
  }
  
  extension [Self <: CrawlerS3Target](x: Self) {
    
    inline def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    inline def setExclusions(value: js.Array[String]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: String*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
