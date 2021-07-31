package typings.reactNativeModal

import typings.reactNativeModal.anon.AnimationIn
import typings.reactNativeModal.anon.AnimationInTiming
import typings.reactNativeModal.anon.IsVisible
import typings.reactNativeModal.modalMod.ModalProps
import typings.reactNativeModal.modalMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal", "default.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    @scala.inline
    def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal", "default.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    @scala.inline
    def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal", "ReactNativeModal")
  @js.native
  class ReactNativeModal protected ()
    extends typings.reactNativeModal.modalMod.ReactNativeModal {
    def this(props: ModalProps) = this()
  }
  /* static members */
  object ReactNativeModal {
    
    @JSImport("react-native-modal", "ReactNativeModal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal", "ReactNativeModal.defaultProps")
    @js.native
    def defaultProps: AnimationInTiming = js.native
    @scala.inline
    def defaultProps_=(x: AnimationInTiming): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[IsVisible | Null]
    
    @JSImport("react-native-modal", "ReactNativeModal.propTypes")
    @js.native
    def propTypes: AnimationIn = js.native
    @scala.inline
    def propTypes_=(x: AnimationIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
