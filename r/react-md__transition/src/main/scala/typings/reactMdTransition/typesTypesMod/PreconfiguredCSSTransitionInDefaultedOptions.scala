package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconfiguredCSSTransitionInDefaultedOptions[E /* <: HTMLElement */]
  extends StObject
     with PreconfiguredTransitionInDefaultedOptions[E] {
  
  /**
    * An optional className to be merged with the transition classes.
    */
  var className: js.UndefOr[String] = js.undefined
}
object PreconfiguredCSSTransitionInDefaultedOptions {
  
  inline def apply[E /* <: HTMLElement */](): PreconfiguredCSSTransitionInDefaultedOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreconfiguredCSSTransitionInDefaultedOptions[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreconfiguredCSSTransitionInDefaultedOptions[?], E /* <: HTMLElement */] (val x: Self & PreconfiguredCSSTransitionInDefaultedOptions[E]) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
