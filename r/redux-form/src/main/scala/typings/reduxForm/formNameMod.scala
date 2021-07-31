package typings.reduxForm

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.reduxForm.anon.Form
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formNameMod extends Shortcut {
  
  @JSImport("redux-form/lib/FormName", JSImport.Default)
  @js.native
  val default: StatelessComponent[FormNameProps] = js.native
  
  @JSImport("redux-form/lib/FormName", "FormName")
  @js.native
  val FormName: StatelessComponent[FormNameProps] = js.native
  
  trait FormNameProps extends StObject {
    
    def children(props: Form): ReactNode
  }
  object FormNameProps {
    
    @scala.inline
    def apply(children: Form => ReactNode): FormNameProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[FormNameProps]
    }
    
    @scala.inline
    implicit class FormNamePropsMutableBuilder[Self <: FormNameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Form => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type _To = StatelessComponent[FormNameProps]
  
  /* This means you don't have to write `default`, but can instead just say `formNameMod.foo` */
  override def _to: StatelessComponent[FormNameProps] = default
}
