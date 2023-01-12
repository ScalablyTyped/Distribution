package typings.reactMdForm

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFormMessageCounterMod {
  
  @JSImport("@react-md/form/types/FormMessageCounter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormMessageCounter(param0: FormMessageCounterProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("FormMessageCounter")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait FormMessageCounterProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * The children to display in the counter. This is normally a string like:
      *
      * @example
      * String Example
      * ```ts
      * `${min} / ${max}`
      * ```
      */
    @JSName("children")
    var children_FormMessageCounterProps: ReactNode
  }
  object FormMessageCounterProps {
    
    inline def apply(): FormMessageCounterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormMessageCounterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormMessageCounterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
