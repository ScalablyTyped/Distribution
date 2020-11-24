package typings.reactImageloader.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageLoaderProps extends Props[ImageLoader] {
  
  /** An optional class name for the wrapper component. */
  var className: js.UndefOr[String] = js.native
  
  /** An optional object containing props for the underlying img component. */
  var imgProps: js.UndefOr[js.Any] = js.native
  
  /** An optional handler for the error event. */
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  /** An optional handler for the load event. */
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  /** An optional function that returns a React element to be shown while the image loads. */
  var preloader: js.UndefOr[js.Function1[/* params */ js.Any, ReactElement]] = js.native
  
  /** The URL of the image to be loaded. */
  var src: String = js.native
  
  /** An optional object containing styles for the wrapper component. */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
  var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, ReactElement]] = js.native
}
object ImageLoaderProps {
  
  @scala.inline
  def apply(src: String): ImageLoaderProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoaderProps]
  }
  
  @scala.inline
  implicit class ImageLoaderPropsOps[Self <: ImageLoaderProps] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setImgProps(value: js.Any): Self = this.set("imgProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImgProps: Self = this.set("imgProps", js.undefined)
    
    @scala.inline
    def setOnError(value: /* event */ js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* event */ js.Any => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setPreloader(value: /* params */ js.Any => ReactElement): Self = this.set("preloader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreloader: Self = this.set("preloader", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapper(value: /* props */ js.Any => ReactElement): Self = this.set("wrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
