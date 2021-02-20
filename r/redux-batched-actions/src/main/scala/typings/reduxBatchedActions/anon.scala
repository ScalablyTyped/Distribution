package typings.reduxBatchedActions

import typings.reduxBatchedActions.reduxBatchedActionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Batch extends StObject {
    
    var batch: `true` = js.native
  }
  object Batch {
    
    @scala.inline
    def apply(batch: `true`): Batch = {
      val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Batch]
    }
    
    @scala.inline
    implicit class BatchMutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatch(value: `true`): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    }
  }
}
