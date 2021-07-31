package typings.scrivito.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjComponentProps
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var page: Obj
}
object ObjComponentProps {
  
  @scala.inline
  def apply(page: Obj): ObjComponentProps = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjComponentProps]
  }
  
  @scala.inline
  implicit class ObjComponentPropsMutableBuilder[Self <: ObjComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Obj): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
