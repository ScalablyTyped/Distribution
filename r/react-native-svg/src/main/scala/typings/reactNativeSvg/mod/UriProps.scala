package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UriProps extends SvgProps {
  
  var `override`: js.UndefOr[SvgProps] = js.native
  
  var uri: String | Null = js.native
}
object UriProps {
  
  @scala.inline
  def apply(): UriProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriProps]
  }
  
  @scala.inline
  implicit class UriPropsMutableBuilder[Self <: UriProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: SvgProps): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriNull: Self = StObject.set(x, "uri", null)
  }
}
