package typings.semanticUiReactEventStack

import typings.react.mod.PureComponent
import typings.semanticUiReactEventStack.anon.Name
import typings.semanticUiReactEventStack.anon.Pool
import typings.semanticUiReactEventStack.anon.ReadonlyEventStackProps
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventStackMod {
  
  @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", JSImport.Default)
  @js.native
  class default () extends EventStack
  /* static members */
  object default {
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", "default.defaultProps")
    @js.native
    def defaultProps: Pool = js.native
    @scala.inline
    def defaultProps_=(x: Pool): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@semantic-ui-react/event-stack/lib/types/EventStack", "default.propTypes")
    @js.native
    def propTypes: Name = js.native
    @scala.inline
    def propTypes_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EventStack
    extends PureComponent[EventStackProps, js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MEventStack(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEventStack(prevProps: EventStackProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MEventStack(): Unit = js.native
    
    def subscribe(props: ReadonlyEventStackProps): Unit = js.native
    
    def unsubscribe(props: ReadonlyEventStackProps): Unit = js.native
  }
  
  @js.native
  trait EventStackProps extends StObject {
    
    /** An event name on which we will subscribe. */
    var name: String = js.native
    
    /** An event handler or array of event handlers. */
    var on: InputEventListener = js.native
    
    /** A name of pool. */
    var pool: js.UndefOr[String] = js.native
    
    /** A DOM element on which we will subscribe. */
    var target: js.UndefOr[InputTargetElement] = js.native
  }
  object EventStackProps {
    
    @scala.inline
    def apply(name: String, on: InputEventListener): EventStackProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventStackProps]
    }
    
    @scala.inline
    implicit class EventStackPropsMutableBuilder[Self <: EventStackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: InputEventListener): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVarargs(value: EventListener*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setTarget(value: InputTargetElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
