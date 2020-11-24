package typings.rfc6902.pointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rfc6902/pointer", "Pointer")
@js.native
class Pointer () extends js.Object {
  def this(tokens: js.Array[String]) = this()
  
  /**
    `token` should be a String. It'll be coerced to one anyway.
    
    immutable (shallowly)
    */
  def add(token: String): Pointer = js.native
  
  /**
    Returns an object with 'parent', 'key', and 'value' properties.
    In the special case that this Pointer's path == "",
    this object will be {parent: null, key: '', value: object}.
    Otherwise, parent and key will have the property such that parent[key] == value.
    */
  def evaluate(`object`: js.Any): PointerEvaluation = js.native
  
  def get(`object`: js.Any): js.Any = js.native
  
  def push(token: String): Unit = js.native
  
  def set(`object`: js.Any, value: js.Any): Unit = js.native
  
  var tokens: js.Array[String] = js.native
}
/* static members */
@JSImport("rfc6902/pointer", "Pointer")
@js.native
object Pointer extends js.Object {
  
  /**
    `path` *must* be a properly escaped string.
    */
  def fromJSON(path: String): Pointer = js.native
}
