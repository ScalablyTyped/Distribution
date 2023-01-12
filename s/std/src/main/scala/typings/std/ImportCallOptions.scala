package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type for the optional second argument to `import()`.
  *
  * If your host environment supports additional options, this type may be
  * augmented via interface merging.
  */
trait ImportCallOptions extends StObject {
  
  /* standard es5 */
  var assert: js.UndefOr[ImportAssertions] = js.undefined
}
object ImportCallOptions {
  
  inline def apply(): ImportCallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportCallOptions] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: ImportAssertions): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
  }
}
