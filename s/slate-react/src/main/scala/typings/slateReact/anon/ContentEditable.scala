package typings.slateReact.anon

import typings.react.mod.CSSProperties
import typings.react.mod.RefObject
import typings.slateReact.slateReactStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentEditable extends StObject {
  
  var contentEditable: Boolean
  
  var `data-slate-placeholder`: Boolean
  
  var dir: js.UndefOr[rtl] = js.undefined
  
  var ref: RefObject[Any]
  
  var style: CSSProperties
}
object ContentEditable {
  
  inline def apply(
    contentEditable: Boolean,
    `data-slate-placeholder`: Boolean,
    ref: RefObject[Any],
    style: CSSProperties
  ): ContentEditable = {
    val __obj = js.Dynamic.literal(contentEditable = contentEditable.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("data-slate-placeholder")(`data-slate-placeholder`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEditable]
  }
  
  extension [Self <: ContentEditable](x: Self) {
    
    inline def setContentEditable(value: Boolean): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def `setData-slate-placeholder`(value: Boolean): Self = StObject.set(x, "data-slate-placeholder", value.asInstanceOf[js.Any])
    
    inline def setDir(value: rtl): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
