package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the fields to show.
     */

trait IFieldListDef extends js.Object {
  /**
           * Shows the fields defined on the fly if set to true.
           */
  var qShowDefinitionOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the fields and derived fields if set to true.
           */
  var qShowDerivedFields: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the hidden fields if set to true.
           */
  var qShowHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the Direct Discovery measure fields if set to true.
           */
  var qShowImplicit: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show the semantic fields if set to true.
           */
  var qShowSemantic: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the tables and fields present in the data model viewer if set to true.
           */
  var qShowSrcTables: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the system tables if set to true.
           */
  var qShowSystem: js.UndefOr[scala.Boolean] = js.undefined
}

