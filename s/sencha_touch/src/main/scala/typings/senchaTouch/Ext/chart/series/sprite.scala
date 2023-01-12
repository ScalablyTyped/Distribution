package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.ISurface
import typings.senchaTouch.Ext.draw.sprite.IPath
import typings.senchaTouch.Ext.draw.sprite.ISector
import typings.senchaTouch.Ext.draw.sprite.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sprite {
  
  trait IAggregative
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.ICartesian {
    
    /** [Config Option] (Object) */
    var dataClose: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataHigh: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataLow: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataOpen: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of aggregator
      * @returns Object
      */
    var getAggregator: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Render the given visible clip range
      * @param surface Object
      * @param ctx Object
      * @param clip Object
      * @param region Object
      */
    @JSName("renderClipped")
    var renderClipped_IAggregative: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* clip */ js.UndefOr[Any], 
          /* region */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of aggregator
      * @param aggregator Object The new value.
      */
    var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAggregative {
    
    inline def apply(): IAggregative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAggregative]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAggregative] (val x: Self) extends AnyVal {
      
      inline def setDataClose(value: Any): Self = StObject.set(x, "dataClose", value.asInstanceOf[js.Any])
      
      inline def setDataCloseUndefined: Self = StObject.set(x, "dataClose", js.undefined)
      
      inline def setDataHigh(value: Any): Self = StObject.set(x, "dataHigh", value.asInstanceOf[js.Any])
      
      inline def setDataHighUndefined: Self = StObject.set(x, "dataHigh", js.undefined)
      
      inline def setDataLow(value: Any): Self = StObject.set(x, "dataLow", value.asInstanceOf[js.Any])
      
      inline def setDataLowUndefined: Self = StObject.set(x, "dataLow", js.undefined)
      
      inline def setDataOpen(value: Any): Self = StObject.set(x, "dataOpen", value.asInstanceOf[js.Any])
      
      inline def setDataOpenUndefined: Self = StObject.set(x, "dataOpen", js.undefined)
      
      inline def setGetAggregator(value: () => Any): Self = StObject.set(x, "getAggregator", js.Any.fromFunction0(value))
      
      inline def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
      
      inline def setRenderClipped(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clip */ js.UndefOr[Any], /* region */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      inline def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      inline def setSetAggregator(value: /* aggregator */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1(value))
      
      inline def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
    }
  }
  
  trait IArea
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian {
    
    /** [Method] Render the given visible clip range
      * @param surface Object
      * @param ctx Object
      * @param clip Object
      * @param clipRegion Object
      */
    @JSName("renderClipped")
    var renderClipped_IArea: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* clip */ js.UndefOr[Any], 
          /* clipRegion */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var step: js.UndefOr[Boolean] = js.undefined
  }
  object IArea {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IArea] (val x: Self) extends AnyVal {
      
      inline def setRenderClipped(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clip */ js.UndefOr[Any], /* clipRegion */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      inline def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      inline def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait IBar
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian {
    
    /** [Config Option] (Number) */
    var inGroupGapWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maxBarWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minBarWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minGapWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** [Method] Render the given visible clip range
      * @param surface Object
      * @param ctx Object
      * @param clip Object
      */
    @JSName("renderClipped")
    var renderClipped_IBar: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* clip */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IBar {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IBar] (val x: Self) extends AnyVal {
      
      inline def setInGroupGapWidth(value: Double): Self = StObject.set(x, "inGroupGapWidth", value.asInstanceOf[js.Any])
      
      inline def setInGroupGapWidthUndefined: Self = StObject.set(x, "inGroupGapWidth", js.undefined)
      
      inline def setMaxBarWidth(value: Double): Self = StObject.set(x, "maxBarWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxBarWidthUndefined: Self = StObject.set(x, "maxBarWidth", js.undefined)
      
      inline def setMinBarWidth(value: Double): Self = StObject.set(x, "minBarWidth", value.asInstanceOf[js.Any])
      
      inline def setMinBarWidthUndefined: Self = StObject.set(x, "minBarWidth", js.undefined)
      
      inline def setMinGapWidth(value: Double): Self = StObject.set(x, "minGapWidth", value.asInstanceOf[js.Any])
      
      inline def setMinGapWidthUndefined: Self = StObject.set(x, "minGapWidth", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRenderClipped(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clip */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction3(value))
      
      inline def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
    }
  }
  
  trait ICandleStick
    extends StObject
       with IAggregative {
    
    /** [Config Option] (Number) */
    var barWidth: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var ohlcType: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var padding: js.UndefOr[Double] = js.undefined
  }
  object ICandleStick {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.ICandleStick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ICandleStick]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ICandleStick] (val x: Self) extends AnyVal {
      
      inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setOhlcType(value: String): Self = StObject.set(x, "ohlcType", value.asInstanceOf[js.Any])
      
      inline def setOhlcTypeUndefined: Self = StObject.set(x, "ohlcType", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait ICartesian
    extends StObject
       with ISprite {
    
    /** [Config Option] (Array) */
    var Data: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Boolean) */
    var If: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Does a binary search of the data on the x axis using the given key
      * @param key String
      * @returns *
      */
    var binarySearch: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], Any]] = js.undefined
    
    /** [Method]
      * @param name String
      * @param marker Ext.chart.Markers
      */
    var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMaxX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMaxY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMinX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMinY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var dataX: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataY: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var field: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of field
      * @returns String
      */
    var getField: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Get the nearest item index from point x y
      * @param x Number
      * @param y Number
      * @returns Number The index
      */
    var getIndexNearPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var labelOverflowPadding: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var labels: js.UndefOr[Any] = js.undefined
    
    /** [Method] Render the given visible clip range
      * @param surface Ext.draw.Surface
      * @param ctx Ext.draw.engine.Canvas/Ext.draw.engine.SvgContext
      * @param clip Array
      * @param region Arrary
      */
    var renderClipped: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[ISurface], 
          /* ctx */ js.UndefOr[Any], 
          /* clip */ js.UndefOr[Array], 
          /* region */ js.UndefOr[Array], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param region Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_ICartesian: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* region */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Config Option] (Number) */
    var selectionTolerance: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of field
      * @param field String The new value.
      */
    var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.undefined
  }
  object ICartesian {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.ICartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ICartesian]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ICartesian] (val x: Self) extends AnyVal {
      
      inline def setBinarySearch(value: /* key */ js.UndefOr[String] => Any): Self = StObject.set(x, "binarySearch", js.Any.fromFunction1(value))
      
      inline def setBinarySearchUndefined: Self = StObject.set(x, "binarySearch", js.undefined)
      
      inline def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      inline def setData(value: Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataMaxX(value: Double): Self = StObject.set(x, "dataMaxX", value.asInstanceOf[js.Any])
      
      inline def setDataMaxXUndefined: Self = StObject.set(x, "dataMaxX", js.undefined)
      
      inline def setDataMaxY(value: Double): Self = StObject.set(x, "dataMaxY", value.asInstanceOf[js.Any])
      
      inline def setDataMaxYUndefined: Self = StObject.set(x, "dataMaxY", js.undefined)
      
      inline def setDataMinX(value: Double): Self = StObject.set(x, "dataMinX", value.asInstanceOf[js.Any])
      
      inline def setDataMinXUndefined: Self = StObject.set(x, "dataMinX", js.undefined)
      
      inline def setDataMinY(value: Double): Self = StObject.set(x, "dataMinY", value.asInstanceOf[js.Any])
      
      inline def setDataMinYUndefined: Self = StObject.set(x, "dataMinY", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setDataX(value: Any): Self = StObject.set(x, "dataX", value.asInstanceOf[js.Any])
      
      inline def setDataXUndefined: Self = StObject.set(x, "dataX", js.undefined)
      
      inline def setDataY(value: Any): Self = StObject.set(x, "dataY", value.asInstanceOf[js.Any])
      
      inline def setDataYUndefined: Self = StObject.set(x, "dataY", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      inline def setGetIndexNearPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "getIndexNearPoint", js.Any.fromFunction2(value))
      
      inline def setGetIndexNearPointUndefined: Self = StObject.set(x, "getIndexNearPoint", js.undefined)
      
      inline def setIf(value: Boolean): Self = StObject.set(x, "If", value.asInstanceOf[js.Any])
      
      inline def setIfUndefined: Self = StObject.set(x, "If", js.undefined)
      
      inline def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setRender(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderClipped(
        value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[Any], /* clip */ js.UndefOr[Array], /* region */ js.UndefOr[Array]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      inline def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
      
      inline def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
      
      inline def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
      
      inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
    }
  }
  
  trait ILine
    extends StObject
       with IAggregative {
    
    /** [Config Option] (Boolean) */
    var fillArea: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var preciseStroke: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var step: js.UndefOr[Boolean] = js.undefined
  }
  object ILine {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ILine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ILine] (val x: Self) extends AnyVal {
      
      inline def setFillArea(value: Boolean): Self = StObject.set(x, "fillArea", value.asInstanceOf[js.Any])
      
      inline def setFillAreaUndefined: Self = StObject.set(x, "fillArea", js.undefined)
      
      inline def setPreciseStroke(value: Boolean): Self = StObject.set(x, "preciseStroke", value.asInstanceOf[js.Any])
      
      inline def setPreciseStrokeUndefined: Self = StObject.set(x, "preciseStroke", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPie3DPart
    extends StObject
       with IPath {
    
    /** [Config Option] (Object) */
    var baseColor: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var baseRotation: js.UndefOr[Double] = js.undefined
    
    /** [Method]
      * @param name String
      * @param marker Ext.chart.Markers
      */
    var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var centerX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var centerY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var distortion: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var endRho: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var margin: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var part: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var startRho: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var thickness: js.UndefOr[Double] = js.undefined
    
    /** [Method] Update the path
      * @param path Object
      */
    @JSName("updatePath")
    var updatePath_IPie3DPart: js.UndefOr[js.Function1[/* path */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IPie3DPart {
    
    inline def apply(): IPie3DPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPie3DPart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPie3DPart] (val x: Self) extends AnyVal {
      
      inline def setBaseColor(value: Any): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setBaseRotation(value: Double): Self = StObject.set(x, "baseRotation", value.asInstanceOf[js.Any])
      
      inline def setBaseRotationUndefined: Self = StObject.set(x, "baseRotation", js.undefined)
      
      inline def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
      
      inline def setDistortion(value: Double): Self = StObject.set(x, "distortion", value.asInstanceOf[js.Any])
      
      inline def setDistortionUndefined: Self = StObject.set(x, "distortion", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
      
      inline def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
      
      inline def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setUpdatePath(value: /* path */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction1(value))
      
      inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPieSlice
    extends StObject
       with ISector {
    
    /** [Method]
      * @param name String
      * @param marker Ext.chart.Markers
      */
    var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var doCallout: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the value of rendererIndex
      * @returns Number
      */
    var getRendererIndex: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (String) */
    var label: js.UndefOr[String] = js.undefined
    
    /** [Config Option] (Number) */
    var labelOverflowPadding: js.UndefOr[Double] = js.undefined
    
    /** [Method] Render method
      * @param ctx Object
      * @param surface Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IPieSlice: js.UndefOr[
        js.Function3[
          /* ctx */ js.UndefOr[Any], 
          /* surface */ js.UndefOr[Any], 
          /* clipRegion */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var rotateLabels: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Sets the value of rendererIndex
      * @param rendererIndex Number The new value.
      */
    var setRendererIndex: js.UndefOr[js.Function1[/* rendererIndex */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IPieSlice {
    
    inline def apply(): IPieSlice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPieSlice]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPieSlice] (val x: Self) extends AnyVal {
      
      inline def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      inline def setDoCallout(value: Boolean): Self = StObject.set(x, "doCallout", value.asInstanceOf[js.Any])
      
      inline def setDoCalloutUndefined: Self = StObject.set(x, "doCallout", js.undefined)
      
      inline def setGetRendererIndex(value: () => Double): Self = StObject.set(x, "getRendererIndex", js.Any.fromFunction0(value))
      
      inline def setGetRendererIndexUndefined: Self = StObject.set(x, "getRendererIndex", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(
        value: (/* ctx */ js.UndefOr[Any], /* surface */ js.UndefOr[Any], /* clipRegion */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRotateLabels(value: Boolean): Self = StObject.set(x, "rotateLabels", value.asInstanceOf[js.Any])
      
      inline def setRotateLabelsUndefined: Self = StObject.set(x, "rotateLabels", js.undefined)
      
      inline def setSetRendererIndex(value: /* rendererIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRendererIndex", js.Any.fromFunction1(value))
      
      inline def setSetRendererIndexUndefined: Self = StObject.set(x, "setRendererIndex", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPolar
    extends StObject
       with ISprite {
    
    /** [Config Option] (Array) */
    var Data: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Number) */
    var baseRotation: js.UndefOr[Double] = js.undefined
    
    /** [Method]
      * @param name String
      * @param marker Ext.chart.Markers
      */
    var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var centerX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var centerY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMaxX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMaxY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMinX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var dataMinY: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var dataX: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataY: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Number) */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var endRho: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of field
      * @returns Object
      */
    var getField: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var labelOverflowPadding: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var labels: js.UndefOr[Any] = js.undefined
    
    /** [Method] Sets the value of field
      * @param field Object The new value.
      */
    var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var startRho: js.UndefOr[Double] = js.undefined
  }
  object IPolar {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IPolar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IPolar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IPolar] (val x: Self) extends AnyVal {
      
      inline def setBaseRotation(value: Double): Self = StObject.set(x, "baseRotation", value.asInstanceOf[js.Any])
      
      inline def setBaseRotationUndefined: Self = StObject.set(x, "baseRotation", js.undefined)
      
      inline def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
      
      inline def setData(value: Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataMaxX(value: Double): Self = StObject.set(x, "dataMaxX", value.asInstanceOf[js.Any])
      
      inline def setDataMaxXUndefined: Self = StObject.set(x, "dataMaxX", js.undefined)
      
      inline def setDataMaxY(value: Double): Self = StObject.set(x, "dataMaxY", value.asInstanceOf[js.Any])
      
      inline def setDataMaxYUndefined: Self = StObject.set(x, "dataMaxY", js.undefined)
      
      inline def setDataMinX(value: Double): Self = StObject.set(x, "dataMinX", value.asInstanceOf[js.Any])
      
      inline def setDataMinXUndefined: Self = StObject.set(x, "dataMinX", js.undefined)
      
      inline def setDataMinY(value: Double): Self = StObject.set(x, "dataMinY", value.asInstanceOf[js.Any])
      
      inline def setDataMinYUndefined: Self = StObject.set(x, "dataMinY", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setDataX(value: Any): Self = StObject.set(x, "dataX", value.asInstanceOf[js.Any])
      
      inline def setDataXUndefined: Self = StObject.set(x, "dataX", js.undefined)
      
      inline def setDataY(value: Any): Self = StObject.set(x, "dataY", value.asInstanceOf[js.Any])
      
      inline def setDataYUndefined: Self = StObject.set(x, "dataY", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
      
      inline def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
      
      inline def setGetField(value: () => Any): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      inline def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setSetField(value: /* field */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
      
      inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
      
      inline def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
    }
  }
  
  trait IRadar
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.IPolar {
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_IRadar: js.UndefOr[js.Function2[/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], Any]] = js.undefined
  }
  object IRadar {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IRadar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IRadar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IRadar] (val x: Self) extends AnyVal {
      
      inline def setRender(value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait IScatter
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.ICartesian {
    
    /** [Method] Render the given visible clip range
      * @param surface Object
      * @param ctx Object
      * @param clip Object
      * @param clipRegion Object
      */
    @JSName("renderClipped")
    var renderClipped_IScatter: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* clip */ js.UndefOr[Any], 
          /* clipRegion */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IScatter {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IScatter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IScatter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IScatter] (val x: Self) extends AnyVal {
      
      inline def setRenderClipped(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clip */ js.UndefOr[Any], /* clipRegion */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      inline def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
    }
  }
  
  trait IStackedCartesian
    extends StObject
       with typings.senchaTouch.Ext.chart.series.sprite.ICartesian {
    
    /** [Method] Get the nearest item index from point x y
      * @param x Object
      * @param y Object
      * @returns Number The index
      */
    @JSName("getIndexNearPoint")
    var getIndexNearPoint_IStackedCartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any], Double]] = js.undefined
  }
  object IStackedCartesian {
    
    inline def apply(): typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian] (val x: Self) extends AnyVal {
      
      inline def setGetIndexNearPoint(value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any]) => Double): Self = StObject.set(x, "getIndexNearPoint", js.Any.fromFunction2(value))
      
      inline def setGetIndexNearPointUndefined: Self = StObject.set(x, "getIndexNearPoint", js.undefined)
    }
  }
}
