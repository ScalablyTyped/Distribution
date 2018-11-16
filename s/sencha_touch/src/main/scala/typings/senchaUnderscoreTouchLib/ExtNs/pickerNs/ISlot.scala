package typings
package senchaUnderscoreTouchLib.ExtNs.pickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISlot
  extends senchaUnderscoreTouchLib.ExtNs.dataviewNs.IDataView {
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Looks at the data configuration and turns it into store
  		* @param data Object
  		* @returns Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the title for this dataview by creating element
  		* @param title String
  		* @returns String
  		*/
  var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of align
  		* @returns String
  		*/
  var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of valueField
  		* @returns String
  		*/
  var getValueField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  @JSName("itemTpl")
  var itemTpl_ISlot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of align
  		* @param align String The new value.
  		*/
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the align configuration
  		* @param newAlign Object
  		* @param oldAlign Object
  		*/
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[java.lang.String] = js.undefined
}

