package typings.reactElemental.mod

import typings.reactElemental.anon.Regular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontOpts extends StObject {
  
  var primary: js.UndefOr[Regular] = js.native
  
  var secondary: js.UndefOr[Regular] = js.native
}
object FontOpts {
  
  @scala.inline
  def apply(): FontOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontOpts]
  }
  
  @scala.inline
  implicit class FontOptsMutableBuilder[Self <: FontOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Regular): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: Regular): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
