package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route
  extends //anything else
/* key */ StringDictionary[js.Any] {
  
  //Commonly found properties
  var backButtonTitle: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[ComponentType[_]] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onRightButtonPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var passProps: js.UndefOr[js.Object] = js.native
  
  var rightButtonTitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var wrapperStyle: js.UndefOr[js.Any] = js.native
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
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
    def setBackButtonTitle(value: String): Self = this.set("backButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackButtonTitle: Self = this.set("backButtonTitle", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnRightButtonPress(value: () => Unit): Self = this.set("onRightButtonPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRightButtonPress: Self = this.set("onRightButtonPress", js.undefined)
    
    @scala.inline
    def setPassProps(value: js.Object): Self = this.set("passProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassProps: Self = this.set("passProps", js.undefined)
    
    @scala.inline
    def setRightButtonTitle(value: String): Self = this.set("rightButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightButtonTitle: Self = this.set("rightButtonTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Any): Self = this.set("wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperStyle: Self = this.set("wrapperStyle", js.undefined)
  }
}
