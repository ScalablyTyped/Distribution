package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because Would inherit conflicting mutable fields List(alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses))*/
trait IPieSlice
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISector {
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
  /** [Config Option] (Boolean) */
  var doCallout: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of rendererIndex
  		* @returns Number
  		*/
  var getRendererIndex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[scala.Double] = js.undefined
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
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var rotateLabels: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of rendererIndex
  		* @param rendererIndex Number The new value.
  		*/
  var setRendererIndex: js.UndefOr[js.Function1[/* rendererIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

