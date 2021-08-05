package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TailOptions extends StObject {
  
  /** Show the last <num> lines of files. */
  var `-n`: Double
}
object TailOptions {
  
  inline def apply(`-n`: Double): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailOptions]
  }
  
  extension [Self <: TailOptions](x: Self) {
    
    inline def `set-n`(value: Double): Self = StObject.set(x, "-n", value.asInstanceOf[js.Any])
  }
}
