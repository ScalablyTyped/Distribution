package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxVariableProperties...
  */
@js.native
trait INxVariableProperties extends js.Object {
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The value of a variable can affect the state of the selections.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean = js.native
  /**
    * Name of the variable.
    */
  var qName: String = js.native
  /**
    * Defines the format of the value of a variable.
    */
  var qNumberPresentation: IFieldAttributes = js.native
  /**
    * List of enumerations.
    * This property is used if qUsePredefListedValues is set to true.
    */
  var qPreDefinedList: js.Array[String] = js.native
  /**
    * The value of a variable can be an enumeration.
    * Set this property to true to reflect the predefined values in an enumeration.
    */
  var qUsePredefListedValues: Boolean = js.native
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
  @scala.inline
  implicit class INxVariablePropertiesOps[Self <: INxVariableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQIncludeInBookmark(value: Boolean): Self = this.set("qIncludeInBookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNumberPresentation(value: IFieldAttributes): Self = this.set("qNumberPresentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPreDefinedListVarargs(value: String*): Self = this.set("qPreDefinedList", js.Array(value :_*))
    @scala.inline
    def setQPreDefinedList(value: js.Array[String]): Self = this.set("qPreDefinedList", value.asInstanceOf[js.Any])
    @scala.inline
    def setQUsePredefListedValues(value: Boolean): Self = this.set("qUsePredefListedValues", value.asInstanceOf[js.Any])
  }
  
}

