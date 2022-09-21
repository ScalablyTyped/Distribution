package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfMegaMenu extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfMegaMenu")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var isActive: Boolean
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
  }
  object Computed {
    
    inline def apply(
      isActive: Boolean,
      isMobile: Boolean,
      mobileObserverClients: Double,
      mobileObserverIsInitialized: Boolean
    ): Computed = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverClients(value: Double): Self = StObject.set(x, "mobileObserverClients", value.asInstanceOf[js.Any])
      
      inline def setMobileObserverIsInitialized(value: Boolean): Self = StObject.set(x, "mobileObserverIsInitialized", value.asInstanceOf[js.Any])
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
    
    var active: js.Array[String]
    
    var items: js.Array[String]
  }
  object Data {
    
    inline def apply(active: js.Array[String], items: js.Array[String]): Data = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setActive(value: js.Array[String]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveVarargs(value: String*): Self = StObject.set(x, "active", js.Array(value*))
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def change(payload: Any): Unit
    
    def updateItems(title: String): Unit
  }
  object Methods {
    
    inline def apply(change: Any => Unit, updateItems: String => Unit): Methods = {
      val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), updateItems = js.Any.fromFunction1(updateItems))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setChange(value: Any => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setUpdateItems(value: String => Unit): Self = StObject.set(x, "updateItems", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var asideTitle: String
    
    var title: String
    
    var visible: Boolean
  }
  object Props {
    
    inline def apply(asideTitle: String, title: String, visible: Boolean): Props = {
      val __obj = js.Dynamic.literal(asideTitle = asideTitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAsideTitle(value: String): Self = StObject.set(x, "asideTitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfMegaMenu.foo` */
  override def _to: Constructor = ^
}
