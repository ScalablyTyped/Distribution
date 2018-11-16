package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * TextMacro...
     */

trait ITextMacro extends js.Object {
  /**
           * Variable value.
           */
  var qDisplayString: java.lang.String
  /**
           * Is set to true if the variable is a reserved variable.
           */
  var qIsReserved: scala.Boolean
  /**
           * Is set to true if the variable is a system variable.
           */
  var qIsSystem: scala.Boolean
  /**
           * Order in which the variable was referenced during the script execution.
           * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
           */
  var qRefSeqNo: scala.Double
  /**
           * Order in which the variable was updated during the script execution.
           * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
           */
  var qSetSeqNo: scala.Double
  /**
           * Name of the variable.
           */
  var qTag: java.lang.String
}

