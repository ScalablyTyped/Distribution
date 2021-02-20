package typings.reactMapGl

import typings.reactMapGl.mod.InteractiveState
import typings.reactMapGl.mod.MapState
import typings.reactMapGl.mod.MapStateProps
import typings.reactMapGl.mod.PositionInput
import typings.reactMapGl.mod.ViewportProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DeltaScaleX extends StObject {
    
    var deltaScaleX: js.UndefOr[Double] = js.native
    
    var deltaScaleY: js.UndefOr[Double] = js.native
  }
  object DeltaScaleX {
    
    @scala.inline
    def apply(): DeltaScaleX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeltaScaleX]
    }
    
    @scala.inline
    implicit class DeltaScaleXMutableBuilder[Self <: DeltaScaleX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeltaScaleX(value: Double): Self = StObject.set(x, "deltaScaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaScaleXUndefined: Self = StObject.set(x, "deltaScaleX", js.undefined)
      
      @scala.inline
      def setDeltaScaleY(value: Double): Self = StObject.set(x, "deltaScaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaScaleYUndefined: Self = StObject.set(x, "deltaScaleY", js.undefined)
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxPitch extends StObject {
    
    var maxPitch: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minPitch: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
  }
  object MaxPitch {
    
    @scala.inline
    def apply(): MaxPitch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxPitch]
    }
    
    @scala.inline
    implicit class MaxPitchMutableBuilder[Self <: MaxPitch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
    
    var status: Double = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String, status: Double): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-map-gl.react-map-gl.MapState> */
  @js.native
  trait PartialMapState extends StObject {
    
    var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, js.Any]] = js.native
    
    var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.native
    
    var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.native
    
    var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.native
    
    var panEnd: js.UndefOr[js.Function0[MapState]] = js.native
    
    var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
    
    var rotate: js.UndefOr[js.Function1[/* input */ DeltaScaleX, MapState]] = js.native
    
    var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.native
    
    var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
    
    var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.native
    
    var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.native
    
    var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.native
  }
  object PartialMapState {
    
    @scala.inline
    def apply(): PartialMapState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMapState]
    }
    
    @scala.inline
    implicit class PartialMapStateMutableBuilder[Self <: PartialMapState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstructor(value: /* props */ MapStateProps => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setGetInteractiveState(value: () => InteractiveState): Self = StObject.set(x, "getInteractiveState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInteractiveStateUndefined: Self = StObject.set(x, "getInteractiveState", js.undefined)
      
      @scala.inline
      def setGetViewportProps(value: () => ViewportProps): Self = StObject.set(x, "getViewportProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetViewportPropsUndefined: Self = StObject.set(x, "getViewportProps", js.undefined)
      
      @scala.inline
      def setPan(value: /* input */ PositionInputstartPosnumb => MapState): Self = StObject.set(x, "pan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanEnd(value: () => MapState): Self = StObject.set(x, "panEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPanEndUndefined: Self = StObject.set(x, "panEnd", js.undefined)
      
      @scala.inline
      def setPanStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "panStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanStartUndefined: Self = StObject.set(x, "panStart", js.undefined)
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      @scala.inline
      def setRotate(value: /* input */ DeltaScaleX => MapState): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateEnd(value: () => MapState): Self = StObject.set(x, "rotateEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRotateEndUndefined: Self = StObject.set(x, "rotateEnd", js.undefined)
      
      @scala.inline
      def setRotateStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "rotateStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateStartUndefined: Self = StObject.set(x, "rotateStart", js.undefined)
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setZoom(value: /* input */ PositionInputscalenumbers => MapState): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomEnd(value: () => MapState): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
      
      @scala.inline
      def setZoomStart(value: /* input */ PositionInput => MapState): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined react-map-gl.react-map-gl.PositionInput & {  scale :number,   startPos :[number, number] | undefined} */
  @js.native
  trait PositionInputscalenumbers extends StObject {
    
    var pos: js.Tuple2[Double, Double] = js.native
    
    var scale: Double = js.native
    
    var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object PositionInputscalenumbers {
    
    @scala.inline
    def apply(pos: js.Tuple2[Double, Double], scale: Double): PositionInputscalenumbers = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInputscalenumbers]
    }
    
    @scala.inline
    implicit class PositionInputscalenumbersMutableBuilder[Self <: PositionInputscalenumbers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
  
  /* Inlined react-map-gl.react-map-gl.PositionInput & {  startPos :[number, number] | undefined} */
  @js.native
  trait PositionInputstartPosnumb extends StObject {
    
    var pos: js.Tuple2[Double, Double] = js.native
    
    var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  }
  object PositionInputstartPosnumb {
    
    @scala.inline
    def apply(pos: js.Tuple2[Double, Double]): PositionInputstartPosnumb = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionInputstartPosnumb]
    }
    
    @scala.inline
    implicit class PositionInputstartPosnumbMutableBuilder[Self <: PositionInputstartPosnumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
