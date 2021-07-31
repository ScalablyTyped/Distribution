package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestination extends StObject {
  
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  var bucket: Input[InventoryDestinationBucket]
}
object InventoryDestination {
  
  @scala.inline
  def apply(bucket: Input[InventoryDestinationBucket]): InventoryDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
  
  @scala.inline
  implicit class InventoryDestinationMutableBuilder[Self <: InventoryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Input[InventoryDestinationBucket]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
  }
}
