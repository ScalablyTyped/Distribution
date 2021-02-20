package typings.sipml

import typings.sipml.SIPml.Session.Event
import typings.sipml.SIPml.Session.EventSubscriptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Audio extends StObject {
    
    var audio: Double = js.native
    
    var video: Double = js.native
  }
  object Audio {
    
    @scala.inline
    def apply(audio: Double, video: Double): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Double): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo(value: Double): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Events extends StObject {
    
    var events: EventSubscriptionType | js.Array[EventSubscriptionType] = js.native
    
    def listener(e: Event): Unit = js.native
  }
  object Events {
    
    @scala.inline
    def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Unit): Events = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: EventSubscriptionType | js.Array[EventSubscriptionType]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: EventSubscriptionType*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setListener(value: Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    var events: typings.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typings.sipml.SIPml.Stack.EventSubscriptionType] = js.native
    
    def listener(e: typings.sipml.SIPml.Stack.Event): Unit = js.native
  }
  object Listener {
    
    @scala.inline
    def apply(
      events: typings.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typings.sipml.SIPml.Stack.EventSubscriptionType],
      listener: typings.sipml.SIPml.Stack.Event => Unit
    ): Listener = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], listener = js.Any.fromFunction1(listener))
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit class ListenerMutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(
        value: typings.sipml.SIPml.Stack.EventSubscriptionType | js.Array[typings.sipml.SIPml.Stack.EventSubscriptionType]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: typings.sipml.SIPml.Stack.EventSubscriptionType*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setListener(value: typings.sipml.SIPml.Stack.Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MaxHeight extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
  }
  object MaxHeight {
    
    @scala.inline
    def apply(): MaxHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxHeight]
    }
    
    @scala.inline
    implicit class MaxHeightMutableBuilder[Self <: MaxHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
}
