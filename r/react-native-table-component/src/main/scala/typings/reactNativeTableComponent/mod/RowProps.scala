package typings.reactNativeTableComponent.mod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowProps extends js.Object {
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var flexArr: js.UndefOr[js.Array[Double]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var textStyle: js.UndefOr[TextStyle] = js.native
  
  var widthArr: js.UndefOr[js.Array[Double]] = js.native
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFlexArrVarargs(value: Double*): Self = this.set("flexArr", js.Array(value :_*))
    
    @scala.inline
    def setFlexArr(value: js.Array[Double]): Self = this.set("flexArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexArr: Self = this.set("flexArr", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setWidthArrVarargs(value: Double*): Self = this.set("widthArr", js.Array(value :_*))
    
    @scala.inline
    def setWidthArr(value: js.Array[Double]): Self = this.set("widthArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthArr: Self = this.set("widthArr", js.undefined)
  }
}
