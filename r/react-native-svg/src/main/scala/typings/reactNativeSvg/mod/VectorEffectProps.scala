package typings.reactNativeSvg.mod

import typings.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typings.reactNativeSvg.reactNativeSvgStrings.inherit
import typings.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typings.reactNativeSvg.reactNativeSvgStrings.none
import typings.reactNativeSvg.reactNativeSvgStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEffectProps extends StObject {
  
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typings.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
  ] = js.undefined
}
object VectorEffectProps {
  
  @scala.inline
  def apply(): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEffectProps]
  }
  
  @scala.inline
  implicit class VectorEffectPropsMutableBuilder[Self <: VectorEffectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVectorEffect(
      value: none | `non-scaling-stroke` | nonScalingStroke | typings.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
    ): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
  }
}
