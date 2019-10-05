package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericVariableProperties width extend GenericProperties
  */
trait IGenericVariableProperties extends IGenericProperties {
  /**
    * Comment related to the variable.
    * >> This parameter is optional.
    */
  var qComment: js.UndefOr[String] = js.undefined
  /**
    * Definition of the variable.
    */
  var qDefinition: String
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The variable value will be persisted in the bookmark.
    * The value of a variable can affect the state of the selections.
    * Script variables cannot be persisted in the bookmark.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean
  /**
    * Name of the variable.
    * The name must be unique.
    * >> This parameter is mandatory.
    */
  var qName: String
  /**
    * Defines the format of the value.
    * >> This parameter is optional.
    */
  var qNumberPresentation: js.UndefOr[IFieldAttributes] = js.undefined
}

object IGenericVariableProperties {
  @scala.inline
  def apply(
    qDefinition: String,
    qIncludeInBookmark: Boolean,
    qInfo: INxInfo,
    qName: String,
    qComment: String = null,
    qNumberPresentation: IFieldAttributes = null
  ): IGenericVariableProperties = {
    val __obj = js.Dynamic.literal(qDefinition = qDefinition, qIncludeInBookmark = qIncludeInBookmark, qInfo = qInfo, qName = qName)
    if (qComment != null) __obj.updateDynamic("qComment")(qComment)
    if (qNumberPresentation != null) __obj.updateDynamic("qNumberPresentation")(qNumberPresentation)
    __obj.asInstanceOf[IGenericVariableProperties]
  }
}

