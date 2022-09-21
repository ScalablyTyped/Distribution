package typings.progressbarJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofutils extends StObject {
    
    def capitalize(text: String): String = js.native
    
    def extend[T, U](target: T, source: U): T & U = js.native
    def extend[T, U](target: T, source: U, recursive: Boolean): T & U = js.native
    
    def floatEquals(a: Double, b: Double): Boolean = js.native
    
    def forEachObject(obj: Any, cb: js.Function2[/* val */ Any, /* key */ String, Unit]): Unit = js.native
    
    def isArray(obj: Any): Boolean = js.native
    
    def isFunction(obj: Any): Boolean = js.native
    
    def isObject(obj: Any): Boolean = js.native
    
    def isString(obj: Any): Boolean = js.native
    
    def removeChildren(el: Element): Unit = js.native
    
    def render(template: String, vars: StringDictionary[Any]): String = js.native
    
    def setStyle(element: Element, style: String, value: Any): Unit = js.native
    
    def setStyles(element: Element, styles: StringDictionary[Any]): Unit = js.native
  }
}
