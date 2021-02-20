package typings.rfc6902

import typings.rfc6902.pointerMod.Pointer
import typings.rfc6902.rfc6902Strings.add
import typings.rfc6902.rfc6902Strings.copy
import typings.rfc6902.rfc6902Strings.move
import typings.rfc6902.rfc6902Strings.remove
import typings.rfc6902.rfc6902Strings.replace
import typings.rfc6902.rfc6902Strings.test
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("rfc6902/diff", "diffAny")
  @js.native
  def diffAny(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  @JSImport("rfc6902/diff", "diffAny")
  @js.native
  def diffAny(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  
  @JSImport("rfc6902/diff", "diffArrays")
  @js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer): js.Array[Operation] = js.native
  @JSImport("rfc6902/diff", "diffArrays")
  @js.native
  def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  
  @JSImport("rfc6902/diff", "diffObjects")
  @js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = js.native
  @JSImport("rfc6902/diff", "diffObjects")
  @js.native
  def diffObjects(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = js.native
  
  @JSImport("rfc6902/diff", "intersection")
  @js.native
  def intersection(objects: ArrayLike[js.Object]): js.Array[String] = js.native
  
  @JSImport("rfc6902/diff", "isDestructive")
  @js.native
  def isDestructive(hasOp: Operation): Boolean = js.native
  
  @JSImport("rfc6902/diff", "subtract")
  @js.native
  def subtract(minuend: js.Object, subtrahend: js.Object): js.Array[String] = js.native
  
  @js.native
  trait AddOperation extends Operation {
    
    var op: add = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object AddOperation {
    
    @scala.inline
    def apply(op: add, path: String, value: js.Any): AddOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation]
    }
    
    @scala.inline
    implicit class AddOperationMutableBuilder[Self <: AddOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CopyOperation extends Operation {
    
    var from: String = js.native
    
    var op: copy = js.native
    
    var path: String = js.native
  }
  object CopyOperation {
    
    @scala.inline
    def apply(from: String, op: copy, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    @scala.inline
    implicit class CopyOperationMutableBuilder[Self <: CopyOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type Diff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation]]
  
  @js.native
  trait MoveOperation extends Operation {
    
    var from: String = js.native
    
    var op: move = js.native
    
    var path: String = js.native
  }
  object MoveOperation {
    
    @scala.inline
    def apply(from: String, op: move, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    @scala.inline
    implicit class MoveOperationMutableBuilder[Self <: MoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rfc6902.diffMod.AddOperation
    - typings.rfc6902.diffMod.RemoveOperation
    - typings.rfc6902.diffMod.ReplaceOperation
    - typings.rfc6902.diffMod.MoveOperation
    - typings.rfc6902.diffMod.CopyOperation
    - typings.rfc6902.diffMod.TestOperation
  */
  trait Operation extends StObject
  object Operation {
    
    @scala.inline
    def AddOperation(op: add, path: String, value: js.Any): typings.rfc6902.diffMod.AddOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.AddOperation]
    }
    
    @scala.inline
    def CopyOperation(from: String, op: copy, path: String): typings.rfc6902.diffMod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.CopyOperation]
    }
    
    @scala.inline
    def MoveOperation(from: String, op: move, path: String): typings.rfc6902.diffMod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.MoveOperation]
    }
    
    @scala.inline
    def RemoveOperation(op: remove, path: String): typings.rfc6902.diffMod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.RemoveOperation]
    }
    
    @scala.inline
    def ReplaceOperation(op: replace, path: String, value: js.Any): typings.rfc6902.diffMod.ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.ReplaceOperation]
    }
    
    @scala.inline
    def TestOperation(op: test, path: String, value: js.Any): typings.rfc6902.diffMod.TestOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.TestOperation]
    }
  }
  
  @js.native
  trait RemoveOperation extends Operation {
    
    var op: remove = js.native
    
    var path: String = js.native
  }
  object RemoveOperation {
    
    @scala.inline
    def apply(op: remove, path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    @scala.inline
    implicit class RemoveOperationMutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplaceOperation extends Operation {
    
    var op: replace = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object ReplaceOperation {
    
    @scala.inline
    def apply(op: replace, path: String, value: js.Any): ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation]
    }
    
    @scala.inline
    implicit class ReplaceOperationMutableBuilder[Self <: ReplaceOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestOperation extends Operation {
    
    var op: test = js.native
    
    var path: String = js.native
    
    var value: js.Any = js.native
  }
  object TestOperation {
    
    @scala.inline
    def apply(op: test, path: String, value: js.Any): TestOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation]
    }
    
    @scala.inline
    implicit class TestOperationMutableBuilder[Self <: TestOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type VoidableDiff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation] | Unit]
}
