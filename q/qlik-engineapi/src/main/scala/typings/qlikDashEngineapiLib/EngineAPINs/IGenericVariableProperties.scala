package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qComment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Definition of the variable.
           */
  var qDefinition: java.lang.String
  /**
           * Set this property to true to update the variable when applying a bookmark.
           * The variable value will be persisted in the bookmark.
           * The value of a variable can affect the state of the selections.
           * Script variables cannot be persisted in the bookmark.
           * >> The default value is false.
           */
  var qIncludeInBookmark: scala.Boolean
  /**
           * Name of the variable.
           * The name must be unique.
           * >> This parameter is mandatory.
           */
  var qName: java.lang.String
  /**
           * Defines the format of the value.
           * >> This parameter is optional.
           */
  var qNumberPresentation: js.UndefOr[IFieldAttributes] = js.undefined
}

