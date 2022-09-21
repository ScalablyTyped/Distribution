package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.glidejsGlide.mod.Options
import typings.storefrontUiVue.storefrontUiVueStrings.next
import typings.storefrontUiVue.storefrontUiVueStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCarousel extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCarousel")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var mergedOptions: Options
  }
  object Computed {
    
    inline def apply(mergedOptions: Options): Computed = {
      val __obj = js.Dynamic.literal(mergedOptions = mergedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setMergedOptions(value: Options): Self = StObject.set(x, "mergedOptions", value.asInstanceOf[js.Any])
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
    
    def go(direct: prev | next): Unit
  }
  object Methods {
    
    inline def apply(go: prev | next => Unit): Methods = {
      val __obj = js.Dynamic.literal(go = js.Any.fromFunction1(go))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGo(value: prev | next => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var settings: Options
  }
  object Props {
    
    inline def apply(settings: Options): Props = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setSettings(value: Options): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCarousel.foo` */
  override def _to: Constructor = ^
}
