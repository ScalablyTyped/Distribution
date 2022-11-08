package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeOptions extends StObject {
  
  /**
    * @deprecated this option is ignored in v9.x. raw stream operations should use {@link createReadStream} or {@link createWriteStream} instead
    */
  var end: js.UndefOr[Boolean] = js.undefined
}
object PipeOptions {
  
  inline def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  extension [Self <: PipeOptions](x: Self) {
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
