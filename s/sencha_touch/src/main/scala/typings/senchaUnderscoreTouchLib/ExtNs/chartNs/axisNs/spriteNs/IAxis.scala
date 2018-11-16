package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, platformConfig, alternateClassName, singleton, callSuper, self, getInitialConfig, callParent, destroy, callOverridden, initConfig))*/

trait IAxis
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite {
  /** [Config Option] (Number) */
  var The: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] = js.undefined
  /** [Config Option] (Boolean) */
  var axisLine: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method]
  		* @param name String
  		* @param marker Ext.chart.Markers
  		*/
  var bindMarker: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[java.lang.String], 
      /* marker */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkers], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enlargeEstStepSizeByText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
  @JSName("getBBox")
  var getBBox_IAxis: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var majorTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var max: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var min: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minStepSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSize: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var minorTricks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
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
  ] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var textPadding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMax: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var visibleMin: js.UndefOr[scala.Double] = js.undefined
}

