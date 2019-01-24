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
    * A dictionary, each of whose keys is a string and each of whose values is a 'rule' object, that describe all
    * rules associated with an analysis tool or a specific run of an analysis tool.
    */
  var rules: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Rule]] = js.undefined
}

