package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StaticContentListItem...
  */
trait IStaticContentListItem extends js.Object {
  /**
    * Relative path to the content file. The URL is static.
    * In Qlik Sense Enterprise, content files located:
    *
    * - in the /content/<content library name>/ folder are part of a global content library.
    * - in the /appcontent/ folder are part of the app specific library.
    *
    * The content files are never embedded in the qvf file.
    * In Qlik Sense Desktop, content files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrl: java.lang.String
  /**
    * Relative path to the content file. The URL is static.
    * In Qlik Sense Enterprise, content files located:
    *
    * - in the /content/<content library name>/ folder are part of a global content library.
    * - in the /appcontent/ folder are part of the app specific library.
    *
    * The content files are never embedded in the qvf file.
    * In Qlik Sense Desktop, content files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: java.lang.String
}

