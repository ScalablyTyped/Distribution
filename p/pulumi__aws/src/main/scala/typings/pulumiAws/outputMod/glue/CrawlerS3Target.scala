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
  
  @scala.inline
  def apply(path: String): CrawlerS3Target = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerS3Target]
  }
  
  @scala.inline
  implicit class CrawlerS3TargetMutableBuilder[Self <: CrawlerS3Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
    
    @scala.inline
    def setExclusions(value: js.Array[String]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: String*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
