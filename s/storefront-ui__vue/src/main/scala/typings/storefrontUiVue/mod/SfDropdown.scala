package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfDropdown extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfDropdown")
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
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def close(): Unit
    
    def keydownHandler(e: KeyboardEvent): Unit
  }
  object Methods {
    
    inline def apply(close: () => Unit, keydownHandler: KeyboardEvent => Unit): Methods = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), keydownHandler = js.Any.fromFunction1(keydownHandler))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setKeydownHandler(value: KeyboardEvent => Unit): Self = StObject.set(x, "keydownHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var isOpen: Boolean
    
    var title: String
  }
  object Props {
    
    inline def apply(isOpen: Boolean, title: String): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfDropdown.foo` */
  override def _to: Constructor = ^
}
