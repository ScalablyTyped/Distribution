package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * NxVariableProperties...
     */

trait INxVariableProperties extends js.Object {
  /**
           * Set this property to true to update the variable when applying a bookmark.
           * The value of a variable can affect the state of the selections.
           * >> The default value is false.
           */
  var qIncludeInBookmark: scala.Boolean
  /**
           * Name of the variable.
           */
  var qName: java.lang.String
  /**
           * Defines the format of the value of a variable.
           */
  var qNumberPresentation: IFieldAttributes
  /**
           * List of enumerations.
           * This property is used if qUsePredefListedValues is set to true.
           */
  var qPreDefinedList: js.Array[java.lang.String]
  /**
           * The value of a variable can be an enumeration.
           * Set this property to true to reflect the predefined values in an enumeration.
           */
  var qUsePredefListedValues: scala.Boolean
}

