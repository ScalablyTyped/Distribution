package typings.rmcDialog

import typings.react.mod.Component
import typings.reactNative.mod.ViewStyle
import typings.rmcDialog.rmcDialogNumbers.`0`
import typings.rmcDialog.rmcDialogNumbers.`1.05`
import typings.rmcDialog.rmcDialogNumbers.`1`
import typings.rmcDialog.rmcDialogStrings.`slide-down`
import typings.rmcDialog.rmcDialogStrings.`slide-up`
import typings.rmcDialog.rmcDialogStrings.fade
import typings.rmcDialog.rmcDialogStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
  @js.native
  class default protected () extends RCModal {
    def this(props: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-dialog/lib/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-dialog/lib/Modal", "default.defaultProps")
    @js.native
    def defaultProps: IModalPropTypes = js.native
    @scala.inline
    def defaultProps_=(x: IModalPropTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IModalPropTypes extends StObject {
    
    var animateAppear: js.UndefOr[Boolean] = js.native
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var animationType: none | fade | `slide-up` | `slide-down` = js.native
    
    var maskClosable: js.UndefOr[Boolean] = js.native
    
    var maskStyle: js.UndefOr[ViewStyle] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var visible: Boolean = js.native
    
    var wrapStyle: js.UndefOr[ViewStyle] = js.native
  }
  object IModalPropTypes {
    
    @scala.inline
    def apply(animationType: none | fade | `slide-up` | `slide-down`, visible: Boolean): IModalPropTypes = {
      val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalPropTypes]
    }
    
    @scala.inline
    implicit class IModalPropTypesMutableBuilder[Self <: IModalPropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateAppear(value: Boolean): Self = StObject.set(x, "animateAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateAppearUndefined: Self = StObject.set(x, "animateAppear", js.undefined)
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationType(value: none | fade | `slide-up` | `slide-down`): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      @scala.inline
      def setMaskStyle(value: ViewStyle): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyle(value: ViewStyle): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
    }
  }
  
  @js.native
  trait RCModal
    extends Component[IModalPropTypes, js.Any, js.Any] {
    
    var animDialog: js.Any = js.native
    
    var animMask: js.Any = js.native
    
    def animateDialog(visible: js.Any): Unit = js.native
    
    def animateMask(visible: js.Any): Unit = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MRCModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRCModal(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MRCModal(nextProps: js.Any): Unit = js.native
    
    def getOpacity(visible: js.Any): `0` | `1` = js.native
    
    def getPosition(visible: js.Any): Double = js.native
    
    def getScale(visible: js.Any): `1` | `1.05` = js.native
    
    def onMaskClose(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MRCModal(nextProps: js.Any, nextState: js.Any): Boolean = js.native
    
    def stopDialogAnim(): Unit = js.native
    
    def stopMaskAnim(): Unit = js.native
  }
}
