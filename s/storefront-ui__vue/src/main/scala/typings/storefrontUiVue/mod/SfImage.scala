package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.storefrontUiVue.anon.Imageheight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfImage extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfImage")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var hasOverlay: Boolean
    
    var isPicture: Boolean
    
    var noscript: String
    
    var size: Imageheight
    
    var source: Source | Null
  }
  object Computed {
    
    inline def apply(hasOverlay: Boolean, isPicture: Boolean, noscript: String, size: Imageheight): Computed = {
      val __obj = js.Dynamic.literal(hasOverlay = hasOverlay.asInstanceOf[js.Any], isPicture = isPicture.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = null)
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setHasOverlay(value: Boolean): Self = StObject.set(x, "hasOverlay", value.asInstanceOf[js.Any])
      
      inline def setIsPicture(value: Boolean): Self = StObject.set(x, "isPicture", value.asInstanceOf[js.Any])
      
      inline def setNoscript(value: String): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Imageheight): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: () => Data, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = js.Any.fromFunction0(data), props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var isLoaded: Boolean
  }
  object Data {
    
    inline def apply(isLoaded: Boolean): Data = {
      val __obj = js.Dynamic.literal(isLoaded = isLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var height: String | Double
    
    var `lazy`: Boolean
    
    var pictureBreakpoint: Double
    
    var rootMargin: String
    
    var src: String | Source
    
    var threshold: String | Double
    
    var width: String | Double
  }
  object Props {
    
    inline def apply(
      height: String | Double,
      `lazy`: Boolean,
      pictureBreakpoint: Double,
      rootMargin: String,
      src: String | Source,
      threshold: String | Double,
      width: String | Double
    ): Props = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pictureBreakpoint = pictureBreakpoint.asInstanceOf[js.Any], rootMargin = rootMargin.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setPictureBreakpoint(value: Double): Self = StObject.set(x, "pictureBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String | Source): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: String | Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfImage.foo` */
  override def _to: Constructor = ^
}
