package typings
package senchaUnderscoreTouchLib.ExtNs.envNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBrowser
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Property] (String) */
  var engineName: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IVersion] = js.undefined
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IVersion] = js.undefined
}

