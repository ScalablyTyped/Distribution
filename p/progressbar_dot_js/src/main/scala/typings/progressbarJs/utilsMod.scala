package typings.progressbarJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("progressbar.js/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def capitalize(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def extend[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  @scala.inline
  def extend[T, U](target: T, source: U, recursive: Boolean): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[T & U]
  
  @scala.inline
  def floatEquals(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("floatEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def forEachObject(obj: js.Any, cb: js.Function2[/* val */ js.Any, /* key */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachObject")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isArray(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeChildren(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChildren")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def render(template: String, vars: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def setStyle(element: Element, style: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(element.asInstanceOf[js.Any], style.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setStyles(element: Element, styles: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyles")(element.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
