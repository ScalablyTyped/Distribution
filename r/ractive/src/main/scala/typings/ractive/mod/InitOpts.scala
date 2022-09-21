package typings.ractive.mod

import typings.ractive.ractiveBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOpts[T /* <: Ractive[T] */]
  extends StObject
     with BaseInitOpts[T] {
  
  /** If true, this instance can occupy the target element with other existing instances rather than cause them to unrender. Cannot be used with enhance. */
  @JSName("append")
  var append_InitOpts: js.UndefOr[`true`] = js.undefined
  
  /** Initial data for this instance. */
  var data: js.UndefOr[Data | DataFn[T]] = js.undefined
  
  /** The target element into which to render this instance. */
  var el: js.UndefOr[Target] = js.undefined
  
  /** If true, this instance will try to reuse DOM nodes found in its target rather than discarding and replacing them. Cannot be used with append. */
  var enhance: js.UndefOr[`true`] = js.undefined
  
  /** The target element into which to render this instance. */
  var target: js.UndefOr[Target] = js.undefined
  
  /** An array of plugins to apply to the instance. */
  var use: js.UndefOr[js.Array[Plugin]] = js.undefined
}
object InitOpts {
  
  inline def apply[T /* <: Ractive[T] */](): InitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOpts[T]]
  }
  
  extension [Self <: InitOpts[?], T /* <: Ractive[T] */](x: Self & InitOpts[T]) {
    
    inline def setAppend(value: `true`): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setData(value: Data | DataFn[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEl(value: Target): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setEnhance(value: `true`): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    inline def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUse(value: js.Array[Plugin]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: Plugin*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
