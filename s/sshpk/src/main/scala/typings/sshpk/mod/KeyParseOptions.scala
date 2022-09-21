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
  
  extension [Self <: KeyParseOptions](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
