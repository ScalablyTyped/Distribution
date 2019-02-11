package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  /**
    * A dictionary, each of whose keys is a resource identifier and each of whose values is a localized string.
    */
  var messageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * Key/value pairs that provide additional information about the resources.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of rule objects relevant to the run.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

