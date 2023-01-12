package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfAccordion extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfAccordion")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def setAsOpen(): Unit
    
    def toggleHandler(slotId: Double): Unit
  }
  object Methods {
    
    inline def apply(setAsOpen: () => Unit, toggleHandler: Double => Unit): Methods = {
      val __obj = js.Dynamic.literal(setAsOpen = js.Any.fromFunction0(setAsOpen), toggleHandler = js.Any.fromFunction1(toggleHandler))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setSetAsOpen(value: () => Unit): Self = StObject.set(x, "setAsOpen", js.Any.fromFunction0(value))
      
      inline def setToggleHandler(value: Double => Unit): Self = StObject.set(x, "toggleHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var firstOpen: Boolean
    
    var multiple: Boolean
    
    var open: String | js.Array[String]
    
    var showChevron: Boolean
    
    var transition: String
  }
  object Props {
    
    inline def apply(
      firstOpen: Boolean,
      multiple: Boolean,
      open: String | js.Array[String],
      showChevron: Boolean,
      transition: String
    ): Props = {
      val __obj = js.Dynamic.literal(firstOpen = firstOpen.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], showChevron = showChevron.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setFirstOpen(value: Boolean): Self = StObject.set(x, "firstOpen", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String | js.Array[String]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenVarargs(value: String*): Self = StObject.set(x, "open", js.Array(value*))
      
      inline def setShowChevron(value: Boolean): Self = StObject.set(x, "showChevron", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfAccordion.foo` */
  override def _to: Constructor = ^
}
