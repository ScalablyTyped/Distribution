package typings.reactResponsiveSpritesheet

import typings.csstype.mod.Properties
import typings.csstype.mod.Property.BackgroundPosition
import typings.csstype.mod.Property.BackgroundRepeat
import typings.csstype.mod.Property.BackgroundSize
import typings.react.mod.Component
import typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetInts.`0`
import typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-responsive-spritesheet", JSImport.Default)
  @js.native
  open class default () extends ReactResponsiveSpritesheet
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPlaying
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPaused
  */
  trait BooleanInfoType extends StObject
  object BooleanInfoType {
    
    inline def isPaused: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPaused = "isPaused".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPaused]
    
    inline def isPlaying: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPlaying = "isPlaying".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.isPlaying]
  }
  
  type Callback = js.Function1[/* spritesheet */ ReactResponsiveSpritesheet, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.forward
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.rewind
  */
  trait Direction extends StObject
  object Direction {
    
    inline def forward: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.forward = "forward".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.forward]
    
    inline def rewind: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.rewind = "rewind".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.rewind]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.frame
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.fps
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.steps
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.width
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.height
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.scale
    - typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.completeLoopCicles
  */
  trait NumberInfoType extends StObject
  object NumberInfoType {
    
    inline def completeLoopCicles: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.completeLoopCicles = "completeLoopCicles".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.completeLoopCicles]
    
    inline def fps: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.fps = "fps".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.fps]
    
    inline def frame: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.frame = "frame".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.frame]
    
    inline def height: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.height = "height".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.height]
    
    inline def scale: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.scale = "scale".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.scale]
    
    inline def steps: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.steps = "steps".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.steps]
    
    inline def width: typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.width = "width".asInstanceOf[typings.reactResponsiveSpritesheet.reactResponsiveSpritesheetStrings.width]
  }
  
  trait Props extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var backgroundPosition: js.UndefOr[BackgroundPosition[String | `0`]] = js.undefined
    
    var backgroundRepeat: js.UndefOr[BackgroundRepeat] = js.undefined
    
    var backgroundSize: js.UndefOr[BackgroundSize[String | `0`]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: Direction
    
    var endAt: js.UndefOr[Double] = js.undefined
    
    var fps: Double
    
    var getInstance: js.UndefOr[Callback] = js.undefined
    
    var heightFrame: Double
    
    var image: String
    
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[Callback] = js.undefined
    
    var onDoubleClick: js.UndefOr[Callback] = js.undefined
    
    var onEachFrame: js.UndefOr[Callback] = js.undefined
    
    var onEnterFrame: js.UndefOr[js.Array[typings.reactResponsiveSpritesheet.anon.Callback]] = js.undefined
    
    var onInit: js.UndefOr[Callback] = js.undefined
    
    var onLoopComplete: js.UndefOr[Callback] = js.undefined
    
    var onMouseDown: js.UndefOr[Callback] = js.undefined
    
    var onMouseEnter: js.UndefOr[Callback] = js.undefined
    
    var onMouseLeave: js.UndefOr[Callback] = js.undefined
    
    var onMouseMove: js.UndefOr[Callback] = js.undefined
    
    var onMouseOut: js.UndefOr[Callback] = js.undefined
    
    var onMouseOver: js.UndefOr[Callback] = js.undefined
    
    var onMouseUp: js.UndefOr[Callback] = js.undefined
    
    var onPause: js.UndefOr[Callback] = js.undefined
    
    var onPlay: js.UndefOr[Callback] = js.undefined
    
    var onResize: js.UndefOr[Callback] = js.undefined
    
    var startAt: js.UndefOr[Double] = js.undefined
    
    var steps: Double
    
    var style: js.UndefOr[Properties[String | `0`, String]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var widthFrame: Double
  }
  object Props {
    
    inline def apply(
      direction: Direction,
      fps: Double,
      heightFrame: Double,
      image: String,
      steps: Double,
      widthFrame: Double
    ): Props = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], heightFrame = heightFrame.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], widthFrame = widthFrame.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPosition(value: BackgroundPosition[String | `0`]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundRepeat(value: BackgroundRepeat): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(value: BackgroundSize[String | `0`]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEndAt(value: Double): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
      
      inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setGetInstance(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "getInstance", js.Any.fromFunction1(value))
      
      inline def setGetInstanceUndefined: Self = StObject.set(x, "getInstance", js.undefined)
      
      inline def setHeightFrame(value: Double): Self = StObject.set(x, "heightFrame", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnClick(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDoubleClick(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnEachFrame(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onEachFrame", js.Any.fromFunction1(value))
      
      inline def setOnEachFrameUndefined: Self = StObject.set(x, "onEachFrame", js.undefined)
      
      inline def setOnEnterFrame(value: js.Array[typings.reactResponsiveSpritesheet.anon.Callback]): Self = StObject.set(x, "onEnterFrame", value.asInstanceOf[js.Any])
      
      inline def setOnEnterFrameUndefined: Self = StObject.set(x, "onEnterFrame", js.undefined)
      
      inline def setOnEnterFrameVarargs(value: typings.reactResponsiveSpritesheet.anon.Callback*): Self = StObject.set(x, "onEnterFrame", js.Array(value*))
      
      inline def setOnInit(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction1(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnLoopComplete(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onLoopComplete", js.Any.fromFunction1(value))
      
      inline def setOnLoopCompleteUndefined: Self = StObject.set(x, "onLoopComplete", js.undefined)
      
      inline def setOnMouseDown(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPause(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnResize(value: /* spritesheet */ ReactResponsiveSpritesheet => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Properties[String | `0`, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWidthFrame(value: Double): Self = StObject.set(x, "widthFrame", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactResponsiveSpritesheet
    extends Component[Props, js.Object, Any] {
    
    def getInfo(`type`: BooleanInfoType): Boolean = js.native
    def getInfo(`type`: NumberInfoType): Double = js.native
    @JSName("getInfo")
    def getInfo_direction(`type`: direction): Direction = js.native
    
    def goToAndPause(frame: Double): Unit = js.native
    
    def goToAndPlay(frame: Double): Unit = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    def setDirection(direction: Direction): Unit = js.native
    
    def setEndAt(frame: Double): Unit = js.native
    
    def setFps(fps: Double): Unit = js.native
    
    def setStartAt(frame: Double): Unit = js.native
  }
}
