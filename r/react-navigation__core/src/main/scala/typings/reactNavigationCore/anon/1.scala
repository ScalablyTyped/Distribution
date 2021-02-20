package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[Data] extends StObject {
  
  val data: js.UndefOr[Data] = js.native
}
object `1` {
  
  @scala.inline
  def apply[Data](): `1`[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[Data]]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`[_], Data] (val x: Self with `1`[Data]) extends AnyVal {
    
    @scala.inline
    def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
