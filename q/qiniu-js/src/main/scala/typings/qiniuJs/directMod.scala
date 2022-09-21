package typings.qiniuJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directMod {
  
  @JSImport("qiniu-js/esm/upload/direct", JSImport.Default)
  @js.native
  open class default () extends Direct
  
  @js.native
  trait Direct
    extends typings.qiniuJs.baseMod.default {
    
    /* private */ var finishDirectProgress: Any = js.native
    
    /* private */ var updateDirectProgress: Any = js.native
  }
}
