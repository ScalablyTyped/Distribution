package typings.progressbarJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("progressbar.js/utils", "capitalize")
  @js.native
  def capitalize(text: String): String = js.native
  
  @JSImport("progressbar.js/utils", "extend")
  @js.native
  def extend[T, U](target: T, source: U): T with U = js.native
  @JSImport("progressbar.js/utils", "extend")
  @js.native
  def extend[T, U](target: T, source: U, recursive: Boolean): T with U = js.native
  
  @JSImport("progressbar.js/utils", "floatEquals")
  @js.native
  def floatEquals(a: Double, b: Double): Boolean = js.native
  
  @JSImport("progressbar.js/utils", "forEachObject")
  @js.native
  def forEachObject(obj: js.Any, cb: js.Function2[/* val */ js.Any, /* key */ String, Unit]): Unit = js.native
  
  @JSImport("progressbar.js/utils", "isArray")
  @js.native
  def isArray(obj: js.Any): Boolean = js.native
  
  @JSImport("progressbar.js/utils", "isFunction")
  @js.native
  def isFunction(obj: js.Any): Boolean = js.native
  
  @JSImport("progressbar.js/utils", "isObject")
  @js.native
  def isObject(obj: js.Any): Boolean = js.native
  
  @JSImport("progressbar.js/utils", "isString")
  @js.native
  def isString(obj: js.Any): Boolean = js.native
  
  @JSImport("progressbar.js/utils", "removeChildren")
  @js.native
  def removeChildren(el: Element): Unit = js.native
  
  @JSImport("progressbar.js/utils", "render")
  @js.native
  def render(template: String, vars: StringDictionary[js.Any]): String = js.native
  
  @JSImport("progressbar.js/utils", "setStyle")
  @js.native
  def setStyle(element: Element, style: String, value: js.Any): Unit = js.native
  
  @JSImport("progressbar.js/utils", "setStyles")
  @js.native
  def setStyles(element: Element, styles: StringDictionary[js.Any]): Unit = js.native
}
