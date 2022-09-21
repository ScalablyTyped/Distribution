package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfContentPages extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfContentPages")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var categories: js.Array[Any]
    
    var isActive: Boolean
    
    var isMobile: Boolean
    
    var mobileObserverClients: Double
    
    var mobileObserverIsInitialized: Boolean
  }
  object Computed {
    
    inline def apply(
      categories: js.Array[Any],
      isActive: Boolean,
      isMobile: Boolean,
      mobileObserverClients: Double,
      mobileObserverIsInitialized: Boolean
    ): Computed = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isMobile = isMobile.asInstanceOf[js.Any], mobileObserverClients = mobileObserverClients.asInstanceOf[js.Any], mobileObserverIsInitialized = mobileObserverIsInitialized.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setCategories(value: js.Array[Any]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: Any*): Self = StObject.set(x, "categories", js.Array(value*))
      
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
    
    var items: js.Array[Any]
  }
  object Data {
    
    inline def apply(items: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def updatePage(title: String): Unit
  }
  object Methods {
    
    inline def apply(updatePage: String => Unit): Methods = {
      val __obj = js.Dynamic.literal(updatePage = js.Any.fromFunction1(updatePage))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setUpdatePage(value: String => Unit): Self = StObject.set(x, "updatePage", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var active: String
    
    var title: String
  }
  object Props {
    
    inline def apply(active: String, title: String): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfContentPages.foo` */
  override def _to: Constructor = ^
}
