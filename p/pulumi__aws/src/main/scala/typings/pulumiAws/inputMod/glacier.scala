package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacier {
  
  trait VaultNotification extends StObject {
    
    /**
      * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
      */
    var events: Input[js.Array[Input[String]]]
    
    /**
      * The SNS Topic ARN.
      */
    var snsTopic: Input[String]
  }
  object VaultNotification {
    
    inline def apply(events: Input[js.Array[Input[String]]], snsTopic: Input[String]): VaultNotification = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultNotification]
    }
    
    extension [Self <: VaultNotification](x: Self) {
      
      inline def setEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Input[String]*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setSnsTopic(value: Input[String]): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    }
  }
}
