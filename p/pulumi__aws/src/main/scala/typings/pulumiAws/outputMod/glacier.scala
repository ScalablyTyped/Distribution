package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glacier {
  
  trait VaultNotification extends StObject {
    
    /**
      * You can configure a vault to publish a notification for `ArchiveRetrievalCompleted` and `InventoryRetrievalCompleted` events.
      */
    var events: js.Array[String]
    
    /**
      * The SNS Topic ARN.
      */
    var snsTopic: String
  }
  object VaultNotification {
    
    @scala.inline
    def apply(events: js.Array[String], snsTopic: String): VaultNotification = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
      __obj.asInstanceOf[VaultNotification]
    }
    
    @scala.inline
    implicit class VaultNotificationMutableBuilder[Self <: VaultNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setSnsTopic(value: String): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    }
  }
}
