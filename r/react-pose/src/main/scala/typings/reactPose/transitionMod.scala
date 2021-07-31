package typings.reactPose

import typings.react.mod.Component
import typings.reactPose.anon.PartialState
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.transitionTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("react-pose/lib/components/Transition", JSImport.Default)
  @js.native
  class default () extends Transition
  object default {
    
    @JSImport("react-pose/lib/components/Transition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.enterAfterExit")
      @js.native
      def enterAfterExit: Boolean = js.native
      @scala.inline
      def enterAfterExit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.enterPose")
      @js.native
      def enterPose: String = js.native
      @scala.inline
      def enterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.exitPose")
      @js.native
      def exitPose: String = js.native
      @scala.inline
      def exitPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.flipMove")
      @js.native
      def flipMove: Boolean = js.native
      @scala.inline
      def flipMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.preEnterPose")
      @js.native
      def preEnterPose: String = js.native
      @scala.inline
      def preEnterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-pose/lib/components/Transition", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.Function2[/* props */ Props, /* state */ State, PartialState] = js.native
    @scala.inline
    def getDerivedStateFromProps_=(x: js.Function2[/* props */ Props, /* state */ State, PartialState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Transition
    extends Component[Props, State, js.Any] {
    
    def removeChild(key: String): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTransition(nextProps: Props, nextState: State): Boolean = js.native
  }
}
