package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* widgetId */ StringDictionary[js.Any] {
  
  var aroundLatLng: Boolean
}
object Dictkey {
  
  @scala.inline
  def apply(aroundLatLng: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(aroundLatLng = aroundLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAroundLatLng(value: Boolean): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
  }
}
