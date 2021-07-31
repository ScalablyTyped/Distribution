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
  
  @scala.inline
  def getClassNames(
    classNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionClassNames */ js.Any,
    timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any,
    disableAppearAsEnter: Boolean
  ): Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionStageClassNames */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(classNames.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], disableAppearAsEnter.asInstanceOf[js.Any])).asInstanceOf[Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionStageClassNames */ js.Any
  ]]
  
  @scala.inline
  def getElementSizing(): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")().asInstanceOf[CollapseSizing]
  @scala.inline
  def getElementSizing(element: HTMLElement): CollapseSizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSizing")(element.asInstanceOf[js.Any]).asInstanceOf[CollapseSizing]
  
  @scala.inline
  def getNextStage(stage: TransitionStage, transitionIn: Boolean): TransitionStage = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextStage")(stage.asInstanceOf[js.Any], transitionIn.asInstanceOf[js.Any])).asInstanceOf[TransitionStage]
  
  @scala.inline
  def getTimeoutDuration(
    timeout: Required[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any
    ],
    appearing: Boolean,
    stage: TransitionStage
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeoutDuration")(timeout.asInstanceOf[js.Any], appearing.asInstanceOf[js.Any], stage.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isEnter(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnter")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEntered(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntered")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEntering(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntering")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExit(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExit")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExited(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExited")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExiting(stage: TransitionStage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExiting")(stage.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** @private */
  trait CollapseSizing extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
  }
  object CollapseSizing {
    
    @scala.inline
    def apply(): CollapseSizing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseSizing]
    }
    
    @scala.inline
    implicit class CollapseSizingMutableBuilder[Self <: CollapseSizing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    }
  }
}
