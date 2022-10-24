package typings.reactMdTransition

import typings.reactMdTransition.anon.ReadonlyRequiredCSSTransi
import typings.reactMdTransition.anon.ReadonlyRequiredTransitio
import typings.reactMdTransition.anon.ReadonlyTransitionTimeoutAppear
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@react-md/transition/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElementSizing(): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")().asInstanceOf[CollapseSizing]
  inline def getElementSizing(element: HTMLElement): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")(element.asInstanceOf[js.Any]).asInstanceOf[CollapseSizing]
  
  inline def getTransitionClassNames(param0: TransitionClassNamesOptions): ReadonlyRequiredCSSTransi = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionClassNames")(param0.asInstanceOf[js.Any]).asInstanceOf[ReadonlyRequiredCSSTransi]
  
  inline def getTransitionTimeout(param0: ReadonlyTransitionTimeoutAppear): ReadonlyRequiredTransitio = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionTimeout")(param0.asInstanceOf[js.Any]).asInstanceOf[ReadonlyRequiredTransitio]
  
  inline def isWithinViewport(param0: IsWithinViewportOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWithinViewport")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CollapseSizing extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
  }
  object CollapseSizing {
    
    inline def apply(): CollapseSizing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseSizing]
    }
    
    extension [Self <: CollapseSizing](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    }
  }
  
  /**
    * @remarks \@since 4.0.0
    * @internal
    */
  trait IsWithinViewportOptions extends StObject {
    
    var fixedElement: HTMLElement
    
    var fixedToElement: HTMLElement
  }
  object IsWithinViewportOptions {
    
    inline def apply(fixedElement: HTMLElement, fixedToElement: HTMLElement): IsWithinViewportOptions = {
      val __obj = js.Dynamic.literal(fixedElement = fixedElement.asInstanceOf[js.Any], fixedToElement = fixedToElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsWithinViewportOptions]
    }
    
    extension [Self <: IsWithinViewportOptions](x: Self) {
      
      inline def setFixedElement(value: HTMLElement): Self = StObject.set(x, "fixedElement", value.asInstanceOf[js.Any])
      
      inline def setFixedToElement(value: HTMLElement): Self = StObject.set(x, "fixedToElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionClassNamesOptions
    extends StObject
       with TransitionTimeoutOptions {
    
    var classNames: CSSTransitionClassNames
  }
  object TransitionClassNamesOptions {
    
    inline def apply(
      appear: Boolean,
      classNames: CSSTransitionClassNames,
      enter: Boolean,
      exit: Boolean,
      timeout: TransitionTimeout
    ): TransitionClassNamesOptions = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionClassNamesOptions]
    }
    
    extension [Self <: TransitionClassNamesOptions](x: Self) {
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Required<@react-md/transition.@react-md/transition/types/types.TransitionActions> */
  trait TransitionTimeoutOptions extends StObject {
    
    var appear: Boolean
    
    var enter: Boolean
    
    var exit: Boolean
    
    var timeout: TransitionTimeout
  }
  object TransitionTimeoutOptions {
    
    inline def apply(appear: Boolean, enter: Boolean, exit: Boolean, timeout: TransitionTimeout): TransitionTimeoutOptions = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionTimeoutOptions]
    }
    
    extension [Self <: TransitionTimeoutOptions](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
