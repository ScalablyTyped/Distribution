package typings.reduxForm

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reduxForm.anon.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormNameMod extends Shortcut {
  
  @JSImport("redux-form/lib/FormName", JSImport.Default)
  @js.native
  val default: FunctionComponent[FormNameProps] = js.native
  
  @JSImport("redux-form/lib/FormName", "FormName")
  @js.native
  val FormName: FunctionComponent[FormNameProps] = js.native
  
  trait FormNameProps extends StObject {
    
    def children(props: Form): ReactNode
  }
  object FormNameProps {
    
    inline def apply(children: Form => ReactNode): FormNameProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[FormNameProps]
    }
    
    extension [Self <: FormNameProps](x: Self) {
      
      inline def setChildren(value: Form => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type _To = FunctionComponent[FormNameProps]
  
  /* This means you don't have to write `default`, but can instead just say `libFormNameMod.foo` */
  override def _to: FunctionComponent[FormNameProps] = default
}
