package typings.quillDelta

import typings.quillDelta.opMod.Op
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("quill-delta/dist/Iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  
  @js.native
  trait Iterator extends js.Object {
    
    def hasNext(): Boolean = js.native
    
    var index: Double = js.native
    
    def next(): Op = js.native
    def next(length: Double): Op = js.native
    
    var offset: Double = js.native
    
    var ops: js.Array[Op] = js.native
    
    def peek(): Op = js.native
    
    def peekLength(): Double = js.native
    
    def peekType(): String = js.native
    
    def rest(): js.Array[Op] = js.native
  }
  
  @js.native
  class default protected () extends Iterator {
    def this(ops: js.Array[Op]) = this()
  }
}
