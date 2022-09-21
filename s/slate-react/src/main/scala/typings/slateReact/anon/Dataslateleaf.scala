package typings.slateReact.anon

import typings.slateReact.slateReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataslateleaf extends StObject {
  
  var `data-slate-leaf`: `true`
}
object Dataslateleaf {
  
  inline def apply(): Dataslateleaf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-slate-leaf")(true)
    __obj.asInstanceOf[Dataslateleaf]
  }
  
  extension [Self <: Dataslateleaf](x: Self) {
    
    inline def `setData-slate-leaf`(value: `true`): Self = StObject.set(x, "data-slate-leaf", value.asInstanceOf[js.Any])
  }
}
