package typings.storefrontUiVue.mod

import org.scalablytyped.runtime.Shortcut
import typings.glidejsGlide.mod.Options
import typings.std.ClientRect
import typings.storefrontUiVue.storefrontUiVueStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfGallery extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfGallery")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var mapPictures: js.Array[Image]
    
    var updatedSliderOptions: Options
  }
  object Computed {
    
    inline def apply(mapPictures: js.Array[Image], updatedSliderOptions: Options): Computed = {
      val __obj = js.Dynamic.literal(mapPictures = mapPictures.asInstanceOf[js.Any], updatedSliderOptions = updatedSliderOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Computed] (val x: Self) extends AnyVal {
      
      inline def setMapPictures(value: js.Array[Image]): Self = StObject.set(x, "mapPictures", value.asInstanceOf[js.Any])
      
      inline def setMapPicturesVarargs(value: Image*): Self = StObject.set(x, "mapPictures", js.Array(value*))
      
      inline def setUpdatedSliderOptions(value: Options): Self = StObject.set(x, "updatedSliderOptions", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Constructor] (val x: Self) extends AnyVal {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: () => Data): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var activeIndex: Double
    
    var eventHover: js.Object
    
    var glide: Null
    
    var pictureSelected: String
    
    var positionStatic: js.Object
    
    var style: String
  }
  object Data {
    
    inline def apply(
      activeIndex: Double,
      eventHover: js.Object,
      glide: Null,
      pictureSelected: String,
      positionStatic: js.Object,
      style: String
    ): Data = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], eventHover = eventHover.asInstanceOf[js.Any], glide = glide.asInstanceOf[js.Any], pictureSelected = pictureSelected.asInstanceOf[js.Any], positionStatic = positionStatic.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setEventHover(value: js.Object): Self = StObject.set(x, "eventHover", value.asInstanceOf[js.Any])
      
      inline def setGlide(value: Null): Self = StObject.set(x, "glide", value.asInstanceOf[js.Any])
      
      inline def setPictureSelected(value: String): Self = StObject.set(x, "pictureSelected", value.asInstanceOf[js.Any])
      
      inline def setPositionStatic(value: js.Object): Self = StObject.set(x, "positionStatic", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def go(index: Double): Unit
    
    def moveZoom($event: Any, index: Double): Unit
    
    def positionObject(index: Double): ClientRect | _empty
    
    def removeZoom(index: Double): Unit
    
    def startZoom(picture: Image): Unit
  }
  object Methods {
    
    inline def apply(
      go: Double => Unit,
      moveZoom: (Any, Double) => Unit,
      positionObject: Double => ClientRect | _empty,
      removeZoom: Double => Unit,
      startZoom: Image => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(go = js.Any.fromFunction1(go), moveZoom = js.Any.fromFunction2(moveZoom), positionObject = js.Any.fromFunction1(positionObject), removeZoom = js.Any.fromFunction1(removeZoom), startZoom = js.Any.fromFunction1(startZoom))
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      inline def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
      
      inline def setMoveZoom(value: (Any, Double) => Unit): Self = StObject.set(x, "moveZoom", js.Any.fromFunction2(value))
      
      inline def setPositionObject(value: Double => ClientRect | _empty): Self = StObject.set(x, "positionObject", js.Any.fromFunction1(value))
      
      inline def setRemoveZoom(value: Double => Unit): Self = StObject.set(x, "removeZoom", js.Any.fromFunction1(value))
      
      inline def setStartZoom(value: Image => Unit): Self = StObject.set(x, "startZoom", js.Any.fromFunction1(value))
    }
  }
  
  trait Props extends StObject {
    
    var current: Double
    
    var enableZoom: Boolean
    
    var imageHeight: Double | String
    
    var imageWidth: Double | String
    
    var images: js.Array[Image]
    
    var outsideZoom: Boolean
    
    var sliderOptions: Options
    
    var thumbHeight: Double | String
    
    var thumbWidth: Double | String
  }
  object Props {
    
    inline def apply(
      current: Double,
      enableZoom: Boolean,
      imageHeight: Double | String,
      imageWidth: Double | String,
      images: js.Array[Image],
      outsideZoom: Boolean,
      sliderOptions: Options,
      thumbHeight: Double | String,
      thumbWidth: Double | String
    ): Props = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], enableZoom = enableZoom.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], outsideZoom = outsideZoom.asInstanceOf[js.Any], sliderOptions = sliderOptions.asInstanceOf[js.Any], thumbHeight = thumbHeight.asInstanceOf[js.Any], thumbWidth = thumbWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setEnableZoom(value: Boolean): Self = StObject.set(x, "enableZoom", value.asInstanceOf[js.Any])
      
      inline def setImageHeight(value: Double | String): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: Double | String): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setOutsideZoom(value: Boolean): Self = StObject.set(x, "outsideZoom", value.asInstanceOf[js.Any])
      
      inline def setSliderOptions(value: Options): Self = StObject.set(x, "sliderOptions", value.asInstanceOf[js.Any])
      
      inline def setThumbHeight(value: Double | String): Self = StObject.set(x, "thumbHeight", value.asInstanceOf[js.Any])
      
      inline def setThumbWidth(value: Double | String): Self = StObject.set(x, "thumbWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfGallery.foo` */
  override def _to: Constructor = ^
}
