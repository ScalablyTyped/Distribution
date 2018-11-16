package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInstancing extends ISprite {
  /** [Method] Creates a new sprite instance
  		* @param config Object The configuration of the instance.
  		* @param data Object
  		* @param bypassNormalization Boolean 'true' to bypass attribute normalization.
  		* @param avoidCopy Boolean 'true' to avoid copying.
  		* @returns Object The attributes of the instance.
  		*/
  var createInstance: js.UndefOr[
    js.Function4[
      /* config */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[scala.Boolean], 
      /* avoidCopy */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the bounding box for the instance at the given index
  		* @param index Number The index of the instance.
  		* @param isWithoutTransform Boolean 'true' to not apply sprite transforms to the bounding box.
  		* @returns Object The bounding box for the instance.
  		*/
  var getBBoxFor: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* isWithoutTransform */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Not supported
  		* @returns null
  		*/
  @JSName("getBBox")
  var getBBox_IInstancing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of template
  		* @returns Object
  		*/
  var getTemplate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @param region Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IInstancing: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the attributes for the instance at the given index
  		* @param index Number the index of the instance
  		* @param changes Object the attributes to change
  		* @param bypassNormalization Boolean 'true' to avoid attribute normalization
  		*/
  var setAttributesFor: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of template
  		* @param template Object The new value.
  		*/
  var setTemplate: js.UndefOr[js.Function1[/* template */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var template: js.UndefOr[js.Any] = js.undefined
}

