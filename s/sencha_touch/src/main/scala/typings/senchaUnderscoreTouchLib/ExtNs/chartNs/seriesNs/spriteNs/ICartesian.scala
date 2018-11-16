package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.chartNs.IMarkerHolder because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, platformConfig, alternateClassName, singleton, callSuper, self, getInitialConfig, callParent, destroy, callOverridden, initConfig))*/

trait ICartesian
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite {
  /** [Config Option] (Array) */
  var Data: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var If: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Does a binary search of the data on the x axis using the given key
  		* @param key String
  		* @returns *
  		*/
  var binarySearch: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], _]] = js.undefined
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
  /** [Config Option] (String) */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of field
  		* @returns String
  		*/
  var getField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the nearest item index from point x y
  		* @param x Number
  		* @param y Number
  		* @returns Number The index
  		*/
  var getIndexNearPoint: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Double]
  ] = js.undefined
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[scala.Double] = js.undefined
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
      /* surface */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      scala.Unit
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
      _
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of field
  		* @param field String The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
}

