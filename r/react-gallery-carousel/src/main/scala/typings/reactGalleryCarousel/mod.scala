package typings.reactGalleryCarousel

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactGalleryCarousel.anon.GoLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The carousel component.
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#props}
    */
  inline def apply(props: CarouselProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-gallery-carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The props of the carousel
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#props}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactGalleryCarousel.anon.CarouselWithChildrenParti
    - typings.reactGalleryCarousel.anon.CarouselWithImagesPartial
  */
  trait CarouselProps extends StObject
  object CarouselProps {
    
    inline def CarouselWithChildrenParti(): typings.reactGalleryCarousel.anon.CarouselWithChildrenParti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactGalleryCarousel.anon.CarouselWithChildrenParti]
    }
    
    inline def CarouselWithImagesPartial(images: Images): typings.reactGalleryCarousel.anon.CarouselWithImagesPartial = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactGalleryCarousel.anon.CarouselWithImagesPartial]
    }
  }
  
  /**
    * The Ref carousel element with the imperative handlers.
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#handlers}
    */
  type CarouselRef[T] = T & GoLeft
  
  // Carousel with children has optional images.
  trait CarouselWithChildren extends StObject {
    
    var children: ReactNode
    
    var images: js.UndefOr[Images] = js.undefined
  }
  object CarouselWithChildren {
    
    inline def apply(): CarouselWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselWithChildren]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselWithChildren] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  // Carousel has the props images mandatory if children do not exists.
  trait CarouselWithImages extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var images: Images
  }
  object CarouselWithImages {
    
    inline def apply(images: Images): CarouselWithImages = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselWithImages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselWithImages] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  /**
    * The image object used in the images array
    * @example
    * {
    *   src: `https://placedog.net/700/420?id=1`,
    *   srcset: `https://placedog.net/400/240?id=1 400w, https://placedog.net/700/420?id=1 700w`,
    *   sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *   alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *   thumbnail: `https://placedog.net/100/60?id=1`
    * }
    *
    * @see {@link https://github.com/yifaneye/react-gallery-carousel/blob/3adffccaf131e69eb084736aa24a0a2b47268fa8/README.md#image-object-example}
    */
  trait Image extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var srcset: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
  }
  object Image {
    
    inline def apply(src: String): Image = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  /**
    * Array of image(s) to be placed in the carousel. Each image object in the array has a required attribute 'src'.
    * @example
    * [
    *    {
    *      src: `https://placedog.net/700/420?id=1`,
    *      srcset: `https://placedog.net/400/240?id=1 400w, https://placedog.net/700/420?id=1 700w`,
    *      sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *      alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *      thumbnail: `https://placedog.net/100/60?id=1`
    *    },
    *    {
    *      src: `https://placedog.net/700/420?id=2`,
    *      srcset: `https://placedog.net/400/240?id=2 400w, https://placedog.net/700/420?id=2 700w`,
    *      sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *      alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *      thumbnail: `https://placedog.net/100/60?id=2`
    *    }
    * ]
    */
  type Images = js.Array[Image]
  
  /**
    * The available position for large widgets
    * @see
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.top
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottom
  */
  trait LargeWidgetPositions extends StObject
  object LargeWidgetPositions {
    
    inline def bottom: typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottom = "bottom".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottom]
    
    inline def top: typings.reactGalleryCarousel.reactGalleryCarouselStrings.top = "top".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.top]
  }
  
  type ObjectFit = js.UndefOr[typings.csstype.mod.Property.ObjectFit]
  
  /**
    * The available position for small widgets
    * @see https://github.com/yifaneye/react-gallery-carousel#small-widget-positions
    */
  /* Rewritten from type alias, can be one of: 
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.topRight
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter
    - typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight
  */
  trait SmallWidgetPositions extends StObject
  object SmallWidgetPositions {
    
    inline def bottomCenter: typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter = "bottomCenter".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter]
    
    inline def bottomLeft: typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft]
    
    inline def bottomRight: typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight = "bottomRight".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight]
    
    inline def centerCenter: typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter = "centerCenter".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter]
    
    inline def centerLeft: typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft = "centerLeft".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft]
    
    inline def centerRight: typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight = "centerRight".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight]
    
    inline def topCenter: typings.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter = "topCenter".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter]
    
    inline def topLeft: typings.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft = "topLeft".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft]
    
    inline def topRight: typings.reactGalleryCarousel.reactGalleryCarouselStrings.topRight = "topRight".asInstanceOf[typings.reactGalleryCarousel.reactGalleryCarouselStrings.topRight]
  }
}
