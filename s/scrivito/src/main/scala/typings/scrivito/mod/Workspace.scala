package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  def id(): String
  
  def title(): String
}
object Workspace {
  
  inline def apply(id: () => String, title: () => String): Workspace = {
    val __obj = js.Dynamic.literal(id = js.Any.fromFunction0(id), title = js.Any.fromFunction0(title))
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setId(value: () => String): Self = StObject.set(x, "id", js.Any.fromFunction0(value))
    
    inline def setTitle(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
  }
}
