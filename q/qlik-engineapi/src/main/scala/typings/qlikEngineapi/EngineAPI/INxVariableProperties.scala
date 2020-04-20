package typings.qlikEngineapi.EngineAPI

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
  var qIncludeInBookmark: Boolean
  /**
    * Name of the variable.
    */
  var qName: String
  /**
    * Defines the format of the value of a variable.
    */
  var qNumberPresentation: IFieldAttributes
  /**
    * List of enumerations.
    * This property is used if qUsePredefListedValues is set to true.
    */
  var qPreDefinedList: js.Array[String]
  /**
    * The value of a variable can be an enumeration.
    * Set this property to true to reflect the predefined values in an enumeration.
    */
  var qUsePredefListedValues: Boolean
}

object INxVariableProperties {
  @scala.inline
  def apply(
    qIncludeInBookmark: Boolean,
    qName: String,
    qNumberPresentation: IFieldAttributes,
    qPreDefinedList: js.Array[String],
    qUsePredefListedValues: Boolean
  ): INxVariableProperties = {
    val __obj = js.Dynamic.literal(qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumberPresentation = qNumberPresentation.asInstanceOf[js.Any], qPreDefinedList = qPreDefinedList.asInstanceOf[js.Any], qUsePredefListedValues = qUsePredefListedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxVariableProperties]
  }
}

