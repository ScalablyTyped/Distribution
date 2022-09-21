package typings.soundPlay

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Stdin extends StObject {
    
    var stdin: String | Buffer
    
    var stdout: String | Buffer
  }
  object Stdin {
    
    inline def apply(stdin: String | Buffer, stdout: String | Buffer): Stdin = {
      val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdin]
    }
    
    extension [Self <: Stdin](x: Self) {
      
      inline def setStdin(value: String | Buffer): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String | Buffer): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
