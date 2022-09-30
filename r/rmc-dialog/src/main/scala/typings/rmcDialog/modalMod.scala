package typings.rmcDialog

import typings.react.mod.Component
import typings.reactNative.mod.ViewStyle
import typings.rmcDialog.rmcDialogDoubles.`1.05`
import typings.rmcDialog.rmcDialogInts.`0`
import typings.rmcDialog.rmcDialogInts.`1`
import typings.rmcDialog.rmcDialogStrings.`slide-down`
import typings.rmcDialog.rmcDialogStrings.`slide-up`
import typings.rmcDialog.rmcDialogStrings.fade
import typings.rmcDialog.rmcDialogStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
  @js.native
  open class default protected () extends RCModal {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-dialog/lib/Modal", "default.defaultProps")
    @js.native
    def defaultProps: IModalPropTypes = js.native
    inline def defaultProps_=(x: IModalPropTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IModalPropTypes extends StObject {
    
    var animateAppear: js.UndefOr[Boolean] = js.undefined
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var animationType: none | fade | `slide-up` | `slide-down`
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var visible: Boolean
    
    var wrapStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object IModalPropTypes {
    
    inline def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): IModalPropTypes = {
      val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalPropTypes]
    }
    
    extension [Self <: IModalPropTypes](x: Self) {
      
      inline def setAnimateAppear(value: Boolean): Self = StObject.set(x, "animateAppear", value.asInstanceOf[js.Any])
      
      inline def setAnimateAppearUndefined: Self = StObject.set(x, "animateAppear", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationType(value: none | fade | `slide-up` | `slide-down`): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskStyle(value: ViewStyle): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWrapStyle(value: ViewStyle): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  @js.native
  trait RCModal extends Component[IModalPropTypes, Any, Any] {
    
    var animDialog: Any = js.native
    
    var animMask: Any = js.native
    
    def animateDialog(visible: Any): Unit = js.native
    
    def animateMask(visible: Any): Unit = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRCModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRCModal(prevProps: Any): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MRCModal(nextProps: Any): Unit = js.native
    
    def getOpacity(visible: Any): `0` | `1` = js.native
    
    def getPosition(visible: Any): Double = js.native
    
    def getScale(visible: Any): `1` | `1.05` = js.native
    
    def onMaskClose(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRCModal(nextProps: Any, nextState: Any): Boolean = js.native
    
    def stopDialogAnim(): Unit = js.native
    
    def stopMaskAnim(): Unit = js.native
  }
}
