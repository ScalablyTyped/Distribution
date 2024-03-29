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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("rfc6902/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diffAny(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffAny")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def diffAny(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffAny")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def diffArrays[T](input: js.Array[T], output: js.Array[T], ptr: Pointer, diff: Diff): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def diffObjects(input: js.Any, output: js.Any, ptr: Pointer): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def diffObjects(input: js.Any, output: js.Any, ptr: Pointer, diff: Diff): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffObjects")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def intersection(objects: ArrayLike[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(objects.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isDestructive(hasOp: Operation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDestructive")(hasOp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def subtract(minuend: js.Object, subtrahend: js.Object): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(minuend.asInstanceOf[js.Any], subtrahend.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait AddOperation
    extends StObject
       with Operation {
    
    var op: add
    
    var path: String
    
    var value: js.Any
  }
  object AddOperation {
    
    inline def apply(path: String, value: js.Any): AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation]
    }
    
    extension [Self <: AddOperation](x: Self) {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CopyOperation
    extends StObject
       with Operation {
    
    var from: String
    
    var op: copy
    
    var path: String
  }
  object CopyOperation {
    
    inline def apply(from: String, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    extension [Self <: CopyOperation](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type Diff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation]]
  
  trait MoveOperation
    extends StObject
       with Operation {
    
    var from: String
    
    var op: move
    
    var path: String
  }
  object MoveOperation {
    
    inline def apply(from: String, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    extension [Self <: MoveOperation](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
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
    
    inline def AddOperation(path: String, value: js.Any): typings.rfc6902.diffMod.AddOperation = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.AddOperation]
    }
    
    inline def CopyOperation(from: String, path: String): typings.rfc6902.diffMod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.CopyOperation]
    }
    
    inline def MoveOperation(from: String, path: String): typings.rfc6902.diffMod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.MoveOperation]
    }
    
    inline def RemoveOperation(path: String): typings.rfc6902.diffMod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.RemoveOperation]
    }
    
    inline def ReplaceOperation(path: String, value: js.Any): typings.rfc6902.diffMod.ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.ReplaceOperation]
    }
    
    inline def TestOperation(path: String, value: js.Any): typings.rfc6902.diffMod.TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rfc6902.diffMod.TestOperation]
    }
  }
  
  trait RemoveOperation
    extends StObject
       with Operation {
    
    var op: remove
    
    var path: String
  }
  object RemoveOperation {
    
    inline def apply(path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    extension [Self <: RemoveOperation](x: Self) {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOperation
    extends StObject
       with Operation {
    
    var op: replace
    
    var path: String
    
    var value: js.Any
  }
  object ReplaceOperation {
    
    inline def apply(path: String, value: js.Any): ReplaceOperation = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation]
    }
    
    extension [Self <: ReplaceOperation](x: Self) {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOperation
    extends StObject
       with Operation {
    
    var op: test
    
    var path: String
    
    var value: js.Any
  }
  object TestOperation {
    
    inline def apply(path: String, value: js.Any): TestOperation = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation]
    }
    
    extension [Self <: TestOperation](x: Self) {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type VoidableDiff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation] | Unit]
}
