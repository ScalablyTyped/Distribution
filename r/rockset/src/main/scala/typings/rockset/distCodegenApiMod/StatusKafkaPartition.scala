package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusKafkaPartition extends StObject {
  
  /**
    * Number of documents consumed by this partition
    * @type {number}
    * @memberof StatusKafkaPartition
    */
  var num_documents_processed: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of this partition
    * @type {number}
    * @memberof StatusKafkaPartition
    */
  var partition_number: js.UndefOr[Double] = js.undefined
}
object StatusKafkaPartition {
  
  inline def apply(): StatusKafkaPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusKafkaPartition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusKafkaPartition] (val x: Self) extends AnyVal {
    
    inline def setNum_documents_processed(value: Double): Self = StObject.set(x, "num_documents_processed", value.asInstanceOf[js.Any])
    
    inline def setNum_documents_processedUndefined: Self = StObject.set(x, "num_documents_processed", js.undefined)
    
    inline def setPartition_number(value: Double): Self = StObject.set(x, "partition_number", value.asInstanceOf[js.Any])
    
    inline def setPartition_numberUndefined: Self = StObject.set(x, "partition_number", js.undefined)
  }
}
