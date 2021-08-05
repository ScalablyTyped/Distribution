package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFactory extends StObject {
  
  def getEditor[T](column: Column[T]): Editor[T]
}
object EditorFactory {
  
  inline def apply(getEditor: Column[js.Any] => Editor[js.Any]): EditorFactory = {
    val __obj = js.Dynamic.literal(getEditor = js.Any.fromFunction1(getEditor))
    __obj.asInstanceOf[EditorFactory]
  }
  
  extension [Self <: EditorFactory](x: Self) {
    
    inline def setGetEditor(value: Column[js.Any] => Editor[js.Any]): Self = StObject.set(x, "getEditor", js.Any.fromFunction1(value))
  }
}
