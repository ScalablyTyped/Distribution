package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvg
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface {
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates a DOM element under the SVG namespace of the given type
  		* @param type String The type of the SVG DOM element.
  		* @returns * The created element.
  		*/
  var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
  		* @param path Object
  		* @param matrix Object
  		* @param band Object
  		*/
  @JSName("destroy")
  var destroy_ISvg: js.UndefOr[
    js.Function3[
      /* path */ js.UndefOr[js.Any], 
      /* matrix */ js.UndefOr[js.Any], 
      /* band */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of highPrecision
  		* @returns Boolean
  		*/
  var getHighPrecision: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Object
  		* @param destroySprite Object
  		*/
  @JSName("remove")
  var remove_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Renders a single sprite into the surface
  		* @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
  		* @returns Boolean returns false to stop the rendering to continue.
  		*/
  var renderSprite: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Sets the value of highPrecision
  		* @param highPrecision Boolean The new value.
  		*/
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

