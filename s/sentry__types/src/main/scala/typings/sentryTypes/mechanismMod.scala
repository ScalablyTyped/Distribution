package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mechanismMod {
  
  @js.native
  trait Mechanism extends StObject {
    
    var data: js.UndefOr[StringDictionary[String | Boolean]] = js.native
    
    var handled: Boolean = js.native
    
    var synthetic: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
  }
  object Mechanism {
    
    @scala.inline
    def apply(handled: Boolean, `type`: String): Mechanism = {
      val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mechanism]
    }
    
    @scala.inline
    implicit class MechanismMutableBuilder[Self <: Mechanism] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynthetic(value: Boolean): Self = StObject.set(x, "synthetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntheticUndefined: Self = StObject.set(x, "synthetic", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
