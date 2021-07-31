package typings.rfc6902

import typings.rfc6902.diffMod.AddOperation
import typings.rfc6902.diffMod.CopyOperation
import typings.rfc6902.diffMod.MoveOperation
import typings.rfc6902.diffMod.Operation
import typings.rfc6902.diffMod.RemoveOperation
import typings.rfc6902.diffMod.ReplaceOperation
import typings.rfc6902.diffMod.TestOperation
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchMod {
  
  @JSImport("rfc6902/patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rfc6902/patch", "InvalidOperationError")
  @js.native
  class InvalidOperationError protected ()
    extends StObject
       with Error {
    def this(operation: Operation) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var operation: Operation = js.native
  }
  
  @JSImport("rfc6902/patch", "MissingError")
  @js.native
  class MissingError protected ()
    extends StObject
       with Error {
    def this(path: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var path: String = js.native
  }
  
  @JSImport("rfc6902/patch", "TestError")
  @js.native
  class TestError protected ()
    extends StObject
       with Error {
    def this(actual: js.Any, expected: js.Any) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @scala.inline
  def add(`object`: js.Any, operation: AddOperation): MissingError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | Null]
  
  @scala.inline
  def apply(`object`: js.Any, operation: Operation): MissingError | InvalidOperationError | TestError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | InvalidOperationError | TestError | Null]
  
  @scala.inline
  def copy(`object`: js.Any, operation: CopyOperation): MissingError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | Null]
  
  @scala.inline
  def move(`object`: js.Any, operation: MoveOperation): MissingError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | Null]
  
  @scala.inline
  def remove(`object`: js.Any, operation: RemoveOperation): MissingError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | Null]
  
  @scala.inline
  def replace(`object`: js.Any, operation: ReplaceOperation): MissingError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[MissingError | Null]
  
  @scala.inline
  def test(`object`: js.Any, operation: TestOperation): TestError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(`object`.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[TestError | Null]
}
