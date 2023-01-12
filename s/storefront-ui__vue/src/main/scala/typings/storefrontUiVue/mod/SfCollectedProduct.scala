package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfCollectedProduct extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfCollectedProduct")
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
    
    def removeHandler(): Unit
  }
  object Methods {
    
    inline def apply(removeHandler: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(removeHandler = js.Any.fromFunction0(removeHandler))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setRemoveHandler(value: () => Unit): Self = StObject.set(x, "removeHandler", js.Any.fromFunction0(value))
    }
  }
  
  trait Props extends StObject {
    
    var image: String | Source
    
    var imageWidth: String | Double
    
    var link: String | Location
    
    var qty: String | Double
    
    var regularPrice: String | Double
    
    var specialPrice: String | Double
    
    var title: String
  }
  object Props {
    
    inline def apply(
      image: String | Source,
      imageWidth: String | Double,
      link: String | Location,
      qty: String | Double,
      regularPrice: String | Double,
      specialPrice: String | Double,
      title: String
    ): Props = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], qty = qty.asInstanceOf[js.Any], regularPrice = regularPrice.asInstanceOf[js.Any], specialPrice = specialPrice.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String | Source): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: String | Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String | Location): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setQty(value: String | Double): Self = StObject.set(x, "qty", value.asInstanceOf[js.Any])
      
      inline def setRegularPrice(value: String | Double): Self = StObject.set(x, "regularPrice", value.asInstanceOf[js.Any])
      
      inline def setSpecialPrice(value: String | Double): Self = StObject.set(x, "specialPrice", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfCollectedProduct.foo` */
  override def _to: Constructor = ^
}
