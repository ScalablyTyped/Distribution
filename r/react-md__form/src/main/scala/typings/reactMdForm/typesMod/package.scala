package typings.reactMdForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type SliderDefaultValue = scala.Double | js.Function0[scala.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdForm.reactMdFormStrings.mouse
    - typings.reactMdForm.reactMdFormStrings.touch
    - scala.Null
  */
  type SliderDraggingType = typings.reactMdForm.typesMod._SliderDraggingType | scala.Null
  
  type UseSliderReturnValue = js.Tuple2[
    typings.reactMdForm.typesMod.SliderBehaviorProps, 
    typings.reactMdForm.typesMod.SliderActionCreators
  ]
}
