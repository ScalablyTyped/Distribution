package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlerSchemaChangePolicy extends StObject {
  
  /**
    * The deletion behavior when the crawler finds a deleted object. Valid values: `LOG`, `DELETE_FROM_DATABASE`, or `DEPRECATE_IN_DATABASE`. Defaults to `DEPRECATE_IN_DATABASE`.
    */
  var deleteBehavior: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The update behavior when the crawler finds a changed schema. Valid values: `LOG` or `UPDATE_IN_DATABASE`. Defaults to `UPDATE_IN_DATABASE`.
    */
  var updateBehavior: js.UndefOr[Input[String]] = js.undefined
}
object CrawlerSchemaChangePolicy {
  
  inline def apply(): CrawlerSchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerSchemaChangePolicy]
  }
  
  extension [Self <: CrawlerSchemaChangePolicy](x: Self) {
    
    inline def setDeleteBehavior(value: Input[String]): Self = StObject.set(x, "deleteBehavior", value.asInstanceOf[js.Any])
    
    inline def setDeleteBehaviorUndefined: Self = StObject.set(x, "deleteBehavior", js.undefined)
    
    inline def setUpdateBehavior(value: Input[String]): Self = StObject.set(x, "updateBehavior", value.asInstanceOf[js.Any])
    
    inline def setUpdateBehaviorUndefined: Self = StObject.set(x, "updateBehavior", js.undefined)
  }
}
