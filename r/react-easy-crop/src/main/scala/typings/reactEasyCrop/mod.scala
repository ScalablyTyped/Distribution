package typings.reactEasyCrop

import typings.react.mod.NativeMouseEvent
import typings.reactEasyCrop.anon.Crop
import typings.reactEasyCrop.anon.X
import typings.reactEasyCrop.anon.Zoom
import typings.reactEasyCrop.reactEasyCropStrings.contain
import typings.reactEasyCrop.reactEasyCropStrings.rect
import typings.reactEasyCrop.typesMod.Area
import typings.reactEasyCrop.typesMod.MediaSize
import typings.reactEasyCrop.typesMod.Size
import typings.std.Element
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-easy-crop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  open class default ()
    extends typings.reactEasyCrop.cropperMod.default
  object default {
    
    @JSImport("react-easy-crop", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-easy-crop", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-easy-crop", "default.defaultProps.aspect")
      @js.native
      def aspect: Double = js.native
      inline def aspect_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.cropShape")
      @js.native
      def cropShape: rect = js.native
      inline def cropShape_=(x: rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cropShape")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.maxZoom")
      @js.native
      def maxZoom: Double = js.native
      inline def maxZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.minZoom")
      @js.native
      def minZoom: Double = js.native
      inline def minZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.objectFit")
      @js.native
      def objectFit: contain = js.native
      inline def objectFit_=(x: contain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.restrictPosition")
      @js.native
      def restrictPosition: Boolean = js.native
      inline def restrictPosition_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.rotation")
      @js.native
      def rotation: Double = js.native
      inline def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.showGrid")
      @js.native
      def showGrid: Boolean = js.native
      inline def showGrid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.zoom")
      @js.native
      def zoom: Double = js.native
      
      @JSImport("react-easy-crop", "default.defaultProps.zoomSpeed")
      @js.native
      def zoomSpeed: Double = js.native
      inline def zoomSpeed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("react-easy-crop", "default.defaultProps.zoomWithScroll")
      @js.native
      def zoomWithScroll: Boolean = js.native
      inline def zoomWithScroll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomWithScroll")(x.asInstanceOf[js.Any])
      
      inline def zoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-easy-crop", "default.getMousePoint")
    @js.native
    def getMousePoint: js.Function1[/* e */ MouseEvent | (typings.react.mod.MouseEvent[Element, NativeMouseEvent]), X] = js.native
    inline def getMousePoint_=(x: js.Function1[/* e */ MouseEvent | (typings.react.mod.MouseEvent[Element, NativeMouseEvent]), X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMousePoint")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("react-easy-crop", "default.getTouchPoint")
    @js.native
    def getTouchPoint: js.Function1[/* touch */ Touch | typings.react.mod.Touch, X] = js.native
    inline def getTouchPoint_=(x: js.Function1[/* touch */ Touch | typings.react.mod.Touch, X]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTouchPoint")(x.asInstanceOf[js.Any])
  }
  
  inline def getInitialCropFromCroppedAreaPercentages(
    croppedAreaPercentages: Area,
    mediaSize: MediaSize,
    rotation: Double,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPercentages")(croppedAreaPercentages.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Crop]
  
  inline def getInitialCropFromCroppedAreaPixels(
    croppedAreaPixels: Area,
    mediaSize: MediaSize,
    rotation: Double,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Zoom = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Zoom]
  inline def getInitialCropFromCroppedAreaPixels(
    croppedAreaPixels: Area,
    mediaSize: MediaSize,
    rotation: Unit,
    cropSize: Size,
    minZoom: Double,
    maxZoom: Double
  ): Zoom = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialCropFromCroppedAreaPixels")(croppedAreaPixels.asInstanceOf[js.Any], mediaSize.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], minZoom.asInstanceOf[js.Any], maxZoom.asInstanceOf[js.Any])).asInstanceOf[Zoom]
}
