package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Capabilities")
@js.native
class Capabilities ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities {
  // region Constructors
  /**
     * @param {(Capabilities|Object)=} opt_other Another set of
     *     capabilities to merge into this instance.
     * @constructor
     */
  def this(opt_other: js.Object) = this()
  // region Constructors
  /**
     * @param {(Capabilities|Object)=} opt_other Another set of
     *     capabilities to merge into this instance.
     * @constructor
     */
  def this(opt_other: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities) = this()
}

@JSImport("protractor", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
     * @return {!Capabilities} A basic set of capabilities for Android.
     */
  def android(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for Chrome.
     */
  def chrome(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
     */
  def edge(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for Firefox.
     */
  def firefox(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for HTMLUnit.
     */
  def htmlunit(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for HTMLUnit
     *                                   with enabled Javascript.
     */
  def htmlunitwithjs(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for
     *     Internet Explorer.
     */
  def ie(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for iPad.
     */
  def ipad(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for iPhone.
     */
  def iphone(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for Opera.
     */
  def opera(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for
     *     PhantomJS.
     */
  def phantomjs(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
  /**
     * @return {!Capabilities} A basic set of capabilities for Safari.
     */
  def safari(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities = js.native
}

