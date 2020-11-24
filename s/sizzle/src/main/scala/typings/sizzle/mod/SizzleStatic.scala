package typings.sizzle.mod

import typings.std.ArrayLike
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizzleStatic extends js.Object {
  
  def apply(selector: String): js.Array[Element] = js.native
  def apply(selector: String, context: Document): js.Array[Element] = js.native
  def apply(selector: String, context: DocumentFragment): js.Array[Element] = js.native
  def apply(selector: String, context: Element): js.Array[Element] = js.native
  def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: DocumentFragment, results: TArrayLike): TArrayLike = js.native
  def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Document, results: TArrayLike): TArrayLike = js.native
  def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Element, results: TArrayLike): TArrayLike = js.native
  
  // tslint:disable-next-line:ban-types
  def compile(selector: String): js.Function = js.native
  
  def matchSelector(element: Element, selector: String): Boolean = js.native
  
  def matches(selector: String, elements: js.Array[Element]): js.Array[Element] = js.native
  
  var selectors: Selectors = js.native
}
