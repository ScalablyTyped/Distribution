package typings
package protractorLib.builtElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", "WebdriverWebElement")
@js.native
class WebdriverWebElement ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Returns either this instance's serialized represention, if immediately
    * available, or a promise for its serialized representation. This function is
    * conceptually equivalent to objects that have a {@code toJSON()} property,
    * except the serialize() result may be a promise or an object containing a
    * promise (which are not directly JSON friendly).
    *
    * @return {!(T|IThenable.<!T>)} This instance's serialized wire format.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def serialize(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId | js.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.IWebElementId] = js.native
}

