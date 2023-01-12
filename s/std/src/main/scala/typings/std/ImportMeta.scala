package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of `import.meta`.
  *
  * If you need to declare that a given property exists on `import.meta`,
  * this type may be augmented via interface merging.
  */
trait ImportMeta extends StObject {
  
  /* standard dom */
  var url: java.lang.String
}
object ImportMeta {
  
  inline def apply(url: java.lang.String): ImportMeta = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportMeta] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
