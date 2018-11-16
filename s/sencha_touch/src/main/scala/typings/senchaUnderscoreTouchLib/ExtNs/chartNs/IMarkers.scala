package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMarkers
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.IInstancing {
  /** [Method] Clear the markers in the category
  		* @param category String
  		*/
  var clear: js.UndefOr[js.Function1[/* category */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method]
  		* @param category String
  		* @param index Mixed
  		* @param isWithoutTransform Boolean
  		*/
  var getMarkerBBoxFor: js.UndefOr[
    js.Function3[
      /* category */ js.UndefOr[java.lang.String], 
      /* index */ js.UndefOr[js.Any], 
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Put a marker in the category with additional attributes
  		* @param category String
  		* @param markerAttr Object
  		* @param index String|Number
  		* @param canonical Boolean
  		* @param keepRevision Boolean
  		*/
  var putMarkerFor: js.UndefOr[
    js.Function5[
      /* category */ js.UndefOr[java.lang.String], 
      /* markerAttr */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[js.Any], 
      /* canonical */ js.UndefOr[scala.Boolean], 
      /* keepRevision */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IMarkers: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
}

