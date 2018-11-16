package typings
package rssLib.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EnclosureObject extends js.Object {
  /**
           * Path to binary file (or URL).
           */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Size of the file.
           */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
           * If not provided, the MIME Type will be guessed based
           * on the extension of the file or URL, passing type to
           * the enclosure will override the guessed type.
           */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
           * URL to file object (or file).
           */
  var url: java.lang.String
}

