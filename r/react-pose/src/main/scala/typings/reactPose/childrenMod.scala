package typings.reactPose

import typings.reactPose.anon.PartialState
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.transitionTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childrenMod {
  
  @JSImport("react-pose/lib/components/Transition/children", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props, state: State): PartialState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialState]
}
