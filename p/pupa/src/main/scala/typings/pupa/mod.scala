package typings.pupa

import typings.pupa.anon.Key
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pupa", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(template: String, data: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(template: String, data: js.Array[Any], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(template: String, data: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(template: String, data: Record[String, Any], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pupa", "MissingValueError")
  @js.native
  open class MissingValueError protected ()
    extends StObject
       with Error {
    def this(key: String) = this()
    
    var key: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_MissingValueError: typings.pupa.pupaStrings.MissingValueError = js.native
  }
  
  trait Options extends StObject {
    
    /**
    	By default, Pupa throws a `MissingValueError` when a placeholder resolves to `undefined`. With this option set to `true`, it simply ignores it and leaves the placeholder as is.
    	@default false
    	*/
    var ignoreMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Performs arbitrary operation for each interpolation. If the returned value was `undefined`, it behaves differently depending on the `ignoreMissing` option. Otherwise, the returned value will be interpolated into a string (and escaped when double-braced) and embedded into the template.
    	@default ({value}) => value
    	*/
    var transform: js.UndefOr[js.Function1[/* data */ Key, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIgnoreMissing(value: Boolean): Self = StObject.set(x, "ignoreMissing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingUndefined: Self = StObject.set(x, "ignoreMissing", js.undefined)
      
      inline def setTransform(value: /* data */ Key => Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
