package typings.semanticUiReactEventStack

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.semanticUiReactEventStack.typesMod.InputEventListener
import typings.semanticUiReactEventStack.typesMod.InputTargetElement
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    /** An event name on which we will subscribe. */
    var name: Validator[String]
    
    /** An event handler or array of event handlers. */
    var on: Validator[
        (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[(js.Function1[/* repeated */ js.Any, js.Any]) | Null])
      ]
    
    /** A name of pool. */
    var pool: Requireable[String]
    
    /** A DOM element on which we will subscribe. */
    var target: Requireable[js.Object]
  }
  object Name {
    
    inline def apply(
      name: Validator[String],
      on: Validator[
          (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[(js.Function1[/* repeated */ js.Any, js.Any]) | Null])
        ],
      pool: Requireable[String],
      target: Requireable[js.Object]
    ): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Validator[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOn(
        value: Validator[
              (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[(js.Function1[/* repeated */ js.Any, js.Any]) | Null])
            ]
      ): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setPool(value: Requireable[String]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Requireable[js.Object]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pool extends StObject {
    
    var pool: String
    
    var target: String
  }
  object Pool {
    
    inline def apply(pool: String, target: String): Pool = {
      val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pool]
    }
    
    extension [Self <: Pool](x: Self) {
      
      inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@semantic-ui-react/event-stack.@semantic-ui-react/event-stack/lib/types/EventStack.EventStackProps> */
  trait ReadonlyEventStackProps extends StObject {
    
    val name: String
    
    val on: InputEventListener
    
    val pool: js.UndefOr[String] = js.undefined
    
    val target: js.UndefOr[InputTargetElement] = js.undefined
  }
  object ReadonlyEventStackProps {
    
    inline def apply(name: String, on: InputEventListener): ReadonlyEventStackProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyEventStackProps]
    }
    
    extension [Self <: ReadonlyEventStackProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOn(value: InputEventListener): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setOnVarargs(value: EventListener*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      inline def setTarget(value: InputTargetElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
