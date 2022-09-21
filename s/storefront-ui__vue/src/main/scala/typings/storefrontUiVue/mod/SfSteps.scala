package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.anon.Disabled
import typings.storefrontUiVue.anon.Stepsprogressactivestep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSteps extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSteps")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var parsedSteps: js.Array[Any]
    
    var progress: Stepsprogressactivestep
  }
  object Computed {
    
    inline def apply(parsedSteps: js.Array[Any], progress: Stepsprogressactivestep): Computed = {
      val __obj = js.Dynamic.literal(parsedSteps = parsedSteps.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setParsedSteps(value: js.Array[Any]): Self = StObject.set(x, "parsedSteps", value.asInstanceOf[js.Any])
      
      inline def setParsedStepsVarargs(value: Any*): Self = StObject.set(x, "parsedSteps", js.Array(value*))
      
      inline def setProgress(value: Stepsprogressactivestep): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var steps: js.Array[Any]
  }
  object Data {
    
    inline def apply(steps: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setSteps(value: js.Array[Any]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Any*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def stepClick(props: Disabled): Unit
    
    def updateSteps(step: Any): Unit
  }
  object Methods {
    
    inline def apply(stepClick: Disabled => Unit, updateSteps: Any => Unit): Methods = {
      val __obj = js.Dynamic.literal(stepClick = js.Any.fromFunction1(stepClick), updateSteps = js.Any.fromFunction1(updateSteps))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setStepClick(value: Disabled => Unit): Self = StObject.set(x, "stepClick", js.Any.fromFunction1(value))
      
      inline def setUpdateSteps(value: Any => Unit): Self = StObject.set(x, "updateSteps", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var active: Double
    
    var canGoBack: Boolean
  }
  object Props {
    
    inline def apply(active: Double, canGoBack: Boolean): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], canGoBack = canGoBack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCanGoBack(value: Boolean): Self = StObject.set(x, "canGoBack", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSteps.foo` */
  override def _to: Constructor = ^
}
