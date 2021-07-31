package typings.storybookReactNative

import typings.react.mod.PureComponent
import typings.reactNative.mod.Animated.Value
import typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onDeviceUIMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", JSImport.Default)
  @js.native
  class default protected () extends OnDeviceUI {
    def this(props: OnDeviceUIProps) = this()
  }
  
  @js.native
  trait OnDeviceUI
    extends PureComponent[OnDeviceUIProps, OnDeviceUIState, js.Any] {
    
    var animatedValue: Value = js.native
    
    var channel: typings.storybookChannels.mod.default = js.native
    
    def handleOpenPreview(): Unit = js.native
    
    def handleToggleTab(newTabOpen: Double): Unit = js.native
    
    def onLayout(hasPreviewWidthPreviewHeight: PreviewDimens): Unit = js.native
  }
  
  trait OnDeviceUIProps extends StObject {
    
    var isUIHidden: js.UndefOr[Boolean] = js.undefined
    
    var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
    
    var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
    
    var stories: js.Any
    
    var tabOpen: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object OnDeviceUIProps {
    
    @scala.inline
    def apply(stories: js.Any): OnDeviceUIProps = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDeviceUIProps]
    }
    
    @scala.inline
    implicit class OnDeviceUIPropsMutableBuilder[Self <: OnDeviceUIProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsUIHidden(value: Boolean): Self = StObject.set(x, "isUIHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUIHiddenUndefined: Self = StObject.set(x, "isUIHidden", js.undefined)
      
      @scala.inline
      def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardAvoidingViewVerticalOffsetUndefined: Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", js.undefined)
      
      @scala.inline
      def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDisableKeyboardAvoidingViewUndefined: Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", js.undefined)
      
      @scala.inline
      def setStories(value: js.Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabOpenUndefined: Self = StObject.set(x, "tabOpen", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait OnDeviceUIState extends StObject {
    
    var previewHeight: Double
    
    var previewWidth: Double
    
    var slideBetweenAnimation: Boolean
    
    var tabOpen: Double
  }
  object OnDeviceUIState {
    
    @scala.inline
    def apply(previewHeight: Double, previewWidth: Double, slideBetweenAnimation: Boolean, tabOpen: Double): OnDeviceUIState = {
      val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any], slideBetweenAnimation = slideBetweenAnimation.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDeviceUIState]
    }
    
    @scala.inline
    implicit class OnDeviceUIStateMutableBuilder[Self <: OnDeviceUIState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideBetweenAnimation(value: Boolean): Self = StObject.set(x, "slideBetweenAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
    }
  }
}
