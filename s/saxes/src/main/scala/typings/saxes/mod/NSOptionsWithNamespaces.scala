package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NSOptionsWithNamespaces extends NSOptions {
  
  @JSName("xmlns")
  var xmlns_NSOptionsWithNamespaces: `true` = js.native
}
object NSOptionsWithNamespaces {
  
  @scala.inline
  def apply(xmlns: `true`): NSOptionsWithNamespaces = {
    val __obj = js.Dynamic.literal(xmlns = xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[NSOptionsWithNamespaces]
  }
  
  @scala.inline
  implicit class NSOptionsWithNamespacesMutableBuilder[Self <: NSOptionsWithNamespaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXmlns(value: `true`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
  }
}
