package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenApiMod.StatusKafka.StateEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusKafka extends StObject {
  
  /**
    * Time at which the last document was consumed from Kafka
    * @type {string}
    * @memberof StatusKafka
    */
  var last_consumed_time: js.UndefOr[String] = js.undefined
  
  /**
    * Number of documents consumed by this Kafka topic
    * @type {number}
    * @memberof StatusKafka
    */
  var num_documents_processed: js.UndefOr[Double] = js.undefined
  
  /**
    * State of the Kafka source
    * @type {string}
    * @memberof StatusKafka
    */
  var state: js.UndefOr[StateEnum] = js.undefined
}
object StatusKafka {
  
  inline def apply(): StatusKafka = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusKafka]
  }
  
  @js.native
  sealed trait StateEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "StatusKafka.StateEnum")
  @js.native
  object StateEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StateEnum & Double] = js.native
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with StateEnum
    /* 1 */ val ACTIVE: typings.rockset.distCodegenApiMod.StatusKafka.StateEnum.ACTIVE & Double = js.native
    
    @js.native
    sealed trait DORMANT
      extends StObject
         with StateEnum
    /* 2 */ val DORMANT: typings.rockset.distCodegenApiMod.StatusKafka.StateEnum.DORMANT & Double = js.native
    
    @js.native
    sealed trait NODOCSYET
      extends StObject
         with StateEnum
    /* 0 */ val NODOCSYET: typings.rockset.distCodegenApiMod.StatusKafka.StateEnum.NODOCSYET & Double = js.native
  }
  
  extension [Self <: StatusKafka](x: Self) {
    
    inline def setLast_consumed_time(value: String): Self = StObject.set(x, "last_consumed_time", value.asInstanceOf[js.Any])
    
    inline def setLast_consumed_timeUndefined: Self = StObject.set(x, "last_consumed_time", js.undefined)
    
    inline def setNum_documents_processed(value: Double): Self = StObject.set(x, "num_documents_processed", value.asInstanceOf[js.Any])
    
    inline def setNum_documents_processedUndefined: Self = StObject.set(x, "num_documents_processed", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
