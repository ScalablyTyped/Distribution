package typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevValueOptions[OptionsType /* <: js.Array[js.Object] */] extends StObject {
  
  var prevValueOptions: js.UndefOr[js.Array[OptionsType]] = js.undefined
}
object PrevValueOptions {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](): PrevValueOptions[OptionsType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrevValueOptions[OptionsType]]
  }
  
  @scala.inline
  implicit class PrevValueOptionsMutableBuilder[Self <: PrevValueOptions[?], OptionsType /* <: js.Array[js.Object] */] (val x: Self & PrevValueOptions[OptionsType]) extends AnyVal {
    
    @scala.inline
    def setPrevValueOptions(value: js.Array[OptionsType]): Self = StObject.set(x, "prevValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueOptionsUndefined: Self = StObject.set(x, "prevValueOptions", js.undefined)
    
    @scala.inline
    def setPrevValueOptionsVarargs(value: OptionsType*): Self = StObject.set(x, "prevValueOptions", js.Array(value :_*))
  }
}
