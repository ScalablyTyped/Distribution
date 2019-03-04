package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CodePage...
  */
trait ICodePage extends js.Object {
  /**
    * Description of the code page
    */
  var qDescription: java.lang.String
  /**
    * Name of the code page
    */
  var qName: java.lang.String
  /**
    * Number of the code page
    */
  var qNumber: scala.Double
}

object ICodePage {
  @scala.inline
  def apply(qDescription: java.lang.String, qName: java.lang.String, qNumber: scala.Double): ICodePage = {
    val __obj = js.Dynamic.literal(qDescription = qDescription, qName = qName, qNumber = qNumber)
  
    __obj.asInstanceOf[ICodePage]
  }
}

