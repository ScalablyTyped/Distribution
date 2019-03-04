package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SourceKeyRecord...
  */
trait ISourceKeyRecord extends js.Object {
  /**
    * Name of the key field.
    */
  var qKeyFields: js.Array[java.lang.String]
  /**
    * Table the key belongs to.
    */
  var qTables: js.Array[java.lang.String]
}

object ISourceKeyRecord {
  @scala.inline
  def apply(qKeyFields: js.Array[java.lang.String], qTables: js.Array[java.lang.String]): ISourceKeyRecord = {
    val __obj = js.Dynamic.literal(qKeyFields = qKeyFields, qTables = qTables)
  
    __obj.asInstanceOf[ISourceKeyRecord]
  }
}

