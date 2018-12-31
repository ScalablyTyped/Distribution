package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContentLibraryListItem...
  */
trait IContentLibraryListItem extends js.Object {
  /**
    * Is set to true if the library is specific to the app (not a global content library).
    */
  var qAppSpecific: scala.Boolean
  /**
    * Information about publishing and permissions.
    */
  var qMeta: INxMeta
  /**
    * Name of the library.
    */
  var qName: java.lang.String
}

