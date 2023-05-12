package typings.rcImage

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.anon.Close
import typings.rcImage.anon.X
import typings.rcImage.rcImageBooleans.`false`
import typings.rcUtil.esPortalWrapperMod.GetContainer
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.Dispatch
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreviewGroupMod extends Shortcut {
  
  @JSImport("rc-image/lib/PreviewGroup", JSImport.Default)
  @js.native
  val default: FC[GroupConsumerProps] = js.native
  
  @JSImport("rc-image/lib/PreviewGroup", "context")
  @js.native
  val context: Context[GroupConsumerValue] = js.native
  
  trait GroupConsumerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var icons: js.UndefOr[Close] = js.undefined
    
    var preview: js.UndefOr[Boolean | PreviewGroupPreview] = js.undefined
    
    var previewPrefixCls: js.UndefOr[String] = js.undefined
  }
  object GroupConsumerProps {
    
    inline def apply(): GroupConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupConsumerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupConsumerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIcons(value: Close): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setPreview(value: Boolean | PreviewGroupPreview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewPrefixCls(value: String): Self = StObject.set(x, "previewPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setPreviewPrefixClsUndefined: Self = StObject.set(x, "previewPrefixCls", js.undefined)
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
  
  @js.native
  trait GroupConsumerValue
    extends StObject
       with GroupConsumerProps {
    
    var current: Double = js.native
    
    var isPreviewGroup: js.UndefOr[Boolean] = js.native
    
    var previewUrls: Map[Double, String] = js.native
    
    def registerImage(id: Double, url: String): js.Function0[Unit] = js.native
    def registerImage(id: Double, url: String, canPreview: Boolean): js.Function0[Unit] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var setCurrent: Dispatch[SetStateAction[Double]] = js.native
    
    var setMousePosition: Dispatch[SetStateAction[Null | X]] = js.native
    
    var setPreviewUrls: Dispatch[SetStateAction[Map[Double, PreviewUrl]]] = js.native
    
    var setShowPreview: Dispatch[SetStateAction[Boolean]] = js.native
  }
  
  /* Inlined parent std.Omit<rc-image.rc-image/lib/Image.ImagePreviewType, 'icons' | 'mask' | 'maskClassName'> */
  trait PreviewGroupPreview extends StObject {
    
    var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var animation: js.UndefOr[Any] = js.undefined
    
    var bodyProps: js.UndefOr[Any] = js.undefined
    
    var bodyStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var countRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, String]] = js.undefined
    
    /**
      * If Preview the show img index
      * @default 0
      */
    var current: js.UndefOr[Double] = js.undefined
    
    var destroyOnClose: js.UndefOr[Boolean] = js.undefined
    
    var focusTriggerAfterClose: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer | `false`] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var maskAnimation: js.UndefOr[Any] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskProps: js.UndefOr[Any] = js.undefined
    
    var maskStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
    
    var mousePosition: js.UndefOr[typings.rcDialog.anon.X | Null] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* current */ Double, /* prevCurrent */ Double, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[
        js.Function3[
          /* value */ Boolean, 
          /* prevValue */ Boolean, 
          /* currentIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var scaleStep: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapProps: js.UndefOr[Any] = js.undefined
    
    var wrapStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PreviewGroupPreview {
    
    inline def apply(): PreviewGroupPreview = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewGroupPreview]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewGroupPreview] (val x: Self) extends AnyVal {
      
      inline def setAfterOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1(value))
      
      inline def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBodyProps(value: Any): Self = StObject.set(x, "bodyProps", value.asInstanceOf[js.Any])
      
      inline def setBodyPropsUndefined: Self = StObject.set(x, "bodyProps", js.undefined)
      
      inline def setBodyStyle(value: Record[String, Any]): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCountRender(value: (/* current */ Double, /* total */ Double) => String): Self = StObject.set(x, "countRender", js.Any.fromFunction2(value))
      
      inline def setCountRenderUndefined: Self = StObject.set(x, "countRender", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      inline def setFocusTriggerAfterClose(value: Boolean): Self = StObject.set(x, "focusTriggerAfterClose", value.asInstanceOf[js.Any])
      
      inline def setFocusTriggerAfterCloseUndefined: Self = StObject.set(x, "focusTriggerAfterClose", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetContainer(value: GetContainer | `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMaskAnimation(value: Any): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskProps(value: Any): Self = StObject.set(x, "maskProps", value.asInstanceOf[js.Any])
      
      inline def setMaskPropsUndefined: Self = StObject.set(x, "maskProps", js.undefined)
      
      inline def setMaskStyle(value: Record[String, Any]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setModalRender(value: /* node */ ReactNode => ReactNode): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      inline def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      inline def setMousePosition(value: typings.rcDialog.anon.X): Self = StObject.set(x, "mousePosition", value.asInstanceOf[js.Any])
      
      inline def setMousePositionNull: Self = StObject.set(x, "mousePosition", null)
      
      inline def setMousePositionUndefined: Self = StObject.set(x, "mousePosition", js.undefined)
      
      inline def setOnChange(value: (/* current */ Double, /* prevCurrent */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnVisibleChange(
        value: (/* value */ Boolean, /* prevValue */ Boolean, /* currentIndex */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction3(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setScaleStep(value: Double): Self = StObject.set(x, "scaleStep", value.asInstanceOf[js.Any])
      
      inline def setScaleStepUndefined: Self = StObject.set(x, "scaleStep", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapProps(value: Any): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      inline def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
      
      inline def setWrapStyle(value: Record[String, Any]): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PreviewUrl extends StObject {
    
    var canPreview: Boolean
    
    var url: String
  }
  object PreviewUrl {
    
    inline def apply(canPreview: Boolean, url: String): PreviewUrl = {
      val __obj = js.Dynamic.literal(canPreview = canPreview.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewUrl] (val x: Self) extends AnyVal {
      
      inline def setCanPreview(value: Boolean): Self = StObject.set(x, "canPreview", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[GroupConsumerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPreviewGroupMod.foo` */
  override def _to: FC[GroupConsumerProps] = default
}
