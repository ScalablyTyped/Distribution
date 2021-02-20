package typings.reactBroadcast

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactBroadcast.mod.Broadcast.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  class Broadcast[T] protected ()
    extends Component[Props[T], js.Any, js.Any] {
    def this(props: Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[T], context: js.Any) = this()
  }
  object Broadcast {
    
    @js.native
    trait DefaultProps[T] extends StObject {
      
      def compareValues(prevValue: T, nextValue: T): Boolean = js.native
    }
    object DefaultProps {
      
      @scala.inline
      def apply[T](compareValues: (T, T) => Boolean): DefaultProps[T] = {
        val __obj = js.Dynamic.literal(compareValues = js.Any.fromFunction2(compareValues))
        __obj.asInstanceOf[DefaultProps[T]]
      }
      
      @scala.inline
      implicit class DefaultPropsMutableBuilder[Self <: DefaultProps[_], T] (val x: Self with DefaultProps[T]) extends AnyVal {
        
        @scala.inline
        def setCompareValues(value: (T, T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Broadcast.DefaultProps<T>> */
    @js.native
    trait Props[T] extends StObject {
      
      var channel: String = js.native
      
      var children: ReactNode = js.native
      
      var compareValues: js.UndefOr[js.Function2[/* prevValue */ T, /* nextValue */ T, Boolean]] = js.native
      
      var value: T = js.native
    }
    object Props {
      
      @scala.inline
      def apply[T](channel: String, value: T): Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props[T]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
        
        @scala.inline
        def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setCompareValues(value: (/* prevValue */ T, /* nextValue */ T) => Boolean): Self = StObject.set(x, "compareValues", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCompareValuesUndefined: Self = StObject.set(x, "compareValues", js.undefined)
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  class Subscriber[T] protected ()
    extends Component[typings.reactBroadcast.mod.Subscriber.Props[T], js.Any, js.Any] {
    def this(props: typings.reactBroadcast.mod.Subscriber.Props[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactBroadcast.mod.Subscriber.Props[T], context: js.Any) = this()
  }
  object Subscriber {
    
    @js.native
    trait DefaultProps extends StObject {
      
      var quiet: Boolean = js.native
    }
    object DefaultProps {
      
      @scala.inline
      def apply(quiet: Boolean): DefaultProps = {
        val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultProps]
      }
      
      @scala.inline
      implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Partial<react-broadcast.react-broadcast.Subscriber.DefaultProps> */
    @js.native
    trait Props[T] extends StObject {
      
      var channel: String = js.native
      
      var children: js.UndefOr[js.Function1[/* state */ T, ReactNode]] = js.native
      
      var quiet: js.UndefOr[Boolean] = js.native
    }
    object Props {
      
      @scala.inline
      def apply[T](channel: String): typings.reactBroadcast.mod.Subscriber.Props[T] = {
        val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.reactBroadcast.mod.Subscriber.Props[T]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: typings.reactBroadcast.mod.Subscriber.Props[_], T] (val x: Self with typings.reactBroadcast.mod.Subscriber.Props[T]) extends AnyVal {
        
        @scala.inline
        def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildren(value: /* state */ T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      }
    }
  }
}
