package typings.sinclairTypebox

import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerMod {
  
  object ValuePointer {
    
    @JSImport("@sinclair/typebox/value/pointer", "ValuePointer")
    @js.native
    val ^ : js.Any = js.native
    
    /** Deletes a value at the given pointer */
    inline def Delete(value: Any, pointer: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Delete")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Formats the given pointer into navigable key components */
    inline def Format(pointer: String): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Format")(pointer.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[String]]
    
    /** Gets the value at the given pointer */
    inline def Get(value: Any, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Get")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /** Returns true if a value exists at the given pointer */
    inline def Has(value: Any, pointer: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("Has")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Sets the value at the given pointer. If the value at the pointer does not exist it is created */
    inline def Set(value: Any, pointer: String, update: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(value.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@sinclair/typebox/value/pointer", "ValuePointerRootDeleteError")
  @js.native
  open class ValuePointerRootDeleteError protected ()
    extends StObject
       with Error {
    def this(value: Any, path: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val path: String = js.native
    
    val value: Any = js.native
  }
  
  @JSImport("@sinclair/typebox/value/pointer", "ValuePointerRootSetError")
  @js.native
  open class ValuePointerRootSetError protected ()
    extends StObject
       with Error {
    def this(value: Any, path: String, update: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val path: String = js.native
    
    val update: Any = js.native
    
    val value: Any = js.native
  }
}
