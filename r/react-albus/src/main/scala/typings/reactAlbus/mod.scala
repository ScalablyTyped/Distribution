package typings.reactAlbus

import typings.history.mod.History
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactAlbus.anon.Basename
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-albus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-albus", "Step")
  @js.native
  val Step: ComponentType[StepProps] = js.native
  
  @JSImport("react-albus", "Steps")
  @js.native
  val Steps: ComponentType[StepsProps] = js.native
  
  @JSImport("react-albus", "WithWizard")
  @js.native
  val WithWizard_ : ComponentType[WizardContextRenderProps] = js.native
  
  @JSImport("react-albus", "Wizard")
  @js.native
  val Wizard: ComponentType[WizardProps] = js.native
  
  inline def withWizard[P](component: ComponentType[P & WizardComponentProps]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWizard")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  trait StepObject extends StObject {
    
    var id: String
  }
  object StepObject {
    
    inline def apply(id: String): StepObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepObject] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type StepProps = StepObject & WizardContextRenderProps
  
  trait StepsProps extends StObject {
    
    var children: NonNullable[ReactNode]
    
    var step: js.UndefOr[StepObject] = js.undefined
  }
  object StepsProps {
    
    inline def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: NonNullable[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStep(value: StepObject): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait WizardComponentProps extends StObject {
    
    var wizard: WizardContext
  }
  object WizardComponentProps {
    
    inline def apply(wizard: WizardContext): WizardComponentProps = {
      val __obj = js.Dynamic.literal(wizard = wizard.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardComponentProps] (val x: Self) extends AnyVal {
      
      inline def setWizard(value: WizardContext): Self = StObject.set(x, "wizard", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WizardContext extends StObject {
    
    def go(n: Double): Unit = js.native
    
    var history: History = js.native
    
    def next(): Unit = js.native
    
    def previous(): Unit = js.native
    
    def push(): Unit = js.native
    def push(id: String): Unit = js.native
    
    def replace(): Unit = js.native
    def replace(id: String): Unit = js.native
    
    var step: StepObject = js.native
    
    var steps: js.Array[StepObject] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAlbus.anon.Render
    - typings.reactAlbus.anon.Children
  */
  trait WizardContextRenderProps extends StObject
  object WizardContextRenderProps {
    
    inline def Children(): typings.reactAlbus.anon.Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactAlbus.anon.Children]
    }
    
    inline def Render(): typings.reactAlbus.anon.Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactAlbus.anon.Render]
    }
  }
  
  type WizardProps = Basename & WizardContextRenderProps
}
