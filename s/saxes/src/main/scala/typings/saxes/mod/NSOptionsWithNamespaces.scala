package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NSOptionsWithNamespaces
  extends StObject
     with NSOptions {
  
  @JSName("xmlns")
  var xmlns_NSOptionsWithNamespaces: `true`
}
object NSOptionsWithNamespaces {
  
  @scala.inline
  def apply(): NSOptionsWithNamespaces = {
    val __obj = js.Dynamic.literal(xmlns = true)
    __obj.asInstanceOf[NSOptionsWithNamespaces]
  }
  
  @scala.inline
  implicit class NSOptionsWithNamespacesMutableBuilder[Self <: NSOptionsWithNamespaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXmlns(value: `true`): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
  }
}
