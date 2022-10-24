package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcDomMod.DOMAttributes
import typings.reactTypesShared.srcDomMod.FocusableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveResult extends StObject {
  
  /** Props to spread on the target element. */
  var moveProps: DOMAttributes[FocusableElement]
}
object MoveResult {
  
  inline def apply(moveProps: DOMAttributes[FocusableElement]): MoveResult = {
    val __obj = js.Dynamic.literal(moveProps = moveProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveResult]
  }
  
  extension [Self <: MoveResult](x: Self) {
    
    inline def setMoveProps(value: DOMAttributes[FocusableElement]): Self = StObject.set(x, "moveProps", value.asInstanceOf[js.Any])
  }
}
