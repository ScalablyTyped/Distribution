package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BLOCKSIZE extends StObject {
  
  var BLOCK_SIZE: js.UndefOr[Double] = js.undefined
}
object BLOCKSIZE {
  
  inline def apply(): BLOCKSIZE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BLOCKSIZE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BLOCKSIZE] (val x: Self) extends AnyVal {
    
    inline def setBLOCK_SIZE(value: Double): Self = StObject.set(x, "BLOCK_SIZE", value.asInstanceOf[js.Any])
    
    inline def setBLOCK_SIZEUndefined: Self = StObject.set(x, "BLOCK_SIZE", js.undefined)
  }
}
