package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal You shouldn't need to use this type since you never see these attributes
  * inside your component or have to validate them.
  */
trait Attributes extends StObject {
  
  var key: js.UndefOr[Key | Null] = js.undefined
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
