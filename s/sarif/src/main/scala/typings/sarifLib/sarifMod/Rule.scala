package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /**
    * Information about the rule that can be configured at runtime.
    */
  var configuration: js.UndefOr[RuleConfiguration] = js.undefined
  /**
    * A description of the rule. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[Message] = js.undefined
  /**
    * Provides the primary documentation for the rule, useful when there is no online documentation.
    */
  var help: js.UndefOr[Message] = js.undefined
  /**
    * A URI where the primary documentation for the rule can be found.
    */
  var helpUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A stable, opaque identifier for the rule.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A set of name/value pairs with arbitrary names. The value within each name/value pair consists of plain text
    * interspersed with placeholders, which can be used to construct a message in combination with an arbitrary
    * number of additional string arguments.
    */
  var messageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * A rule identifier that is understandable to an end user.
    */
  var name: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the rule.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * A set of name/value pairs with arbitrary names. The value within each name/value pair consists of rich text
    * interspersed with placeholders, which can be used to construct a message in combination with an arbitrary
    * number of additional string arguments.
    */
  var richMessageStrings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * A concise description of the rule. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[Message] = js.undefined
}

