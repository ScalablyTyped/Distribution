package typings.reactNativeImageGallery.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends ViewProps {
  
  /**
    * Custom function to render the page of an image that couldn't be displayed
    */
  var errorComponent: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  /**
    * Props to be passed to the underlying FlatList
    * @default { windowSize: 3 }
    */
  var flatListProps: js.UndefOr[FlatListProps] = js.native
  
  /**
    * Custom function to render your images, 1st param is the image props, 2nd is its dimensions
    */
  var imageComponent: js.UndefOr[
    js.Function2[/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions, ReactNode]
  ] = js.native
  
  /**
    * Your array of images
    */
  var images: js.Array[Image] = js.native
  
  /**
    * Image displayed first
    * @default 0
    */
  var initialPage: js.UndefOr[Double] = js.native
  
  /**
    * Fired after a long press
    */
  var onLongPress: js.UndefOr[js.Function1[/* state */ GestureState, Unit]] = js.native
  
  /**
    * Scroll event, see scroll state and events
    */
  var onPageScroll: js.UndefOr[js.Function1[/* event */ ScrollEvent, Unit]] = js.native
  
  /**
    * Called when page scrolling state has changed, see scroll state and events
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ ScrollState, Unit]] = js.native
  
  /**
    * Fired with the index of page that has been selected
    */
  var onPageSelected: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  
  /**
    * Fired after a single tap
    */
  var onSingleTapConfirmed: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.native
  
  /**
    * Blank space to show between images
    */
  var pageMargin: js.UndefOr[Double] = js.native
  
  /**
    * Custom style for the FlatList component
    */
  var scrollViewStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object Props {
  
  @scala.inline
  def apply(images: js.Array[Image]): Props = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorComponent(value: () => ReactNode): Self = this.set("errorComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteErrorComponent: Self = this.set("errorComponent", js.undefined)
    
    @scala.inline
    def setFlatListProps(value: FlatListProps): Self = this.set("flatListProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatListProps: Self = this.set("flatListProps", js.undefined)
    
    @scala.inline
    def setImageComponent(value: (/* imageProps */ ImageProps, /* imageDimensions */ ImageDimensions) => ReactNode): Self = this.set("imageComponent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteImageComponent: Self = this.set("imageComponent", js.undefined)
    
    @scala.inline
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: /* state */ GestureState => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnPageScroll(value: /* event */ ScrollEvent => Unit): Self = this.set("onPageScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageScroll: Self = this.set("onPageScroll", js.undefined)
    
    @scala.inline
    def setOnPageScrollStateChanged(value: /* state */ ScrollState => Unit): Self = this.set("onPageScrollStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageScrollStateChanged: Self = this.set("onPageScrollStateChanged", js.undefined)
    
    @scala.inline
    def setOnPageSelected(value: /* page */ Double => Unit): Self = this.set("onPageSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageSelected: Self = this.set("onPageSelected", js.undefined)
    
    @scala.inline
    def setOnSingleTapConfirmed(value: /* page */ Double => Unit): Self = this.set("onSingleTapConfirmed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSingleTapConfirmed: Self = this.set("onSingleTapConfirmed", js.undefined)
    
    @scala.inline
    def setPageMargin(value: Double): Self = this.set("pageMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageMargin: Self = this.set("pageMargin", js.undefined)
    
    @scala.inline
    def setScrollViewStyle(value: StyleProp[ViewStyle]): Self = this.set("scrollViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollViewStyle: Self = this.set("scrollViewStyle", js.undefined)
    
    @scala.inline
    def setScrollViewStyleNull: Self = this.set("scrollViewStyle", null)
  }
}
