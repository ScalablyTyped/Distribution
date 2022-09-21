package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSidebar extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSidebar")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var hasBottom: Boolean
    
    var hasTop: Boolean
    
    var transitionName: String
    
    var visibleOverlay: Boolean
  }
  object Computed {
    
    inline def apply(hasBottom: Boolean, hasTop: Boolean, transitionName: String, visibleOverlay: Boolean): Computed = {
      val __obj = js.Dynamic.literal(hasBottom = hasBottom.asInstanceOf[js.Any], hasTop = hasTop.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], visibleOverlay = visibleOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setHasBottom(value: Boolean): Self = StObject.set(x, "hasBottom", value.asInstanceOf[js.Any])
      
      inline def setHasTop(value: Boolean): Self = StObject.set(x, "hasTop", value.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setVisibleOverlay(value: Boolean): Self = StObject.set(x, "visibleOverlay", value.asInstanceOf[js.Any])
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
    
    var className: String
    
    var position: String
    
    var staticClass: String
  }
  object Data {
    
    inline def apply(className: String, position: String, staticClass: String): Data = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], staticClass = staticClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setStaticClass(value: String): Self = StObject.set(x, "staticClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def classHandler(): Unit
    
    def close(): Unit
    
    def keydownHandler(e: KeyboardEvent): Unit
  }
  object Methods {
    
    inline def apply(classHandler: () => Unit, close: () => Unit, keydownHandler: KeyboardEvent => Unit): Methods = {
      val __obj = js.Dynamic.literal(classHandler = js.Any.fromFunction0(classHandler), close = js.Any.fromFunction0(close), keydownHandler = js.Any.fromFunction1(keydownHandler))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setClassHandler(value: () => Unit): Self = StObject.set(x, "classHandler", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setKeydownHandler(value: KeyboardEvent => Unit): Self = StObject.set(x, "keydownHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var button: Boolean
    
    var headingLevel: Double
    
    var overlay: Boolean
    
    var subtitle: String
    
    var title: String
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(
      button: Boolean,
      headingLevel: Double,
      overlay: Boolean,
      subtitle: String,
      title: String,
      visible: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], headingLevel = headingLevel.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSidebar.foo` */
  override def _to: Constructor = ^
}
