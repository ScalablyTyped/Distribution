package typings.rheostat

import typings.react.mod.Component
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rheostat", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, scala.Nothing, js.Any]
  
  @js.native
  trait Algorithm extends StObject {
    
    def getPosition(value: Double, min: Double, max: Double): Double = js.native
    
    def getValue(pos: Double, min: Double, max: Double): Double = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(getPosition: (Double, Double, Double) => Double, getValue: (Double, Double, Double) => Double): Algorithm = {
      val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction3(getPosition), getValue = js.Any.fromFunction3(getValue))
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPosition(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetValue(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getValue", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait Events extends StObject {
    
    var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
    
    var onClick: js.UndefOr[js.Function0[_]] = js.native
    
    var onKeyPress: js.UndefOr[js.Function0[_]] = js.native
    
    var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.native
    
    var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.native
    
    var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.native
    
    var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
  }
  object Events {
    
    @scala.inline
    def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): Self = StObject.set(x, "getNextHandlePosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNextHandlePositionUndefined: Self = StObject.set(x, "getNextHandlePosition", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* publicState */ PublicState => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => _): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: () => _): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnSliderDragEnd(value: () => _): Self = StObject.set(x, "onSliderDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSliderDragEndUndefined: Self = StObject.set(x, "onSliderDragEnd", js.undefined)
      
      @scala.inline
      def setOnSliderDragMove(value: () => _): Self = StObject.set(x, "onSliderDragMove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSliderDragMoveUndefined: Self = StObject.set(x, "onSliderDragMove", js.undefined)
      
      @scala.inline
      def setOnSliderDragStart(value: () => _): Self = StObject.set(x, "onSliderDragStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSliderDragStartUndefined: Self = StObject.set(x, "onSliderDragStart", js.undefined)
      
      @scala.inline
      def setOnValuesUpdated(value: /* publicState */ PublicState => _): Self = StObject.set(x, "onValuesUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValuesUpdatedUndefined: Self = StObject.set(x, "onValuesUpdated", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rheostat.rheostatStrings.horizontal
    - typings.rheostat.rheostatStrings.vertical
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def horizontal: typings.rheostat.rheostatStrings.horizontal = "horizontal".asInstanceOf[typings.rheostat.rheostatStrings.horizontal]
    
    @scala.inline
    def vertical: typings.rheostat.rheostatStrings.vertical = "vertical".asInstanceOf[typings.rheostat.rheostatStrings.vertical]
  }
  
  @js.native
  trait Props extends Events {
    
    var algorithm: js.UndefOr[Algorithm] = js.native
    
    var autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.native
    
    var background: js.UndefOr[ReactType[_]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var handle: js.UndefOr[ReactType[_]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var orientation: js.UndefOr[Orientation] = js.native
    
    var pitComponent: js.UndefOr[ReactType[_]] = js.native
    
    var pitPoints: js.UndefOr[js.Array[Double]] = js.native
    
    var progressBar: js.UndefOr[ReactType[_]] = js.native
    
    var snap: js.UndefOr[Boolean] = js.native
    
    var snapPoints: js.UndefOr[js.Array[Double]] = js.native
    
    var values: js.UndefOr[js.Array[Double]] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setAutoAdjustVerticalPosition(value: Boolean): Self = StObject.set(x, "autoAdjustVerticalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustVerticalPositionUndefined: Self = StObject.set(x, "autoAdjustVerticalPosition", js.undefined)
      
      @scala.inline
      def setBackground(value: ReactType[_]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHandle(value: ReactType[_]): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPitComponent(value: ReactType[_]): Self = StObject.set(x, "pitComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitComponentUndefined: Self = StObject.set(x, "pitComponent", js.undefined)
      
      @scala.inline
      def setPitPoints(value: js.Array[Double]): Self = StObject.set(x, "pitPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitPointsUndefined: Self = StObject.set(x, "pitPoints", js.undefined)
      
      @scala.inline
      def setPitPointsVarargs(value: Double*): Self = StObject.set(x, "pitPoints", js.Array(value :_*))
      
      @scala.inline
      def setProgressBar(value: ReactType[_]): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      @scala.inline
      def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapPoints(value: js.Array[Double]): Self = StObject.set(x, "snapPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapPointsUndefined: Self = StObject.set(x, "snapPoints", js.undefined)
      
      @scala.inline
      def setSnapPointsVarargs(value: Double*): Self = StObject.set(x, "snapPoints", js.Array(value :_*))
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PublicState extends StObject {
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var values: js.Array[Double] = js.native
  }
  object PublicState {
    
    @scala.inline
    def apply(max: Double, min: Double, values: js.Array[Double]): PublicState = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicState]
    }
    
    @scala.inline
    implicit class PublicStateMutableBuilder[Self <: PublicState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  type Rheostat = Component[Props, scala.Nothing, js.Any]
}
