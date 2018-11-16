package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Is the layout for GenericVariableProperties.
     */

trait IGenericVariableLayout extends IGenericBaseLayout {
  /**
           * If set to true, it means that the variable was defined via script.
           */
  var qIsScriptCreated: scala.Boolean
  /**
           * A value.
           */
  var qNum: scala.Double
  /**
           * Some text.
           */
  var qText: java.lang.String
}

