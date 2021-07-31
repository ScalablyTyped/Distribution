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
    var dataClose: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataHigh: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataLow: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataOpen: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Returns the value of aggregator
      * @returns Object
      */
    var getAggregator: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Render the given visible clip range
      * @param surface Object
      * @param ctx Object
      * @param clip Object
      * @param region Object
      */
    @JSName("renderClipped")
    var renderClipped_IAggregative: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clip */ js.UndefOr[js.Any], 
          /* region */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of aggregator
      * @param aggregator Object The new value.
      */
    var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IAggregative {
    
    @scala.inline
    def apply(): IAggregative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAggregative]
    }
    
    @scala.inline
    implicit class IAggregativeMutableBuilder[Self <: IAggregative] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataClose(value: js.Any): Self = StObject.set(x, "dataClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataCloseUndefined: Self = StObject.set(x, "dataClose", js.undefined)
      
      @scala.inline
      def setDataHigh(value: js.Any): Self = StObject.set(x, "dataHigh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHighUndefined: Self = StObject.set(x, "dataHigh", js.undefined)
      
      @scala.inline
      def setDataLow(value: js.Any): Self = StObject.set(x, "dataLow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLowUndefined: Self = StObject.set(x, "dataLow", js.undefined)
      
      @scala.inline
      def setDataOpen(value: js.Any): Self = StObject.set(x, "dataOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataOpenUndefined: Self = StObject.set(x, "dataOpen", js.undefined)
      
      @scala.inline
      def setGetAggregator(value: () => js.Any): Self = StObject.set(x, "getAggregator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAggregatorUndefined: Self = StObject.set(x, "getAggregator", js.undefined)
      
      @scala.inline
      def setRenderClipped(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      @scala.inline
      def setSetAggregator(value: /* aggregator */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setAggregator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAggregatorUndefined: Self = StObject.set(x, "setAggregator", js.undefined)
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
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clip */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var step: js.UndefOr[Boolean] = js.undefined
  }
  object IArea {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IArea]
    }
    
    @scala.inline
    implicit class IAreaMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderClipped(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      @scala.inline
      def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
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
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clip */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IBar {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IBar]
    }
    
    @scala.inline
    implicit class IBarMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInGroupGapWidth(value: Double): Self = StObject.set(x, "inGroupGapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInGroupGapWidthUndefined: Self = StObject.set(x, "inGroupGapWidth", js.undefined)
      
      @scala.inline
      def setMaxBarWidth(value: Double): Self = StObject.set(x, "maxBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBarWidthUndefined: Self = StObject.set(x, "maxBarWidth", js.undefined)
      
      @scala.inline
      def setMinBarWidth(value: Double): Self = StObject.set(x, "minBarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinBarWidthUndefined: Self = StObject.set(x, "minBarWidth", js.undefined)
      
      @scala.inline
      def setMinGapWidth(value: Double): Self = StObject.set(x, "minGapWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinGapWidthUndefined: Self = StObject.set(x, "minGapWidth", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRenderClipped(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
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
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.ICandleStick = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ICandleStick]
    }
    
    @scala.inline
    implicit class ICandleStickMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ICandleStick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      @scala.inline
      def setOhlcType(value: String): Self = StObject.set(x, "ohlcType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOhlcTypeUndefined: Self = StObject.set(x, "ohlcType", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
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
    var binarySearch: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], js.Any]] = js.undefined
    
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
    var dataX: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataY: js.UndefOr[js.Any] = js.undefined
    
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
    var labels: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Render the given visible clip range
      * @param surface Ext.draw.Surface
      * @param ctx Ext.draw.engine.Canvas/Ext.draw.engine.SvgContext
      * @param clip Array
      * @param region Arrary
      */
    var renderClipped: js.UndefOr[
        js.Function4[
          /* surface */ js.UndefOr[ISurface], 
          /* ctx */ js.UndefOr[js.Any], 
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
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* region */ js.UndefOr[js.Any], 
          js.Any
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
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.ICartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ICartesian]
    }
    
    @scala.inline
    implicit class ICartesianMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ICartesian] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinarySearch(value: /* key */ js.UndefOr[String] => js.Any): Self = StObject.set(x, "binarySearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBinarySearchUndefined: Self = StObject.set(x, "binarySearch", js.undefined)
      
      @scala.inline
      def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      @scala.inline
      def setData(value: Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxX(value: Double): Self = StObject.set(x, "dataMaxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxXUndefined: Self = StObject.set(x, "dataMaxX", js.undefined)
      
      @scala.inline
      def setDataMaxY(value: Double): Self = StObject.set(x, "dataMaxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxYUndefined: Self = StObject.set(x, "dataMaxY", js.undefined)
      
      @scala.inline
      def setDataMinX(value: Double): Self = StObject.set(x, "dataMinX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMinXUndefined: Self = StObject.set(x, "dataMinX", js.undefined)
      
      @scala.inline
      def setDataMinY(value: Double): Self = StObject.set(x, "dataMinY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMinYUndefined: Self = StObject.set(x, "dataMinY", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setDataX(value: js.Any): Self = StObject.set(x, "dataX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataXUndefined: Self = StObject.set(x, "dataX", js.undefined)
      
      @scala.inline
      def setDataY(value: js.Any): Self = StObject.set(x, "dataY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataYUndefined: Self = StObject.set(x, "dataY", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      @scala.inline
      def setGetIndexNearPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "getIndexNearPoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetIndexNearPointUndefined: Self = StObject.set(x, "getIndexNearPoint", js.undefined)
      
      @scala.inline
      def setIf(value: Boolean): Self = StObject.set(x, "If", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIfUndefined: Self = StObject.set(x, "If", js.undefined)
      
      @scala.inline
      def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderClipped(
        value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[Array], /* region */ js.UndefOr[Array]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSelectionTolerance(value: Double): Self = StObject.set(x, "selectionTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionToleranceUndefined: Self = StObject.set(x, "selectionTolerance", js.undefined)
      
      @scala.inline
      def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
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
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.ILine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.ILine]
    }
    
    @scala.inline
    implicit class ILineMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.ILine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillArea(value: Boolean): Self = StObject.set(x, "fillArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAreaUndefined: Self = StObject.set(x, "fillArea", js.undefined)
      
      @scala.inline
      def setPreciseStroke(value: Boolean): Self = StObject.set(x, "preciseStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreciseStrokeUndefined: Self = StObject.set(x, "preciseStroke", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setStep(value: Boolean): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPie3DPart
    extends StObject
       with IPath {
    
    /** [Config Option] (Object) */
    var baseColor: js.UndefOr[js.Any] = js.undefined
    
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
    var updatePath_IPie3DPart: js.UndefOr[js.Function1[/* path */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IPie3DPart {
    
    @scala.inline
    def apply(): IPie3DPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPie3DPart]
    }
    
    @scala.inline
    implicit class IPie3DPartMutableBuilder[Self <: IPie3DPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseColor(value: js.Any): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setBaseRotation(value: Double): Self = StObject.set(x, "baseRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseRotationUndefined: Self = StObject.set(x, "baseRotation", js.undefined)
      
      @scala.inline
      def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      @scala.inline
      def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
      
      @scala.inline
      def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
      
      @scala.inline
      def setDistortion(value: Double): Self = StObject.set(x, "distortion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistortionUndefined: Self = StObject.set(x, "distortion", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setUpdatePath(value: /* path */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updatePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
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
          /* ctx */ js.UndefOr[js.Any], 
          /* surface */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          js.Any
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
    
    @scala.inline
    def apply(): IPieSlice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPieSlice]
    }
    
    @scala.inline
    implicit class IPieSliceMutableBuilder[Self <: IPieSlice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      @scala.inline
      def setDoCallout(value: Boolean): Self = StObject.set(x, "doCallout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoCalloutUndefined: Self = StObject.set(x, "doCallout", js.undefined)
      
      @scala.inline
      def setGetRendererIndex(value: () => Double): Self = StObject.set(x, "getRendererIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRendererIndexUndefined: Self = StObject.set(x, "getRendererIndex", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* ctx */ js.UndefOr[js.Any], /* surface */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRotateLabels(value: Boolean): Self = StObject.set(x, "rotateLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateLabelsUndefined: Self = StObject.set(x, "rotateLabels", js.undefined)
      
      @scala.inline
      def setSetRendererIndex(value: /* rendererIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRendererIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRendererIndexUndefined: Self = StObject.set(x, "setRendererIndex", js.undefined)
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
    var dataX: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Object) */
    var dataY: js.UndefOr[js.Any] = js.undefined
    
    /** [Config Option] (Number) */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var endRho: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of field
      * @returns Object
      */
    var getField: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var labelOverflowPadding: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Object) */
    var labels: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Sets the value of field
      * @param field Object The new value.
      */
    var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var startRho: js.UndefOr[Double] = js.undefined
  }
  object IPolar {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IPolar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IPolar]
    }
    
    @scala.inline
    implicit class IPolarMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IPolar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseRotation(value: Double): Self = StObject.set(x, "baseRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseRotationUndefined: Self = StObject.set(x, "baseRotation", js.undefined)
      
      @scala.inline
      def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
      
      @scala.inline
      def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
      
      @scala.inline
      def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
      
      @scala.inline
      def setData(value: Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxX(value: Double): Self = StObject.set(x, "dataMaxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxXUndefined: Self = StObject.set(x, "dataMaxX", js.undefined)
      
      @scala.inline
      def setDataMaxY(value: Double): Self = StObject.set(x, "dataMaxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMaxYUndefined: Self = StObject.set(x, "dataMaxY", js.undefined)
      
      @scala.inline
      def setDataMinX(value: Double): Self = StObject.set(x, "dataMinX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMinXUndefined: Self = StObject.set(x, "dataMinX", js.undefined)
      
      @scala.inline
      def setDataMinY(value: Double): Self = StObject.set(x, "dataMinY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMinYUndefined: Self = StObject.set(x, "dataMinY", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setDataX(value: js.Any): Self = StObject.set(x, "dataX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataXUndefined: Self = StObject.set(x, "dataX", js.undefined)
      
      @scala.inline
      def setDataY(value: js.Any): Self = StObject.set(x, "dataY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataYUndefined: Self = StObject.set(x, "dataY", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setEndRho(value: Double): Self = StObject.set(x, "endRho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndRhoUndefined: Self = StObject.set(x, "endRho", js.undefined)
      
      @scala.inline
      def setGetField(value: () => js.Any): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      @scala.inline
      def setLabelOverflowPadding(value: Double): Self = StObject.set(x, "labelOverflowPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverflowPaddingUndefined: Self = StObject.set(x, "labelOverflowPadding", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setStartRho(value: Double): Self = StObject.set(x, "startRho", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRhoUndefined: Self = StObject.set(x, "startRho", js.undefined)
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
    var render_IRadar: js.UndefOr[
        js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], js.Any]
      ] = js.undefined
  }
  object IRadar {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IRadar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IRadar]
    }
    
    @scala.inline
    implicit class IRadarMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IRadar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
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
          /* surface */ js.UndefOr[js.Any], 
          /* ctx */ js.UndefOr[js.Any], 
          /* clip */ js.UndefOr[js.Any], 
          /* clipRegion */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
  }
  object IScatter {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IScatter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IScatter]
    }
    
    @scala.inline
    implicit class IScatterMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IScatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderClipped(
        value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "renderClipped", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderClippedUndefined: Self = StObject.set(x, "renderClipped", js.undefined)
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
    var getIndexNearPoint_IStackedCartesian: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], Double]] = js.undefined
  }
  object IStackedCartesian {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian]
    }
    
    @scala.inline
    implicit class IStackedCartesianMutableBuilder[Self <: typings.senchaTouch.Ext.chart.series.sprite.IStackedCartesian] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndexNearPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => Double): Self = StObject.set(x, "getIndexNearPoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetIndexNearPointUndefined: Self = StObject.set(x, "getIndexNearPoint", js.undefined)
    }
  }
}
