package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriState extends StObject {
  
  var xml: String | Null = js.native
}
object UriState {
  
  @scala.inline
  def apply(): UriState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriState]
  }
  
  @scala.inline
  implicit class UriStateMutableBuilder[Self <: UriState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlNull: Self = StObject.set(x, "xml", null)
  }
}
