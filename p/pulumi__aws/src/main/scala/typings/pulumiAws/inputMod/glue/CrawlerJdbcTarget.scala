package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerJdbcTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var connectionName: Input[String]
  
  /**
    * A list of glob patterns used to exclude from the crawl.
    */
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * The path of the JDBC target.
    */
  var path: Input[String]
}
object CrawlerJdbcTarget {
  
  @scala.inline
  def apply(connectionName: Input[String], path: Input[String]): CrawlerJdbcTarget = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerJdbcTarget]
  }
  
  @scala.inline
  implicit class CrawlerJdbcTargetMutableBuilder[Self <: CrawlerJdbcTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionName(value: Input[String]): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: Input[String]*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
