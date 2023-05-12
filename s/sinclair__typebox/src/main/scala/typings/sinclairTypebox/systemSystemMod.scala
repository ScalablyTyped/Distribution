package typings.sinclairTypebox

import typings.sinclairTypebox.mod.TUnsafe
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemSystemMod {
  
  object TypeSystem {
    
    @JSImport("@sinclair/typebox/system/system", "TypeSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** Sets whether arrays should be treated as a kind of objects. The default is `false` */
    @JSImport("@sinclair/typebox/system/system", "TypeSystem.AllowArrayObjects")
    @js.native
    def AllowArrayObjects: Boolean = js.native
    inline def AllowArrayObjects_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowArrayObjects")(x.asInstanceOf[js.Any])
    
    /** Sets whether `NaN` or `Infinity` should be treated as valid numeric values. The default is `false` */
    @JSImport("@sinclair/typebox/system/system", "TypeSystem.AllowNaN")
    @js.native
    def AllowNaN: Boolean = js.native
    inline def AllowNaN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowNaN")(x.asInstanceOf[js.Any])
    
    /** Sets whether `null` should validate for void types. The default is `false` */
    @JSImport("@sinclair/typebox/system/system", "TypeSystem.AllowVoidNull")
    @js.native
    def AllowVoidNull: Boolean = js.native
    inline def AllowVoidNull_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllowVoidNull")(x.asInstanceOf[js.Any])
    
    /** Sets whether TypeBox should assert optional properties using the TypeScript `exactOptionalPropertyTypes` assertion policy. The default is `false` */
    @JSImport("@sinclair/typebox/system/system", "TypeSystem.ExactOptionalPropertyTypes")
    @js.native
    def ExactOptionalPropertyTypes: Boolean = js.native
    inline def ExactOptionalPropertyTypes_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExactOptionalPropertyTypes")(x.asInstanceOf[js.Any])
    
    /** Creates a new string format */
    inline def Format[F /* <: String */](format: F, check: js.Function1[/* value */ String, Boolean]): F = (^.asInstanceOf[js.Dynamic].applyDynamic("Format")(format.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[F]
    
    /** Creates a new type */
    inline def Type[Type, Options](kind: String, check: js.Function2[/* options */ Options, /* value */ Any, Boolean]): js.Function1[/* options */ js.UndefOr[Partial[Options]], TUnsafe[Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Type")(kind.asInstanceOf[js.Any], check.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* options */ js.UndefOr[Partial[Options]], TUnsafe[Type]]]
  }
  
  @JSImport("@sinclair/typebox/system/system", "TypeSystemDuplicateFormat")
  @js.native
  open class TypeSystemDuplicateFormat protected ()
    extends StObject
       with Error {
    def this(kind: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@sinclair/typebox/system/system", "TypeSystemDuplicateTypeKind")
  @js.native
  open class TypeSystemDuplicateTypeKind protected ()
    extends StObject
       with Error {
    def this(kind: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
