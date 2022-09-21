package typings.reactBroadcast

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBroadcast.mod.Broadcast.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  open class Broadcast[T] protected () extends Component[Props[T], Any, Any] {
    def this(props: Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[T], context: Any) = this()
  }
  object Broadcast {
    
    trait DefaultProps[T] extends StObject {
      
      def compareValues(prevValue: T, nextValue: T): Boolean
    }
    object DefaultProps {
      
      inline def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
        val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
        __obj.asInstanceOf[DefaultProps[T]]
      }
      
      extension [Self <: DefaultProps[?], T](x: Self & DefaultProps[T]) {
        
        inline def setCompareValues(value: (T, T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> */
    trait Props[T] extends StObject {
      
      var channel: String
      
      var children: ReactNode
      
      var compareValues: js.UndefOr[js.Function2[/* prevValue */ T, /* nextValue */ T, Boolean]] = js.undefined
      
      var value: T
    }
    object Props {
      
      inline def apply[T](channel: String, value: T): Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props[T]]
      }
      
      extension [Self <: Props[?], T](x: Self & Props[T]) {
        
        inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setCompareValues(value: (/* prevValue */ T, /* nextValue */ T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
        
        inline def setCompareValuesUndefined: Self = StObject.set(x, "compareValues", js.undefined)
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  open class Subscriber[T] protected ()
    extends Component[typings.reactBroadcast.mod.Subscriber.Props[T], Any, Any] {
    def this(props: typings.reactBroadcast.mod.Subscriber.Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactBroadcast.mod.Subscriber.Props[T], context: Any) = this()
  }
  object Subscriber {
    
    trait DefaultProps extends StObject {
      
      var quiet: Boolean
    }
    object DefaultProps {
      
      inline def apply(quiet: Boolean): DefaultProps = {
        val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultProps]
      }
      
      extension [Self <: DefaultProps](x: Self) {
        
        inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Subscriber.DefaultProps> */
    trait Props[T] extends StObject {
      
      var channel: String
      
      var children: js.UndefOr[js.Function1[/* state */ T, ReactNode]] = js.undefined
      
      var quiet: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply[T](channel: String): typings.reactBroadcast.mod.Subscriber.Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.reactBroadcast.mod.Subscriber.Props[T]]
      }
      
      extension [Self <: typings.reactBroadcast.mod.Subscriber.Props[?], T](x: Self & typings.reactBroadcast.mod.Subscriber.Props[T]) {
        
        inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        inline def setChildren(value: /* state */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
        
        inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      }
    }
  }
}
