package typings.rcUtil

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esChildrenToArrayMod {
  
  @JSImport("rc-util/es/Children/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(children: ReactNode): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  inline def default(children: ReactNode, option: Option): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  trait Option extends StObject {
    
    var keepEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setKeepEmpty(value: Boolean): Self = StObject.set(x, "keepEmpty", value.asInstanceOf[js.Any])
      
      inline def setKeepEmptyUndefined: Self = StObject.set(x, "keepEmpty", js.undefined)
    }
  }
}
