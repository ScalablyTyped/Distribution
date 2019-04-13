package typings
package sizzleLib.sizzleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizzleStatic extends js.Object {
  var selectors: Selectors = js.native
  def apply(selector: java.lang.String): js.Array[stdLib.Element] = js.native
  def apply(selector: java.lang.String, context: stdLib.Document): js.Array[stdLib.Element] = js.native
  def apply(selector: java.lang.String, context: stdLib.DocumentFragment): js.Array[stdLib.Element] = js.native
  def apply(selector: java.lang.String, context: stdLib.Element): js.Array[stdLib.Element] = js.native
  def apply[TArrayLike /* <: stdLib.ArrayLike[stdLib.Element] */](selector: java.lang.String, context: stdLib.DocumentFragment, results: TArrayLike): TArrayLike = js.native
  def apply[TArrayLike /* <: stdLib.ArrayLike[stdLib.Element] */](selector: java.lang.String, context: stdLib.Document, results: TArrayLike): TArrayLike = js.native
  def apply[TArrayLike /* <: stdLib.ArrayLike[stdLib.Element] */](selector: java.lang.String, context: stdLib.Element, results: TArrayLike): TArrayLike = js.native
  // tslint:disable-next-line:ban-types
  def compile(selector: java.lang.String): js.Function = js.native
  def matchSelector(element: stdLib.Element, selector: java.lang.String): scala.Boolean = js.native
  def matches(selector: java.lang.String, elements: js.Array[stdLib.Element]): js.Array[stdLib.Element] = js.native
}

