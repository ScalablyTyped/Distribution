package typings.reduxPack

import typings.reduxPack.mod.LIFECYCLEValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ReduxpackLIFECYCLE extends StObject {
    
    @JSName("redux-pack/LIFECYCLE")
    var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.undefined
    
    @JSName("redux-pack/TRANSACTION")
    var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.undefined
  }
  object ReduxpackLIFECYCLE {
    
    inline def apply(): ReduxpackLIFECYCLE = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxpackLIFECYCLE]
    }
    
    extension [Self <: ReduxpackLIFECYCLE](x: Self) {
      
      inline def `setRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = StObject.set(x, "redux-pack/LIFECYCLE", value.asInstanceOf[js.Any])
      
      inline def `setRedux-packSlashLIFECYCLEUndefined`: Self = StObject.set(x, "redux-pack/LIFECYCLE", js.undefined)
      
      inline def `setRedux-packSlashTRANSACTION`(value: String): Self = StObject.set(x, "redux-pack/TRANSACTION", value.asInstanceOf[js.Any])
      
      inline def `setRedux-packSlashTRANSACTIONUndefined`: Self = StObject.set(x, "redux-pack/TRANSACTION", js.undefined)
    }
  }
}
