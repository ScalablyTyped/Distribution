package typings.reactImageFallback.mod

import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactImageFallbackProps extends js.Object {
  
  var fallbackImage: String | ReactElement | (js.Array[ReactElement | String]) = js.native
  
  var initialImage: js.UndefOr[String | ReactElement] = js.native
  
  var initialTimeout: js.UndefOr[Double] = js.native
  
  var onError: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.native
  
  var onLoad: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLImageElement, Event], Unit]] = js.native
  
  var src: String = js.native
}
object ReactImageFallbackProps {
  
  @scala.inline
  def apply(fallbackImage: String | ReactElement | (js.Array[ReactElement | String]), src: String): ReactImageFallbackProps = {
    val __obj = js.Dynamic.literal(fallbackImage = fallbackImage.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageFallbackProps]
  }
  
  @scala.inline
  implicit class ReactImageFallbackPropsOps[Self <: ReactImageFallbackProps] (val x: Self) extends AnyVal {
    
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
    def setFallbackImageVarargs(value: (ReactElement | String)*): Self = this.set("fallbackImage", js.Array(value :_*))
    
    @scala.inline
    def setFallbackImage(value: String | ReactElement | (js.Array[ReactElement | String])): Self = this.set("fallbackImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialImage(value: String | ReactElement): Self = this.set("initialImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialImage: Self = this.set("initialImage", js.undefined)
    
    @scala.inline
    def setInitialTimeout(value: Double): Self = this.set("initialTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTimeout: Self = this.set("initialTimeout", js.undefined)
    
    @scala.inline
    def setOnError(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* event */ SyntheticEvent[HTMLImageElement, Event] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
}
