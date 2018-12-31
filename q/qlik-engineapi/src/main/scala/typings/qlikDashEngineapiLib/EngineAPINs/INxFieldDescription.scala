package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxFieldDescription...
  */
trait INxFieldDescription extends js.Object {
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of distinct field values
    */
  var qCardinal: scala.Double
  /**
    * Lists the derived fields if any.
    */
  var qDerivedFieldData: INxDerivedFieldDescriptionList
  /**
    * If set to true, it means that the field is a field on the fly.
    */
  var qIsDefinitionOnly: scala.Boolean
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is detail.
    */
  var qIsDetail: scala.Boolean
  /**
    * If set to true, it means that the field is hidden.
    */
  var qIsHidden: scala.Boolean
  /**
    * Is used for Direct Discovery.
    * If set to true, it means that the type of the field is measure.
    */
  var qIsImplicit: scala.Boolean
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: scala.Boolean
  /**
    * If set to true, it means that the field is a system field.
    */
  var qIsSystem: scala.Boolean
  /**
    * Name of the field
    */
  var qName: java.lang.String
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[java.lang.String]
}

