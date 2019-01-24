package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChange extends js.Object {
  /**
    * The location of the file to change.
    */
  var fileLocation: FileLocation
  /**
    * Key/value pairs that provide additional information about the file change.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * An array of replacement objects, each of which represents the replacement of a single region in a single file
    * specified by 'fileLocation'.
    */
  var replacements: js.Array[Replacement]
}

