package typings
package rfc6902Lib.pointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc6902/pointer", "Pointer")
@js.native
class Pointer () extends js.Object {
  def this(tokens: js.Array[java.lang.String]) = this()
  var tokens: js.Array[java.lang.String] = js.native
  /**
    `token` should be a String. It'll be coerced to one anyway.
    
    immutable (shallowly)
    */
  def add(token: java.lang.String): Pointer = js.native
  /**
    Returns an object with 'parent', 'key', and 'value' properties.
    In the special case that pointer = "", parent and key will be null, and `value = obj`
    Otherwise, parent will be the such that `parent[key] == value`
    */
  def evaluate(`object`: js.Any): PointerEvaluation = js.native
  def get(`object`: js.Any): js.Any = js.native
  def push(token: java.lang.String): scala.Unit = js.native
  def set(`object`: js.Any, value: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("rfc6902/pointer", "Pointer")
@js.native
object Pointer extends js.Object {
  /**
    `path` *must* be a properly escaped string.
    */
  def fromJSON(path: java.lang.String): rfc6902Lib.pointerMod.Pointer = js.native
}

