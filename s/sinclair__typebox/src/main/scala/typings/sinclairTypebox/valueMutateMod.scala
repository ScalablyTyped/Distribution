package typings.sinclairTypebox

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueMutateMod {
  
  object ValueMutate {
    
    @JSImport("@sinclair/typebox/value/mutate", "ValueMutate")
    @js.native
    val ^ : js.Any = js.native
    
    /** Performs a deep mutable value assignment while retaining internal references. */
    inline def Mutate(current: Mutable, next: Mutable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Mutate")(current.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@sinclair/typebox/value/mutate", "ValueMutateInvalidRootMutationError")
  @js.native
  open class ValueMutateInvalidRootMutationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@sinclair/typebox/value/mutate", "ValueMutateTypeMismatchError")
  @js.native
  open class ValueMutateTypeMismatchError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type Mutable = StringDictionary[Any] | js.Array[Any]
}
