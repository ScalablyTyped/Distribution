package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesignTagConfig extends StObject {
  
  val delimeter: js.Tuple2[String, String] = js.native
}
object DesignTagConfig {
  
  @scala.inline
  def apply(delimeter: js.Tuple2[String, String]): DesignTagConfig = {
    val __obj = js.Dynamic.literal(delimeter = delimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignTagConfig]
  }
  
  @scala.inline
  implicit class DesignTagConfigMutableBuilder[Self <: DesignTagConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimeter(value: js.Tuple2[String, String]): Self = StObject.set(x, "delimeter", value.asInstanceOf[js.Any])
  }
}
