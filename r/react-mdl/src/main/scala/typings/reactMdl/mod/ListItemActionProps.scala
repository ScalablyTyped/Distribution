package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemActionProps
  extends HTMLProps[js.Any] {
  
  var info: js.UndefOr[String] = js.native
}
object ListItemActionProps {
  
  @scala.inline
  def apply(): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionProps]
  }
  
  @scala.inline
  implicit class ListItemActionPropsMutableBuilder[Self <: ListItemActionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
