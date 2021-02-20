package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDestination extends StObject {
  
  /**
    * The S3 bucket configuration where inventory results are published (documented below).
    */
  var bucket: InventoryDestinationBucket = js.native
}
object InventoryDestination {
  
  @scala.inline
  def apply(bucket: InventoryDestinationBucket): InventoryDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
  
  @scala.inline
  implicit class InventoryDestinationMutableBuilder[Self <: InventoryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: InventoryDestinationBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
  }
}
