package typings.reactTable.anon

import typings.reactTable.mod.HeaderProps
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[D /* <: js.Object */] extends StObject {
  
  var Header: Renderer[HeaderProps[D]]
  
  var id: IdType[D]
}
object Id {
  
  @scala.inline
  def apply[D /* <: js.Object */](Header: Renderer[HeaderProps[D]], id: IdType[D]): Id[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[D]]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id[?], D /* <: js.Object */] (val x: Self & Id[D]) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Renderer[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
