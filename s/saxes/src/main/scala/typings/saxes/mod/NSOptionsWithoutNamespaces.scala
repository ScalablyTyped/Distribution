package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NSOptionsWithoutNamespaces extends NSOptions {
  
  @JSName("additionalNamespaces")
  var additionalNamespaces_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("resolvePrefix")
  var resolvePrefix_NSOptionsWithoutNamespaces: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("xmlns")
  var xmlns_NSOptionsWithoutNamespaces: js.UndefOr[`false`] = js.native
}
object NSOptionsWithoutNamespaces {
  
  @scala.inline
  def apply(): NSOptionsWithoutNamespaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NSOptionsWithoutNamespaces]
  }
  
  @scala.inline
  implicit class NSOptionsWithoutNamespacesMutableBuilder[Self <: NSOptionsWithoutNamespaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXmlns(value: `false`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
