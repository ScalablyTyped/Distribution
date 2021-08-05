package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var onCancel: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
}
object DialogProps {
  
  inline def apply(): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogProps]
  }
  
  extension [Self <: DialogProps](x: Self) {
    
    inline def setOnCancel(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
  }
}
