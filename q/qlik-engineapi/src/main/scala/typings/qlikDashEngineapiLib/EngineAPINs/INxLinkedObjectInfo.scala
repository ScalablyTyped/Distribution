package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxLinkedObjectInfo...
  */
trait INxLinkedObjectInfo extends js.Object {
  /**
    * Information about the linked object.
    */
  var qInfo: INxInfo
  /**
    * Identifier of the root object.
    * If the linked object is a child, the root identifier is the identifier of the parent.
    * If the linked object is an app object, the root identifier is the same than the
    * identifier of the linked object since the linked object is a root object.
    */
  var qRootId: java.lang.String
}

