package typings.reactTagcloud.ReactTagCloud_

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCloudProps extends Props[Unit] {
  
  var className: js.UndefOr[String] = js.native
  
  var colorOptions: js.UndefOr[js.Object] = js.native
  
  var disableRandomColor: js.UndefOr[Boolean] = js.native
  
  var maxSize: Double = js.native
  
  var minSize: Double = js.native
  
  var onClick: js.UndefOr[js.Function] = js.native
  
  var renderer: js.UndefOr[js.Function] = js.native
  
  var shuffle: js.UndefOr[Boolean] = js.native
  
  var tags: js.Array[_] = js.native
}
object TagCloudProps {
  
  @scala.inline
  def apply(maxSize: Double, minSize: Double, tags: js.Array[_]): TagCloudProps = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCloudProps]
  }
  
  @scala.inline
  implicit class TagCloudPropsOps[Self <: TagCloudProps] (val x: Self) extends AnyVal {
    
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
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[_]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColorOptions(value: js.Object): Self = this.set("colorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorOptions: Self = this.set("colorOptions", js.undefined)
    
    @scala.inline
    def setDisableRandomColor(value: Boolean): Self = this.set("disableRandomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRandomColor: Self = this.set("disableRandomColor", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Function): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
  }
}
