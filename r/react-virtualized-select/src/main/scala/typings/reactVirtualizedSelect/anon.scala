package typings.reactVirtualizedSelect

import typings.reactVirtualizedSelect.reactVirtualizedSelectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Async extends StObject {
    
    var async: `true` = js.native
  }
  object Async {
    
    @scala.inline
    def apply(async: `true`): Async = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
      __obj.asInstanceOf[Async]
    }
    
    @scala.inline
    implicit class AsyncMutableBuilder[Self <: Async] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Option[TValue] extends StObject {
    
    var option: TValue = js.native
  }
  object Option {
    
    @scala.inline
    def apply[TValue](option: TValue): Option[TValue] = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option[TValue]]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option[_], TValue] (val x: Self with Option[TValue]) extends AnyVal {
      
      @scala.inline
      def setOption(value: TValue): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
}
