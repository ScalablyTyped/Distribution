package typings.stripComments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("strip-comments/lib/Node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  @js.native
  class Block protected () extends Node {
    def this(node: Node) = this()
    
    def push(node: Node): Unit = js.native
  }
  
  @js.native
  class Node protected () extends js.Object {
    def this(node: Node) = this()
    
    var `match`: Boolean = js.native
    
    var newline: String = js.native
    
    var nodes: js.Array[js.Any] = js.native
    
    val `protected`: Boolean = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
}
