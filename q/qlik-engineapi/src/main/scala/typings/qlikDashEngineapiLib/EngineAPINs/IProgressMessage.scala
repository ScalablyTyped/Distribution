package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressMessage...
  */
trait IProgressMessage extends js.Object {
  /**
    * Code number to the corresponding localized message string.
    */
  var qMessageCode: scala.Double
  /**
    * Parameters to be inserted in the localized message string.
    */
  var qMessageParameters: js.Array[java.lang.String]
}

object IProgressMessage {
  @scala.inline
  def apply(qMessageCode: scala.Double, qMessageParameters: js.Array[java.lang.String]): IProgressMessage = {
    val __obj = js.Dynamic.literal(qMessageCode = qMessageCode, qMessageParameters = qMessageParameters)
  
    __obj.asInstanceOf[IProgressMessage]
  }
}

