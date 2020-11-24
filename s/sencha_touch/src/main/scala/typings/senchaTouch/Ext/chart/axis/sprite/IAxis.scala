package typings.senchaTouch.Ext.chart.axis.sprite

import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IAxis extends ISprite {
  
  /** [Config Option] (Number) */
  var The: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[typings.senchaTouch.Ext.chart.axis.IAxis] = js.native
  
  /** [Config Option] (Boolean) */
  var axisLine: js.UndefOr[Boolean] = js.native
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMax: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMin: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var enlargeEstStepSizeByText: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of axis
    * @returns Ext.chart.axis.Axis
    */
  var getAxis: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
  @JSName("getBBox")
  var getBBox_IAxis: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of label
    * @returns Object
    */
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of layout
    * @returns Object|Ext.chart.axis.layout.Layout
    */
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of renderer
    * @returns Function
    */
  var getRenderer: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of segmenter
    * @returns Object|Ext.chart.axis.segmenter.Segmenter
    */
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var grid: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var majorTickSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var majorTicks: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var max: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var min: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minStepSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minorTickSize: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var minorTricks: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  
  /** [Method] Render method
    * @param surface Object
    * @param ctx Object
    * @param clipRegion Object
    * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
    */
  @JSName("render")
  var render_IAxis: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of axis
    * @param axis Ext.chart.axis.Axis The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], Unit]] = js.native
  
  /** [Method] Sets the value of label
    * @param label Object The new value.
    */
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of layout
    * @param layout Object|Ext.chart.axis.layout.Layout The new value.
    */
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of renderer
    * @param renderer Function The new value.
    */
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of segmenter
    * @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
    */
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var textPadding: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var visibleMax: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var visibleMin: js.UndefOr[Double] = js.native
}
object IAxis {
  
  @scala.inline
  def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThe(value: Double): Self = this.set("The", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThe: Self = this.set("The", js.undefined)
    
    @scala.inline
    def setAxis(value: typings.senchaTouch.Ext.chart.axis.IAxis): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setAxisLine(value: Boolean): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    
    @scala.inline
    def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = this.set("bindMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBindMarker: Self = this.set("bindMarker", js.undefined)
    
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    
    @scala.inline
    def setDataMax(value: Double): Self = this.set("dataMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMax: Self = this.set("dataMax", js.undefined)
    
    @scala.inline
    def setDataMin(value: Double): Self = this.set("dataMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMin: Self = this.set("dataMin", js.undefined)
    
    @scala.inline
    def setEnlargeEstStepSizeByText(value: Boolean): Self = this.set("enlargeEstStepSizeByText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnlargeEstStepSizeByText: Self = this.set("enlargeEstStepSizeByText", js.undefined)
    
    @scala.inline
    def setGetAxis(value: () => IAxis): Self = this.set("getAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAxis: Self = this.set("getAxis", js.undefined)
    
    @scala.inline
    def setGetBBox(value: () => Unit): Self = this.set("getBBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBBox: Self = this.set("getBBox", js.undefined)
    
    @scala.inline
    def setGetLabel(value: () => _): Self = this.set("getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    
    @scala.inline
    def setGetLayout(value: () => _): Self = this.set("getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLayout: Self = this.set("getLayout", js.undefined)
    
    @scala.inline
    def setGetRenderer(value: () => _): Self = this.set("getRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRenderer: Self = this.set("getRenderer", js.undefined)
    
    @scala.inline
    def setGetSegmenter(value: () => _): Self = this.set("getSegmenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSegmenter: Self = this.set("getSegmenter", js.undefined)
    
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMajorTickSize(value: Double): Self = this.set("majorTickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTickSize: Self = this.set("majorTickSize", js.undefined)
    
    @scala.inline
    def setMajorTicks(value: Boolean): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinStepSize(value: Double): Self = this.set("minStepSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinStepSize: Self = this.set("minStepSize", js.undefined)
    
    @scala.inline
    def setMinorTickSize(value: Double): Self = this.set("minorTickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickSize: Self = this.set("minorTickSize", js.undefined)
    
    @scala.inline
    def setMinorTricks(value: Boolean): Self = this.set("minorTricks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTricks: Self = this.set("minorTricks", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setSegmenter(value: js.Any): Self = this.set("segmenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmenter: Self = this.set("segmenter", js.undefined)
    
    @scala.inline
    def setSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = this.set("setAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAxis: Self = this.set("setAxis", js.undefined)
    
    @scala.inline
    def setSetLabel(value: /* label */ js.UndefOr[js.Any] => Unit): Self = this.set("setLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLabel: Self = this.set("setLabel", js.undefined)
    
    @scala.inline
    def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = this.set("setLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLayout: Self = this.set("setLayout", js.undefined)
    
    @scala.inline
    def setSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => Unit): Self = this.set("setRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRenderer: Self = this.set("setRenderer", js.undefined)
    
    @scala.inline
    def setSetSegmenter(value: /* segmenter */ js.UndefOr[js.Any] => Unit): Self = this.set("setSegmenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSegmenter: Self = this.set("setSegmenter", js.undefined)
    
    @scala.inline
    def setTextPadding(value: Double): Self = this.set("textPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPadding: Self = this.set("textPadding", js.undefined)
    
    @scala.inline
    def setVisibleMax(value: Double): Self = this.set("visibleMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleMax: Self = this.set("visibleMax", js.undefined)
    
    @scala.inline
    def setVisibleMin(value: Double): Self = this.set("visibleMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleMin: Self = this.set("visibleMin", js.undefined)
  }
}
