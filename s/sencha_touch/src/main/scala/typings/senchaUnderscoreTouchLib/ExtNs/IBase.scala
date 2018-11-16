package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBase extends IClass {
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  var callOverridden: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  var callParent: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  var callSuper: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method]  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  var getInitialConfig: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  var initConfig: js.UndefOr[js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Property] (Ext.Class) */
  var self: js.UndefOr[IClass] = js.undefined
}

