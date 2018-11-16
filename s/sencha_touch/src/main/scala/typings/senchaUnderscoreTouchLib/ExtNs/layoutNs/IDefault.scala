package typings
package senchaUnderscoreTouchLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDefault extends IAbstract {
  /** [Config Option] (Ext.fx.layout.Card) */
  var animation: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.fxNs.layoutNs.ICard] = js.undefined
  /** [Method] Returns the value of animation
  		* @returns Ext.fx.layout.Card
  		*/
  var getAnimation: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.fxNs.layoutNs.ICard]] = js.undefined
  /** [Method]
  		* @param item Ext.Component
  		* @param isInner Boolean
  		* @param destroying Boolean
  		*/
  var onItemInnerStateChange: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IComponent], 
      /* isInner */ js.UndefOr[scala.Boolean], 
      /* destroying */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of animation
  		* @param animation Ext.fx.layout.Card The new value.
  		*/
  var setAnimation: js.UndefOr[
    js.Function1[
      /* animation */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.fxNs.layoutNs.ICard], 
      scala.Unit
    ]
  ] = js.undefined
}

