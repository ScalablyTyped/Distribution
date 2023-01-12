package typings.sshpk.mod

import typings.sshpk.mod.Format.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyParseOptions
  extends StObject
     with ReadOptions {
  
  var filename: js.UndefOr[String] = js.undefined
}
object KeyParseOptions {
  
  inline def apply(): KeyParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyParseOptions] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
