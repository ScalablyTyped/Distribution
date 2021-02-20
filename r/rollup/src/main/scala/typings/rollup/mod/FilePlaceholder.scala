package typings.rollup.mod

import typings.rollup.rollupStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePlaceholder extends StObject {
  
  var `type`: placeholder = js.native
}
object FilePlaceholder {
  
  @scala.inline
  def apply(`type`: placeholder): FilePlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePlaceholder]
  }
  
  @scala.inline
  implicit class FilePlaceholderMutableBuilder[Self <: FilePlaceholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
