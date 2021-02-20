package typings.stripComments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("strip-comments/lib/Node", "Block")
  @js.native
  class Block protected () extends Node {
    def this(node: Node) = this()
    
    def push(node: Node): Unit = js.native
  }
  
  @JSImport("strip-comments/lib/Node", "Node")
  @js.native
  class Node protected () extends StObject {
    def this(node: Node) = this()
    
    var `match`: Boolean = js.native
    
    var newline: String = js.native
    
    var nodes: js.Array[js.Any] = js.native
    
    val `protected`: Boolean = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
}
