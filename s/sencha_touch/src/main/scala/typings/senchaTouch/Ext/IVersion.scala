package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
      Unit
    ]
  ] = js.native
  /** [Method] Returns whether this version equals to the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version equals to the target, false otherwise.
    */
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns the build component value
    * @returns Number build
    */
  var getBuild: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the major component value
    * @returns Number major
    */
  var getMajor: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the minor component value
    * @returns Number minor
    */
  var getMinor: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the patch component value
    * @returns Number patch
    */
  var getPatch: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the release component value
    * @returns Number release
    */
  var getRelease: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns shortVersion version without dots and release
    * @returns String
    */
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Get the version number of the supplied package name will return the last registered version last Ext setVersion  c
    * @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
    * @returns Ext.Version The version.
    */
  var getVersion: js.UndefOr[js.Function1[/* packageName */ js.UndefOr[java.lang.String], this.type]] = js.native
  /** [Method] Convenient alias to isGreaterThan
    * @param target String/Number
    * @returns Boolean
    */
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isGreaterThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if greater than the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version if greater than the target, false otherwise.
    */
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version if greater than or equal to the target, false otherwise.
    */
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if smaller than the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version if smaller than the target, false otherwise.
    */
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version if less than or equal to the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version if less than or equal to the target, false otherwise.
    */
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isLessThan
    * @param target String/Number
    * @returns Boolean
    */
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Convenient alias to isLessThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Returns whether this version matches the supplied argument
    * @param target String/Number The version to compare with.
    * @returns Boolean true if this version matches the target, false otherwise.
    */
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Set version number for the given package name
    * @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
    * @param version String/Ext.Version The version, for example: '1.2.3alpha', '2.4.0-dev'.
    * @returns any
    */
  var setVersion: js.UndefOr[
    js.Function2[/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Returns this format  major minor patch build release
    * @returns Number[]
    */
  var toArray: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method]
    * @param value Number
    * @returns Number
    */
  var toNumber: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Double]] = js.native
}

object IVersion {
  @scala.inline
  def apply(): IVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVersion]
  }
  @scala.inline
  implicit class IVersionOps[Self <: IVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeprecate(
      value: (/* packageName */ js.UndefOr[java.lang.String], /* since */ js.UndefOr[java.lang.String], /* closure */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("deprecate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDeprecate: Self = this.set("deprecate", js.undefined)
    @scala.inline
    def setEquals(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setGetBuild(value: () => Double): Self = this.set("getBuild", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBuild: Self = this.set("getBuild", js.undefined)
    @scala.inline
    def setGetMajor(value: () => Double): Self = this.set("getMajor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMajor: Self = this.set("getMajor", js.undefined)
    @scala.inline
    def setGetMinor(value: () => Double): Self = this.set("getMinor", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMinor: Self = this.set("getMinor", js.undefined)
    @scala.inline
    def setGetPatch(value: () => Double): Self = this.set("getPatch", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPatch: Self = this.set("getPatch", js.undefined)
    @scala.inline
    def setGetRelease(value: () => Double): Self = this.set("getRelease", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRelease: Self = this.set("getRelease", js.undefined)
    @scala.inline
    def setGetShortVersion(value: () => java.lang.String): Self = this.set("getShortVersion", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetShortVersion: Self = this.set("getShortVersion", js.undefined)
    @scala.inline
    def setGetVersion(value: /* packageName */ js.UndefOr[java.lang.String] => IVersion): Self = this.set("getVersion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetVersion: Self = this.set("getVersion", js.undefined)
    @scala.inline
    def setGt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("gt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    @scala.inline
    def setGtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("gtEq", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGtEq: Self = this.set("gtEq", js.undefined)
    @scala.inline
    def setIsGreaterThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isGreaterThan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsGreaterThan: Self = this.set("isGreaterThan", js.undefined)
    @scala.inline
    def setIsGreaterThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isGreaterThanOrEqual", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsGreaterThanOrEqual: Self = this.set("isGreaterThanOrEqual", js.undefined)
    @scala.inline
    def setIsLessThan(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isLessThan", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsLessThan: Self = this.set("isLessThan", js.undefined)
    @scala.inline
    def setIsLessThanOrEqual(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("isLessThanOrEqual", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsLessThanOrEqual: Self = this.set("isLessThanOrEqual", js.undefined)
    @scala.inline
    def setLt(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("lt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    @scala.inline
    def setLtEq(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("ltEq", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLtEq: Self = this.set("ltEq", js.undefined)
    @scala.inline
    def setMatch(value: /* target */ js.UndefOr[js.Any] => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setSetVersion(value: (/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any]) => _): Self = this.set("setVersion", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetVersion: Self = this.set("setVersion", js.undefined)
    @scala.inline
    def setToArray(value: () => Array): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
    @scala.inline
    def setToNumber(value: /* value */ js.UndefOr[Double] => Double): Self = this.set("toNumber", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToNumber: Self = this.set("toNumber", js.undefined)
  }
  
}

