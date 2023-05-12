package typings.sinclairTypebox

import typings.sinclairTypebox.anon.Path
import typings.sinclairTypebox.anon.PathType
import typings.sinclairTypebox.anon.Type
import typings.sinclairTypebox.mod.Static
import typings.sinclairTypebox.mod.TObject
import typings.sinclairTypebox.mod.TUnion
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueDeltaMod {
  
  @JSImport("@sinclair/typebox/value/delta", "Delete")
  @js.native
  val Delete: TObject[PathType] = js.native
  type Delete = Static[TObject[PathType], js.Array[Any]]
  
  @JSImport("@sinclair/typebox/value/delta", "Edit")
  @js.native
  val Edit: TUnion[js.Tuple3[TObject[Path], TObject[Type], TObject[PathType]]] = js.native
  type Edit = Static[TUnion[js.Tuple3[TObject[Path], TObject[Type], TObject[PathType]]], js.Array[Any]]
  
  @JSImport("@sinclair/typebox/value/delta", "Insert")
  @js.native
  val Insert: TObject[Path] = js.native
  type Insert = Static[TObject[Path], js.Array[Any]]
  
  @JSImport("@sinclair/typebox/value/delta", "Update")
  @js.native
  val Update: TObject[Type] = js.native
  type Update = Static[TObject[Type], js.Array[Any]]
  
  object ValueDelta {
    
    @JSImport("@sinclair/typebox/value/delta", "ValueDelta")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Diff(current: Any, next: Any): js.Array[typings.sinclairTypebox.valueDeltaMod.Edit] = (^.asInstanceOf[js.Dynamic].applyDynamic("Diff")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.sinclairTypebox.valueDeltaMod.Edit]]
    
    inline def Patch[T](current: Any, edits: js.Array[typings.sinclairTypebox.valueDeltaMod.Edit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("Patch")(current.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@sinclair/typebox/value/delta", "ValueDeltaObjectWithSymbolKeyError")
  @js.native
  open class ValueDeltaObjectWithSymbolKeyError protected ()
    extends StObject
       with Error {
    def this(key: Any) = this()
    
    val key: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@sinclair/typebox/value/delta", "ValueDeltaUnableToDiffUnknownValue")
  @js.native
  open class ValueDeltaUnableToDiffUnknownValue protected ()
    extends StObject
       with Error {
    def this(value: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val value: Any = js.native
  }
}
