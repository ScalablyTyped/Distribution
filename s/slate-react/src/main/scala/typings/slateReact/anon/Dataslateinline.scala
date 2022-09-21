package typings.slateReact.anon

import typings.slateReact.slateReactBooleans.`true`
import typings.slateReact.slateReactStrings.element
import typings.slateReact.slateReactStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataslateinline extends StObject {
  
  var `data-slate-inline`: js.UndefOr[`true`] = js.undefined
  
  var `data-slate-node`: element
  
  var `data-slate-void`: js.UndefOr[`true`] = js.undefined
  
  var dir: js.UndefOr[rtl] = js.undefined
  
  var ref: Any
}
object Dataslateinline {
  
  inline def apply(ref: Any): Dataslateinline = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("data-slate-node")("element")
    __obj.asInstanceOf[Dataslateinline]
  }
  
  extension [Self <: Dataslateinline](x: Self) {
    
    inline def `setData-slate-inline`(value: `true`): Self = StObject.set(x, "data-slate-inline", value.asInstanceOf[js.Any])
    
    inline def `setData-slate-inlineUndefined`: Self = StObject.set(x, "data-slate-inline", js.undefined)
    
    inline def `setData-slate-node`(value: element): Self = StObject.set(x, "data-slate-node", value.asInstanceOf[js.Any])
    
    inline def `setData-slate-void`(value: `true`): Self = StObject.set(x, "data-slate-void", value.asInstanceOf[js.Any])
    
    inline def `setData-slate-voidUndefined`: Self = StObject.set(x, "data-slate-void", js.undefined)
    
    inline def setDir(value: rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
