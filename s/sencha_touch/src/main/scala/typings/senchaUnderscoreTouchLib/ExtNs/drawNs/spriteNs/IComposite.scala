package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComposite extends ISprite {
  /** [Method] Adds a sprite to the composite
  		* @param sprite Object
  		*/
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Renders all sprites contained in the composite to the surface
  		* @param surface Object
  		* @param ctx Object
  		* @param region Object
  		*/
  @JSName("render")
  var render_IComposite: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

