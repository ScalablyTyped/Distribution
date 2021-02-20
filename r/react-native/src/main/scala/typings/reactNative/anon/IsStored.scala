package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsStored extends StObject {
  
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
  implicit class IsStoredMutableBuilder[Self <: IsStored] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStored(value: Boolean): Self = StObject.set(x, "isStored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStoredUndefined: Self = StObject.set(x, "isStored", js.undefined)
    
    @scala.inline
    def setPlayableDuration(value: Double): Self = StObject.set(x, "playableDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
