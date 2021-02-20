package typings.reactGlobalConfiguration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-global-configuration", "get")
  @js.native
  def get(): js.Any = js.native
  @JSImport("react-global-configuration", "get")
  @js.native
  def get(key: String): js.Any = js.native
  @JSImport("react-global-configuration", "get")
  @js.native
  def get[Value](key: String, fallbackValue: Value): Value = js.native
  
  @JSImport("react-global-configuration", "serialize")
  @js.native
  def serialize(): String = js.native
  
  @JSImport("react-global-configuration", "set")
  @js.native
  def set(newConfiguration: js.Any): Unit = js.native
  @JSImport("react-global-configuration", "set")
  @js.native
  def set(newConfiguration: js.Any, newOptions: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var assign: Boolean = js.native
    
    var freeze: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(assign: Boolean, freeze: Boolean): Options = {
      val __obj = js.Dynamic.literal(assign = assign.asInstanceOf[js.Any], freeze = freeze.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssign(value: Boolean): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
    }
  }
}
