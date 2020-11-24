package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsStored extends js.Object {
  
  var height: Double = js.native
  
  var isStored: js.UndefOr[Boolean] = js.native
  
  var playableDuration: Double = js.native
  
  var uri: String = js.native
  
  var width: Double = js.native
}
object IsStored {
  
  @scala.inline
  def apply(height: Double, playableDuration: Double, uri: String, width: Double): IsStored = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], playableDuration = playableDuration.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStored]
  }
  
  @scala.inline
  implicit class IsStoredOps[Self <: IsStored] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayableDuration(value: Double): Self = this.set("playableDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStored(value: Boolean): Self = this.set("isStored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStored: Self = this.set("isStored", js.undefined)
  }
}
