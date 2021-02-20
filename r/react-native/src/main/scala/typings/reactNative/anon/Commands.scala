package typings.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commands extends StObject {
  
  var Commands: StringDictionary[Double] = js.native
}
object Commands {
  
  @scala.inline
  def apply(Commands: StringDictionary[Double]): Commands = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
  
  @scala.inline
  implicit class CommandsMutableBuilder[Self <: Commands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: StringDictionary[Double]): Self = StObject.set(x, "Commands", value.asInstanceOf[js.Any])
  }
}
