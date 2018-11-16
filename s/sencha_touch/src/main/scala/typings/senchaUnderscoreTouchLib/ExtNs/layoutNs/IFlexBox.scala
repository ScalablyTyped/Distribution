package typings
package senchaUnderscoreTouchLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFlexBox extends IBox {
  /** [Method] Sets the flex of an item in this box layout
  		* @param item Ext.Component The item of this layout which you want to update the flex of.
  		* @param flex Number The flex to set on this method
  		*/
  var setItemFlex: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IComponent], 
      /* flex */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

