package typings.selectorSet.selectorSetNextMod

import typings.selectorSet.anon.Data
import typings.selectorSet.anon.Elements
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorSet[T] extends js.Object {
  
  def add(selector: String, data: T): Unit = js.native
  
  var indexes: js.Array[ISelectorSetIndex] = js.native
  
  def logDefaultIndexUsed(hasSelectorData: Data[T]): Unit = js.native
  
  def matches(el: Element): js.Array[Data[T]] = js.native
  
  def matchesSelector(el: Element, selector: String): Boolean = js.native
  
  def queryAll(context: Element): js.Array[Elements[T]] = js.native
  
  def querySelectorAll(selectors: String, context: Element): js.Array[Element] = js.native
  
  def remove(selector: String): Unit = js.native
  def remove(selector: String, data: T): Unit = js.native
  
  var size: Double = js.native
}
