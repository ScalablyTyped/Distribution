package typings.reactGlobalConfiguration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-global-configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
  @scala.inline
  def get(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def get[Value](key: String, fallbackValue: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], fallbackValue.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  @scala.inline
  def serialize(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[String]
  
  @scala.inline
  def set(newConfiguration: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(newConfiguration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def set(newConfiguration: js.Any, newOptions: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(newConfiguration.asInstanceOf[js.Any], newOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var assign: Boolean
    
    var freeze: Boolean
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
