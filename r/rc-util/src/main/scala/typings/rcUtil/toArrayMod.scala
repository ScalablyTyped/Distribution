package typings.rcUtil

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toArrayMod {
  
  @JSImport("rc-util/lib/Children/toArray", JSImport.Default)
  @js.native
  def default(children: ReactNode): js.Array[ReactElement] = js.native
  @JSImport("rc-util/lib/Children/toArray", JSImport.Default)
  @js.native
  def default(children: ReactNode, option: Option): js.Array[ReactElement] = js.native
  
  @js.native
  trait Option extends StObject {
    
    var keepEmpty: js.UndefOr[Boolean] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepEmpty(value: Boolean): Self = StObject.set(x, "keepEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepEmptyUndefined: Self = StObject.set(x, "keepEmpty", js.undefined)
    }
  }
}
