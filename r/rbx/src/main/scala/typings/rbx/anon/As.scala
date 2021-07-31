package typings.rbx.anon

import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[TAsComponent /* <: ReactType[js.Any] */] extends StObject {
  
  var as: js.UndefOr[TAsComponent] = js.undefined
}
object As {
  
  @scala.inline
  def apply[TAsComponent /* <: ReactType[js.Any] */](): As[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[TAsComponent]]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As[?], TAsComponent /* <: ReactType[js.Any] */] (val x: Self & As[TAsComponent]) extends AnyVal {
    
    @scala.inline
    def setAs(value: TAsComponent): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
  }
}
