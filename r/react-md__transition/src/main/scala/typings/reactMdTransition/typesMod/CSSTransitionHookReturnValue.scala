package typings.reactMdTransition.typesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactMdTransition.typesMod.CSSTransitionElementProps because var conflicts: ref. Inlined className */ trait CSSTransitionHookReturnValue[E /* <: HTMLElement */]
  extends StObject
     with TransitionHookReturnValue[E] {
  
  /**
    * The current transition class name or `undefined`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * This can be used so that you don't need to destructure multiple props from
    * the hook return value to pass to the transitioning component.
    *
    * @example
    * Simple Example
    * ```tsx
    * import type { ReactElement } from "react";
    * import { useCSSTransition } from "@react-md/transition";
    *
    * interface ExampleProps {
    *   transitionIn: boolean;
    *   children: ReactNode;
    * }
    *
    * function Example({ transitionIn, children }: ExampleProps): ReactElement | null {
    *   const { elementProps, rendered } = useCSSTransition({
    *     timeout: 150,
    *     classNames: "example",
    *     transitionIn,
    *   });
    *
    *   if (!rendered) {
    *     return null;
    *   }
    *
    *   return <div {...elementProps}>{children}</div>
    * }
    * ```
    *
    * @example
    * Verbose Version
    * ```tsx
    * import type { ReactElement } from "react";
    * import { useCSSTransition } from "@react-md/transition";
    *
    * interface ExampleProps {
    *   transitionIn: boolean;
    *   children: ReactNode;
    * }
    *
    * function Example({ transitionIn, children }: ExampleProps): ReactElement | null {
    *   const { ref, className, rendered } = useCSSTransition({
    *     timeout: 150,
    *     classNames: "example",
    *     transitionIn,
    *   });
    *
    *   if (!rendered) {
    *     return null;
    *   }
    *
    *   return <div ref={ref} className={className}>{children}</div>
    * }
    * ```
    */
  var elementProps: CSSTransitionElementProps[E]
}
object CSSTransitionHookReturnValue {
  
  inline def apply[E /* <: HTMLElement */](
    appearing: Boolean,
    elementProps: CSSTransitionElementProps[E],
    ref: /* instance */ E | Null => Unit,
    rendered: Boolean,
    stage: TransitionStage,
    transitionTo: TransitionStage => Unit
  ): CSSTransitionHookReturnValue[E] = {
    val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], elementProps = elementProps.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], transitionTo = js.Any.fromFunction1(transitionTo))
    __obj.asInstanceOf[CSSTransitionHookReturnValue[E]]
  }
  
  extension [Self <: CSSTransitionHookReturnValue[?], E /* <: HTMLElement */](x: Self & CSSTransitionHookReturnValue[E]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setElementProps(value: CSSTransitionElementProps[E]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
  }
}
