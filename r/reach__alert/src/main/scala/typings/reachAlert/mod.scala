package typings.reachAlert

import typings.reachAlert.reachAlertStrings.assertive
import typings.reachAlert.reachAlertStrings.div
import typings.reachAlert.reachAlertStrings.polite
import typings.reachPolymorphic.mod.ForwardRefComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/alert!
    *
    * An alert is an element that displays a brief, important message in a way that
    * attracts the user's attention without interrupting the user's task.
    * Dynamically rendered alerts are automatically announced by most screen
    * readers, and in some operating systems, they may trigger an alert sound.
    *
    * The approach here is to allow developers to render a visual <Alert> and then
    * we mirror that to a couple of aria-live regions behind the scenes. This way,
    * most of the time, developers don't have to think about visual vs. aria
    * alerts.
    *
    * Limitations: Developers can't read from context inside of an Alert because
    * we aren't using ReactDOM.createPortal(), we're actually creating a couple of
    * brand new React roots. We could use createPortal but then apps would need to
    * render the entire app tree in an <AlertProvider>, or maybe there's a way
    * with default context to do it, but we haven't explored that yet. So, we'll
    * see how this goes. If it becomes a problem we can introduce a portal later.
    *
    * @see Docs     https://reach.tech/alert
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/alert
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#alert
    */
  /**
    * Alert
    *
    * Screen-reader-friendly alert messages. In many apps developers add "alert"
    * messages when network events or other things happen. Users with assistive
    * technologies may not know about the message unless you develop for it.
    *
    * @see Docs https://reach.tech/alert
    */
  @JSImport("@reach/alert", "Alert")
  @js.native
  val Alert: ForwardRefComponent[div, AlertProps] = js.native
  
  /**
    * @see Docs https://reach.tech/alert#alert-props
    */
  trait AlertProps extends StObject {
    
    var children: ReactNode
    
    /**
      * Controls whether the assistive technology should read immediately
      * ("assertive") or wait until the user is idle ("polite").
      *
      * @see Docs https://reach.tech/alert#alert-type
      */
    var `type`: js.UndefOr[assertive | polite] = js.undefined
  }
  object AlertProps {
    
    inline def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setType(value: assertive | polite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
