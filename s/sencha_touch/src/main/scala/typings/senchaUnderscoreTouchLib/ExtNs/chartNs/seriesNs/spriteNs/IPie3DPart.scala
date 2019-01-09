package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ trait IPie3DPart
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.IPath {
  /** [Config Option] (Object) */
  var baseColor: js.UndefOr[js.Any] = js.undefined
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
  var distortion: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var part: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Update the path
  		* @param path Object
  		*/
  @JSName("updatePath")
  var updatePath_IPie3DPart: js.UndefOr[js.Function1[/* path */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

