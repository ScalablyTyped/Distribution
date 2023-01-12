package typings.rheostat

import typings.react.mod.Component
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rheostat", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, scala.Nothing, Any]
  
  trait Algorithm extends StObject {
    
    def getPosition(value: Double, min: Double, max: Double): Double
    
    def getValue(pos: Double, min: Double, max: Double): Double
  }
  object Algorithm {
    
    inline def apply(getPosition: (Double, Double, Double) => Double, getValue: (Double, Double, Double) => Double): Algorithm = {
      val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction3(getPosition), getValue = js.Any.fromFunction3(getValue))
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      inline def setGetPosition(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction3(value))
      
      inline def setGetValue(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction3(value))
    }
  }
  
  trait Events extends StObject {
    
    var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, Any]] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onSliderDragEnd: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onSliderDragMove: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onSliderDragStart: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, Any]] = js.undefined
  }
  object Events {
    
    inline def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      inline def setGetNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): Self = StObject.set(x, "getNextHandlePosition", js.Any.fromFunction2(value))
      
      inline def setGetNextHandlePositionUndefined: Self = StObject.set(x, "getNextHandlePosition", js.undefined)
      
      inline def setOnChange(value: /* publicState */ PublicState => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: () => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyPress(value: () => Any): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction0(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnSliderDragEnd(value: () => Any): Self = StObject.set(x, "onSliderDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnSliderDragEndUndefined: Self = StObject.set(x, "onSliderDragEnd", js.undefined)
      
      inline def setOnSliderDragMove(value: () => Any): Self = StObject.set(x, "onSliderDragMove", js.Any.fromFunction0(value))
      
      inline def setOnSliderDragMoveUndefined: Self = StObject.set(x, "onSliderDragMove", js.undefined)
      
      inline def setOnSliderDragStart(value: () => Any): Self = StObject.set(x, "onSliderDragStart", js.Any.fromFunction0(value))
      
      inline def setOnSliderDragStartUndefined: Self = StObject.set(x, "onSliderDragStart", js.undefined)
      
      inline def setOnValuesUpdated(value: /* publicState */ PublicState => Any): Self = StObject.set(x, "onValuesUpdated", js.Any.fromFunction1(value))
      
      inline def setOnValuesUpdatedUndefined: Self = StObject.set(x, "onValuesUpdated", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rheostat.rheostatStrings.horizontal
    - typings.rheostat.rheostatStrings.vertical
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typings.rheostat.rheostatStrings.horizontal = "horizontal".asInstanceOf[typings.rheostat.rheostatStrings.horizontal]
    
    inline def vertical: typings.rheostat.rheostatStrings.vertical = "vertical".asInstanceOf[typings.rheostat.rheostatStrings.vertical]
  }
  
  trait Props
    extends StObject
       with Events {
    
    var algorithm: js.UndefOr[Algorithm] = js.undefined
    
    var autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[ElementType[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var handle: js.UndefOr[ElementType[Any]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var pitComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    var pitPoints: js.UndefOr[js.Array[Double]] = js.undefined
    
    var progressBar: js.UndefOr[ElementType[Any]] = js.undefined
    
    var snap: js.UndefOr[Boolean] = js.undefined
    
    var snapPoints: js.UndefOr[js.Array[Double]] = js.undefined
    
    var values: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAutoAdjustVerticalPosition(value: Boolean): Self = StObject.set(x, "autoAdjustVerticalPosition", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustVerticalPositionUndefined: Self = StObject.set(x, "autoAdjustVerticalPosition", js.undefined)
      
      inline def setBackground(value: ElementType[Any]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandle(value: ElementType[Any]): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPitComponent(value: ElementType[Any]): Self = StObject.set(x, "pitComponent", value.asInstanceOf[js.Any])
      
      inline def setPitComponentUndefined: Self = StObject.set(x, "pitComponent", js.undefined)
      
      inline def setPitPoints(value: js.Array[Double]): Self = StObject.set(x, "pitPoints", value.asInstanceOf[js.Any])
      
      inline def setPitPointsUndefined: Self = StObject.set(x, "pitPoints", js.undefined)
      
      inline def setPitPointsVarargs(value: Double*): Self = StObject.set(x, "pitPoints", js.Array(value*))
      
      inline def setProgressBar(value: ElementType[Any]): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapPoints(value: js.Array[Double]): Self = StObject.set(x, "snapPoints", value.asInstanceOf[js.Any])
      
      inline def setSnapPointsUndefined: Self = StObject.set(x, "snapPoints", js.undefined)
      
      inline def setSnapPointsVarargs(value: Double*): Self = StObject.set(x, "snapPoints", js.Array(value*))
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait PublicState extends StObject {
    
    var max: Double
    
    var min: Double
    
    var values: js.Array[Double]
  }
  object PublicState {
    
    inline def apply(max: Double, min: Double, values: js.Array[Double]): PublicState = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicState] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type Rheostat = Component[Props, scala.Nothing, Any]
}
