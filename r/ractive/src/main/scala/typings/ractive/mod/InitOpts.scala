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
  
  /** Initiial data for this instance. */
  var data: js.UndefOr[Data | DataFn[T]] = js.undefined
  
  /** The target element into which to render this instance. */
  var el: js.UndefOr[Target] = js.undefined
  
  /** If true, this instance will try to reuse DOM nodes found in its target rather than discarding and replacing them. Cannot be used with append. */
  var enhance: js.UndefOr[`true`] = js.undefined
  
  /** The target element into which to render this instance. */
  var target: js.UndefOr[Target] = js.undefined
  
  /** An array of plugins to apply to the instance. */
  var use: js.UndefOr[js.Array[PluginInstance]] = js.undefined
}
object InitOpts {
  
  @scala.inline
  def apply[T /* <: Ractive[T] */](): InitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOpts[T]]
  }
  
  @scala.inline
  implicit class InitOptsMutableBuilder[Self <: InitOpts[?], T /* <: Ractive[T] */] (val x: Self & InitOpts[T]) extends AnyVal {
    
    @scala.inline
    def setAppend(value: `true`): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setData(value: Data | DataFn[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEl(value: Target): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setEnhance(value: `true`): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUse(value: js.Array[PluginInstance]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setUseVarargs(value: PluginInstance*): Self = StObject.set(x, "use", js.Array(value :_*))
  }
}
