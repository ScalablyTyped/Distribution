package typings.rcSelect.anon

import typings.rcSelect.interfaceMod.OptionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var prevValueOptions: js.UndefOr[js.Array[OptionData]] = js.undefined
}
object `1` {
  
  @scala.inline
  def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrevValueOptions(value: js.Array[OptionData]): Self = StObject.set(x, "prevValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevValueOptionsUndefined: Self = StObject.set(x, "prevValueOptions", js.undefined)
    
    @scala.inline
    def setPrevValueOptionsVarargs(value: OptionData*): Self = StObject.set(x, "prevValueOptions", js.Array(value :_*))
  }
}
