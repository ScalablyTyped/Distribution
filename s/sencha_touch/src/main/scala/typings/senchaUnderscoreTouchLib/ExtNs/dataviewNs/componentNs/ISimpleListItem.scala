package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleListItem
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Method] Returns the value of disclosure
  		* @returns Object
  		*/
  var getDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns Object
  		*/
  var getHeader: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of disclosure
  		* @param disclosure Object The new value.
  		*/
  var setDisclosure: js.UndefOr[js.Function1[/* disclosure */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header Object The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ISimpleListItem {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    baseCls: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getDisclosure: js.Function0[_] = null,
    getHeader: js.Function0[_] = null,
    getRecord: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] = null,
    initialize: js.Function0[scala.Unit] = null,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDisclosure: js.Function1[/* disclosure */ js.UndefOr[js.Any], scala.Unit] = null,
    setHeader: js.Function1[/* header */ js.UndefOr[js.Any], scala.Unit] = null,
    setRecord: js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], scala.Unit] = null
  ): ISimpleListItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getDisclosure != null) __obj.updateDynamic("getDisclosure")(getDisclosure)
    if (getHeader != null) __obj.updateDynamic("getHeader")(getHeader)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (record != null) __obj.updateDynamic("record")(record)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setDisclosure != null) __obj.updateDynamic("setDisclosure")(setDisclosure)
    if (setHeader != null) __obj.updateDynamic("setHeader")(setHeader)
    if (setRecord != null) __obj.updateDynamic("setRecord")(setRecord)
    __obj.asInstanceOf[ISimpleListItem]
  }
}

