package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.glidejsGlide.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfGroupedProduct extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfGroupedProduct")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var glideSettings: Options
  }
  object Computed {
    
    inline def apply(glideSettings: Options): Computed = {
      val __obj = js.Dynamic.literal(glideSettings = glideSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setGlideSettings(value: Options): Self = StObject.set(x, "glideSettings", value.asInstanceOf[js.Any])
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
    
    var defaultSettings: Options
    
    var glide: Any
  }
  object Data {
    
    inline def apply(defaultSettings: Options, glide: Any): Data = {
      val __obj = js.Dynamic.literal(defaultSettings = defaultSettings.asInstanceOf[js.Any], glide = glide.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setDefaultSettings(value: Options): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      inline def setGlide(value: Any): Self = StObject.set(x, "glide", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def glideMount(): Unit
  }
  object Methods {
    
    inline def apply(glideMount: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(glideMount = js.Any.fromFunction0(glideMount))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGlideMount(value: () => Unit): Self = StObject.set(x, "glideMount", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var hasCarousel: Boolean
    
    var settings: Options
  }
  object Props {
    
    inline def apply(hasCarousel: Boolean, settings: Options): Props = {
      val __obj = js.Dynamic.literal(hasCarousel = hasCarousel.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setHasCarousel(value: Boolean): Self = StObject.set(x, "hasCarousel", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Options): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfGroupedProduct.foo` */
  override def _to: Constructor = ^
}
