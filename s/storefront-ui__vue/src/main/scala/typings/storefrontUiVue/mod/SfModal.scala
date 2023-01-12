package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfModal extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfModal")
  @js.native
  val ^ : Constructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(data: () => Data, methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var className: String | Null
    
    var staticClass: String | Null
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal(className = null, staticClass = null)
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
      
      inline def setStaticClassNull: Self = StObject.set(x, "staticClass", null)
    }
  }
  
  trait Methods extends StObject {
    
    def checkPersistence(): Unit
    
    def classHandler(): Unit
    
    def close(): Unit
    
    def keydownHandler(e: KeyboardEvent): Unit
  }
  object Methods {
    
    inline def apply(
      checkPersistence: () => Unit,
      classHandler: () => Unit,
      close: () => Unit,
      keydownHandler: KeyboardEvent => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(checkPersistence = js.Any.fromFunction0(checkPersistence), classHandler = js.Any.fromFunction0(classHandler), close = js.Any.fromFunction0(close), keydownHandler = js.Any.fromFunction1(keydownHandler))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setCheckPersistence(value: () => Unit): Self = StObject.set(x, "checkPersistence", js.Any.fromFunction0(value))
      
      inline def setClassHandler(value: () => Unit): Self = StObject.set(x, "classHandler", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setKeydownHandler(value: KeyboardEvent => Unit): Self = StObject.set(x, "keydownHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var cross: Boolean
    
    var overlay: Boolean
    
    var persistent: Boolean
    
    var title: String
    
    var transitionModal: String
    
    var transitionOverlay: Boolean
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      cross: Boolean,
      overlay: Boolean,
      persistent: Boolean,
      title: String,
      transitionModal: String,
      transitionOverlay: Boolean,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(cross = cross.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transitionModal = transitionModal.asInstanceOf[js.Any], transitionOverlay = transitionOverlay.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setCross(value: Boolean): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTransitionModal(value: String): Self = StObject.set(x, "transitionModal", value.asInstanceOf[js.Any])
      
      inline def setTransitionOverlay(value: Boolean): Self = StObject.set(x, "transitionOverlay", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfModal.foo` */
  override def _to: Constructor = ^
}
