package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Header
import typings.reactNavigationStack.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderInterpolationProps extends StObject {
  
  /**
    * Values for the current screen (the screen which owns this header).
    */
  var current: Progress
  
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: Header
  
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[Progress] = js.undefined
}
object StackHeaderInterpolationProps {
  
  @scala.inline
  def apply(current: Progress, layouts: Header): StackHeaderInterpolationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderInterpolationProps]
  }
  
  @scala.inline
  implicit class StackHeaderInterpolationPropsMutableBuilder[Self <: StackHeaderInterpolationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Progress): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayouts(value: Header): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: Progress): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
