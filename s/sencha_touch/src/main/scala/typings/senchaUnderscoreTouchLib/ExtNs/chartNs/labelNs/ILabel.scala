package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.labelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabel
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.IText {
  /** [Config Option] (Object) */
  var fx: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of field
  		* @returns Object
  		*/
  var getField: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fx
  		* @returns Object
  		*/
  var getFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_ILabel: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the value of field
  		* @param field Object The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fx
  		* @param fx Object The new value.
  		*/
  var setFx: js.UndefOr[js.Function1[/* fx */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

