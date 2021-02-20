package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOneOf extends StObject {
  
  /** Oneof field names */
  var oneof: js.Array[String] = js.native
  
  /** Oneof options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object IOneOf {
  
  @scala.inline
  def apply(oneof: js.Array[String]): IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneOf]
  }
  
  @scala.inline
  implicit class IOneOfMutableBuilder[Self <: IOneOf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOneof(value: js.Array[String]): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneofVarargs(value: String*): Self = StObject.set(x, "oneof", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
