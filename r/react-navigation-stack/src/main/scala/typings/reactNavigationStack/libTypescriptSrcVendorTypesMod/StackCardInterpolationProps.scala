package typings.reactNavigationStack.libTypescriptSrcVendorTypesMod

import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNavigationStack.anon.Left
import typings.reactNavigationStack.anon.Progress
import typings.reactNavigationStack.anon.Screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackCardInterpolationProps extends StObject {
  
  /**
    * Animated node representing whether the card is closing (1 - closing, 0 - not closing).
    */
  var closing: AnimatedInterpolation[Double | String]
  
  /**
    * Values for the current screen.
    */
  var current: Progress
  
  /**
    * The index of the card in the stack.
    */
  var index: Double
  
  /**
    * Safe area insets
    */
  var insets: Left
  
  /**
    * Animated node representing multiplier when direction is inverted (-1 - inverted, 1 - normal).
    */
  var inverted: AnimatedInterpolation[Double | String]
  
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: Screen
  
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[Progress] = js.undefined
  
  /**
    * Animated node representing whether the card is being swiped (1 - swiping, 0 - not swiping).
    */
  var swiping: AnimatedInterpolation[Double | String]
}
object StackCardInterpolationProps {
  
  inline def apply(
    closing: AnimatedInterpolation[Double | String],
    current: Progress,
    index: Double,
    insets: Left,
    inverted: AnimatedInterpolation[Double | String],
    layouts: Screen,
    swiping: AnimatedInterpolation[Double | String]
  ): StackCardInterpolationProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackCardInterpolationProps]
  }
  
  extension [Self <: StackCardInterpolationProps](x: Self) {
    
    inline def setClosing(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Progress): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInsets(value: Left): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    
    inline def setInverted(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setLayouts(value: Screen): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Progress): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setSwiping(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
  }
}
