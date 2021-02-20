package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacier {
  
  @js.native
  trait VaultNotification extends StObject {
    
    /**
      * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
      */
    var events: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The SNS Topic ARN.
      */
    var snsTopic: Input[String] = js.native
  }
  object VaultNotification {
    
    @scala.inline
    def apply(events: Input[js.Array[Input[String]]], snsTopic: Input[String]): VaultNotification = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultNotification]
    }
    
    @scala.inline
    implicit class VaultNotificationMutableBuilder[Self <: VaultNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Input[String]*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setSnsTopic(value: Input[String]): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    }
  }
}
