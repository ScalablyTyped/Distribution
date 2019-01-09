package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPolar
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite {
  /** [Config Option] (Array) */
  var Data: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Number) */
  var baseRotation: js.UndefOr[scala.Double] = js.undefined
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
  var dataMaxX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMaxY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMinX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var dataMinY: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var dataX: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dataY: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of field
  		* @returns Object
  		*/
  var getField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var labels: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of field
  		* @param field Object The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[scala.Double] = js.undefined
}

