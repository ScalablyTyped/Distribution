package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IText extends ISprite {
  /** [Config Option] (String) */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Number) */
  var fontSize: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fontVariant: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IText: js.UndefOr[js.Function2[/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var textBaseline: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[scala.Double] = js.undefined
}

