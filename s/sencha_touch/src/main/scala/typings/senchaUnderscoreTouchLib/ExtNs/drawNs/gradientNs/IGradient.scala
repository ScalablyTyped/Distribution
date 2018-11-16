package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.gradientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGradient
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IIdentifiable {
  /** [Config Option] (Array/Object) */
  var Defines: js.UndefOr[js.Any] = js.undefined
  /** [Method] Generates the gradient for the given context
  		* @param ctx Ext.draw.engine.SvgContext The context.
  		* @param bbox Object
  		* @returns Object
  		*/
  var generateGradient: js.UndefOr[
    js.Function2[
      /* ctx */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.ISvgContext], 
      /* bbox */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IGradient: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

