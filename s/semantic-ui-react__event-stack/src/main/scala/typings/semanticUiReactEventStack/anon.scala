package typings.semanticUiReactEventStack

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Called extends StObject {
    
    var called: js.UndefOr[Boolean] = js.native
  }
  object Called {
    
    @scala.inline
    def apply(): Called = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Called]
    }
    
    @scala.inline
    implicit class CalledMutableBuilder[Self <: Called] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalled(value: Boolean): Self = StObject.set(x, "called", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalledUndefined: Self = StObject.set(x, "called", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    /** An event name on which we will subscribe. */
    var name: Validator[String] = js.native
    
    /** An event handler or array of event handlers. */
    var on: Validator[
        (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
      ] = js.native
    
    /** A name of pool. */
    var pool: Requireable[String] = js.native
    
    /** A DOM element on which we will subscribe. */
    var target: Requireable[js.Object] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(
      name: Validator[String],
      on: Validator[
          (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
        ],
      pool: Requireable[String],
      target: Requireable[js.Object]
    ): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Validator[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(
        value: Validator[
              (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
            ]
      ): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPool(value: Requireable[String]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Requireable[js.Object]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pool extends StObject {
    
    var pool: String = js.native
    
    var target: String = js.native
  }
  object Pool {
    
    @scala.inline
    def apply(pool: String, target: String): Pool = {
      val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pool]
    }
    
    @scala.inline
    implicit class PoolMutableBuilder[Self <: Pool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@semantic-ui-react/event-stack.@semantic-ui-react/event-stack/lib/types/EventStack.EventStackProps> */
  @js.native
  trait ReadonlyEventStackProps extends StObject {
    
    val name: String = js.native
    
    val on: InputEventListener = js.native
    
    val pool: js.UndefOr[String] = js.native
    
    val target: js.UndefOr[InputTargetElement] = js.native
  }
  object ReadonlyEventStackProps {
    
    @scala.inline
    def apply(name: String, on: InputEventListener): ReadonlyEventStackProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyEventStackProps]
    }
    
    @scala.inline
    implicit class ReadonlyEventStackPropsMutableBuilder[Self <: ReadonlyEventStackProps] (val x: Self) extends AnyVal {
      
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
