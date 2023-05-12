package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * For internal usage only.
  * Different release channels declare additional types of ReactNode this particular release channel accepts.
  * App or library types should never augment this interface.
  */
trait DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES extends StObject {
  
  var promises: typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode
}
object DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES {
  
  inline def apply(promises: typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode): DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES = {
    val __obj = js.Dynamic.literal(promises = promises.asInstanceOf[js.Any])
    __obj.asInstanceOf[DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES] (val x: Self) extends AnyVal {
    
    inline def setPromises(value: typings.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
  }
}
