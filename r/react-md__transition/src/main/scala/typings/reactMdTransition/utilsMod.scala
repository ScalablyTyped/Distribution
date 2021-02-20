package typings.reactMdTransition

import typings.reactMdTransition.constantsMod.TransitionStage
import typings.std.HTMLElement
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/transition/types/utils", "getClassNames")
  @js.native
  def getClassNames(
    classNames: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionClassNames */ js.Any,
    timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any,
    disableAppearAsEnter: Boolean
  ): Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionStageClassNames */ _
  ] = js.native
  
  @JSImport("@react-md/transition/types/utils", "getElementSizing")
  @js.native
  def getElementSizing(): CollapseSizing = js.native
  @JSImport("@react-md/transition/types/utils", "getElementSizing")
  @js.native
  def getElementSizing(element: HTMLElement): CollapseSizing = js.native
  
  @JSImport("@react-md/transition/types/utils", "getNextStage")
  @js.native
  def getNextStage(stage: TransitionStage, transitionIn: Boolean): TransitionStage = js.native
  
  @JSImport("@react-md/transition/types/utils", "getTimeoutDuration")
  @js.native
  def getTimeoutDuration(
    timeout: Required[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ _
    ],
    appearing: Boolean,
    stage: TransitionStage
  ): Double = js.native
  
  @JSImport("@react-md/transition/types/utils", "isEnter")
  @js.native
  def isEnter(stage: TransitionStage): Boolean = js.native
  
  @JSImport("@react-md/transition/types/utils", "isEntered")
  @js.native
  def isEntered(stage: TransitionStage): Boolean = js.native
  
  @JSImport("@react-md/transition/types/utils", "isEntering")
  @js.native
  def isEntering(stage: TransitionStage): Boolean = js.native
  
  @JSImport("@react-md/transition/types/utils", "isExit")
  @js.native
  def isExit(stage: TransitionStage): Boolean = js.native
  
  @JSImport("@react-md/transition/types/utils", "isExited")
  @js.native
  def isExited(stage: TransitionStage): Boolean = js.native
  
  @JSImport("@react-md/transition/types/utils", "isExiting")
  @js.native
  def isExiting(stage: TransitionStage): Boolean = js.native
  
  /** @private */
  @js.native
  trait CollapseSizing extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var paddingBottom: js.UndefOr[Double] = js.native
    
    var paddingTop: js.UndefOr[Double] = js.native
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
