package typings.reactMdTransition

import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStageTimeoutMod {
  
  @JSImport("@react-md/transition/types/useStageTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useStageTimeout(
    timeout: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionTimeout */ js.Any,
    actions: Required[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionActions */ js.Any
    ],
    disableAppearAsEnter: Boolean
  ): Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStageTimeout")(timeout.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], disableAppearAsEnter.asInstanceOf[js.Any])).asInstanceOf[Required[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionStageTimeouts */ js.Any
  ]]
}
