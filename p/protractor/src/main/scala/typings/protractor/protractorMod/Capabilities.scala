package typings.protractor.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Object)=} opt_other Another set of
  *     capabilities to merge into this instance.
  * @constructor
  */
class Capabilities ()
  extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities {
  def this(opt_other: js.Object) = this()
  def this(opt_other: typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities) = this()
}

/* static members */
@JSImport("protractor", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Android.
    */
  def android(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit.
    */
  def htmlunit(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for HTMLUnit
    *                                   with enabled Javascript.
    */
  def htmlunitwithjs(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPad.
    */
  def ipad(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for iPhone.
    */
  def iphone(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Opera.
    */
  def opera(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     PhantomJS.
    */
  def phantomjs(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities = js.native
}

