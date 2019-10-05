package typings.sarif.sarifMod

import typings.sarif.sarifMod.Suppression.kind
import typings.sarif.sarifMod.Suppression.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppression extends js.Object {
  /**
    * A stable, unique identifer for the suprression in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  /**
    * A string representing the justification for the suppression.
    */
  var justification: js.UndefOr[String] = js.undefined
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: kind
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A string that indicates the state of the suppression.
    */
  var state: js.UndefOr[state] = js.undefined
}

@JSImport("sarif", "Suppression")
@js.native
object Suppression extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.inSource
    - typings.sarif.sarifStrings.external
  */
  trait kind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.accepted
    - typings.sarif.sarifStrings.underReview
    - typings.sarif.sarifStrings.rejected
  */
  trait state extends js.Object
  
}

