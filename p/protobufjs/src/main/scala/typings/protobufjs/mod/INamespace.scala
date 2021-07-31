package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamespace
  extends StObject
     with AnyNestedObject {
  
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[AnyNestedObject]] = js.undefined
  
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object INamespace {
  
  @scala.inline
  def apply(): INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INamespace]
  }
  
  @scala.inline
  implicit class INamespaceMutableBuilder[Self <: INamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNested(value: StringDictionary[AnyNestedObject]): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
