package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxContainerEntry...
  */
trait INxContainerEntry[T] extends js.Object {
  /**
    * Set of data
    */
  var qData: T
  /**
    * Information about the object
    */
  var qInfo: INxInfo
  /**
    * Information on publishing and permissions
    */
  var qMeta: INxMeta
}

