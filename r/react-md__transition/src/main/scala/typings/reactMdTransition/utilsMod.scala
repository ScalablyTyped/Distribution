package typings.reactMdTransition

import typings.reactMdTransition.constantsMod.TransitionStage
import typings.std.HTMLElement
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/transition/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClassNames(
    classNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionClassNames */ js.Any,
    timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any,
    disableAppearAsEnter: Boolean
  ): Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionStageClassNames */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(classNames.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], disableAppearAsEnter.asInstanceOf[js.Any])).asInstanceOf[Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionStageClassNames */ js.Any
  ]]
  
  inline def getElementSizing(): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")().asInstanceOf[CollapseSizing]
  inline def getElementSizing(element: HTMLElement): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")(element.asInstanceOf[js.Any]).asInstanceOf[CollapseSizing]
  
  inline def getNextStage(stage: TransitionStage, transitionIn: Boolean): TransitionStage = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextStage")(stage.asInstanceOf[js.Any], transitionIn.asInstanceOf[js.Any])).asInstanceOf[TransitionStage]
  
  inline def getTimeoutDuration(
    timeout: Required[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any
    ],
    appearing: Boolean,
    stage: TransitionStage
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeoutDuration")(timeout.asInstanceOf[js.Any], appearing.asInstanceOf[js.Any], stage.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isEnter(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnter")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEntered(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntered")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEntering(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntering")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExit(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExit")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExited(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExited")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isExiting(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExiting")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @private */
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
}
