package typings.reachAlert

import org.scalablytyped.runtime.Shortcut
import typings.reachAlert.reachAlertStrings.assertive
import typings.reachAlert.reachAlertStrings.polite
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod extends Shortcut {
  
  /**
    * Alert
    *
    * Screen-reader-friendly alert messages. In many apps developers add "alert"
    * messages when network events or other things happen. Users with assistive
    * technologies may not know about the message unless you develop for it.
    *
    * @see Docs https://reach.tech/alert
    */
  @JSImport("@reach/alert/dist/declarations/src", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertProps> */ Any = js.native
  
  /**
    * Alert
    *
    * Screen-reader-friendly alert messages. In many apps developers add "alert"
    * messages when network events or other things happen. Users with assistive
    * technologies may not know about the message unless you develop for it.
    *
    * @see Docs https://reach.tech/alert
    */
  @JSImport("@reach/alert/dist/declarations/src", "Alert")
  @js.native
  val Alert: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertProps> */ Any = js.native
  
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
    
    extension [Self <: AlertProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setType(value: assertive | polite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `srcMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', AlertProps> */ Any = default
}
