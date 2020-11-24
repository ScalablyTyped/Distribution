package typings.reactNativeCanvas.mod

import typings.react.mod.RefObject
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasProps extends js.Object {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var originWhitelist: js.UndefOr[js.Array[String]] = js.native
  
  var ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object CanvasProps {
  
  @scala.inline
  def apply(ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas]): CanvasProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasProps]
  }
  
  @scala.inline
  implicit class CanvasPropsOps[Self <: CanvasProps] (val x: Self) extends AnyVal {
    
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
    def setRefFunction1(value: /* canvas */ Canvas => _): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setOriginWhitelistVarargs(value: String*): Self = this.set("originWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setOriginWhitelist(value: js.Array[String]): Self = this.set("originWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginWhitelist: Self = this.set("originWhitelist", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
