package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersion extends js.Object {
  /** [Method] Create a closure for deprecated code
  		* @param packageName String The package name.
  		* @param since String The last version before it's deprecated.
  		* @param closure Function The callback function to be executed with the specified version is less than the current version.
  		* @param scope Object The execution scope (this) if the closure
  		*/
  var deprecate: js.UndefOr[
    js.Function4[
      /* packageName */ js.UndefOr[java.lang.String], 
      /* since */ js.UndefOr[java.lang.String], 
      /* closure */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns whether this version equals to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version equals to the target, false otherwise.
  		*/
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns the build component value
  		* @returns Number build
  		*/
  var getBuild: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the major component value
  		* @returns Number major
  		*/
  var getMajor: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the minor component value
  		* @returns Number minor
  		*/
  var getMinor: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the patch component value
  		* @returns Number patch
  		*/
  var getPatch: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the release component value
  		* @returns Number release
  		*/
  var getRelease: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns shortVersion version without dots and release
  		* @returns String
  		*/
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the version number of the supplied package name will return the last registered version last Ext setVersion  c
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @returns Ext.Version The version.
  		*/
  var getVersion: js.UndefOr[js.Function1[/* packageName */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Method] Convenient alias to isGreaterThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isGreaterThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than the target, false otherwise.
  		*/
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than or equal to the target, false otherwise.
  		*/
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if smaller than the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if smaller than the target, false otherwise.
  		*/
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if less than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if less than or equal to the target, false otherwise.
  		*/
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version matches the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version matches the target, false otherwise.
  		*/
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Set version number for the given package name
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @param version String/Ext.Version The version, for example: '1.2.3alpha', '2.4.0-dev'.
  		* @returns any
  		*/
  var setVersion: js.UndefOr[
    js.Function2[/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns this format  major minor patch build release
  		* @returns Number[]
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method]
  		* @param value Number
  		* @returns Number
  		*/
  var toNumber: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
}

object IVersion {
  @scala.inline
  def apply(
    deprecate: js.Function4[
      /* packageName */ js.UndefOr[java.lang.String], 
      /* since */ js.UndefOr[java.lang.String], 
      /* closure */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    equals: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    getBuild: js.Function0[scala.Double] = null,
    getMajor: js.Function0[scala.Double] = null,
    getMinor: js.Function0[scala.Double] = null,
    getPatch: js.Function0[scala.Double] = null,
    getRelease: js.Function0[scala.Double] = null,
    getShortVersion: js.Function0[java.lang.String] = null,
    getVersion: js.Function1[/* packageName */ js.UndefOr[java.lang.String], IVersion] = null,
    gt: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    gtEq: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isGreaterThan: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isGreaterThanOrEqual: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isLessThan: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isLessThanOrEqual: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    lt: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    ltEq: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    `match`: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    setVersion: js.Function2[/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any], _] = null,
    toArray: js.Function0[Array] = null,
    toNumber: js.Function1[/* value */ js.UndefOr[scala.Double], scala.Double] = null
  ): IVersion = {
    val __obj = js.Dynamic.literal()
    if (deprecate != null) __obj.updateDynamic("deprecate")(deprecate)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (getBuild != null) __obj.updateDynamic("getBuild")(getBuild)
    if (getMajor != null) __obj.updateDynamic("getMajor")(getMajor)
    if (getMinor != null) __obj.updateDynamic("getMinor")(getMinor)
    if (getPatch != null) __obj.updateDynamic("getPatch")(getPatch)
    if (getRelease != null) __obj.updateDynamic("getRelease")(getRelease)
    if (getShortVersion != null) __obj.updateDynamic("getShortVersion")(getShortVersion)
    if (getVersion != null) __obj.updateDynamic("getVersion")(getVersion)
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gtEq != null) __obj.updateDynamic("gtEq")(gtEq)
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(isGreaterThan)
    if (isGreaterThanOrEqual != null) __obj.updateDynamic("isGreaterThanOrEqual")(isGreaterThanOrEqual)
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(isLessThan)
    if (isLessThanOrEqual != null) __obj.updateDynamic("isLessThanOrEqual")(isLessThanOrEqual)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (ltEq != null) __obj.updateDynamic("ltEq")(ltEq)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (setVersion != null) __obj.updateDynamic("setVersion")(setVersion)
    if (toArray != null) __obj.updateDynamic("toArray")(toArray)
    if (toNumber != null) __obj.updateDynamic("toNumber")(toNumber)
    __obj.asInstanceOf[IVersion]
  }
}

