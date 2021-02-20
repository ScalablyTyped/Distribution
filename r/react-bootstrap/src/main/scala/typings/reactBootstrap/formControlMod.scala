package typings.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import typings.reactBootstrap.mod.Sizes
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlMod {
  
  @JSImport("react-bootstrap/lib/FormControl", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FormControlProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/FormControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/FormControl", "Feedback")
  @js.native
  class Feedback ()
    extends typings.reactBootstrap.formControlFeedbackMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/FormControl", "Feedback")
  @js.native
  def Feedback: Instantiable0[typings.reactBootstrap.formControlFeedbackMod.^] = js.native
  @scala.inline
  def Feedback_=(x: Instantiable0[typings.reactBootstrap.formControlFeedbackMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Feedback")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/FormControl", "Static")
  @js.native
  class Static ()
    extends typings.reactBootstrap.formControlStaticMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/FormControl", "Static")
  @js.native
  def Static: Instantiable0[typings.reactBootstrap.formControlStaticMod.^] = js.native
  @scala.inline
  def Static_=(x: Instantiable0[typings.reactBootstrap.formControlStaticMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Static")(x.asInstanceOf[js.Any])
  
  @js.native
  trait FormControl
    extends Component[FormControlProps, js.Object, js.Any]
  
  @js.native
  trait FormControlProps extends HTMLProps[FormControl] {
    
    var bsClass: js.UndefOr[String] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
    
    var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement, Unit]] = js.native
  }
  object FormControlProps {
    
    @scala.inline
    def apply(): FormControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlProps]
    }
    
    @scala.inline
    implicit class FormControlPropsMutableBuilder[Self <: FormControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* instance */ HTMLInputElement => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    }
  }
}
