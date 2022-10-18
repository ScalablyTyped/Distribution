package typings.primereact.treeTreeMod

import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeFilterInputOptions extends StObject {
  
  var className: String
  
  def onChange(event: KeyboardEvent[HTMLInputElement]): Unit
  
  def onKeyDown(event: KeyboardEvent[HTMLInputElement]): Unit
}
object TreeFilterInputOptions {
  
  inline def apply(
    className: String,
    onChange: KeyboardEvent[HTMLInputElement] => Unit,
    onKeyDown: KeyboardEvent[HTMLInputElement] => Unit
  ): TreeFilterInputOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[TreeFilterInputOptions]
  }
  
  extension [Self <: TreeFilterInputOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
  }
}
